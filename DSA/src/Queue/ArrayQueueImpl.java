package Queue;

public class ArrayQueueImpl {
    int front ,rear,size ,capacity;
    int[] array;

    public ArrayQueueImpl(int capacity) {
        this.capacity = capacity;
        front=this.size=0;
        rear=capacity-1;
        array=new int[this.capacity-1];
    }

    //if full
    boolean ifFull(ArrayQueueImpl queue){
        if(queue.size==queue.capacity){
            return true;
        }else
        return false;
    }

    //if empty
    boolean ifEmpty(ArrayQueueImpl queue){
        if (queue.size==0){
            return true;
        }else
        return false;
    }
    //enqueue from rear
    void enQueue(int item){
        if(ifFull(this))return;
        this.rear=(this.rear+1)% this.capacity;
        this.array[this.rear]=item;
        this.size=+1;
        System.out.println("enqued  "+item);
    }
    //dequeue from front
    int deQueue(){
        if(ifEmpty(this)) return Integer.MIN_VALUE;
        int item=array[this.front];
        this.front=(this.front+1)%this.capacity;
        this.size=-1;
        System.out.println("dequeued "+item);
       return item;
    }
    public static void main(String args[]){
        ArrayQueueImpl queue=new ArrayQueueImpl(10);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        System.out.println("Capacity  "+queue.capacity+"  front  "+queue.front+ "  rear  "+queue.rear+  " dequed "+ queue.deQueue());
        System.out.println();;

    }
}
