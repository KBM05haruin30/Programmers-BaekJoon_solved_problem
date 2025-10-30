import java.util.Scanner;

public class Main {
    
    static int N;
    static String answer = "";
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
    }
    
    static void N_byte(int n) {
        int rep = n/4;
        for (int i = 0; i < rep; i++) {
            answer += "long ";
        }
        answer += "int";
    }
    
    public static void main(String[] args) {
        input();
        N_byte(N);
        System.out.print(answer);
    }
}