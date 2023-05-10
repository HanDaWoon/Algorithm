package baekjoon.p6603

fun main() =
        with(System.`in`.bufferedReader()) {
            while (true) {
                val input = readLine().split(" ").map(String::toInt)
                // 입력의 마지막 줄
                if (input[0] == 0) {
                    break
                }

                val k = input[0] // 6 < k < 13 개의 수
                val arr = input.subList(1, input.size) // 1 ~ 49
                val visited = BooleanArray(k) // 0 ~ k-1
                val result = mutableListOf<List<Int>>() // 6개의 수

                fun dfs(idx: Int, depth: Int) {
                    if (depth == 6) {
                        // depth == 6 -> 6개의 수
                        //  visited 배열의 true 인덱스에 해당하는 arr의 값들을 result에 추가
                        result.add(arr.filterIndexed { index, _ -> visited[index] })
                        return
                    }
                    for (i in idx until k) {
                        if (!visited[i]) {
                            visited[i] = true
                            dfs(i + 1, depth + 1)
                            visited[i] = false
                        }
                    }
                }
                dfs(0, 0)
                result.forEach { println(it.joinToString(" ")) }
                println()
            }
        }
