import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AirConditionerTest {
    @Test
    public void TestThatAirConditioner_IsOn(){
        AirConditioner airConditioner = new AirConditioner();
        boolean actual =airConditioner.isAirConditionerOn(false);
        boolean expected = true;
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void TestThatAirConditioner_IsOff(){
        AirConditioner airConditioner = new AirConditioner();
        boolean actual =airConditioner.isAirConditionerOff(true);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void TestThatTemperatureIs_IncreasedByOne(){
        AirConditioner airConditioner = new AirConditioner();
        int actual =airConditioner.increase(18);
        int expected = 19;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void TestThatTemperatureIs_IncreasedByOneWhenItIsGreater_ThanThirtyItReturnsThirty(){
        AirConditioner airConditioner = new AirConditioner();
        int actual =airConditioner.increase(32);
        int expected = 30;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void TestThatTemperatureIs_DecreasedByOne(){
        AirConditioner airConditioner = new AirConditioner();
        int actual =airConditioner.decrease(17);
        int expected = 16;
        Assertions.assertEquals(expected,actual);

    }
    @Test
    public void TestThatTemperatureIs_ReducedByOneWhenItIsLess_ThanSixteenItReturnsSixteen(){
        AirConditioner airConditioner = new AirConditioner();
        int actual =airConditioner.decrease(16);
        int expected = 16;
        Assertions.assertEquals(expected,actual);

    }
}