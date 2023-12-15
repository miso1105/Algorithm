class Solution {
    fun solution(n: Int): Int {
        var answer = 0

        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        var nStr = n.toString().toList()
        println(nStr)
        for (i in nStr) {
            println(i.digitToInt())
            answer += i.digitToInt()
        }
        return answer
    }
}