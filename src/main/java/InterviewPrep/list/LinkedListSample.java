package InterviewPrep.list;

public class LinkedListSample {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();


        linkedList.push(new Node(2));
        linkedList.push(new Node(1));
        linkedList.push(new Node(0));
        linkedList.addAfter(linkedList.find(2),new Node(6));
        linkedList.addAfter(2,new Node(8));
        linkedList.addEnd(new Node(4));
        System.out.println(" " + linkedList);
    }
}
