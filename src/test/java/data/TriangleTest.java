package data;

import exceptions.NotATriangleException;
import exceptions.NotPositiveParameterException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class TriangleTest {

    @Test
    void getTriangleTypeIsosceles() {
        assertEquals("isosceles",new Triangle(2,3,2).getType());
        assertEquals("isosceles",new Triangle(2,2,3).getType());
        assertEquals("isosceles",new Triangle(3,2,2).getType());
    }

    @Test
    void getTriangleTypeEquilateral() {
        assertEquals("equilateral",new Triangle(2,2,2).getType());
        assertEquals("equilateral",new Triangle(3,3,3).getType());
    }

    @Test
    void getTriangleTypeScalane() {
        Triangle firstOption = new Triangle(2,3,4);
        Triangle secondOption = new Triangle(4,5,7);
        assertEquals("scalane",firstOption.getType());
        assertEquals("scalane",secondOption.getType());
    }

    @Test
    void getNotTriangleType(){

        Triangle firstTriangle = new Triangle(4,5,17);

        Throwable exception = Assertions.assertThrows(NotATriangleException.class, () -> {
            firstTriangle.getType();
        });

        String expectedMessage = "Not possible to create triangle with following arguments";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        Triangle secondTriangle = new Triangle(7,10,1);

        exception = Assertions.assertThrows(NotATriangleException.class, () -> {
            secondTriangle.getType();
        });

        actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }

    @Test
    void getNonPositiveArgumentType(){
        Triangle firstTriangle = new Triangle(3,3,-3);

        Throwable exception = Assertions.assertThrows(NotPositiveParameterException.class, () -> {
            firstTriangle.getType();
        });

        String expectedMessage = "Not positive argument";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

        Triangle secondTriangle = new Triangle(0,10,7);

        exception = Assertions.assertThrows(NotPositiveParameterException.class, () -> {
            secondTriangle.getType();
        });

        actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));


    }

}