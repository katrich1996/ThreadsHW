class Timer7sec extends Thread{
    Timer timer;
    public Timer7sec(Timer t){
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

                if(timer.getTime() % 7 == 0){
                    System.out.print("\n7 Second Message\n");
                }

            }
        }
    }
}