public class App {
    public static void main(String[] args) throws Exception {
        Stack<Integer> stack = new Stack<Integer>(10);
        System.out.println("You have successfully created a Stack!");

        if(stack.isEmpty())
        System.out.println("Stack is empty");
        else
        System.out.println("Stack is not empty");
        
        System.out.printf("%n");
        
        //output if stack is full or not
        if(stack.isFull())
        System.out.println("Stack is full");
        else
        System.out.println("Stack is not full");

        System.out.print("Elements pushed in the Stack: ");
        for (int i = 0; i < 5; i++) {
            stack.push(i); //pushes 5 elements (0-4 inclusive) to the stack
            System.out.print(i + " ");
        }
        System.out.println("\nIs Stack full? \n" + stack.isFull());
        System.out.print("Elements popped from the Stack: ");
        for (int i = 0; i < 5; i++) {
            System.out.print(stack.pop()+" "); //pops all 5 elements from the stack and prints them
        }
        System.out.println("\nIs Stack empty? \n" + stack.isEmpty());
    }
}
