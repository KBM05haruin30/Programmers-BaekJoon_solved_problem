import java.util.Scanner;

public class Main{
    
    static int A, B, hunds, tens, ones, sum;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
    }
    
    public static void main(String[] args) {
        input();
        hunds = A * (B / 100);
        tens = A * (B % 100 / 10);
        ones = A * (B % 10);
        
        System.out.println(ones);
        System.out.println(tens);
        System.out.println(hunds);
        System.out.print(ones + tens * 10 + hunds * 100);
    }
}