package medium.addTwoNumbers;

import java.util.LinkedList;
import java.util.List;

public class AddTwoNumbers {

    public static void main(String[] args) {
        System.out.println(addTwoNumbers(new LinkedList<>(List.of(2, 4, 3)), new LinkedList<>(List.of(5, 6, 4))));
    }

    public static LinkedList<Integer> addTwoNumbers(LinkedList<Integer> l1, LinkedList<Integer> l2) {
        int rest = 0;
        LinkedList<Integer> result = new LinkedList<>();
        while(!l1.isEmpty() && !l2.isEmpty()){
            int v1 = l1.pop();
            int v2 = l2.pop();
            if(v1+v2>=10) {
                result.add(v1 + v2 + rest-10);
                rest++;
                l1.addLast(l1.getLast() + rest);
            }
            else {
                result.add(v1 + v2 + rest);
            }
        }
        return result;
    }
}
