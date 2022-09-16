package Day_35_INHERITANCE;

public class Vehicle {
    //truck is a vehicle
    //minibus is a vehicle
    String type;
    double  price;
    String color;


    public void sellPriceWithTaxt(double price){
        price+=price*0.10;
        System.out.println(price);
    }
}
