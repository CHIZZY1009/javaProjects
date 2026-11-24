public class Bike {

    public boolean isBikeOn(boolean isOn){
        isOn = true;
        return isOn;

    }

    public boolean isBikeOff(boolean isOff){
        isOff = false;
        return isOff;
    }

    public static int accelerate(int speed){
        if(speed >= 0 && speed <= 20){
            speed += 1;
        }
        else if(speed >= 21 && speed <= 30){
            speed += 2;
        }
        else if(speed >= 31 && speed <= 40){
            speed += 3;
        }
        if(speed >= 41 ){
            speed += 4;
        }
    return speed;
    }
    public static int decelerate(int speed){
        if(speed >= 0 && speed <= 20){
            speed -= 1;
        }
        else if(speed >= 21 && speed <= 30){
            speed -= 2;
        }
        else if(speed >= 31 && speed <= 40){
            speed -= 3;
        }
        if(speed >= 41 ){
            speed -= 4;
        }
        return speed;
    }
}

