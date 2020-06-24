import java.util.Scanner;

public class Methods {
    public void createEmployee(Employee employee) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First name: ");
        String firstName = scanner.nextLine();
        System.out.println("Last name: ");
        String lastName = scanner.nextLine();
        System.out.println("Salary: ");
        double salary = scanner.nextDouble();
        System.out.println(firstName + " " + lastName + " " + salary);
    }

    void printArray(Employee[] employees) {
    }


}
