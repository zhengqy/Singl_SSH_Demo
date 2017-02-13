package com.zhengqy.demo.thread;

/**
 * Created by zhengqy on 2017/1/19.
 */
public class TraditionalThreadSynchronized {
    public static void main(String[] args){
        Outputter outputter = new Outputter();
        new Thread(new Runnable() {
            @Override
            public void run() {
                outputter.output("zhangsanzhangsanzhangsan");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                outputter.output("lisilisilisi");
            }
        }).start();
        new Thread(new Runnable() {
            @Override
            public void run() {
                outputter.output("wangwuwagnwu");
            }
        }).start();

    }

    static class Outputter {
        public synchronized void output(String name){
            for (int i=0;i<name.length();i++){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print(name.charAt(i));
            }
        }
    }
}
