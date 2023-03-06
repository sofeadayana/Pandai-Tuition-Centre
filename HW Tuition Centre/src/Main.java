/*
A client has a tuition centre for SPM Maths. There are 5 temporary teachers and 100 students.
The centre hire teachers. The head of centre records their name, IC, address and background info
(includes years of teaching & qualification).
Every student needs to complete 5 trial tests. The marks for each test is per 100.
The centre records name, IC, address and school name for each student. The teachers split the students among
themselves based on the average marks range.

Each student sits through  a series of 5 trial test. Each test covers different set of topics.
The center calculates the avg for each student.
And each student will be assigned to the teachers based on the avg:
< 30: Mr Hassan
30-50: Mr Gopal
50-70: Mr Li
70-80: Cikgu Minah
80-100: Mr Raju
Each teacher must have at least 5 years experience.
*/

// application team in UTP
import java.util.Scanner;

public class Main
{

    //application class 
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        float average = 0;
        String assignedTeacher;

        //MIKE
        //mike.name = "Michael"; not good bcs users can access object directly   
        Student mike = new Student();
        Name michael = new Name();
        michael.setFirstName("Michael ");
        michael.setMidName("Learns To ");
        michael.setLastName("Rock");
        mike.setName(michael);
        mike.setIC("030403028897");
        mike.setAddr("Taman Orkid, Bangi");
        mike.setSchoolName("SMJK Tiong Hua");

        try {  // try block.. something in here can cause exception
            mike.setMarks(100, 0);
            mike.setMarks(56, 1);
            mike.setMarks(77, 2);
            mike.setMarks(23, 3);
            mike.setMarks(89, 4);

        } catch (Exception ex) {  // catch block.. action to be taken in case of Exception

            System.out.println("Error! Cannot continue..");
            ex.printStackTrace();
        }

        //ADILA
        Student adila = new Student();
        Name abi = new Name(); //"new" means create a new object
        abi.setFirstName("Adila ");
        abi.setMidName("binti ");
        abi.setLastName("Izzat");
        adila.setName(abi);
        adila.setIC("040607089098");
        adila.setAddr("Kampung Berjaya, Gombak");
        adila.setSchoolName("SMK St Cecilia");

        try {  // try block.. something in here can cause exception
            adila.setMarks(98, 0);
            adila.setMarks(90, 1);
            adila.setMarks(85, 2);
            adila.setMarks(88, 3);
            adila.setMarks(91, 4);

        } catch (Exception ex) {  // catch block.. action to be taken in case of Exception

            System.out.println("Error! Cannot continue..");
            ex.printStackTrace();
        }

        //IMRAN
        Student imran = new Student();
        Name sis = new Name("Syed ", "Imran ", "Syah");
        imran.setName(sis);
        imran.setIC("030201056755");
        imran.setAddr("Taman Hup Seng, Setapak");
        imran.setSchoolName("SMK Taman Mawar");

        try {  // try block.. something in here can cause exception
            imran.setMarks(21, 0);
            imran.setMarks(50, 1);
            imran.setMarks(12, 2);
            imran.setMarks(10, 3);
            imran.setMarks(5, 4);

        } catch (Exception ex) {  // catch block.. action to be taken in case of Exception

            System.out.println("Error! Cannot continue..");
            ex.printStackTrace();
        }

        //creating StudentBatch object
        StudentBatch sb2023 = new StudentBatch();
        sb2023.add(mike, 0);
        sb2023.add(adila, 1);
        sb2023.add(imran, 2);

        //MR HASAN
        Teacher hasan = new Teacher();
        Name hsn = new Name();
        hsn.setFirstName("Hasan ");
        hsn.setMidName("bin ");
        hsn.setLastName("Husain");
        hasan.setName(hsn);
        hasan.setIC("730421035547");
        hasan.setAddr("Taman Jago, Seremban");
        hasan.setYearExp(10);

        //MR GOPAL
        Teacher gopal = new Teacher();
        Name gpl = new Name();
        gpl.setFirstName("Gopal ");
        gpl.setMidName("Ravindran ");
        gpl.setLastName("Raj");
        gopal.setName(gpl);
        gopal.setIC("780908076655");
        gopal.setAddr("Taman Permata, Klang");
        gopal.setYearExp(12);

        //MR LI 
        Teacher li = new Teacher();
        Name lee = new Name("Li ", "Chong ", "Wei");
        li.setName(lee);
        li.setIC("800707076551");
        li.setAddr("Villa Hill, Puchong");
        li.setYearExp(6);

        //CIKGU MINAH 
        Teacher minah = new Teacher();
        Name min = new Name("Aminah ", "binti ", "Amin");
        minah.setName(min);
        minah.setIC("750101025544");
        minah.setAddr("Bukit Bintang, Kuala Lumpur");
        minah.setYearExp(8);

        //MR RAJU 
        Teacher raju = new Teacher();
        Name raj = new Name("Raju ", "Devi ", "Shangkar");
        raju.setName(raj);
        raju.setIC("900504067799");
        raju.setAddr("Bukit Jelutong, Shah Alam");
        raju.setYearExp(5);

