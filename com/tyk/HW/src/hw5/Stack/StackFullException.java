package hw5.Stack;

public class StackFullException extends Exception{
    public StackFullException(String message){
        super(message); //父类的 getMessage 方法将返回你在构造函数中传递的错误消息
    }
}
