package baekjoon.p14888

var min = Int.MAX_VALUE
var max = Int.MIN_VALUE

fun main() =
        with(System.`in`.bufferedReader()) {
            val n = readLine().toInt()
            val number = readLine().split(" ").map(String::toInt).toIntArray()
            val operator = readLine().split(" ").map(String::toInt).toIntArray()
            dfs(n, number, operator, 1, number[0])
            println(max)
            println(min)
        }

fun dfs(n: Int, number: IntArray, operator: IntArray, depth: Int, result: Int) {
    if (depth == n) {
        min = min.coerceAtMost(result)
        max = max.coerceAtLeast(result)
        return
    }

    for (i in 0 until 4) {
        if (operator[i] > 0) {
            operator[i]--
            when (i) {
                0 -> dfs(n, number, operator, depth + 1, result + number[depth])
                1 -> dfs(n, number, operator, depth + 1, result - number[depth])
                2 -> dfs(n, number, operator, depth + 1, result * number[depth])
                3 -> dfs(n, number, operator, depth + 1, result / number[depth])
            }
            operator[i]++
        }
    }
}
