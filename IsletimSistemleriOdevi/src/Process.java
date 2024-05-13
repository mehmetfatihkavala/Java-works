public class Process {
    private int processID;
    int burstTime;
    int arrivalTime;

    public Process(int processID, int burstTime, int arrivalTime) {
        this.processID = processID;
        this.burstTime = burstTime;
        this.arrivalTime = arrivalTime;
        }

        public int getProcessID() {
            return processID;
        }

        public void setProcessID(int processID) {
            this.processID = processID;
        }

        public int getBurstTime() {
            return burstTime;
        }

        public void setBurstTime(int burstTime) {
            this.burstTime = burstTime;
        }

        public int getArrivalTime() {
            return arrivalTime;
        }

        public void setArrivalTime(int arrivalTime) {
            this.arrivalTime = arrivalTime;
        }

        @Override
        public String toString() {
            return String.format("Process(processID=%d, burstTime=%d, arrivalTime=%d)", processID, burstTime, arrivalTime);
        }

        // bekleme süresi hesaplama
        public int getWaitingTime() {
            return arrivalTime + burstTime - getTurnaroundTime();
        }

        // dönüş süresi hesaplama
        public int getTurnaroundTime() {
            return arrivalTime + burstTime;
        }    
}
