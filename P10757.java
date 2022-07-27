import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class P10757 {
    // BigInteger
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        BigInteger A = new BigInteger(st.nextToken());
        BigInteger B = new BigInteger(st.nextToken());
        System.out.println(A.add(B));
    }
    // array
    // public static void main(String[] args) throws IOException {

    // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    // StringTokenizer st = new StringTokenizer(br.readLine());

    // String strA = st.nextToken();
    // String strB = st.nextToken();

    // // A,B 중 최장 길이 저장
    // int maxLength = Math.max(strA.length(), strB.length());

    // // 최장길이 + 1로 배열 생성(올림)
    // int[] A = new int[maxLength + 1];
    // int[] B = new int[maxLength + 1];

    // // 배열에 A,B 입력
    // for (int i = strA.length() - 1, idx = 0; i >= 0; i--, idx++) {
    // A[idx] = strA.charAt(i) - '0';
    // }
    // for (int i = strB.length() - 1, idx = 0; i >= 0; i--, idx++) {
    // B[idx] = strB.charAt(i) - '0';
    // }

    // for (int i = 0; i < maxLength; i++) {
    // int value = A[i] + B[i]; // 더하기
    // A[i] = value % 10; // 현재 자리값
    // A[i + 1] += (value / 10); // 올림
    // }

    // StringBuilder sb = new StringBuilder();
    // if (A[maxLength] != 0) { // 가장 높은 자리수가 0이 아닐 경우
    // for (int i = maxLength; i >= 0; i--) {
    // sb.append(A[i]);
    // }
    // } else {
    // for (int i = maxLength - 1; i >= 0; i--) {
    // sb.append(A[i]);
    // }
    // }

    // System.out.println(sb);
    // }
}