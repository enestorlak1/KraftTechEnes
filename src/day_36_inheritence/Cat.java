package day_36_inheritence;

public class Cat extends Animal {
    boolean isNankor;

    public Cat(int foodCount,String color,boolean isNankor){
        super(foodCount,color);
        this.isNankor=isNankor;
    }



     }