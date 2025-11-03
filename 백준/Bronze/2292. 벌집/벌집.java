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

        // 1 6 12 18 24
        int count = 1;
        int N = Integer.parseInt(br.readLine());
        int bul = 1;
        while (bul < N) {
            bul += count * 6;
            count++;
        }
        sb.append(count);
        bw.write(sb.toString());
        bw.flush();
    }
}