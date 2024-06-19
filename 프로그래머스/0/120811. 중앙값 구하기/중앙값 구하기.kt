class Solution {
    fun solution(array: IntArray): Int {
        var answer: Int = 0
        var s = array.sorted()
        var d = s.size/2
        answer = s[d]
        return answer
    }
}