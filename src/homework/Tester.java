package homework;

public class Tester extends SoftwareDevelopmentTeam {
   boolean isManual;
  boolean isİdentifyProblems;

    public Tester(int numberOfPersonel,boolean isİdentifyProblems) {
        super(numberOfPersonel);
        this.isİdentifyProblems = isİdentifyProblems;
    }

    public Tester(int numberOfPersonel,boolean isManual, boolean isİdentifyProblems) {
        super(numberOfPersonel);
        this.isManual = isManual;
        this.isİdentifyProblems = isİdentifyProblems;
    }

    public boolean getManual() {
        return isManual;
    }

    public void setManual(boolean manual) {
        isManual = manual;
    }

    public void TesterSalary(int yearsOfExperience){
        super.salary=salary+(yearsOfExperience*(salary*2));
    }






}
