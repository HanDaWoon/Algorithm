package baekjoon.p9663

fun main() =
        with(System.`in`.bufferedReader()) {
            val n = readLine().toInt() // 1 <= n < 15
            val visited = IntArray(n + 1) // 1 ~ n
            var result = 0

            fun isPossible(depth: Int): Boolean {
                for (i in 0 until depth) {
                    if (visited[i] == visited[depth] ||
                                    Math.abs(visited[i] - visited[depth]) == depth - i
                    ) // 같은 열에 있는지, 대각선에 있는지
                     return false
                }
                return true
            }

            fun dfs(depth: Int) {
                if (depth == n) {
                    // depth == n -> n개의 퀸
                    result++
                    return
                }
                for (i in 0 until n) {
                    visited[depth] = i
                    if (isPossible(depth)) {
                        // depth 행에 i 열에 퀸을 놓을 수 있다면
                        dfs(depth + 1)
                    }
                }
            }

            dfs(0)
            println(result)
        }
