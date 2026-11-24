public class Television {

    public static boolean turnOn(boolean isOn) {
        isOn = true;
        return isOn;
    }

    public static boolean turnOff(boolean isOn) {
        isOn = false;
        return isOn;
    }

    public static int nextChannel(int currentChannel) {
        return currentChannel + 1;
    }

    public static int previousChannel(int currentChannel) {
        if (currentChannel > 1) {
            return currentChannel - 1;
        }
        return currentChannel;
    }

    public static int increaseVolume(int volume) {
        if (volume < 100) {
            volume++;
        }
        return volume;
    }

    public static int decreaseVolume(int volume) {
        if (volume > 0) {
            volume--;
        }
        return volume;
    }

    public static boolean mute(boolean isSoundOn) {
        isSoundOn = false;
        return isSoundOn;
    }

    public static boolean unmute(boolean isSoundOn) {
        isSoundOn = true;
        return isSoundOn;
    }
}