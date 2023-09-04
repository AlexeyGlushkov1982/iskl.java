package TASK4;

public class InsufficientFundsException extends Exception {
    private String name;
    private String errorMessage;
    public InsufficientFundsException(String name) {
        this.name = name;
    }
    @Override
    public String getMessage() {
        return super.getMessage();
    }

}