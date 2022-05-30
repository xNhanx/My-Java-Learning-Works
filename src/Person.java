public class Person {
    private String firstName;
    private char middleName;
    private String lastName;
    private String fullName;
    private int age;

    public Person(String firstName, char middleName, String lastName, int age) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.age = age;
        this.fullName = String.format("%s %s %s", firstName, middleName, lastName);
    }

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.fullName = String.format("%s %s", firstName, lastName);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void printInfo() {
        System.out.printf("Your name is %s and your age is: %d\n", firstName, age);
    }
}

