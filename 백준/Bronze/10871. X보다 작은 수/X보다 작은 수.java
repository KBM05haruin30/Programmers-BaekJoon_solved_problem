import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i= 0; i < N; i++) {
            arr[i] = Integer.parseInt(st1.nextToken());
            if (arr[i] < X) {
                sb.append(arr[i]).append(" ");
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}