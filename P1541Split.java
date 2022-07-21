import java.io.BufferedReader;
import java.io.InputStreamReader;

public class P1541Split {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] minus = bf.readLine().split("\\-"); // -를 기준으로 split
        int sum = 0; // 결과
        Boolean fst = true; // 처음 더할 수 판별
        for (String st : minus)            
         {
            int temp = 0;
            String[] plus = st.split("\\+"); // +를 기준으로 split
            for (String st2 : plus)           
                temp += Integer.parseInt(st2);   // -##(??+??+??) -뒤 ??들 계산
            if (fst) {
                sum = temp; // 처음 수
                fst = false;
            } else {
                sum -= temp; // 빼기
            }
        }
        System.out.println(sum);
        bf.close();
    }
}