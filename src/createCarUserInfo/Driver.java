package createCarUserInfo;

public class Driver extends Factory {

   private String driverFullName;
   private int diriverIdNumber;
   private boolean wantCar;

   public Driver(String driverFullName, int diriverIdNumber, boolean wantCar,String factoryName, int factoryNumber, boolean factoryAccess) {
      super(factoryName, factoryNumber, factoryAccess);

      this.driverFullName = driverFullName;
      this.diriverIdNumber = diriverIdNumber;
      this.wantCar = wantCar;
   }

   public String getDriverFullName() {
      return driverFullName;
   }

   public void setDriverFullName(String driverFullName) {
      this.driverFullName = driverFullName;
   }

   public int getDiriverIdNumber() {
      return diriverIdNumber;
   }

   public void setDiriverIdNumber(int diriverIdNumber) {
      this.diriverIdNumber = diriverIdNumber;
   }

   public boolean getWantCar() {
      return wantCar;
   }

   public void setWantCar(boolean wantCar) {
      this.wantCar = wantCar;
   }



}
