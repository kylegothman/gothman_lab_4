public class EmptyEmployeeNameException extends IllegalArgumentException {
  public EmptyEmployeeNameException(String errorMessage) {
      super(errorMessage);
      
  }
}