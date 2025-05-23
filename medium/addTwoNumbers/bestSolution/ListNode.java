package medium.addTwoNumbers.bestSolution;

public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next;}

    public ListNode resList = new ListNode(0);
    public ListNode head = resList;
    public int carry = 0;

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            int sum = l1.val + l2.val + carry; //soma entre os 2 valores + o resto
            carry  = sum / 10; // armazena o resto como a soma dividida por 10
            resList.next = new ListNode(sum % 10); // adiciona um nó na lista de resto com o valor da soma modulo de 10
            resList = resList.next;

            if(l1.next != null && l2.next != null) //recursividade com os 2 parametros
                addTwoNumbers(l1.next, l2.next);
            else if (l1.next != null) //recursividade com o próximo Nó de l1 com um listNode de 0 no lugar do l2
                addTwoNumbers(l1.next, new ListNode(0));
            else if (l2.next != null) // recursividade com o próximo Nó de l2 com o listNode de 0 no lugar do l1
                addTwoNumbers(new ListNode(0), l2.next);
            else if (carry > 0) //caso l1 e l2 estejam vazio, apenas incrementa o valor do resto no próximo Nó (caso o resto seja maior que 0)
            {
                resList.next = new ListNode(1);
                resList = resList.next;
            }
            return head.next; // ignora o 0 inicial e retorna o restante do nó
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

