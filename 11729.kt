package baekjoon.p11729
fun main() =
        with(System.`in`.bufferedReader()) {
            val n = readLine().toInt()
            val sb = StringBuilder()
            // hanoi(n) = hanoi(n - 1) + 1 + hanoi(n - 1)
            println((1 shl n) - 1)
            hanoi(n, 1, 3, 2, sb)
            print(sb)
        }

fun hanoi(n: Int, start: Int, end: Int, mid: Int, sb: StringBuilder) {
    if (n == 1) {
        sb.append("$start $end\n")
        return
    }
    // 3개의 기둥 중 중간
    hanoi(n - 1, start, mid, end, sb)
    sb.append("$start $end\n")
    hanoi(n - 1, mid, end, start, sb)
}

// https://www.youtube.com/watch?v=rf6uf3jNjbo hanoi
