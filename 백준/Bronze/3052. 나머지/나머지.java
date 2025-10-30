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
        
        int[] arr = new int[42];
        int count = 0;
        
        for (int i = 0; i < 10; i++) {
            int num = Integer.parseInt(br.readLine());
            int div = num % 42;
            arr[div] = 1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count++;
            }
        }
        sb.append(count);
        
        bw.write(sb.toString());
        bw.flush();
    }
}