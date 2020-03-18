public class StackBracket {
    private char[] stackArray;
    private int top;

    public StackBracket(int maxSize) {
        stackArray = new char[maxSize];
        top = -1;
    }

    public void push(char ch){
        stackArray[++top] = ch;
    }
    public char pop(){
        return stackArray[top--];
    }
    public char peek(){
        return stackArray[top];
    }
    public boolean isEmpty(){
        return (top == - 1);
    }
}
