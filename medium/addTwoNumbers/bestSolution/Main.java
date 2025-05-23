package medium.addTwoNumbers.bestSolution;

public class Main {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(2,new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5,new ListNode(6, new ListNode(4)));

        ListNode ln = new ListNode();
        System.out.println(ln.addTwoNumbers(l1,l2));
    }
}
