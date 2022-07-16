class Timer extends Thread{
    private int time = 1;
    private boolean setting = false;

    public void run(){
        while(true){
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.print(time + " ");
            setTime(time + 1);
        }
    }
    public synchronized int getTime(){
        while(setting){
            try {
                wait();
            } catch (InterruptedException e) {  }
        }

        return time;
    }
    public synchronized void setTime(int t){
        setting = true;
        this.time = t;
        setting = false;
        notifyAll();
    }
}