public class Teacher {

    //data
    private Name name;
    private String IC;
    private String address;
    private int yearExp;
    private String qualify;

    //constructor
    public void Teacher() {

    }

    //setters
    public void setName(Name thename) {
        this.name = thename;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public void setAddr(String address) {
        this.address = address;
    }

    public void setYearExp(int yearExp) {
        this.yearExp = yearExp;
    }

    //getters
    public Name getName() {
        return name;
    }

    public String getIC() {
        return IC;
    }

    public String getAddr() {
        return address;
    }

    public int getYearExp() {
        return yearExp;
    }

    //method
    public String isQualified() {

        if (yearExp >= 5)
            qualify = "Qualified";

        else
            qualify = "Not qualified";

        return qualify;
    }

}
