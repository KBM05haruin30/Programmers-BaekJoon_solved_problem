import java.util.Scanner;

public class Main {
    
    static int Score;
    static char grade;
    
    static void input() {
        Scanner sc = new Scanner(System.in);
        Score = sc.nextInt();
    }
    
    static char grades(int score) {
        if (score >= 90 && score <= 100) {
            return 'A';
        } else if (score >= 80 && score <= 89) {
            return 'B';
        } else if (score >= 70 && score <= 79) {
            return 'C';
        } else if (score >= 60 && score <= 69) {
            return 'D';
        } else 
            return 'F';
    }
    
    public static void main(String[] args) {
        input();
        grade = grades(Score);
        System.out.print(grade);
    }
}