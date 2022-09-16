package createCarUserInfo;

public class CarMain {
    public static void main(String[] args) {

        Driver enes=new Driver("Enes TORLAK",3489,true,"MERCEDES",1,true);
        Factory mercedes=new Factory("Mercedes",2,true);
        Car car=new Car(33432,"Black","Mercedes",2022,4,true,true,"GermanyMercedesFactory",3,true);
        Driver.creatCarSpeed(300);
        System.out.println(car.automaticTransmission);
        System.out.println(car.getSerialNumber());
        System.out.println(car.getFactoryName());
        car.goToFactory();


    }
}
