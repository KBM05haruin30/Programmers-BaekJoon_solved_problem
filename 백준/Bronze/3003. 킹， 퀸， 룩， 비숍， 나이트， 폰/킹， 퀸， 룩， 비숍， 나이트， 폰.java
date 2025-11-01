import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int king = 1 - Integer.parseInt(st.nextToken());
        int queen = 1 - Integer.parseInt(st.nextToken());
        int look = 2 - Integer.parseInt(st.nextToken());
        int bishob = 2 - Integer.parseInt(st.nextToken());
        int night = 2 - Integer.parseInt(st.nextToken());
        int phon = 8 - Integer.parseInt(st.nextToken());
        
        sb.append(king).append("\n")
            .append(queen).append("\n")
            .append(look).append("\n")
            .append(bishob).append("\n")
            .append(night).append("\n")
            .append(phon);
        bw.write(sb.toString());
        bw.flush();
        
        
    }
}