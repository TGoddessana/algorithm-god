class Solution {
    fun solution(price: Int): Int {
        when (price) {
            in 10 until 100000 -> return price
            in 100000 until 300000 -> return (price * 0.95).toInt()
            in 300000 until 500000 -> return (price * 0.9).toInt()
            else -> return (price * 0.8).toInt() 
        }
    }
}