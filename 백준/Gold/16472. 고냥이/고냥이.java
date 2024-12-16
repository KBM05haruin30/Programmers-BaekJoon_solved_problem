

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static int N, kind;
    static String A;
    static int[] cnt;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        A = st.nextToken();

        cnt = new int[26];
    }

    static void add(char x) { // x 라는 알파벳 추가
        /* TODO */
        cnt[x-'a']++;
        if (cnt[x-'a'] == 1) {
            kind++;
        }
    }

    static void erase(char x) { // x 라는 알파벳 제거
        /* TODO */
        cnt[x-'a']--;
        if (cnt[x-'a'] == 0) {
            kind--;
        }
    }

    static void pro() {
        int len = A.length(), ans = 0;
        for (int R = 0, L = 0; R < len; R++) {
            // R 번째 문자를 오른쪽에 추가
            /* TODO */
            add(A.charAt(R));

            // 불가능하면, 가능할 때까지 L을 이동
            /* TODO */
            while (kind > N) {
                erase(A.charAt(L++));
            }
            // 정답 갱신
            /* TODO */
            ans = Math.max(ans, R - L + 1);
        }
        System.out.println(ans);
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }
}
