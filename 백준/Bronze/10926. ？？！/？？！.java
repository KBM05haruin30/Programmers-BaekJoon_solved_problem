import java.util.Scanner;

public class Main{
    
    static String id;
    
    static void input(){
        Scanner sc = new Scanner(System.in);
        id = sc.next();
    }
    
    public static void main(String[] args) {
        input();
        System.out.print(id + "??!");
        
    }
}