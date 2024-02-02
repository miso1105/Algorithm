class Solution {
    fun solution(n: Int): String {
        var answer = ""
        val k = n / 2
        
        for (i in 0 until k) {
            answer += "수"
            answer += "박"
        } 
        if (n % 2 == 1) {
            answer += "수"
        }
        return answer
    }
}