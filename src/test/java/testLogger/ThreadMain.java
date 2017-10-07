package testLogger;


import core.ThreadRunner;

public class ThreadMain {

    public static int counter = 0;

    public static synchronized int getInt(){
        return counter;
    }

    public static synchronized void setInt(int i){
        counter = i;
    }

    public static void main(String[] args) {

        Thread thread = new Thread(new ThreadRunner());
        Thread thread1 = new Thread(new ThreadRunner());
        Thread thread2 = new Thread(new ThreadRunner());

        thread.start();
        thread1.start();
        thread2.start();

        System.out.println("MAIN METHOD END");

    }
}
