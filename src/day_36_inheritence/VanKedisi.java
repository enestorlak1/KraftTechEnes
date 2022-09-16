package day_36_inheritence;

public class VanKedisi extends Cat {
    boolean isDifferentEyes;

    public VanKedisi(int foodCount,String color,boolean isNankor){
        super(foodCount,color,isNankor);

    }
    public VanKedisi(int foodCount,String color,boolean isNankor,boolean isDifferentEyes){
        super(foodCount,color,isNankor);
        this.isDifferentEyes=isDifferentEyes;
    }
}
