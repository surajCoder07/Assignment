package Assignment;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        int n,i,j,s=0;
        System.out.print("Enter an Even number : ");
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        i=n;
        if(n%2==0){
            while(n>0){
                j=n%10;
                s=(s*10)+j;
                n=n/10;
            }
            if(n==i){
                System.out.println("This even number is palindrome");
            }else{
                System.out.println("This even number is not a palindrome");
            }

            }
        else{
            System.out.println("Not an even number");
        }
    }
}
