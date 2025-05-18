package easy.palindrome;

import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        System.out.println(isPalindrome(x));

        List<Integer> pilha = new Stack<>();
    }

    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int digit = 0;
        int sizeNum = sizeNum(x);
        int original = x;
        for(int i = 0;i<=sizeNum;i++){
            digit += x%10*Math.pow(10,sizeNum-i-1);
            x /= 10;
            if(x == 0){
                return original == digit;
            }
        }
        return false;
    }
    public static int sizeNum(int num){
        int i = 0;
        while(num>0){
            num /=10;
            i++;
        }
        return i;
    }

}
