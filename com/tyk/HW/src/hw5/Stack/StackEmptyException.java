package hw5.Stack;

public class StackEmptyException extends Exception{
    public StackEmptyException(String stackEmpty) {
        super("Stack empty");
    }
}
