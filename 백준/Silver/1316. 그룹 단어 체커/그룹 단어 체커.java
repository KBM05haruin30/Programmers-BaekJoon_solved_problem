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

        int N = Integer.parseInt(br.readLine());
        int count = 0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            boolean[] alpa = new boolean[26];
            alpa[(int)str.charAt(0)-'a'] = true;
            for (int j = 1; j < str.length(); j++) {
                if (str.charAt(j) == str.charAt(j-1)) {
                    continue;
                } else if (str.charAt(j) != str.charAt(j-1) && alpa[(int)str.charAt(j)-'a'] == true) {
                    count++;
                    break;
                } else {
                    alpa[(int)str.charAt(j)-'a'] = true;
                }
            }

        }
        sb.append(N-count);
        bw.write(sb.toString());
        bw.flush();


    }
}