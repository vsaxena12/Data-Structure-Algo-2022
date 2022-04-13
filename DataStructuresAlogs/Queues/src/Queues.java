public class Queues<T> {
    private T array[];
    private int maxSize;
    private int front;
    private int back;
    private int currentSize;

    public Queues(int maxSize){
        this.maxSize = maxSize;
        array = (T[]) new Object[maxSize];
        this.front = 0;
        this.back = -1;
        this.currentSize = 0;
    }

    public int getMaxSize(){
        return maxSize;
    }

    public int getCurrentSize(){
        return currentSize;
    }

    
}
