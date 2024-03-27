package org.example.bmi_calculator;

import org.junit.jupiter.api.Test;
import org.junit.Assert;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;
class BMIControllerTest {


    @Test
    public void AdjustHeightTestsWhencm()
    {
        Random random=new Random();
        for(int i=0;i<100;i++) {
            float a = Float.parseFloat(String.valueOf(random.nextInt()));
            BMIController ob = new BMIController();
            assertEquals(a, ob.adjustHeight(a, "cm"));
        }
    }


    @Test
    public void AdjustHeightTestsWhenin()
    {
        Random random=new Random();
        for(int i=0;i<100;i++) {
            float a = Float.parseFloat(String.valueOf(random.nextInt()));
            BMIController ob = new BMIController();
            assertEquals(a*2.54f, ob.adjustHeight(a, "in"));
        }
    }

    @Test
    public void AdjustWeightTestsWhencm()
    {
        Random random=new Random();
        for(int i=0;i<100;i++) {
            float a = Float.parseFloat(String.valueOf(random.nextInt()));
            BMIController ob = new BMIController();
            assertEquals(a, ob.adjustWeight(a, "kg"));
        }
    }


    @Test
    public void AdjustWeightTestsWhenin()
    {
        Random random=new Random();
        for(int i=0;i<100;i++) {
            float a = Float.parseFloat(String.valueOf(random.nextInt()));
            BMIController ob = new BMIController();
            assertEquals(a/1000, ob.adjustWeight(a, "g"));
        }
    }


    @Test
    public void BMITestsinInchesKg()
    {
        BMIController ob=new BMIController();

        assertEquals("25.680527",ob.CalculateingBMI(ob.adjustHeight(65,"in"),70));
        assertEquals("25.140621",ob.CalculateingBMI(ob.adjustHeight(68,"in"),75));
        assertEquals("25.414785",ob.CalculateingBMI(ob.adjustHeight(72,"in"),85));
        assertEquals("25.619886",ob.CalculateingBMI(ob.adjustHeight(66,"in"),72));
        assertEquals("25.393877",ob.CalculateingBMI(ob.adjustHeight(69,"in"),78));
    }

    @Test
    public void BMITestsinInchesG()
    {
        BMIController ob=new BMIController();

        assertEquals("25.680527",ob.CalculateingBMI(ob.adjustHeight(65,"in"),ob.adjustWeight(70000,"g")));
        assertEquals("25.140621",ob.CalculateingBMI(ob.adjustHeight(68,"in"),ob.adjustWeight(75000,"g")));
        assertEquals("25.414785",ob.CalculateingBMI(ob.adjustHeight(72,"in"),ob.adjustWeight(85000,"g")));
        assertEquals("25.619886",ob.CalculateingBMI(ob.adjustHeight(66,"in"),ob.adjustWeight(72000,"g")));
        assertEquals("25.393877",ob.CalculateingBMI(ob.adjustHeight(69,"in"),ob.adjustWeight(78000,"g")));
    }

    @Test
    public void BMITestsinCmKg()
    {
        BMIController ob=new BMIController();

        assertEquals("25.711662",ob.CalculateingBMI(165,70));
        assertEquals("25.249338",ob.CalculateingBMI(178,80));
        assertEquals("25.059307",ob.CalculateingBMI(173,75));
        assertEquals("25.381468",ob.CalculateingBMI(183,85));
        assertEquals("25.510204",ob.CalculateingBMI(168,72));
    }

    @Test
    public void BMITestsinCMg()
    {
        BMIController ob=new BMIController();

        assertEquals("25.711662",ob.CalculateingBMI(165,ob.adjustWeight(70000,"g")));
        assertEquals("25.249338",ob.CalculateingBMI(178,ob.adjustWeight(80000,"g")));
        assertEquals("25.059307",ob.CalculateingBMI(173,ob.adjustWeight(75000,"g")));
        assertEquals("25.381468",ob.CalculateingBMI(183,ob.adjustWeight(85000,"g")));
        assertEquals("25.510204",ob.CalculateingBMI(168,ob.adjustWeight(72000,"g")));
    }
}