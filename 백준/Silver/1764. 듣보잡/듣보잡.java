

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static String[] listen;
    static String[] watch;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        listen = new String[N];
        watch = new String[M];
        for (int i = 0; i < N; i++) {
            listen[i] = br.readLine();
        }
        for (int i = 0; i < M; i++) {
            watch[i] = br.readLine();
        }
    }

    // 이분 탐색
    static boolean binarySearch(String[] arr, String target) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            int cmp = arr[mid].compareTo(target);
            if (cmp == 0) {
                return true;
            } else if (cmp < 0) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }

    static void pro() {
        // 듣도 못한 사람 정렬
        Arrays.sort(listen);

        // 보도 못한 사람의 이름을 기준으로 이분 탐색
        List<String> result = new ArrayList<>();
        for (String name : watch) {
            if (binarySearch(listen, name)) {
                result.add(name);
            }
        }


        // 듣도 보도 못한 사람 수와 이름 출력
        result.sort(String::compareTo);
        sb.append(result.size()).append('\n');
        for(String name : result) {
            sb.append(name).append('\n');
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

}
