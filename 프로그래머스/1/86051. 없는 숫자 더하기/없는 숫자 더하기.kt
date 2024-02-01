class Solution {
    fun solution(numbers: IntArray): Int {
        var answer: Int = 0
        var result = numbers.sumOf { it }
        var sumNum: Int = 0
        for (i in 0..9) {
            sumNum += i
        }
        answer = sumNum - result
        return answer
    }
}