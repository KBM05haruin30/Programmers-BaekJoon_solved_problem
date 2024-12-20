

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static StringBuffer sb = new StringBuffer();

    static int n;
    static ArrayList<Integer>[] adj;
    static int[] parent;

    static void input() throws IOException {
        // 인접 리스트 구성하기
        /* TODO */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        adj = new ArrayList[n + 1];
        parent = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 1; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adj[x].add(y);
            adj[y].add(x);
        }
    }

    // dfs(x, par) := 정점 x의 부모가 par 였고, x의 children들을 찾아주는 함수
    static void dfs(int x, int par) {
        /* TODO */
        for (int y : adj[x]) {
            if (y == par) {
                continue;
            }
            parent[y] = x;
            dfs(y, x);
        }
    }

    static void pro() {
        // 1번 정점이 ROOT 이므로, 여기서 시작해서 Tree의 구조를 파악하자
        /* TODO */
        // parent를 -1로 주는 이유는 ROOT부터 시작하는데, ROOT는 부모가 없으므로
        dfs(1, -1);

        // 정답 출력하기
        /* TODO */
        for (int i = 2; i <= n; i++) {
            sb.append(parent[i]).append('\n');
        }
        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }
}
