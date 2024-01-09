class Solution {
    fun solution(a: Int, b: Int): Long {
        var answer: Long = 0
        for (i in a..b) {
            answer += i.toLong()
        }
        
        if (b < a) {
            for (i in b..a){
                answer += i.toLong()
            }
        } 
    
        if (a == b) {
            answer = a.toLong()
        }
        return answer
    }
}