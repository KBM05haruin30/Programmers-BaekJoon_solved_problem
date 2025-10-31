import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        String s1 = st.nextToken();
        String s2 = st.nextToken();
        StringBuffer sbf1 = new StringBuffer(s1);
        StringBuffer sbf2 = new StringBuffer(s2);
        String reverses1 = sbf1.reverse().toString();
        String reverses2 = sbf2.reverse().toString();
        
        if (Integer.parseInt(reverses1) > Integer.parseInt(reverses2)) {
            sb.append(reverses1);
        } else {
            sb.append(reverses2);
        }
        
        
        bw.write(sb.toString());
        bw.flush();
    }
}