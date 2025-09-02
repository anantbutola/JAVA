package COLLEGE_ASSIGNMENTS;

public class testStaticNonStatic {

    static String UniversityName;

    String studentName;
    int rollNum;

    static {
        UniversityName = "GRAPHIC ERA UNIVERSITY";
        System.out.println("Static block executed");
    }

    testStaticNonStatic(String name, int rno) {
        this.studentName = name;
        this.rollNum = rno;
    }

    static void displayUni() {
        System.out.println("College Name: " + UniversityName);
    }

    void displayInfo() {
        System.out.println("Student Name: " + studentName);
        System.out.println("Roll Number: " + rollNum);
    }

    public static void main(String[] args) {

        testStaticNonStatic.displayUni();

        testStaticNonStatic s1 = new testStaticNonStatic("Rishita", 55);
        testStaticNonStatic s2 = new testStaticNonStatic("Diksha", 28);
        s1.displayInfo();
        System.out.println();
        s2.displayInfo();

        testStaticNonStatic.displayUni();
    }
}