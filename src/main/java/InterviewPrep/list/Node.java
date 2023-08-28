package InterviewPrep.list;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Node {
    private int data;
    @ToString.Exclude
    private Node next;
    @ToString.Exclude
    private Node prev;

    public Node(int data) {
        this.data = data;
    }
}
