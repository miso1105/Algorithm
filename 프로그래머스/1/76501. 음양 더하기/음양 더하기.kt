class Solution {
    fun solution(absolutes: IntArray, signs: BooleanArray): Int {
        var answer: Int = 0
        
        for ((idx, name) in absolutes.withIndex()) {
            if (signs[idx] == true) {
                answer += name
            } else {
                answer -= name
            }
        }
        
        return answer
    }
}