import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Node {
    private int Data;// 数据域
    private Node Next;// 指针域
    public Node(int Data) {
        // super();
        this.Data = Data;
    }
    public int getData() {
        return Data;
    }
    public void setData(int Data) {
        this.Data = Data;
    }

    public Node getNext() {
        return Next;
    }
    public void setNext(Node Next) {
        this.Next = Next;
    }
}


class test{
    static public void main(String args[]){
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        Node h=head;
        while(h!=null){
            System.out.print(h.getData() + " ");
            h = h.getNext();
        }
        head = Reverse1(head);
        System.out.println("\n**************************");
        // 打印反转后的结果
        while (null != head) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
    }

    private static Node Reverse1(Node h){
        List<Node> l=new ArrayList<>();
        while(h!=null){
            l.add(h);
            h=h.getNext();
        }
        for(int i=l.size();i>1;i--){
            l.get(i-1).setNext(l.get(i-2));
        }
        l.get(0).setNext(null);
        return l.get(l.size()-1);
    }
}

