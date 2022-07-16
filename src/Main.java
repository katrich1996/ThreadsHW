public class Main {

    public static synchronized void main(String[] args) {

        Timer timer = new Timer();
        timer.start();


        Timer5sec t5 = new Timer5sec(timer);
        t5.start();

        Timer7sec t7 = new Timer7sec(timer);
        t7.start();

    }

}