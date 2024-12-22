

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N, cnt;
    static String[] file;
    static String filename;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        file = new String[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            filename = st.nextToken();
            file[i] = filename.split("\\.")[1];
        }
        Arrays.sort(file);
    }

    static void pro() {
        String last = file[0];
        cnt = 1;
        for (int i = 1; i < N; i++) {
            if (last.equals(file[i])) {
                cnt++;
            } else {
                sb.append(last).append(' ').append(cnt).append('\n');
                last = file[i];
                cnt = 1;
            }
        }
        sb.append(last).append(' ').append(cnt).append('\n');
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
        System.out.println(sb.toString());
    }

}
