class Solution {
    fun solution(n: Int): Int {
        var arr = ArrayList<Int>()
        for(i in 1..n){
            if (n%i==1){
                arr.add(i)
            }
        }
        return arr[0]
    }
}