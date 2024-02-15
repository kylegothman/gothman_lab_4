import java.util.Scanner;

public class PayrollDemo {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter employee's name: ");
            String name = scanner.nextLine();
            
            System.out.print("Enter employee's ID number: ");
            String id = scanner.nextLine();
            
            Payroll employee = new Payroll(name, id);
            
            System.out.print("Enter hourly pay rate: ");
            double rate = scanner.nextDouble();
            employee.setHourlyPayRate(rate); // Validation inside
            
            System.out.print("Enter number of hours worked: ");
            double hours = scanner.nextDouble();
            employee.setHoursWorked(hours); // Validation inside
            
            System.out.printf("Gross pay for %s (ID: %s) is: %.2f\n", employee.getEmployeeName(), employee.getIdNumber(), employee.calculateGrossPay());
        } catch (EmptyEmployeeNameException | InvalidIDNumberException | InvalidHoursWorkedException | InvalidHourlyRateException e) {
            System.err.println(e.getMessage());
        }
    }
}

