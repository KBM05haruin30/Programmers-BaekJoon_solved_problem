import java.util.Scanner;

public class Main{
    
    static int y;
    
    static void input(){
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
    }
    
    public static void main(String[] args) {
        input();
        System.out.print(y - 543);
    }
}