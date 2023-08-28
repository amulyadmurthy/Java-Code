package InterviewPrep;

import org.testng.mustache.Value;

public class NodeInsertion {

    static nodeInsertion head;
    static nodeInsertion tail;


    static class nodeInsertion
    {
        nodeInsertion next;
        nodeInsertion prev;
        int data;
        nodeInsertion(int d)
        {

            data=d;
            next=null;


        }

        @Override
        public String toString() {
            return "nodeInsertion{" +
                    "next=" + next +
                    "prev=" + prev +
                    ", data=" + data +
                    '}';
        }
    }

    public static nodeInsertion nodeInsertion(int new_data)
    {
            nodeInsertion new_node=new nodeInsertion(new_data);
            if (head == null && tail == null) {
                head = new_node;
                tail = new_node;
                return new_node;
            }

            new_node.next =head;
            head= new_node;
            return new_node;

    }

    public static nodeInsertion nodeInsertionEnd(int new_data)
    {

        nodeInsertion new_node = new nodeInsertion(new_data);
        if (head == null && tail == null) {
            head = new_node;
            tail = new_node;
            return new_node;
        }
        //tail.prev =head;
        new_node.prev =tail;
        tail = new_node;
        return new_node;
    }



    public static void main(String[] args) {


        System.out.println("inserted node is" + nodeInsertion(10));
        System.out.println("inserted node is" + nodeInsertion(101));
        System.out.println("INSERTED NODE AT THE END" + nodeInsertionEnd(30));


    }
}

