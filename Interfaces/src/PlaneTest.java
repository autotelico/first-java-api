package Interfaces.src;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PlaneTest {

    @Test
     public void modelIsString() {
        Plane myPlane = new Plane("Su-80");
        assertTrue(myPlane.getModel().equals("Su-80"));
//        assertFalse(myPlane instanceof String);
    }
}