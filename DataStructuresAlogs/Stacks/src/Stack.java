public class Stack <T> {
    private int top;
    private int maxSize; 
    private T arr[];

    public Stack(int arrSize){
        this.maxSize = arrSize;
        this.top = -1;
        arr = (T[]) new Object[arrSize];
    }

    public int capacity(){
        return maxSize;
    }

    public boolean isEmpty(){
        return top == -1;
    }

    public boolean isFull(){
        return top == maxSize-1;
    }

    public T top(){
        if(isEmpty())
            return null;
        return arr[top];
    }

    //inserts a value to the top of Stack
    public void push(T value){
        if(isFull()){
            System.err.println("Stack Is Full");
            return;
        }
        arr[++top] = value;
    }

    //removes a value from top of Stack and returns
    public T pop(){
        if(isEmpty())
            return null;
        return arr[top--]; //returns value and top and decrements the top
    }
}
