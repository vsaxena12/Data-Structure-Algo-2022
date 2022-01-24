package stack;

public class ReverseString {
    public int maxValue;
    public char[] stack;
    public int top;

    public ReverseString() {

    }

    public ReverseString(int size){
        this.maxValue = size;
        this.stack = new char[this.maxValue];
        this.top = -1;
    }

    

    public void push(char c){
        if(isFull()){
            System.err.println("Stack Is Full!");
        }
        else{
            top++;
            stack[top] = c;
        }
        
    }

    public char pop(){
        if(isEmpty()){
            System.err.println("Stack Is Empty!");
            return '0';
        }
        else{
            int oldElement = top;
            top--;
            return stack[oldElement];
        }
         
    }

    public char peak(){
        return stack[top];
    }

    public boolean isEmpty(){
        return (top == -1);
    }

    public boolean isFull(){
        return (maxValue-1 == top);
    }

}
