import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        int N = Integer.parseInt(br.readLine());
        
        for (int i = N; i >= 1; i--) {
            for (int j = 1; j <= i-1; j++) {
                sb.append(" ");
            }
            for (int k = 1; k <= N-i+1; k++ ){
                sb.append("*");
            }
            sb.append("\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
    }
}