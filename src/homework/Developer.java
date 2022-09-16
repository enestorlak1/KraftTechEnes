package homework;

public class Developer extends SoftwareDevelopmentTeam {
    protected String softwareLanguage;
    private int memberNum;
    String softwareLanguageTeam;

    public Developer() {

        System.out.println("boş const çalışıyor");
    }

    public Developer(String softwareLanguage, int memberNum, String softwareLanguageTeam) {
        this.softwareLanguage = softwareLanguage;
        this.memberNum = memberNum;
        this.softwareLanguageTeam = softwareLanguageTeam;
    }

    public Developer( int memberNum) {
        this();
        System.out.println("int parametreli constructor çalışıyor");
        this.memberNum = memberNum;
    }

    public Developer(String softwareLanguage) {
        this(45);
        System.out.println("ilk giriş yapılan constructor çalışıyor");
        this.softwareLanguage = softwareLanguage;
    }

    public String getSoftwareLanguage() {
        return softwareLanguage;
    }

    public void setSoftwareLanguage(String softwareLanguage) {
        this.softwareLanguage = softwareLanguage;
    }

    public int getMemberNum() {
        return memberNum;
    }

    public void setMemberNum(int memberNum) {
        this.memberNum = memberNum;
    }
    public int getId() {
        setId(345);
        return super.getId();
    }

}

