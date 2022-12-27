class Solution {
    public String intToRoman(int num) {
        StringBuilder result = new StringBuilder();
        int[] values = {1, 4, 5, 9, 10, 40, 50, 90, 100, 400, 500, 900, 1000};
        String[] symbols = {"I", "IV", "V", "IX", "X", "XL", "L", "XC", "C", "CD", "D", "CM", "M" };

        int index = values.length - 1;
        while(num > 0 && index >=0){
            if(num < values[index])
                index--; 
            else{
                num = num - values[index];
                result.append(symbols[index]);
            }  
        }
        return result.toString();
    }
}
