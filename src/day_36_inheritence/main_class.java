package day_36_inheritence;

public class main_class {
    public static void main(String[] args) {

       VanKedisi vankedisi=new VanKedisi(4,"siyah",false,true);
        System.out.println(vankedisi.isDifferentEyes);
        System.out.println(vankedisi.isNankor);
        System.out.println(vankedisi.color);
        vankedisi.color="beyaz";
        System.out.println(vankedisi.color);

    }




}
