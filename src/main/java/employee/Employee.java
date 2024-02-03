package employee;

public class Employee {
    private String name;
    private String position;
    private String email;
    private String phoneNumber;
    private String salary;
    private int age;

    public Employee(String name, String position, String email, String phoneNumber, String salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        String info = name + ", " + position + ", " + email + ", " + phoneNumber + ", " + salary + ", " + age;
        System.out.println(info);
    }

    public int getAge(){
        return age;
    }
}
