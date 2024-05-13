public class CPU {
    private boolean isBusy;

        public CPU() {
            this.isBusy = false;
        }

        public boolean isBusy() {
            return isBusy;
        }

        public void setBusy(boolean isBusy) {
            this.isBusy = isBusy;
        }
}
