 


import java.math.BigInteger;

public class Factorial {

    public BigInteger factorialOf(Integer value){
        BigInteger finished = BigInteger.valueOf(0);
        BigInteger val = BigInteger.valueOf(value);
        for(int i=0;i<value;++i){
            BigInteger I = BigInteger.valueOf(i);
            BigInteger temp = val.multiply(I);
            finished = finished.add(temp);
        }
        return finished;
    }

}
