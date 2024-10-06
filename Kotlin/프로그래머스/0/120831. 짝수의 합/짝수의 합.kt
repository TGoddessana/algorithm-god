class Solution {
    fun solution(n: Int): Int {
        return (1 .. n).filter{number -> number%2 == 0}.sum()
    }
}