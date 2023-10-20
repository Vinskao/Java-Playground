package hw5.Stack;


public class Stack {
    private int[] saveData;
    private int top; //最上層資料的註標值
    public Stack(int size){
        saveData = new int[size];
        top = -1;
    }
    public void push(int data) throws StackFullException{ //放資料
        if(top == saveData.length -1){
            throw new StackFullException("Stack full");
        } else {
            saveData[++top] = data; //top先+1後在saveData[]遍歷
        }
    }
    public int pop() throws StackEmptyException{ //取資料
        if (top >= 0){
            return saveData[top--];
        } else {
            throw new StackEmptyException("Stack empty");
        }
    }
}
