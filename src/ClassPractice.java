import java.util.Scanner;

public class ClassPractice {


    public static void main(String[] args) {
        Student studentBody = new Student((byte) 2, 2025, "Nhan", 'T', "Dang", 25);
        studentBody.setSchoolYear((byte) 4);
        studentBody.printInfo();
    }
}
