import java.util.*;

public class Fibonocci{
    static int[] memo = new int[100];
    
    static int fib(int n){
        if (n <= 2) return n;
        if (memo[n] != 0 ) return memo[n];
    
        memo[n] = fib (n-1) + fib(n-2);
        return memo[n];
    }
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.print("\nEnter number: ");
        int num = scan.nextInt();
        
        System.out.println("Output: "+fib(num));
        }
    }
}
