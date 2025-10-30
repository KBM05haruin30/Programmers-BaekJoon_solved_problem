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
        
        int N = Integer.parseInt(br.readLine());
        double sum = 0.0;
        
        Double[] arr = new Double[N];
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Double.parseDouble(st.nextToken());
        }
        
        double max = arr[0];
        
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i]/max*100;
        }
        
        
        sb.append(sum/N);
        
        
        
        bw.write(sb.toString());
        bw.flush();
    }
}