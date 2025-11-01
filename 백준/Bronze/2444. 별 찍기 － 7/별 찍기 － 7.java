import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = N; i >= 1; i--) {
            sb.append(" ".repeat(i - 1));
            sb.append("*".repeat(Math.max(0, N - i + 1)));
            sb.append("*".repeat(Math.max(0, N - i)));
            sb.append("\n");
        }

        for (int i = N-1; i >=1 ; i--) {
            sb.append(" ".repeat(Math.max(0, N - i)));
            sb.append("*".repeat(i - 1));
            sb.append("*".repeat(i));
            sb.append("\n");
        }
        
        
        bw.write(sb.toString());
        bw.flush();
        
        
    }
}