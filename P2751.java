import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class P2751 {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken()); // n 입력받기
        ArrayList<Integer> arr = new ArrayList<Integer>(); // ArrayList<Integer> 생성
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            arr.add(Integer.parseInt(st.nextToken())); // int로 ArrayList에 추가
        }
        Collections.sort(arr); // Collections.sort() 적용
        StringBuilder sb = new StringBuilder(); // 출력 하기 위한 StringBuilder 생성
        // var intstream = bf.lines().mapToInt(Integer::parseInt).toArray(); // lines()
        // => Stream<string> => mapToInt(x=>Integer.valueOf(x)) => int
        for (int i : arr) {
            sb.append(i);
            sb.append("\n"); // 한줄에 하나 출력
        }
        System.out.println(sb);
        bf.close();
    }
}