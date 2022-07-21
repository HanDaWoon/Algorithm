import java.io.*;
import java.util.*;

public class P18352 {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    static int n, m, k, x;
    static int[] d = new int[3000001]; // 최단거리 저장 배열

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken()); // 도시의 개수
        m = Integer.parseInt(st.nextToken()); // 도로의 개수
        k = Integer.parseInt(st.nextToken()); // 거리 정보
        x = Integer.parseInt(st.nextToken()); // 출발 도시

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Integer>());
            d[i] = -1; // graph 최단거리 -1로 초기화
        }

        for (int i = 0; i < m; i++) { // 도시의 연결정보 넣기
            st = new StringTokenizer(br.readLine());
            // A에서 B로의 단방향 도로(거리는 1)
            graph.get(Integer.parseInt(st.nextToken())).add(Integer.parseInt(st.nextToken()));
        }

        d[x] = 0; // 출발도시까지의 거리는 0
        Queue<Integer> q = new LinkedList<>();
        q.offer(x);
        while (!q.isEmpty()) {
            int now = q.poll(); // 큐 맨앞에 있는값 반환

            for (int i = 0; i < graph.get(now).size(); i++) { // 현재 도시에서 이동 가능한 다른 도시
                int next = graph.get(now).get(i);
                if (d[next] == -1) { // 방문 하지 않은 도시
                    d[next] = d[now] + 1; // 도로의 거리가 1이기 때문에 이전 최단거리에 +1한 값 저장
                    q.offer(next);
                }
            }
        }

        boolean check = false;
        for (int i = 1; i <= n; i++) {
            if (d[i] == k) { // 최단거리가 k인 노드 찾기
                System.out.println(i);
                check = true;
            }
        }

        if (check == false) // 최단거리가 k인 노드가 없다면 -1 출력
            System.out.println(-1);

        br.close();
    }
}