
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class BikeTest {
    @Test
    public void TestThatBike_IsOn(){

        Bike bike = new Bike();
        boolean actual = bike.isBikeOn(false);
        boolean expected = true;
        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void TestThatBike_IsOff(){
        Bike bike =  new Bike();
        boolean actual = bike.isBikeOff(true);
        boolean expected = false;
        Assertions.assertEquals(expected,actual);
}
    @Test
    public void TestThatSpeed_IncreasesByOne_WhenInGearOne(){
    Bike bike =  new Bike();
    int actual = bike.accelerate(15);
    int expected = 16;
    }
    @Test
    public void TestThatSpeed_IncreasesByTwo_WhenInGearTwo(){
        Bike bike =  new Bike();
        int actual = bike.accelerate(22);
        int expected = 24;
    }
    @Test
    public void TestThatSpeed_IncreasesByThree_WhenInGearThree(){
        Bike bike =  new Bike();
        int actual = bike.accelerate(36);
        int expected = 39;
    }
    @Test
    public void TestThatSpeed_IncreasesByFour_WhenInGearFour(){
        Bike bike =  new Bike();
        int actual = bike.accelerate(40);
        int expected = 44;
    }
    @Test
    public void TestThatSpeed_DecreasesByOne_WhenInGearOne(){
        Bike bike =  new Bike();
        int actual  = bike.decelerate(16);
        int expected = 15;

    }
    @Test
    public void TestThatSpeed_DecreasesByTwo_WhenInGearTwo(){
        Bike bike =  new Bike();
        int actual  = bike.decelerate(24);
        int expected = 22;

    }


    @Test
    public void TestThatCorrectPinIsAccepted() {
        Account account = new Account();

        boolean actual = account.validatePin(1234);
        boolean expected = true;
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void TestThatIncorrectPinIsRejected() {
        Account account = new Account();

        boolean actual = account.validatePin(5678);
        boolean expected = false;
        Assertions.assertEquals(expected, actual);
    }


}