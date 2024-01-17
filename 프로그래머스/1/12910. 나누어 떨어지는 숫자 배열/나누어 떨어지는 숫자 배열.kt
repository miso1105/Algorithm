class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
        var answer: MutableList<Int> = mutableListOf()
        
        for (i in arr) {
            if (i % divisor == 0) {
                answer.add(i)
            } 
        }
        if (answer.size == 0) {
            answer.add(-1)
            }
        
    return answer.sorted().toIntArray()
    }
        
    }