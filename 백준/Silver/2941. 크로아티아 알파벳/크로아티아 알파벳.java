import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        String[] croatia = new String[]{"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        int idx;

        StringBuilder sb = new StringBuilder(str);
        for (int i = 0; i < croatia.length; i++) {
            while(true) {
                idx = sb.indexOf(croatia[i]);
                if (idx == -1) {
                    break;
                }
                sb.replace(idx, idx + croatia[i].length(), "#");
            }
        }


        bw.write(String.valueOf(sb.length()));
        bw.flush();


    }
}