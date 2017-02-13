package com.zhengqy.demo.thread;

/**
 * Created by zhengqy on 2017/1/22.
 */
public class Test {
    static volatile int i=0,j=0;
    static void a(){
        i++;
        try {
            if(false){
                throw  new InterruptedException();
            }
           // Thread.sleep(20);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        j++;
    }

    static void b(){
        System.out.println("i="+i+",j="+j);
    }

    static class RunA implements  Runnable{
        @Override
        public void run() {
            Test.a();
        }
    }

    static class RunB implements Runnable{

        @Override
        public void run() {
            Test.b();
        }
    }

    public static void main(String[] args){
        for (int i=0;i<100;i++){
           new Thread(new RunA()).start();
           new Thread(new RunB()).start();
        }
    }

}
