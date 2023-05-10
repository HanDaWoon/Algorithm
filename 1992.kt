package baekjoon.p1992
fun main() =
        with(System.`in`.bufferedReader()) {
            val n = readLine().toInt()
            val arr = Array(n) { readLine().toCharArray() }
            val sb = StringBuilder()

            fun recursive(x: Int, y: Int, size: Int) {
                if (size == 1) {
                    sb.append(arr[x][y])
                    return
                }
                val chk = arr[x][y]
                for (i in x until x + size) {
                    for (j in y until y + size) {
                        if (chk != arr[i][j]) {
                            sb.append("(")
                            recursive(x, y, size / 2)
                            recursive(x, y + size / 2, size / 2)
                            recursive(x + size / 2, y, size / 2)
                            recursive(x + size / 2, y + size / 2, size / 2)
                            sb.append(")")
                            return
                        }
                    }
                }
                sb.append(chk)
            }
            recursive(0, 0, n)
            println(sb.toString())
        }
