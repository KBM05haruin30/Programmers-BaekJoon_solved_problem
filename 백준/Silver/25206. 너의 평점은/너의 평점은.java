import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    
    static double grades(String str) {
        if (str.equals("A+")) {
            return 4.5;
        } else if (str.equals("A0")) {
            return 4.0;
        } else if (str.equals("B+")) {
            return 3.5;
        } else if (str.equals("B0")) {
            return 3.0;
        } else if (str.equals("C+")) {
            return 2.5;
        } else if (str.equals("C0")) {
            return 2.0;
        } else if (str.equals("D+")) {
            return 1.5;
        } else if (str.equals("D0")) {
            return 1.0;
        } else {
            return 0.0;
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        double grade_subavg = 0.0;
        double score_total = 0.0;
        
        
        
        for (int i = 0; i < 20; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String subject = st.nextToken();
            double score = Double.parseDouble(st.nextToken());
            String grade = st.nextToken();
            
            if (!grade.equals("P")) {
                double a = grades(grade);
                score_total += score;
                grade_subavg += score * a;
            }
        }
        sb.append(grade_subavg / score_total);
        
        bw.write(sb.toString());
        bw.flush();
        
    }
}