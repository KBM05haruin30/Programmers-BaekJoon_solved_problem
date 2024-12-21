
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int N, M;
    static int[] indeg, T_done, T;
    static ArrayList<Integer>[] adj;

    static void input(BufferedReader br) throws IOException {
        // Testcase가 존재하는 문제이므로 "배열 초기화"에 유의하자
        /* TODO */
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        adj = new ArrayList[N+1];
        indeg = new int[N+1];
        T = new int[N+1];
        T_done = new int[N+1];
        st = new StringTokenizer(br.readLine());
        for (int i = 1; i <= N; i++) {
            adj[i] = new ArrayList<>();
            T[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            adj[x].add(y);
            // indegree 계산하기
            indeg[y]++;
        }
    }

    static void pro(BufferedReader br) throws IOException {
        Deque<Integer> queue = new LinkedList<>();
        // 제일 앞에 "정렬될 수 있는" 정점 찾기
        for (int i = 1; i <= N; i++) {
            if (indeg[i] == 0) {
                queue.add(i);
                /* TODO */
                T_done[i] = T[i];
            }
        }

        // 위상 정렬 순서대로 T_done 계산을 함께 해주기
        /* TODO */
        while (!queue.isEmpty()) {
            int x = queue.poll();
            for (int y : adj[x]) {
                indeg[y]--;
                if (indeg[y] == 0) {
                    queue.add(y);
                }
                /* TODO */
                T_done[y] = Math.max(T_done[y], T_done[x] + T[y]);
            }
        }
        int W = Integer.parseInt(br.readLine());
        System.out.println(T_done[W]);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Q = Integer.parseInt(br.readLine());
        while(Q > 0) {
            Q--;
            input(br);
            pro(br);
        }
    }

}
