package com.zhengqy.demo.pattern;


/**
 * Created by zheng on 2016/12/27.
 */
public class BuilderPatternTest {
    public static void main(String[] args){
        BuilderPattern builderPattern = new BuilderPattern.Builder(240,12).calories(10).build();
        System.out.println(builderPattern.getServings());
    }
}
