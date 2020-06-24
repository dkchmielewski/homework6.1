import java.util.Scanner;

public class Company {
    public static void main(String[] args) {
        Methods methods = new Methods();
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        methods.createEmployee(employee1);
        methods.createEmployee(employee2);

        Employee[] employees = new Employee[5];
        employees[0] = employee1;
        employees[1] = employee2;

        methods.printArray(employees);
    }
}
