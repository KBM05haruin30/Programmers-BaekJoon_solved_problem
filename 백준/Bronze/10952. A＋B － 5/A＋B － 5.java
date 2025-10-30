import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    
    static int A, B;
    
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        while(true) {
            String line = br.readLine();
            if (line == null) {
                break;
            }
            
            StringTokenizer st = new StringTokenizer(line);
            A = Integer.parseInt(st.nextToken());
            B = Integer.parseInt(st.nextToken());
            
            if (A == 0 && B == 0) {
                break;
            }
            sb.append(A+B).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        
    }
    
}