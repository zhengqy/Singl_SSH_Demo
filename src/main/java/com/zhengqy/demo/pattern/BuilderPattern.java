package com.zhengqy.demo.pattern;

/**
 * Created by zheng on 2016/12/27.
 * 创建字段比较多的对象是用builder设计模式
 */
public class BuilderPattern {
    private final int servingSize;
    private final int servings;
    private final int calories;
    private final int fat;
    private final int sodium;
    private final int carbohyrate;

    public static class Builder{
        //必填字段
        private final int servingSize;
        private final int servings;
        //选填字段
        private int calories = 0;
        private int fat = 0;
        private int sodium = 0;
        private int carbohyrate = 0;

        public Builder(int servingSize,int servings){
            this.servings = servings;
            this.servingSize = servingSize;
        }

        public Builder calories(int calories){
            this.calories = calories;
            return this;
        }

        public Builder fat(int fat){
            this.fat = fat;
            return this;
        }

        public Builder sodium(int sodium){
            this.sodium = sodium;
            return this;
        }

        public Builder carbohyrate(int carbohyrate){
            this.carbohyrate = carbohyrate;
            return this;
        }

        public BuilderPattern build(){
            return new BuilderPattern(this);
        }
    }

    //私有构造器
    private BuilderPattern(Builder builder){
        this.servings = builder.servings;
        this.servingSize = builder.servingSize;
        this.calories = builder.calories;
        this.fat = builder.fat;
        this.sodium = builder.sodium;
        this.carbohyrate = builder.carbohyrate;
    }

    public int getServingSize() {
        return servingSize;
    }

    public int getServings() {
        return servings;
    }

    public int getCalories() {
        return calories;
    }

    public int getFat() {
        return fat;
    }

    public int getSodium() {
        return sodium;
    }

    public int getCarbohyrate() {
        return carbohyrate;
    }
}
