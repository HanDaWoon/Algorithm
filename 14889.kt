package baekjoon.p14889

fun main() =
        with(System.`in`.bufferedReader()) {
            val n = readLine().toInt()
            val arr = Array(n) { IntArray(n) }
            for (i in 0 until n) {
                arr[i] = readLine().split(" ").map(String::toInt).toIntArray()
            }
            val visited = BooleanArray(n + 1)
            var result = Integer.MAX_VALUE

            fun score() {
                var team_start = 0
                var team_link = 0

                for (i in 0 until n - 1) {
                    for (j in i + 1 until n) {
                        if (visited[i] && visited[j]) {
                            team_start += arr[i][j] + arr[j][i]
                        } else if (!visited[i] && !visited[j]) {
                            team_link += arr[i][j] + arr[j][i]
                        }
                    }
                }

                var dif = Math.abs(team_start - team_link)
                result = result.coerceAtMost(dif)

                if (result == 0) {
                    println(result)
                    System.exit(0)
                }
            }

            fun dfs(idx: Int, depth: Int) {
                if (depth == n / 2) {
                    score()
                    return
                }
                for (i in idx until n) {
                    if (!visited[i]) {
                        visited[i] = true
                        dfs(i + 1, depth + 1)
                        visited[i] = false
                    }
                }
            }
            dfs(0, 0)
            println(result)
        }
