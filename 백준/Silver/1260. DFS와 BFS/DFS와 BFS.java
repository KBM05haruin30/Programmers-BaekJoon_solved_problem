

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    static StringBuilder sb = new StringBuilder();

    static int N, M, V;
    static ArrayList<Integer>[] adj;
    static boolean[] visit;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        V = Integer.parseInt(st.nextToken());
        adj = new ArrayList[N + 1];
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
        }
        for (int i = 1; i <= M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adj[x].add(y);
            adj[y].add(x);
        }
        for (int i = 1; i <= N; i++) {
            Collections.sort(adj[i]);
        }
    }

    // x를 갈 수 있다는 걸 알고 방문한 상태
    static void dfs(int x) {
        /* TODO */
        visit[x] = true;
        sb.append(x).append(' ');
        for (int y : adj[x]) {
            if (visit[y]) continue;
            dfs(y);
        }
    }

    // start 에서 시작해서 갈 수 있는 정점들을 모두 탐색하기
    static void bfs(int start) {
        Queue<Integer> que = new LinkedList<>();
        /* TODO */

        que.add(start);
        visit[start] = true;

        while(!que.isEmpty()) {
            start = que.poll();
            sb.append(start).append(' ');
            for (int y : adj[start]) {
                if (visit[y]) continue;

                que.add(y);
                visit[y] = true;
            }
        }

    }

    static void pro() {
        // 모든 x에 대해서 adj[x] 정렬하기
        /* TODO */
        visit = new boolean[N + 1];

        // DFS, BFS 결과 구하기
        /* TODO */
        dfs(V);
        sb.append('\n');
        for(int i = 1; i <= N; i++) {
            visit[i] = false;
        }
        bfs(V);

        System.out.println(sb);
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

}
