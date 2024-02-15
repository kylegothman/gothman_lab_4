public class Payroll {
  private String employeeName;
  private String idNumber;
  private double hourlyPayRate;
  private double hoursWorked;

  // Constructor
  public Payroll(String employeeName, String idNumber) {
      if (employeeName == null || employeeName.trim().isEmpty()) {
          throw new EmptyEmployeeNameException("Employee name cannot be empty.");
      }
      if (idNumber == null || idNumber.trim().isEmpty()) {
          throw new InvalidIDNumberException("ID number cannot be empty.");
      }
      this.employeeName = employeeName;
      this.idNumber = idNumber;
  }

  // Accessor methods (getters)
  public String getEmployeeName() {
      return employeeName;
  }

  public String getIdNumber() {
      return idNumber;
  }

  public double getHourlyPayRate() {
      return hourlyPayRate;
  }

  public double getHoursWorked() {
      return hoursWorked;
  }

  // Mutator methods (setters)
  public void setEmployeeName(String employeeName) {
      if (employeeName == null || employeeName.trim().isEmpty()) {
          throw new EmptyEmployeeNameException("Employee name cannot be empty.");
      }
      this.employeeName = employeeName;
  }

  public void setIdNumber(String idNumber) {
      if (idNumber == null || idNumber.trim().isEmpty()) {
          throw new InvalidIDNumberException("ID number cannot be empty.");
      }
      this.idNumber = idNumber;
  }

  public void setHourlyPayRate(double hourlyPayRate) {
      if (hourlyPayRate < 0 || hourlyPayRate > 25) {
          throw new InvalidHourlyRateException("Hourly pay rate must be between 0 and 25.");
      }
      this.hourlyPayRate = hourlyPayRate;
  }

  public void setHoursWorked(double hoursWorked) {
      if (hoursWorked < 0 || hoursWorked > 84) {
          throw new InvalidHoursWorkedException("Hours worked must be between 0 and 84.");
      }
      this.hoursWorked = hoursWorked;
  }

  // Method to calculate gross pay
  public double calculateGrossPay() {
      return hourlyPayRate * hoursWorked;
  }
}