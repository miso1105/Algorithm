class Solution {
    fun solution(left: Int, right: Int): Int {
        var answer: Int = 0
        var primeNum: Int = 0
        var numList: MutableList<Int> = mutableListOf()
        for (i in left..right) {
            numList.add(i)
        }

        for (i in numList) {
            for (j in 1..i) {
                if (i % j == 0) {
                    primeNum += 1
                }
            }; if (primeNum % 2 == 0) {
                answer += i
            } else {
                answer -= i
            }
            primeNum = 0  
        }
        return answer
    }
}