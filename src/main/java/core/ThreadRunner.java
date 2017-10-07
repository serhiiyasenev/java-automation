package core;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

public class ThreadRunner implements Runnable{

    private Logger logger = LoggerFactory.getLogger(ThreadRunner.class);
    static Random random = new Random();

    @Override
    public void run() {
        for (int i = 0; i < 500; i++) {
            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        }
    }
