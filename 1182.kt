package baekjoon.p1182

fun main() =
        with(System.`in`.bufferedReader()) {
            val (n, s) = readLine()!!.split(" ").map(String::toInt)
            val arr = readLine()!!.split(" ").map(String::toInt)

            var count = 0

            fun recursive(depth: Int, sum: Int) {
                if (depth == n) return
                if (sum + arr[depth] == s) count++
                recursive(depth + 1, sum)
                recursive(depth + 1, sum + arr[depth])
            }

            recursive(0, 0)
            println(count)
        }
