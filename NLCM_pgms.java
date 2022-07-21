import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NLCM_pgms {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int result = Integer.parseInt(st.nextToken());
        while (st.hasMoreTokens()) {
            int b = Integer.parseInt(st.nextToken());
            result = result * b / gcdRecursion(result, b);
        }
        System.out.println(result);
    }
    public static int gcdRecursion(int a, int b) {
        if (b == 0)
            return a;
        return gcdRecursion(b, a % b);
    }
}
