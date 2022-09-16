package createCarUserInfo;

public class Factory {


    private String factoryName;
    private int factoryNumber;
    private boolean factoryAccess;

    public Factory(String factoryName, int factoryNumber, boolean factoryAccess) {
        this.factoryName = factoryName;
        this.factoryNumber = factoryNumber;
        this.factoryAccess = factoryAccess;
    }

    public String getFactoryName() {
        return factoryName;
    }

    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName;
    }

    public int getFactoryNumber() {
        return factoryNumber;
    }

    public void setFactoryNumber(int factoryNumber) {
        this.factoryNumber = factoryNumber;
    }

    public boolean getFactoryAccess() {
        return factoryAccess;
    }

    public void setFactoryAccess(boolean factoryAccess) {
        this.factoryAccess = factoryAccess;
    }

   public static void creatCarSpeed(int speedLimiter){
       System.out.println("Your cars speed limit is = "+speedLimiter+" km/h");
   }


}
