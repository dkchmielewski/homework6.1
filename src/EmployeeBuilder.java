import java.util.Scanner;

public class EmployeeBuilder {
    public Employee createEmployee() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = scanner.nextLine();
        System.out.println("Last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Salary: ");
        double salary = scanner.nextDouble();
        return new Employee(firstName, lastName, salary);
    }

    void salaryCost(Employee[] employees) {
        double salary1 = employees[0].getSalary();
        double salary2 = employees[1].getSalary();
        double salaryCost = salary1 + salary2;
        System.out.println("Koszt wynagrodzen dla pracownikow: " + salaryCost);
    }


}
