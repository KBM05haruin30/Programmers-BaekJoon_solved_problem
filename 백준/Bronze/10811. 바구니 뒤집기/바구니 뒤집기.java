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
        StringBuilder sb =new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[N];
        
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        
        for (int a = 0; a < M; a++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            int i = Integer.parseInt(st1.nextToken())-1;
            int j = Integer.parseInt(st1.nextToken())-1;
                                   
            for (int b = i; b <= (i+j)/2; b++) {
                int temp = arr[b];
                arr[b] = arr[i + j - b];
                arr[i + j - b] = temp;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        
        
        bw.write(sb.toString());
        bw.flush();
    }
}