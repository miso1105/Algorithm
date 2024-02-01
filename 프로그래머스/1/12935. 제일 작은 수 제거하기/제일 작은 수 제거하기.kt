class Solution {
    fun solution(arr: IntArray): IntArray {
        var answer = intArrayOf()
        var minNum = arr.minOf{ it }
        var newList = arr.toMutableList()
        newList.remove(minNum)
        answer = newList.toIntArray()
        
        if (arr.size < 2) {
            answer = intArrayOf(-1)
        }
        return answer
    }
}