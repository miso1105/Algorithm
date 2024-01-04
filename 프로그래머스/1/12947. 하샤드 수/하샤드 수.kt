class Solution {
    fun solution(x: Int): Boolean {
        var sum: Int = 0
        var newList: List<Int> = listOf()
        newList = x.toString().map { it.toString().toInt() }
        for (i in newList) {
            sum += i
        }
        if (x%sum == 0) {
            return true
        } else {
          return false
        }
    }
}