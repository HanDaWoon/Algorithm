import java.io.*;
import java.util.*;

public class P11051 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());

        // 파스칼의 삼각형 nCk = n-1Ck-1+n-1Ck
        int[][] triangle = new int[N + 1][N + 1]; // 파스칼의 삼각형 생성
        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (i == j | j == 0)
                    triangle[i][j] = 1; // nCn or nC0 즉 삼각형의 양쪽끝 채우기
                else
                    // nCr + nC(r+1) = (n+1)C(r+1)
                    triangle[i][j] = (triangle[i - 1][j - 1] + triangle[i - 1][j]) % 10007;
            }
        }
        System.out.println(triangle[N][K]);
    }
}