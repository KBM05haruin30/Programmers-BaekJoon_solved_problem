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

        while(true) {
            int n = Integer.parseInt(br.readLine());
            if (n == -1) {
                break;
            }
            int sum = 1;
            String str = n + " = 1";
            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    sum += i;
                    str += " + " + i;
                }
            }

            if (sum != n) {
                str = n + " is NOT perfect.";
            }
            sb.append(str).append("\n");

        }


        bw.write(sb.toString());
        bw.flush();
    }
}