

public class MusicPlayer {


    public static boolean isMusicPlayerOn(boolean isOn){

    isOn =true;
        return isOn;

    }

    public static boolean isMusicPlayerOff(boolean isOff){
        isOff = false;
            return isOff;
    }

    public static boolean pause(boolean isPlaying) {
        if (isPlaying) {
            return true;
        }
        return false;
    }


    public static int skip(int currentSong) {
        return currentSong + 1;
    }


    public static int previous(int currentSong) {
        if (currentSong > 1) {
            return currentSong - 1;
        }
        return currentSong;
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





    }



