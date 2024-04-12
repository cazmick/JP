public class Queue {
    int SIZE ;
    int items[] ;
    int front, rear;

    Queue(int size){
        this.SIZE=size;
        this.items = new int[SIZE];
        this.front=-1;
        this.rear=-1;
    }
    public void enQueue(int element){
        if(isFull()){
            System.out.println("Queue Overflow");
            System.exit(1);
        }else {
            if(front==-1){
                front=0;
            }
            items[++rear] = element;
            System.out.println("Inserting Element : "+element);
        }
    }
    public int deQueue(){
        int cuurentFront;
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }else {
            cuurentFront= items[front];
            if(front>=rear){
                front=-1;
                rear=-1;
            }else {
                front++;
            }
            System.out.println("Deleteing Front : "+ cuurentFront);
            return cuurentFront;
        }
    }

    public void display(){
        if(isEmpty()){
            System.out.println("Empty Queue");
        }else {
            System.out.println("Current Front index  "+front);
            System.out.println("Current Rear index "+rear);
            for(int i = front;i<=rear;i++){
                System.out.print(items[i] +" ");
            }
        }
    }

    protected boolean isEmpty(){
        if(front==-1){
            return true;
        }else {
            return false;
        }
    }

    protected boolean isFull(){
        if(front<=0&&rear==SIZE-1){
        return true;
        }else {
            return false;
        }
    }
    public void peek(){
        System.out.println("Peek Value "+items[front]);
    }

}
