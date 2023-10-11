/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.phanthien.mathutil.core;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author PhanThien
 */
public class MathUtilityTest {
    //cấu trúc test case: ID | Desc | Steps/Procedures | Expected Result | Status
    // Test case #1 - Verify getFactorial (with n = 0)
    //Steps:
    //      1. given n = 0\
    //      2. call/invoke getFactorial (n = 0)
    //Expected Result:
    //               the method must return 1 as the result of 0!
    // Status: PASSED | FALSED đoán xem, 
    @Test
    public void VerifyFactorialGivenRightArgument0ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(0));
    }
    @Test
    public void VerifyFactorialGivenRightArgument2ReturnsOk(){
        assertEquals(1, MathUtility.getFactorial(1));
    }
    @Test
    public void VerifyFactorialGivenRightArgument3ReturnsOk(){
        assertEquals(2, MathUtility.getFactorial(2));
    }
    @Test
    public void VerifyFactorialGivenRightArgument4ReturnsOk(){
        assertEquals(6, MathUtility.getFactorial(3));
    }
    @Test
    public void VerifyFactorialGivenRightArgument5ReturnsOk(){
        assertEquals(24, MathUtility.getFactorial(4));
    }
}
