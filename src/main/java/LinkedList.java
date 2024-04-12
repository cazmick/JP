public class LinkedList {
    Node head;
    static class Node{
        int value;
        Node nextNode;
        Node(int d){
            value=d;
            nextNode=null;
        }

    }

    public void insertAtBegining(int newdata){
        Node newNode = new Node(newdata);
        newNode.nextNode = head;
        head= newNode;
    }
    public void insertAfterNode(Node prevnode , int newdata){
        if(prevnode==null){
            System.out.println("The given previous node cannot be null");
            return;
        }
        Node new_node = new Node(newdata);
        new_node.nextNode=prevnode.nextNode;
        prevnode.nextNode=new_node;
    }
    public void insertAtEnd(int newdata){
        Node newNode = new Node(newdata);
        if(head==null){
            head=newNode;
            return;
        }
        newNode.nextNode=null;
        Node last = head;
        while(last.nextNode !=null){
            last =last.nextNode;
            last.nextNode =newNode;
            return;
        }

    }



    public static void main(String args[]){
        LinkedList linkedList = new LinkedList();
        linkedList.head = new Node(1);
        Node  second = new Node(2);
        Node third = new Node(3);

        linkedList.head.nextNode=second;
        second.nextNode=third;
        while (linkedList.head !=null){
            System.out.print(linkedList.head.value + " ");
            linkedList.head = linkedList.head.nextNode;
        }
    }

}
