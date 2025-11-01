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

        String str = br.readLine().toUpperCase();

        int[] arr = new int[26];
        int max = 0;
        int indx = -1;
        boolean twoBig = false;
        for (int i = 0; i < str.length(); i++) {
            int idx = str.charAt(i)- 'A';
            int n = ++arr[idx];

            if (n > max) {
                max = n;
                indx = idx;
                twoBig = false;
            } else if (n == max && idx != indx) {
                twoBig = true;
            }

        }

        if (twoBig) {
            sb.append("?");
        } else {
            sb.append((char)(indx+65));
        }
        bw.write(sb.toString());
        bw.flush();


    }
}