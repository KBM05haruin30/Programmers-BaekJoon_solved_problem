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
        
        int[] arr = new int[30];
        
        for (int i = 0; i < 28; i++) {
            int student = Integer.parseInt(br.readLine());
            arr[student-1] = 1;
        }
        
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                sb.append(i+1).append(" ");
            }
        }
        bw.write(sb.toString());
        bw.flush();
    }
}