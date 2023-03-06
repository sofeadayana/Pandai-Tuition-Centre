public class StudentBatch {

    //StudentBatch is a list of students registered in a StudentBatch
    //"list of students" is an array of Student

    //data section
    private Student stud [] = new Student [10];
    private int n = 0; // n is current size

    //constructor
    public void StudentBatch() {

    }

    //operation
    public void add(Student s, int i) {

        stud[i] = s;
    }

    //method overloading
    public void add(Student s) {

        stud[n] = s;
        n++;
        //stud[n++] = s
    }

    public boolean find(String name) {

        System.out.println("\nFinding student...");
        for (int i = 0; i < n; i++) {

            //if (stud[i] == name)
            if (stud[i].name.equals(name))
                return true;
        }
        return false;
    }
}
