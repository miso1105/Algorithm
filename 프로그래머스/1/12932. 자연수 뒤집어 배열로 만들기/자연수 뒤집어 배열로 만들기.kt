class Solution {
    fun solution(n: Long): IntArray {
        var answer = intArrayOf()
        answer = n.toString().reversed().map { it.toString().toInt() }.toIntArray()
        return answer
    }
}