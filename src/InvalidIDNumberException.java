public class InvalidIDNumberException extends IllegalArgumentException {
  public InvalidIDNumberException(String errorMessage) {
      super(errorMessage);
  }
}