package lesson5;

public class Employee {
    private String name;
    private int age;
    private String position;
    private String email;
    private String phone;
    private int salary;

    public Employee(String name, int age, String position, String email, String phone, int salary) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Работник: " +
                "имя = " + name +
                ", возраст = " + age +
                ", должность = " + position +
                ", email = " + email +
                ", телефон = " + phone +
                ", зарплата = " + salary;
    }

    public int getAge() {
        return age;
    }
}
