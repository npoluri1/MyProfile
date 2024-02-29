import com.test.rem.*;
import org.junit.Test;
import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.*;

public class AutoDrivingCarCollisionTest {

    @Test
    public void testNoCollision() {
        String input = "10 10\n" +
                "A\n" +
                "1 2 N\n" +
                "FFRFFFFRRL\n" +
                "B\n" +
                "7 8 W\n" +
                "FFLFFFFFFF";

        assertFalse("Expected no collision", AutoDrivingCarCollision.simulateCollision(input));
    }

    @Test
    public void testCollision() {
        String input = "10 10\n" +
                "A\n" +
                "1 2 N\n" +
                "FFRFFFFRRL\n" +
                "B\n" +
                "5 4 N\n" +
                "FFLFFFFFFF";

        assertTrue("Expected collision", AutoDrivingCarCollision.simulateCollision(input));
    }
}


/*
public class AutoDrivingCarCollisionTest {
    @Test
    public void testNoCollision() {
        String input = "10 10\n" +
                "A\n" +
                "1 2 N\n" +
                "FFRFFFFRRL\n" +
                "B\n" +
                "7 8 W\n" +
                "FFLFFFFFFF";

        assertFalse(AutoDrivingCarCollision.simulateCollision(input));
    }

    @Test
    public void testCollision() {
        String input = "10 10\n" +
                "A\n" +
                "1 2 N\n" +
                "FFRFFFFRRL\n" +
                "B\n" +
                "5 4 N\n" +
                "FFLFFFFFFF";

        assertTrue(AutoDrivingCarCollision.simulateCollision(input));
    }
}*/
