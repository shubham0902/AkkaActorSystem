package com.shubham;

class LL{
    public LL(int val, LL next) {
        this.val = val;
        this.next = next;
    }


    int val;
    LL next;
}

public class ReverseLL {


    static void printLL(LL head){
        LL curr = head;
        while(curr != null){
            System.out.println(curr.val);
            curr = curr.next;
        }
    }


    static LL reverse(LL head){
        LL curr = head;
        LL n = null;
        LL p = null;
        while(curr != null){
            n = curr.next;
            curr.next = p;
            p = curr;
            curr = n;
        }
        head = p;
        return head;
    }

    public static void main(String[] args) {
        LL last = new LL(4, null);
        LL last1 = new LL(3, last);
        LL last2 = new LL(2, last1);
        LL head = new LL(1, last2);

        printLL(head);

        printLL(reverse(head));
    }
}
