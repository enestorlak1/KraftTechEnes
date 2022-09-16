package createCarUserInfo;

public class Car extends Factory{
    private int serialNumber;
    public  String carColor;
    public String carBrand;
    protected int carModel;
    int wheelsNumber;
    boolean automaticTransmission;
    private boolean shareInfo;

    public Car(int serialNumber, String carColor, String carBrand, int carModel, int wheelsNumber, boolean automaticTransmission, boolean shareInfo,String factoryName, int factoryNumber, boolean factoryAccess) {
       super( factoryName,  factoryNumber,  factoryAccess);
        this.serialNumber = serialNumber;
        this.carColor = carColor;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.wheelsNumber = wheelsNumber;
        this.automaticTransmission = automaticTransmission;
        this.shareInfo = shareInfo;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public boolean getShareInfo() {
        return shareInfo;
    }

    public void setShareInfo(boolean shareInfo) {
        this.shareInfo = shareInfo;
    }

    public void goToFactory(){
        if(this.shareInfo==true){
            System.out.println("your information shared with factory");
        }else{
            System.out.println("your information didn't share with factory ");
        }

    }





}
