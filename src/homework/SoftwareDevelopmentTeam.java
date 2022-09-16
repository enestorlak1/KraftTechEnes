package homework;

public class SoftwareDevelopmentTeam extends Person {
    private String teamName;
    private String domain;
    private int numberOfPersonel;

    public SoftwareDevelopmentTeam() {
    }

    public SoftwareDevelopmentTeam(int numberOfPersonel) {
        this.numberOfPersonel = numberOfPersonel;
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public String getDomain() {
        return domain;
    }

    public void setDomain(String domain) {
        this.domain = domain;
    }

    public int getNumberOfPersonel() {
        return numberOfPersonel;
    }

    public void setNumberOfPersonel(int numberOfPersonel) {
        this.numberOfPersonel = numberOfPersonel;
    }


    public void dailyTime(){
        System.out.println("DAILY TİME METODU ÇALIŞIYOR");
    }

    public void sprintTime(){
        System.out.println("SPRİNT TİME METODU ÇALIŞIYOR");
    }

    public static boolean metotAdı(String str){
        if(str.equals("ali")){
            return true;
        }
        return false;
    }

    public void over(){
        System.out.println("software class çalışıyor");
    }


}
