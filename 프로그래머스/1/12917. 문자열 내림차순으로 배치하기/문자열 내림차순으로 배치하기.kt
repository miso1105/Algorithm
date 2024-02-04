class Solution {
    fun solution(s: String): String {
        var answer = ""
        for (i in s.toList().sortedDescending()) {
            answer += i
        }
        return answer
    }
}