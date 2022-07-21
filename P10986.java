import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 문제
// 수 N개 A1, A2, ..., AN이 주어진다. 이때, 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 구하는 프로그램을 작성하시오.

// 즉, Ai + ... + Aj (i ≤ j) 의 합이 M으로 나누어 떨어지는 (i, j) 쌍의 개수를 구해야 한다.

// 입력
// 첫째 줄에 N과 M이 주어진다. (1 ≤ N ≤ 106, 2 ≤ M ≤ 103)

// 둘째 줄에 N개의 수 A1, A2, ..., AN이 주어진다. (0 ≤ Ai ≤ 109)

// 출력
// 첫째 줄에 연속된 부분 구간의 합이 M으로 나누어 떨어지는 구간의 개수를 출력한다.

// 5 3
// 1 2 3 1 2

public class P10986 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(reader.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(reader.readLine());

        long result = 0;
        long[] sum = new long[n + 1];
        long[] sumRemainder = new long[m];

        for (int i = 1; i <= n; i++) {
            sum[i] = sum[i - 1] + Long.parseLong(st.nextToken());  // 합 배열
            if (sum[i] % m == 0)    // 합 배열 % m == 0 then 답+1
                result++;
            sumRemainder[(int) (sum[i] % m)] += 1;  // 나머지가 같은 합 배열 개수 구하기
        }
        for (int i = 0; i < m; i++) {
            result += sumRemainder[i] * (sumRemainder[i] - 1) / 2;  // 조합 (sr[i]*sr[i]-1)/2
        }
        System.out.println(result);
        reader.close();
    }
}