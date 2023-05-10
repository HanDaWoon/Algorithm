package baekjoon.p15649
fun main() =
        with(System.`in`.bufferedReader()) {
            val (n, m) = readLine().split(" ").map(String::toInt)
            val arr = BooleanArray(n + 1)
            val result = Array(m) { 0 }
            dfs(n, m, 0, arr, result)
        }

fun dfs(n: Int, m: Int, depth: Int, visited: BooleanArray, result: Array<Int>) {
    if (depth == m) {
        println(result.joinToString(" "))
        return
    }

    for (i in 1..n) {
        if (!visited[i]) {
            visited[i] = true
            result[depth] = i
            dfs(n, m, depth + 1, visited, result)
            visited[i] = false
        }
    }
}
