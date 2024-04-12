//public class DoubleEndQueue{
//
//    DoubleEndQueue(int size) {
//        this.SIZE = size;
//        this.items= new int[SIZE];
//        this.front=-1;
//        this.rear=0;
//
//    }
//    public  void enQueueFront(int elements){
//        if(isFull()){
//            System.out.println("Queue Overflow");
//            System.exit(1);
//        }else {
//            if(front==-1){
//                front=0;
//                rear=0;
//            } else if (front==0) {
//                front=SIZE-1;
//            }else {
//                front = front-1;
//            }
//            items[front]=elements;
//        }
//    }
//
//
//}
