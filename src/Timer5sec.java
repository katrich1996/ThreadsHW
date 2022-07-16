class Timer5sec extends Thread{
    Timer timer;
    public Timer5sec(Timer t){
        this.timer = t;
    }

    public void run(){
        synchronized(timer){
            while(true){

                try {
                    timer.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                if(timer.getTime() % 5 == 0){
                    System.out.print("\n5 seconds passed\n");
                }

            }
        }
    }
}
