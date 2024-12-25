
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

    static StringBuilder sb = new StringBuilder();

    static class XY implements Comparable<XY> {
        public int x, y;

        @Override
        public int compareTo(XY o) {
            if (x != o.x) return x - o.x;
            return y - o.y;
        }
    }


    static int N;
    static XY[] xy;

    static void input() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        xy = new XY[N];
        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            xy[i] = new XY();
            xy[i].x = Integer.parseInt(st.nextToken());
            xy[i].y = Integer.parseInt(st.nextToken());
        }
    }

    static void pro() {
        Arrays.sort(xy);

        for (int i = 0; i < N; i++) {
            sb.append(xy[i].x).append(" ").append(xy[i].y).append("\n");
        }
        System.out.println(sb.toString());
    }

    public static void main(String[] args) throws IOException {
        input();
        pro();
    }
}
