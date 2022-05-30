public class Student extends Person {

    private byte schoolYear;
    private int expectedGradDate;

    public Student(byte schoolYear, int expectedGradDate, String firstName, char middleName, String lastName, int age) {
        super(firstName, middleName, lastName, age);
        this.schoolYear = schoolYear;
        this.expectedGradDate = expectedGradDate;
    }

    public Student(byte schoolYear, int expectedGradDate, String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        this.schoolYear = schoolYear;
        this.expectedGradDate = expectedGradDate;

    }

    public void setSchoolYear(byte schoolYear) {
        this.schoolYear = schoolYear;
    }

    public byte getSchoolYear() {
        return this.schoolYear;
    }

    @Override
    public void printInfo() {
        System.out.printf("Current school year: %d Grad Date: %d\n", schoolYear, expectedGradDate);
        super.printInfo();
    }
}
