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
        int day = Integer.parseInt(st.nextToken());
        int night = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());
        int count = 1;

        int day_night = day-night;
        int last_move = goal - day;
        if (last_move % day_night != 0) {
            count += last_move / day_night + 1;
        } else {
            count += last_move / day_night;
        }

        sb.append(count);

        bw.write(sb.toString());
        bw.flush();
    }
}