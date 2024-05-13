import java.util.concurrent.Semaphore;

public class RiverCrossing {

    private static Semaphore mutex = new Semaphore(1);
    private static Semaphore hackerQueue = new Semaphore(0);
    private static Semaphore serfQueue = new Semaphore(0);
    private static int hackers = 0;
    private static int serfs = 0;
    private static boolean isCaptain = false;

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Simülasyon başlıyor...");

        Runnable hackerRunnable = () -> {
            try {
                while (!Thread.interrupted()) {
                    board("hacker");
                }
            } catch (InterruptedException e) {
                System.out.println("Hacker thread kesildi.");
                Thread.currentThread().interrupt(); // Interrupt durumunu tekrar set et
            }
        };

        Runnable serfRunnable = () -> {
            try {
                while (!Thread.interrupted()) {
                    board("serf");
                }
            } catch (InterruptedException e) {
                System.out.println("Serf thread kesildi.");
                Thread.currentThread().interrupt(); // Interrupt durumunu tekrar set et
            }
        };

        Thread hackerThread = new Thread(hackerRunnable);
        Thread serfThread = new Thread(serfRunnable);

        hackerThread.start();
        serfThread.start();

        // Belirli bir süre sonra thread'leri durdur
        Thread.sleep(5000); // Örnek olarak 5 saniye bekleyelim
        hackerThread.interrupt();
        serfThread.interrupt();

        // Thread'ler sonlanana kadar bekler.
        hackerThread.join();
        serfThread.join();

        System.out.println("Simulasyon sona erdi.");
    }

    public static void board(String type) throws InterruptedException {
        System.out.println("Bir " + type + " gemiye binmeye çalışıyor.");

        if (type.equals("hacker")) {
            hackers++;
            if (hackers == 4) {
                System.out.println("4 hacker gemiye biniyor.");
                hackerQueue.release(4);
                hackers = 0;
                isCaptain = false;
            } else if (hackers == 2 && serfs >= 2) {
                System.out.println("2 hacker ve 2 serf gemiye biniyor.");
                hackerQueue.release(2);
                serfQueue.release(2);
                serfs -= 2;
                isCaptain = true;
            } else {
                mutex.acquire();
                if (isCaptain) {
                    isCaptain = false;
                } else {
                    serfQueue.acquire();
                }
                System.out.println("Bir " + type + " gemiye bindi.");
                mutex.release();
            }
        } else { 
            serfs++;
            if (serfs == 4) {
                System.out.println("4 serf gemiye biniyor.");
                serfQueue.release(4);
                serfs = 0;
                isCaptain = false;
            } else if (serfs == 2 && hackers >= 2) {
                System.out.println("2 serf ve 2 hacker gemiye biniyor.");
                serfQueue.release(2);
                hackerQueue.release(2);
                hackers -= 2;
                isCaptain = true;
            } else {
                mutex.acquire();
                if (isCaptain) {
                    isCaptain = false;
                } else {
                    hackerQueue.acquire();
                }
                System.out.println("Bir " + type + " gemiye bindi.");
                mutex.release();
            }
        }

        if (isCaptain) {
            rowBoat();
        }
    }

    public static void rowBoat() {
        System.out.println("Köprüden geçiliyor.");
        isCaptain = false;
    }
}
