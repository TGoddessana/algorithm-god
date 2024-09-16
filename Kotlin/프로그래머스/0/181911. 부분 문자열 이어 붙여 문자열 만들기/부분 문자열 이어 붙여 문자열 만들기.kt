class Solution {
    fun solution(myStrings: Array<String>, parts: Array<IntArray>): String {
        val sb = StringBuilder()
        
        for (index: Int in 0 until myStrings.size) {
            val partOfString = myStrings[index]
            val startIndex = parts[index][0]
            val endIndex = parts[index][1]
            
            sb.append(partOfString.substring(startIndex until endIndex+1))
        }
        
        return sb.toString()
    }
}