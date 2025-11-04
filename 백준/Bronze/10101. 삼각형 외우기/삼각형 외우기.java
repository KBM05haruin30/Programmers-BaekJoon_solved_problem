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

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());
        int sum = a + b + c;

        if (a == 60 && a == b && b == c) {
            sb.append("Equilateral");
        } else if ((sum == 180) && (a == b || b == c || c == a)) {
            sb.append("Isosceles");
        } else if ((sum == 180) && (a != b && b != c && c != a)) {
            sb.append("Scalene");
        } else if (sum != 180) {
            sb.append("Error");
        }

        bw.write(sb.toString());
        bw.flush();
    }
}