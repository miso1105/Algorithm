class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var array: List<Int> = listOf()
        array = n.toString().map { it.toString().toInt() }.sorted().reversed()
        var emptyStr = ""
        for (i in array) emptyStr += i
        answer = emptyStr.toLong()
        return answer
    }
}