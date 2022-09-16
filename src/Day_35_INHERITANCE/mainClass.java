package Day_35_INHERITANCE;

public class mainClass {
    public static void main(String[] args) {

        ChildClass childClass=new ChildClass();
        childClass.printMessage_p();//childclass parent class özelliklerine erişti.
        childClass.printMessageC();

        ParentClass parentClass=new ParentClass();
         parentClass.printMessage_p();
         //parent class child class çzelliklerine erişemiyor.



    }
}
