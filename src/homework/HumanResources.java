package homework;

public class HumanResources extends Person {
   private String areaResponsibility;
   boolean isCustomerSatisfaction;

    public HumanResources(String areaResponsibility, boolean isCustomerSatisfaction) {
        this.areaResponsibility = areaResponsibility;
        this.isCustomerSatisfaction = isCustomerSatisfaction;
    }

    public String getAreaResponsibility() {
        return areaResponsibility;
    }

    public void setAreaResponsibility(String areaResponsibility) {
        this.areaResponsibility = areaResponsibility;
    }
}
