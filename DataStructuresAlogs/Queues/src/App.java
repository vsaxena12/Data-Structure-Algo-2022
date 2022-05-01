public class App {
    public static void main(String[] args) throws Exception {
        Queues<Integer> queue = new Queues<Integer>(5);
        System.out.println("You have successfully created a Queue!");
        System.out.println(queue.getMaxSize());
        System.out.println(queue.getCurrentSize());
        
    }
}
