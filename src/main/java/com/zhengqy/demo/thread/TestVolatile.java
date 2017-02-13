package com.zhengqy.demo.thread;

/**
 * Created by zhengqy on 2017/1/22.
 */
public class TestVolatile {
    private boolean shutdownRequested = false;

    public void shutDown(){
        shutdownRequested = true;
    }

    public void doWork(){
        if(!shutdownRequested){
            System.out.println("start dowork");
          /*  try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            if(!shutdownRequested){
                System.out.println("start dowork again");
            }
        }
    }

    public static void main(String[] args){
        TestVolatile testVolatile = new TestVolatile();
        new Thread(new Runnable() {
            @Override
            public void run() {
                testVolatile.doWork();
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                testVolatile.shutDown();
            }
        }).start();
    }
}
