class Solution {
    fun solution(s: String): String {
        var answer = ""
        var mList = mutableListOf<Char>()
        var list = listOf<Char>()
        var f: Int = 0
        list = s.toList()
        if (list.size % 2 == 0) {
            f = list.size / 2 - 1
            mList.add(list[f])
            mList.add(list[f+1])
        } else {
            f = list.size / 2
            mList.add(list[f])
        }
        for (i in mList) {
            answer += i
        }
        return answer
    }
}