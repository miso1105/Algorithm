class Solution {
    fun solution(num: Int): Int {
        var answer = 0
        var num2 = num
        
        while (true) {
            if (num2 == 1) {
                break
            } else if (answer == 500) {
                answer = -1
                break
            } else {
                answer += 1
                if (num2 % 2 == 0) {
                    num2 = num2 / 2
                } else {
                    var numD = num2.toDouble()
                    numD = numD * 3 + 1
                    num2 = numD.toInt()
                }
            } 
        }
        
        return answer
    }
}