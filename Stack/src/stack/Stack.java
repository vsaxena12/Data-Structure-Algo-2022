package stack;

public class Stack {
    public int maxValue;
    public long[] stack;
    public int top;

    public Stack() {

    }

    public Stack(int size){
        this.maxValue = size;
        this.stack = new long[this.maxValue];
        this.top = -1;
    }

    

    public void push(int num){
        if(isFull()){
            System.err.println("Stack Is Full!");
        }
        else{
            top++;
            stack[top] = num;
        }
        
    }

    public long pop(){
        if(isEmpty()){
            System.err.println("Stack Is Empty!");
            return -1;
        }
        else{
            int oldElement = top;
            top--;
            return stack[oldElement];
        }
         
    }

    public long peak(){
        return stack[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxValue-1 == top);
    }

}
