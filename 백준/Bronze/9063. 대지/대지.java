import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] X = new int[N];
        int[] Y = new int[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            X[i] = Integer.parseInt(st.nextToken());
            Y[i] = Integer.parseInt(st.nextToken());
        }

        int min_X = X[0];
        int max_X = X[0];
        int min_Y = Y[0];
        int max_Y = Y[0];

        for (int i = 1; i < N; i++) {
            if (min_X >X[i]) {
                min_X = X[i];
            }
            if (min_Y > Y[i]) {
                min_Y = Y[i];
            }
            if (max_X < X[i]) {
                max_X = X[i];
            }
            if (max_Y < Y[i]) {
                max_Y = Y[i];
            }
        }

        sb.append((max_X-min_X)*(max_Y-min_Y));


        bw.write(sb.toString());
        bw.flush();
    }
}