import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;

class TelevisionTest {

    @Test
    public void TestThatTelevisionCanTurnOn() {
        Television television = new Television();
        boolean actual = television.turnOn(false);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatTelevisionCanTurnOff() {
        Television television = new Television();
        boolean actual = television.turnOff(true);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatTelevisionCanChangeToNextChannel() {
        Television television = new Television();
        int actual = television.nextChannel(2);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatTelevisionCanChangeToPreviousChannel() {
        Television television = new Television();
        int actual = television.previousChannel(3);
        int expected = 2;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatTelevisionCanIncreaseVolume() {
        Television television = new Television();
        int actual = television.increaseVolume(50);
        int expected = 51;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatTelevisionCanDecreaseVolume() {
        Television television = new Television();
        int actual = television.decreaseVolume(50);
        int expected = 49;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatTelevisionCanMute() {
        Television television = new Television();
        boolean actual = television.mute(true);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatTelevisionCanUnmute() {
        Television television = new Television();
        boolean actual = television.unmute(false);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }
}
