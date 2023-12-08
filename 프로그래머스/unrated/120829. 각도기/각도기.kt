class Solution {
    fun solution(angle: Int): Int {
        var answer: Int = 0
        if (angle in 1..89) {
            answer = 1
        } else if (angle == 90) {
            answer = 2
        } else if (angle in 91..179) {
            answer = 3
        } else if (angle == 180) {
            answer = 4
        }
        return answer
    }
}