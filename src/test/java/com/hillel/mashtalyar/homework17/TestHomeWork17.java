package com.hillel.mashtalyar.homework17;


import com.hillel.mashtalyar.homework.homework17.Average;
import com.hillel.mashtalyar.homework.homework17.Matrix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestHomeWork17 {
    int []array=new int[]{1,2,3,4,5};
    int [][] matrix=new int[][]{{1,2,3,4},{5,6,7,8}};

    @Test
    public void testMatrix(){

        assertEquals(false, Matrix.testMatrix(matrix));

    }

    @Test
    public  void  testAverage(){
        assertEquals(3, Average.testAverage(array));

}


}
