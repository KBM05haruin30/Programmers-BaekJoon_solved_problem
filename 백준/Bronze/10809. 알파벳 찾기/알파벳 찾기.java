import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String S = br.readLine();
        int[] arr = new int[26];
        
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        
        for (int i = 0; i < S.length(); i++) {
            int ascii = S.charAt(i);
            int pos = ascii - 97;
            
            if (arr[pos] == -1) {
                arr[pos] = i;
            }
        }
        
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]).append(" ");
        }
        

        bw.write(sb.toString());
        bw.flush();
    }
}