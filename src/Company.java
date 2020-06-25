public class Company {
    public static void main(String[] args) {
        EmployeeBuilder employeeBuilder = new EmployeeBuilder();

        Employee employee1 = employeeBuilder.createEmployee();
        Employee employee2 = employeeBuilder.createEmployee();

        Employee[] employees = new Employee[5];
        employees[0] = employee1;
        employees[1] = employee2;

        EmployeeCalculations employeeCalculations = new EmployeeCalculations();

        employeeCalculations.salaryCost(employees);
    }
}
