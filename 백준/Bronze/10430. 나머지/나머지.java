import java.util.Scanner;

public class Main{
    
    static int A, B, C;
    
    static void input(){
        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();
    }
    
    public static void main(String[] args) {
        input();
        System.out.println((A+B)%C);
        System.out.println(((A%C)+(B%C))%C);
        System.out.println((A*B)%C);
        System.out.print(((A%C)*(B%C))%C);
        
    }
}