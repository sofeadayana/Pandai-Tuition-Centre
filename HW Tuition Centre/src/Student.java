public class Student {

    // data
    public Name name;
    public String IC;
    public String address;
    public String schoolName;
    public float marks [] = new float [5]; //array is always dynamic

    //constructor
    public void Student() {

    }

    //setters
    public void setName(Name thename) {
        this.name = thename;
    }

    public void setIC(String IC) {
        this.IC = IC;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public void setAddr(String address) {
        this.address = address;
    }

    void setMarks(float mark, int i) throws Exception {
        if (mark < 0)
            throw new Exception("Error in mark detected!");

        this.marks[i] = mark;
    }

    //getters
    public Name getName() {
        return name;
    }

    public String getIC() {
        return IC;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public String getAddr() {
        return address;
    }

    public float getMark(int j) {
        return marks[j];
    }

    // methods
    void displayMarks(){

        for (int i = 0; i < marks.length; i++){
            System.out.println("Marks #" + i + 1 + ": " + marks[i]);
        }
    }

    public float calcAvg() { // no need parameters, as marks is already accessible

        float sum = 0;

        for (int i = 0; i < marks.length; i++) {
            sum += marks[i];
        }

        float avg = sum / marks.length;

        return avg;
    }

    public float findMin() {

        float min = 99999;

        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min)
                min = marks[i];
        }
        return min;

    }
}
