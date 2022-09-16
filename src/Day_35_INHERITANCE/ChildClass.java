package Day_35_INHERITANCE;

public class ChildClass extends ParentClass {


    public void printMessageC(){
        System.out.println(" hello from childClass");
        printMessage_p();// parent class metodu direkt çağrıldı

    }

}
