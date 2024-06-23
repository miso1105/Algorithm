class Solution {
    fun solution(my_string: String): Int {
        var answer: Int = 0
        for (i in my_string) {
            if (i.isDigit()) {
                answer += i.toString().toInt()
            }
        }
        return answer
    }
}