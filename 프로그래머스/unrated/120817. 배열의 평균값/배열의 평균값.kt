class Solution {
    fun solution(numbers: IntArray): Double {
        var addNum: Double = 0.0
        for (i in numbers){
            addNum += i
        }
        return addNum / numbers.size
    }
}