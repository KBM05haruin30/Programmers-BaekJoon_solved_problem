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
        
        String str = br.readLine();
        int tr = 0;
        
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) == (str.charAt(str.length()-i-1))) {
                tr++;
            }
        }
        
        if (tr == str.length()/2){
            sb.append(1);
        } else {
            sb.append(0);
        }
        
        bw.write(sb.toString());
        bw.flush();
        
        
    }
}