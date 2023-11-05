package backjoon_kotlin.b_11659

fun main() = with(System.`in`.bufferedReader()) {
    val (n, m) = readLine().split(" ").map { it.toInt() }
    val input = readLine().split(" ").map { it.toInt() }.toIntArray()
    val sumArray = IntArray(n + 1)
    sumArray[0] = 0

    for(i in 1 .. n) {
        sumArray[i] = sumArray[i - 1] + input[i - 1]
    }

    for(i in 0 until m) {
        val (left, right) = readLine().split(" ").map { it.toInt() }
        println(sumArray[right] - sumArray[left - 1])
    }
}