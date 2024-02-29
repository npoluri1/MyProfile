
import com.test.rem.AutoDrivingCar;
import org.junit.Test;
import static org.junit.Assert.*;

public class AutoDrivingCarTest {

    @Test
    public void testMoveForwardNorth() {
        AutoDrivingCar car = new AutoDrivingCar(10, 10, 1, 2, 'N');
        car.executeCommands("F");
        assertEquals("1 3 N", car.getPositionAndDirection());
    }

    @Test
    public void testMoveForwardEast() {
        AutoDrivingCar car = new AutoDrivingCar(10, 10, 1, 2, 'E');
        car.executeCommands("F");
        assertEquals("2 2 E", car.getPositionAndDirection());
    }

    @Test
    public void testMoveForwardSouth() {
        AutoDrivingCar car = new AutoDrivingCar(10, 10, 1, 2, 'S');
        car.executeCommands("F");
        assertEquals("1 1 S", car.getPositionAndDirection());
    }

    @Test
    public void testMoveForwardWest() {
        AutoDrivingCar car = new AutoDrivingCar(10, 10, 1, 2, 'W');
        car.executeCommands("F");
        assertEquals("0 2 W", car.getPositionAndDirection());
    }

    @Test
    public void testTurnLeft() {
        AutoDrivingCar car = new AutoDrivingCar(10, 10, 1, 2, 'N');
        car.executeCommands("L");
        assertEquals("1 2 W", car.getPositionAndDirection());
    }

    @Test
    public void testTurnRight() {
        AutoDrivingCar car = new AutoDrivingCar(10, 10, 1, 2, 'N');
        car.executeCommands("R");
        assertEquals("1 2 E", car.getPositionAndDirection());
    }
}