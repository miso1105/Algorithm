class Solution {
    fun solution(seoul: Array<String>): String {
        var answer = ""
        
        for ( (index, item) in seoul.withIndex()) {
            if (item == "Kim") {
                answer = "김서방은 ${index}에 있다"
            }
        }
        return answer
    }
}