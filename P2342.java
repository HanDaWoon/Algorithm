import java.util.*;
import java.io.*;

public class P2342 {
    static List<Integer> point;
    static int[][][] total;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        point = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while (true) {
            int k = Integer.parseInt(st.nextToken());
            if (k == 0)
                break;
            point.add(k);
        }
        total = new int[point.size() + 1][5][5]; // step, left, right
        System.out.println(ddr(0, 0, 0));
    }

    static int ddr(int step, int left, int right) {
        // 1. 마지막 스텝 도달하면 끝
        if (step == point.size())
            return 0;

        // 2. dp에 값이 차있으면 return
        if (total[step][left][right] != 0) {
            return total[step][left][right];
        }

        // 3. 가능한 경우의 수 중 가장 적은 경우로 갱신하고 return
        // 왼발 욺직이는 경우 vs 오른발 움직이는 경우
        int leftScore = move_power(left, point.get(step)) + ddr(step + 1, point.get(step), right);
        int rightScore = move_power(right, point.get(step)) + ddr(step + 1, left, point.get(step));

        return total[step][left][right] = Math.min(leftScore, rightScore);
    }

    static int move_power(int go, int to) {
        if (go == 0)
            return 2;
        if (go == to)
            return 1;
        if (Math.abs(go - to) == 2)
            return 4;
        return 3;
    }
}
