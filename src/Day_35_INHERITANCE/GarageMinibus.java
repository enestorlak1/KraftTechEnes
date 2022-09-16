package Day_35_INHERITANCE;

public class GarageMinibus {
    public static void main(String[] args) {

        Minibus minibus=new Minibus();
        minibus.type="minibüs";
        minibus.color="mavi";
        minibus.seat=14;
        minibus.sellPriceWithTaxt(50000);
        minibus.using();
        minibus.toString();



    }

}class GaraheTruck{
    public static void main(String[] args) {
        Truck truck=new Truck();
        truck.carryingCapasity=16000;
        truck.type="kamyon";
        truck.color="kırmızı";
        truck.sellPriceWithTaxt(120000);
        truck.carrying();
        truck.toString();
    }

}
