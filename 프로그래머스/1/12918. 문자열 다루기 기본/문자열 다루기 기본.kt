class Solution {
    fun solution(s: String): Boolean {
        val result = s.filter { it in '0'..'9'}.length
        return result == s.length && (s.length == 4 || s.length == 6) 
        return false
    }
}