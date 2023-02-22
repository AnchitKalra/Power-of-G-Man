package com.example.geektrust;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void testGetPower() {
        String s = "SOURCE 1 1 S DESTINATION 1 2 PRINT_POWER";
        Grid grid = new Grid();
        int a = grid.getPower(s);
        Assertions.assertEquals(180, a);
    }

    @Test
    public void testMain() {
        String args[] = {"SOURCE 0 0 W DESTINATION 6 6 PRINT_POWER"};
        Main.main(args);

    }
}