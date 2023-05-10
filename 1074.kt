package baekjoon.p1074

fun main() =
        with(System.`in`.bufferedReader()) {
            readLine()
                    .split(" ")
                    .map(String::toInt)
                    .let { (n, r, c) -> recursive(n, r, c) }
                    .let(::println)
        }

fun recursive(n: Int, r: Int, c: Int): Int {
    if (n == 0) return 0
    val half = 1 shl (n - 1)
    return when {
        r < half && c < half -> recursive(n - 1, r, c) // 좌상단
        r < half && c >= half -> half * half + recursive(n - 1, r, c - half) // 우상단
        r >= half && c < half -> 2 * half * half + recursive(n - 1, r - half, c) // 좌하단
        else -> 3 * half * half + recursive(n - 1, r - half, c - half) // 우하단
    }
}
