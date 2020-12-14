package lesson5;

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", 30, "CEO",
                "ceo@company.com", "81234567890", 200_000);

        employees[1] = new Employee("Petrov Petr", 42, "Engineer",
                "PetrovP@company.com", "89991234567", 70_000);

        employees[2] = new Employee("Zhukov Alexey", 44, "Worker",
                "ZhikovA@company.com", "8991234567890", 80_000);

        employees[3] = new Employee("Alexeev Alexandr", 35, "Manager",
                "AlexeevA@company.com", "81234576890", 70_000);

        employees[4] = new Employee("Sidorov Andrey", 47, "Manager",
                "SidorovA@company.com", "88881234678", 50_000);

        for (Employee employee : employees) {
            if (employee.getAge() > 40) {
                System.out.println(employee.toString());
            }
        }
    }
}
