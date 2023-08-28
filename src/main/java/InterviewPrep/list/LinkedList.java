package InterviewPrep.list;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Data
public class LinkedList {
    @Getter
    private Node head;
    @Getter
    private Node tail;


    public Node find(Integer data) {
        Node curr = head;
        while (curr != null) {
            if (curr.getData() == data)
                return curr;
            curr = curr.getNext();
        }
        return null;
    }


    public void push(Node node) {

        if (head == null) {
            head = tail = node;
            return;
        }
        node.setNext(head);
        head.setPrev(node);
        head = node;

    }

    public void addEnd(Node node) {
        if(head == null){
            head = tail = node;
            return;
        }
        tail.setNext(node);
       node.setPrev(tail);
       tail=node;
    }

    public void addAfter(Node after,Node node) {

    }

    public void addAfter(Integer data,Node node) {

    }


    public void remove(Node node) {

    }

    public void remove(Integer data) {

    }
}
