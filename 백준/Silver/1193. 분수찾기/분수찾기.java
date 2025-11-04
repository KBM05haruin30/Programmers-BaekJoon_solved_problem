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

        int X = Integer.parseInt(br.readLine());
        int x = 1;
        int y = 1;

        int count = 1;
        int num = 1;
        int before_num = 0;

        while (X > num) {
            before_num = num;
            count++;
            num += count;
        }

        int sub = X - before_num;

        if (count % 2 == 0) {
            y = count + 1 - sub;
            x = sub;
        } else {
            x = count + 1 - sub;
            y = sub;
        }

        sb.append(x).append("/").append(y);

        bw.write(sb.toString());
        bw.flush();
    }
}