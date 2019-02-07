 


public class NormalizeAngle {

    public Integer normalizeValueUsingModulo(Integer angle){
        int finalAngle = (angle+360)%360;
        return finalAngle;
    }

    public Integer normalizeValueUsingFloorMod(Integer integer){
        int finalAngle = Math.floorMod(integer,360);
        return finalAngle;
    }

    public static void main(String[] args){

    }
}
