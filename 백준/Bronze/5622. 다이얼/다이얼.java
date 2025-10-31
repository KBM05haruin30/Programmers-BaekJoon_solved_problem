import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {

    static int times(char s) {
        if (s >= 'A' && s <= 'C') {
            return 3;
        } else if (s >= 'D' && s <= 'F') {
            return 4;
        } else if (s >= 'G' && s <= 'I') {
            return 5;
        } else if (s >= 'J' && s <= 'L') {
            return 6;
        } else if (s >= 'M' && s <= 'O') {
            return 7;
        } else if (s >= 'P' && s <= 'S') {
            return 8;
        } else if (s >= 'T' && s <= 'V') {
            return 9;
        } else if (s >= 'W' && s <= 'Z') {
            return 10;
        } else {
            return 11;
        }
    }
    
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        
        String number = br.readLine();
        int time = 0;
        for (int i = 0; i < number.length(); i++) {
            time += times(number.charAt(i));
        }
        sb.append(time);
        bw.write(sb.toString());
        bw.flush();
    }
}