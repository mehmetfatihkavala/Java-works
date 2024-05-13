import java.util.LinkedList;
import java.util.Queue;

public class ProcessSchedularSimulation {

    
    public static class ProcessSchedular {

        private Queue<Process> queue1;
        private Queue<Process> queue2;
        private Queue<Process> queue3;
        private CPU cpu;

        public ProcessSchedular() {
            this.queue1 = new LinkedList<>();
            this.queue2 = new LinkedList<>();
            this.queue3 = new LinkedList<>();
            this.cpu = new CPU();
        }

        public void run() {
            while (true) {
                if (!queue1.isEmpty()) {
                    runProcess(queue1.poll());
                } else if (!queue2.isEmpty()) {
                    runProcess(queue2.poll());
                } else if (!queue3.isEmpty()) {
                    runProcess(queue3.poll());
                } else {
                    break;
                }
            }
        }

        public void runProcess(Process process) {
            cpu.setBusy(true);

            int runTime = process.burstTime;
            if (process.burstTime <= 8) {
                runTime = process.burstTime;
            } else {
                runTime = 8;
            }

            for (int i = 0; i < runTime; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            process.burstTime -= runTime;
            process.arrivalTime += runTime;

            if (process.burstTime > 0) {
                if (process.burstTime <= 8) {
                    queue1.add(process);
                } else if (process.burstTime <= 16) {
                    queue2.add(process);
                }
            else {
                queue3.remove(process);
            }
        }
    }

    public static void main(String[] args) {
        Queue<Process> queue1 = generateProcesses(1000);
        Queue<Process> queue2 = generateProcesses(1000);
        Queue<Process> queue3 = generateProcesses(1000);

        ProcessSchedular scheduler = new ProcessSchedular();

        scheduler.run();

        double averageWaitingTime = 0;
        double averageTurnaroundTime = 0;
        for (Process process : queue1) {
            averageWaitingTime += process.getWaitingTime();
            averageTurnaroundTime += process.getTurnaroundTime();
        }
        for (Process process : queue2) {
            averageWaitingTime += process.getWaitingTime();
            averageTurnaroundTime += process.getTurnaroundTime();
        }
        for (Process process : queue3) {
            averageWaitingTime += process.getWaitingTime();
            averageTurnaroundTime += process.getTurnaroundTime();
        }
        averageWaitingTime /= 3000;
        averageTurnaroundTime /= 3000;

        System.out.println("Ortalama waiting time: " + averageWaitingTime);
        System.out.println("Ortalama turnaround time: " + averageTurnaroundTime);
    }

    public static Queue<Process> generateProcesses(int count) {
        Queue<Process> processes = new LinkedList<>();
        for (int i = 0; i < count; i++) {
            int burstTime = (int) (Math.random() * 100);
            int arrivalTime = (int) (Math.random() * 100);
            Process process = new Process(i, burstTime, arrivalTime);
            processes.add(process);
        }
        return processes;
    }
}}
