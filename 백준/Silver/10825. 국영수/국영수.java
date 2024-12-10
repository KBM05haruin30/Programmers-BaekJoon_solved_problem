import java.util.Arrays;
import java.util.Scanner;

public class Main implements Comparable<Main>{
    public String name;
    public int korean, english, math;

    static StringBuilder sb = new StringBuilder();
    static Scanner scan = new Scanner(System.in);

    @Override
    public int compareTo(Main other) {
        // 국어 점수 내림차순
        if (korean != other.korean) return other.korean - korean;
        // 영어 점수 오름차순
        if (english != other.english) return english - other.english;
        // 수학 점수 내림차순
        if (math != other.math) return other.math - math;
        return name.compareTo(other.name);
    }

    static int N;
    static Main[] a;

    static void input() {
        N = scan.nextInt();
        a = new Main[N];
        for (int i = 0; i < N; i++) {
            a[i] = new Main();
            a[i].name = scan.next();
            a[i].korean = scan.nextInt();
            a[i].english = scan.nextInt();
            a[i].math = scan.nextInt();
        }
    }
    static void pro() {
        // TODO
        // 기준을 통해 정렬하기
        Arrays.sort(a);
        // 정답 출력하기
        for(int i = 0; i < a.length; i++) {
            sb.append(a[i].name).append('\n');
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        input();
        pro();
    }
}