        //OUTPUT
        System.out.print("******WELCOME TO PANDAI TUITION CENTRE!******");
        System.out.println("\n\nList of students registered:\n1. Michael\n2. Adila\n3. Imran");
        System.out.print("\nEnter a student to check (using number): ");
        int check = input.nextInt();
        input.nextLine();

        switch (check) {

            case 1:
                //System.out.println(mike.getName());
                System.out.println("\nName: " + michael.getFName() + michael.getMName() + michael.getLName());
                System.out.println("IC: " + mike.getIC());
                System.out.println("Address: " + mike.getAddr());
                System.out.println("School Name: " + mike.getSchoolName());
                System.out.println("\nMARKS FOR TRIAL TESTS");

                //print marks
                for (int i = 0; i < mike.marks.length; i++) {
                    int j = 0;
                    j = j + i + 1;
                    System.out.println("Mark #" + j + ": " + mike.getMark(i));
                }

                // calculate and print average
                average = mike.calcAvg();
                System.out.println("\nAverage = " + average);

                // calculate the min marks

                System.out.println("Minimum = " + mike.findMin());
                break;

            case 2:
                System.out.println("\nName: " + abi.getFName() + abi.getMName() + abi.getLName());
                System.out.println("IC: " + adila.getIC());
                System.out.println("Address: " + adila.getAddr());
                System.out.println("School Name: " + adila.getSchoolName());
                System.out.println("\nMARKS FOR TRIAL TESTS");

                //print marks
                for (int i = 0; i < adila.marks.length; i++) {
                    int j = 0;
                    j = j + i + 1;
                    System.out.println("Mark #" + j + ": " + adila.getMark(i));
                }

                // calculate and print average
                average = adila.calcAvg();
                System.out.println("\nAverage = " + average);

                // calculate the min marks
                System.out.println("Minimum = " + adila.findMin());
                break;

            case 3:
                System.out.println("\nName: " + sis.getFName() + sis.getMName() + sis.getLName());
                System.out.println("IC: " + imran.getIC());
                System.out.println("Address: " + imran.getAddr());
                System.out.println("School Name: " + imran.getSchoolName());
                System.out.println("\nMARKS FOR TRIAL TESTS");

                //print marks
                for (int i = 0; i < imran.marks.length; i++) {
                    int j = i + 1;
                    System.out.println("Mark #" + j + ": " + imran.getMark(i));
                }

                // calculate and print average
                average = imran.calcAvg();
                System.out.println("\nAverage = " + average);

                // calculate the min marks
                System.out.println("Minimum = " + imran.findMin());
                break;

            default:
                System.out.println("\nError! Data does not exist.");
                return;
        }

        if (average < 30) {
            assignedTeacher = "Mr Hasan";
            System.out.println("\nAssigned teacher: " + assignedTeacher);
            System.out.println("Name: " + hsn.getFName() + hsn.getMName() + hsn.getLName());
            System.out.println("IC: " + hasan.getIC());
            System.out.println("Address: " + hasan.getAddr());
            System.out.println("Years of teaching exp: " + hasan.getYearExp());
            System.out.println("Qualification: " + hasan.isQualified());
        }

        else if (average >= 30 && average < 50) {
            assignedTeacher = "Mr Gopal";
            System.out.println("\nAssigned teacher: " + assignedTeacher);
            System.out.println("Name: " + gpl.getFName() + gpl.getMName() + gpl.getLName());
            System.out.println("IC: " + gopal.getIC());
            System.out.println("Address: " + gopal.getAddr());
            System.out.println("Years of teaching exp: " + gopal.getYearExp());
            System.out.println("Qualification: " + gopal.isQualified());
        }

        else if (average >= 50 && average < 70) {
            assignedTeacher = "Mr Li";
            System.out.println("\nAssigned teacher: " + assignedTeacher);
            System.out.println("Name: " + lee.getFName() + lee.getMName() + lee.getLName());
            System.out.println("IC: " + li.getIC());
            System.out.println("Address: " + li.getAddr());
            System.out.println("Years of teaching exp: " + li.getYearExp());
            System.out.println("Qualification: " + li.isQualified());
        }

        else if (average >= 70 && average < 80) {
            assignedTeacher = "Cikgu Minah";
            System.out.println("\nAssigned teacher: " + assignedTeacher);
            System.out.println("Name: " + min.getFName() + min.getMName() + min.getLName());
            System.out.println("IC: " + minah.getIC());
            System.out.println("Address: " + minah.getAddr());
            System.out.println("Years of teaching exp: " + minah.getYearExp());
            System.out.println("Qualification: " + minah.isQualified());
        }

        else if (average >= 80 && average <= 100) {
            assignedTeacher = "Mr Raju";
            System.out.println("\nAssigned teacher: " + assignedTeacher);
            System.out.println("Name: " + raj.getFName() + raj.getMName() + raj.getLName());
            System.out.println("IC: " + raju.getIC());
            System.out.println("Address: " + raju.getAddr());
            System.out.println("Years of teaching exp: " + raju.getYearExp());
            System.out.println("Qualification: " + raju.isQualified());
        }

        System.out.print("\n\nEnter student name to find: ");
        String find = input.nextLine();
        boolean isIn = sb2023.find(find);
        System.out.println("It is " + isIn + " that student is registered in this tuition centre.");

    }

}