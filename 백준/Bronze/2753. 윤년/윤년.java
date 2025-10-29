import java.util.Scanner;

public class Main {
    
    static int Year;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        Year = sc.nextInt();
    }
    
    static void leap(int year) {
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
    
    public static void main(String[] args) {
        input();
        leap(Year);
    }
}