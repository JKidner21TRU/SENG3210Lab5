package com.example.lab5;

import static org.junit.Assert.assertEquals;

import android.renderscript.ScriptGroup;

import org.junit.Test;

public class CalculatorTest {
    @Test
    public void TestAdd() {
    double InputA=5;
    double InputB=10;
    double ActualSum = Calculator.add(InputA, InputB);
    double ExpectedSum = InputA + InputB;
    assertEquals(ExpectedSum,ActualSum,0.0005);
    }
    @Test
    public void TestSubtract() {
        double InputA=5;
        double InputB=10;
        double ActualSum = Calculator.sub(InputA, InputB);
        double ExpectedSum = InputA - InputB;
        assertEquals(ExpectedSum,ActualSum,0.0005);
    }
}
