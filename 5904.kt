package baekjoon.p5904
fun main() =
        with(System.`in`.bufferedReader()) {
            val n = readLine().toInt()
            val sb = StringBuilder()

            fun recursive(n: Int, k: Int, length: Int) {
                if (n == 1) {
                    sb.append("m")
                    return
                }
                if (n == 2 || n == 3) {
                    sb.append("o")
                    return
                }

                val mid = k + 3
                val total = length * 2 + mid
                if (n > total) {
                    recursive(n, k + 1, total)
                    return
                }

                if (n <= (total - length)) {
                    if (n - length == 1) sb.append("m") else sb.append("o")
                } else {
                    recursive(n - (length + mid), 1, 3)
                }
            }
            recursive(n, 1, 3)
            println(sb.toString())
        }
