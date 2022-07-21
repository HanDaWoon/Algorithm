import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class P1934 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(bf.readLine());
        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
            bw.write(a * b / gcdRecursion(a, b) + "\n");    // a * b / gcd(a, b) 를 통하여 최소공배수를 구한다.
            // 최소 공배수 = 두 자연수의 곱 / 최대 공약수
        }
        bw.flush();
        bw.close();
        bf.close();
    }

    public static int gcdRecursion(int a, int b) {
        if (b == 0)
            return a;
        return gcdRecursion(b, a % b);
    }

    public static int gcdWhile(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}