class Solution {
    fun solution(n: Int): Array<Int> {
        var answer = arrayOf<Int>()
        for (i in 1..n) {
            if (i % 2 == 1) {
                answer += i
            }
        }
        return answer
    }
}