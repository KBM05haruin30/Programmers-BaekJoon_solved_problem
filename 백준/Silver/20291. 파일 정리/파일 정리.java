

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static StringBuilder sb = new StringBuilder();
    static Scanner sc = new Scanner(System.in);

    static int N;
    static String[] file;
    static String[] extension;

    static void input() {
        N = sc.nextInt();
        file = new String[N];
        extension = new String[N];
        for (int i = 0; i < N; i++) {
            file[i] = sc.next();
        }
    }

    static void pro() {
        // .을 기준으로 확장자 명만 따로 저장하는 배열 만들기
        for (int i = 0; i < N; i++) {
            extension[i] = file[i].split("\\.",2)[1];
        }
        // 배열 정렬
        Arrays.sort(extension);
        // count: 등장 횟수
        int count = 1;
        String ext = extension[0];

        // TODO
        // 2번 원소부터 차례대로 보면서, 같은 확장자가 이어서 나오는지, 새로운 확장자가 나오는지
        // 판단하여 count를 갱신해주고, 새로운 확장자의 이름과 값을 출력
        for (int i = 1; i < N; i++) {
            if (extension[i].equals(extension[i-1])) {
                count++;
            } else {
                sb.append(ext).append(' ').append(count);
                sb.append('\n');
                ext = extension[i];
                count = 1;
            }
        }
        sb.append(ext).append(' ').append(count);
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        input();
        pro();
    }


}
