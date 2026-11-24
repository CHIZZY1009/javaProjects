public class AirConditioner {
    public boolean isAirConditionerOn(boolean isOn){
        isOn = true;
        return isOn;

    }

    public boolean isAirConditionerOff(boolean isOff){
        isOff = false;
        return isOff;

    }
public static int increase(int temperature){
    if (temperature < 30) {
        return temperature += 1;
    }
    else{
        return 30;
    }

}
    public static int decrease(int temperature){
        if (temperature > 16) {
            return temperature -= 1;
        }
        else{
            return 16;
        }

    }


}