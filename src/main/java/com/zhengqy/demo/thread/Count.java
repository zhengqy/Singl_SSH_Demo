package com.zhengqy.demo.thread;

/**
 * Created by zhengqy on 2017/1/19.
 */
public class Count {
    private int num;

    public void count(){
        for (int i=0;i<10;i++){
            num = num + i;
        }
        System.out.println(Thread.currentThread().getName()+"_"+num);
    }

    public static void main(String[] args){
        Runnable runnable = new Runnable() {
            Count count = new Count();
            @Override
            public void run() {
                count.count();
            }
        };
        for (int i=0;i<10;i++){
            new Thread(runnable).start();
        }
    }
}
