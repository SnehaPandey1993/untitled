package Queue;

class QNode {
    int key;
    QNode next;

    public QNode(int key) {
        this.key = key;
        this.next=null;
    }
}
public class LLQueueImpl {
    QNode front,rear;
    public LLQueueImpl(){
        this.front=null;
        this.rear=null;
     }
     void enqueue(int key){
        QNode temp=new QNode(key);
        if(this.rear==null){
            this.front=this.rear=temp;
            return;
        }
        this.rear.next=temp;
        this.rear=temp;

     }

     void deque(){
        if(this.front==null){
            return;
        }
        QNode temp=this.front;
        this.front=this.front.next;
        if(this.front==null)
          this.rear=null;
     }
     public static void main(String args[]){
        LLQueueImpl queue= new LLQueueImpl();
        queue.enqueue(10);
        queue.enqueue(21);
        queue.enqueue(11);
        queue.enqueue(43);
        queue.enqueue(32);
        queue.deque();
        queue.deque();
         queue.enqueue(11);
         queue.enqueue(33);
         queue.enqueue(37);
         queue.deque();
         queue.deque();
         System.out.println(" Front "+(queue.front!=null?queue.front.key:-1));
         System.out.println("rear "+(queue.rear!=null?queue.rear.key:-1));
     }

}
