package hw5.Stack;

public class StackFullException extends Exception{
    public StackFullException(String stackFull){
        super("Stack full");
    }
}
