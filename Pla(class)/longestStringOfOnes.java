public class longestStringOfOnes {

    public static int longestStringOfOnes( int binaryNumber){
        String binaryString = Integer.toBinaryString(binaryNumber);
        int count = 0;
        int maxCount = 0;
        for(char digit : binaryString.toCharArray()){
            if(digit == '1'){
                count++;
                if(count > maxCount){
                    maxCount = count;
                }
            }else{
                count = 0;
            }
        }
        return maxCount;
    }
    
}
