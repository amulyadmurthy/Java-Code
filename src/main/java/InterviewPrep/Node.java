package InterviewPrep;

import lombok.Data;

@Data
public class Node {
    public Node prev;
    private Integer data;
    private Node next;

    public Node(Integer data) {
        this.data = data;
    }
}
