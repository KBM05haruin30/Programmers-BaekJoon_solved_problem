

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static int n, root, erased;
    static ArrayList<Integer>[] child;
    static int[] leaf;


    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        child = new ArrayList[n];
        leaf = new int[n];
        for (int i = 0; i < n; i++) {
            child[i] = new ArrayList<>();
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            int par = Integer.parseInt(st.nextToken());
            if (par == -1) {
                root = i;
                continue;
            }
            child[par].add(i);
        }
        st = new StringTokenizer(br.readLine());
        erased = Integer.parseInt(st.nextToken());
        /* TODO */
    }

    // dfs(x, par) := 정점 x의 부모가 par 였고, Subtree(x)의 leaf 개수를 세주는 함수
    static void dfs(int x) {
        /* TODO */
        if (child[x].isEmpty()) {
            leaf[x] = 1;
        }
        for (int y : child[x]) {
            dfs(y);
            leaf[x] += leaf[y];
        }
    }

    static void pro() {
        // erased와 그 외 부모 사이의 연결을 끊어주기
        /* TODO */
        for (int i = 0; i < n; i++) {
            if (child[i].contains(erased)) {
                child[i].remove(child[i].indexOf(erased));
            }
        }
        // erased 가 root인 예외 처리하기
        /* TODO */
        if (root != erased) {
            dfs(root);
        }

        // 정답 출력하기
        /* TODO */
        System.out.println(leaf[root]);
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }

}
