 


public class ShortCalculator {
    public void shortCalc(int value1, int value2){
        short convert1 = (short)(value1);
        short convert2 = (short)(value2);
        
        add(convert1,convert2);
        subtract(convert1,convert2);
        multiply(convert1,convert2);
        divide(convert1,convert2);
        modulus(convert1,convert2);
    }
    public short add(short val1,short val2){
        short sum = (short)(val1+val2);
        return sum;
    }
    public short subtract(short val1,short val2){
        short difference = (short)(val1-val2);
        return difference;
    }
    public short multiply(short val1,short val2){
        short product = (short)(val1*val2);
        return product;
    }
    public short divide(short val1,short val2){
        short remainder = (short)(val1/val2);
        return remainder;
    }
    public short modulus(short val1,short val2){
        short modulo = (short)(val1%val2);
        return modulo;
    }
}
