 

import java.lang.reflect.Array;
public class LargestInteger {

    public Integer findLargestNumberUsingConditional(Integer[] integers){
        int bigNum = 0;
        for(int i=0;i<integers.length;i++){
            int checkNum = integers[i];
            if(checkNum>bigNum){
                bigNum=checkNum;
            }
        }
        return bigNum;
    }

    public Integer findLargestNumberUsingMathMax(Integer[] integers){
        int bigNum = 0;
        for(int i=0;i<integers.length;i++){
            int checkNum = integers[i];
            bigNum = Math.max(bigNum,checkNum);
        }
        return bigNum;
    }
}
