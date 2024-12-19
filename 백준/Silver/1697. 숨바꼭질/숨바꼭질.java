

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

    static int N, K;
    static boolean[] visit;
    static int[] dist;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        visit = new boolean[100001];
        dist = new int[100001];
    }

    // 숨바꼭질 시작
    static void bfs() {
        Queue<Integer> Q = new LinkedList<>();
        /* TODO */
        Q.add(N);
        visit[N] = true;
        dist[N] = 0;

        // BFS 과정 시작
        /* TODO */
        while (!Q.isEmpty()) {
            int x = Q.poll();
            int y = x - 1;
            if (y >= 0 && y <= 100000 && !visit[y]) {
                visit[y] = true;
                dist[y] = dist[x]+1;
                Q.add(y);
            }

            y = x + 1;
            if (y >= 0 && y <= 100000 && !visit[y]) {
                visit[y] = true;
                dist[y] = dist[x]+1;
                Q.add(y);
            }

            y = x * 2;
            if (y >= 0 && y <= 100000 && !visit[y]) {
                visit[y] = true;
                dist[y] = dist[x]+1;
                Q.add(y);
            }
        }
    }

    static void pro() {
        bfs();
        System.out.println(dist[K]);
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

}
