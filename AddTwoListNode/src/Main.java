import java.util.*;

public class Main {

    public static void main(String[] args) {
        ListNode l1=new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);
        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(6);
        Solution solution=new Solution();
        ListNode l=solution.addTwoNumbers(l1,l2);
        System.out.print(l.val+" "+l.next.val+" "+l.next.next.val+" "+l.next.next.next.val);
    }
}


class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val1=l1.val,val2=l2.val;
        int val3=val1+val2;
        int count=0;
        ListNode l3,l4;
        if(val3<10) l3=new ListNode(val3);
        else {
            l3 = new ListNode(val3 - 10);
            count=1;
        }
        l4=l3;
       while(l1.next!=null || l2.next!=null){
           if(l1.next==null&&l2.next!=null) {val1=0;l2=l2.next;val2=l2.val;}
           if(l2.next==null&&l1.next!=null) {val2=0;l1=l1.next;val1=l1.val;}
           if(l1.next!=null&&l2.next!=null) {
               l1 = l1.next;
               l2 = l2.next;
               val1=l1.val;val2=l2.val;
           }
           val3=val1+val2+count;
           if(val3<10) {
               l3.next = new ListNode(val3);
               count=0;
           }else{
               l3.next=new ListNode(val3-10);
               count=1;
           }
           l3=l3.next;
       }
       if(count==1){
           l3.next=new ListNode(1);
       }
       return l4;
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}