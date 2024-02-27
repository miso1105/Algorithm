class Solution {
    fun solution(n: Int, m: Int): IntArray {
        
        fun gcd(n: Int, m: Int): Int {
            var i = n
            var j = m
            
            while (j != 0) {
                var x = i % j
                i = j
                j = x
            }
            return i
        }
        
        fun lcm(n: Int, m: Int): Int {
            return n * m / gcd(n, m)
        }
        
        var answer = intArrayOf(gcd(n, m), lcm(n, m))
        
        return answer
    }
}