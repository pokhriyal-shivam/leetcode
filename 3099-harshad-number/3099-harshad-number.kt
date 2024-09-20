class Solution {
    fun sumOfTheDigitsOfHarshadNumber(x: Int): Int {
        val stringX = x.toString()
        if(stringX.length>1){
            val x1 = stringX.toCharArray()[0].digitToInt()
            val x2 = stringX.toCharArray()[1].digitToInt()
            val sum = x1+x2
            if(x%sum==0){
                return sum
            }else{
                return -1
            }
        }else{
            return x
        }
    }
}