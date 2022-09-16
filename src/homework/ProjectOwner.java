package homework;

public class ProjectOwner extends SoftwareDevelopmentTeam {

  private   boolean isTechnical;
  protected int howOld;


    public ProjectOwner(boolean isTechnical, int howOld) {
        this.isTechnical = isTechnical;
        this.howOld = howOld;
    }

    public ProjectOwner(boolean isTechnical){
      this.isTechnical=isTechnical;
  }

    public boolean getTechnical() {
        return isTechnical;
    }

    public void setTechnical(boolean technical) {
        isTechnical = technical;
    }

    public static int sub(int a,int b){

        return a*b;
    }

}
