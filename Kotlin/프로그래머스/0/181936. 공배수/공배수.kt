class Solution {
    fun solution(number: Int, n: Int, m: Int): Int {
        return if ((number % n == 0) and (number % m == 0)) 1 else 0
    }
}