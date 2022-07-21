import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P2751Object {
    public static void main(String[] args) throws Exception {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
        StringTokenizer st = new StringTokenizer(bf.readLine());
        int n = Integer.parseInt(st.nextToken());
        Object[] arr = new Object[n];   // Object[] array 생성
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(bf.readLine());
            arr[i] = Integer.parseInt(st.nextToken());  // array 에 입력
        }
        Arrays.sort(arr);   // Timsort
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        for (Object i : arr) {
            bw.write(i.toString()+"\n");
        }
        bw.flush();
        bw.close();
        bf.close();
    }
}