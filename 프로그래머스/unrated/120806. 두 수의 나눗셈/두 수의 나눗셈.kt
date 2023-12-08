class Solution {
    fun solution(num1: Int, num2: Int): Int {
        var answer: Int = 0
        var num1D : Double = 0.0
        var num2D : Double = 0.0
        var answerD : Double = 0.0
        num1D = num1.toDouble()
        num2D = num2.toDouble()
        answerD = num1D / num2D * 1000
        answer = answerD.toInt()
        return answer
    }
}