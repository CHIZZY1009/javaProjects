import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertTrue;


class MusicPlayerTest {
    @Test
    public void TestThatMusic_PlayerIsOn() {
        MusicPlayer musicPlayer = new MusicPlayer();
        boolean actual = musicPlayer.isMusicPlayerOn(false);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);


    }

    @Test
    public void TestThatAirConditioner_IsOff() {
        MusicPlayer musicPlayer = new MusicPlayer();
        boolean actual = musicPlayer.isMusicPlayerOff(true);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void TestThatMusic_PlayerCanPause() {
        MusicPlayer musicPlayer = new MusicPlayer();
        boolean actual = musicPlayer.pause(true);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatMusic_PlayerCanSkip() {
        MusicPlayer musicPlayer = new MusicPlayer();
        int actual = musicPlayer.skip(2);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatMusic_PlayerCanGoToPreviousSong() {
        MusicPlayer musicPlayer = new MusicPlayer();
        int actual = musicPlayer.previous(3);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatMusic_PlayerCannotGoBelowSongOne() {
        MusicPlayer musicPlayer = new MusicPlayer();
        int actual = musicPlayer.previous(1);
        int expected = 1;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatMusic_PlayerCanIncreaseVolume() {
        MusicPlayer musicPlayer = new MusicPlayer();
        int actual = musicPlayer.increaseVolume(50);
        int expected = 51;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatVolumeCannotExceed100() {
        MusicPlayer musicPlayer = new MusicPlayer();
        int actual = musicPlayer.increaseVolume(100);
        int expected = 100;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatMusic_PlayerCanDecreaseVolume() {
        MusicPlayer musicPlayer = new MusicPlayer();
        int actual = musicPlayer.decreaseVolume(50);
        int expected = 49;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatVolumeCannotGoBelowZero() {
        MusicPlayer musicPlayer = new MusicPlayer();
        int actual = musicPlayer.decreaseVolume(0);
        int expected = 0;
        Assertions.assertEquals(expected, actual);
    }
}