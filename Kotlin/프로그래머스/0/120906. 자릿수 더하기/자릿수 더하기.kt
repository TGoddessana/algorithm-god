class Solution {
    fun solution(n: Int): Int {
        return n.toString().toList().map() {it.digitToInt()}.sum()
    }
}