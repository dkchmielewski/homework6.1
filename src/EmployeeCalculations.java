public class EmployeeCalculations {
    void salaryCost(Employee[] employees) {
        double salary1 = employees[0].getSalary();
        double salary2 = employees[1].getSalary();
        double salaryCost = salary1 + salary2;
        System.out.println("Koszt wynagrodzen dla pracownikow: " + salaryCost);
    }
}
