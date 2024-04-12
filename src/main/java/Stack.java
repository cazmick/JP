public class Stack {
    private int arr[];
    private int top;
    private int capacity;
    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    public void push(int x){
        if(isFull()){
            System.out.println("Overflow");
            System.exit(1);
        }
        System.out.println("Inserting " + x);
        arr[++top] = x;
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Empty Stack");
            System.exit(1);
        }
        return arr[top--];
    }

    public void printStack() {
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
    private boolean isEmpty(){
        return top==-1;
    }
    private boolean isFull(){
        return top==capacity-1;
    }
}
