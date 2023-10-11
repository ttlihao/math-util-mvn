/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.phanthien.mathutil.main;

import com.phanthien.mathutil.core.MathUtility;

/**
 *
 * @author PhanThien
 */
public class Main {
    public static void main(String[] args) {
        //test thử hàm mình vừa viết tính giai thừa có đúng không
        // chuẩn bị bộ data test, test case
        
        // test case 1 check if getFactorial runs well with n=0
        // test Procedures:
        //                given n=0
        //                Invoke getFactorial (n = 0)
        //Expected Result: 1;        //0! == ?????
        long expected = 1; //em hy vong duoc tra ve
        int n = 0; // nếu anh đưa vào 0 giai thừa
        long actual = MathUtility.getFactorial(n); //chạy hàm mới biết
        System.out.println(n + "! | expected = " + expected + 
                "| actual = " + actual);
        //in ra và tự kết luận có giống kì vọng hay không
        
        
        //Test case #2: Check if getFactorial() runs 
       //               well with n=1
       //Test Procedures/Step : 
       //               Given n=1
       //               Invoke getFactorial(n=1)
       
       //               Expected Result: 1; // 1!==1?????      
               System.out.println("1! | expected = 1" +
                               "| actual = " + MathUtility.getFactorial(1));
        
        
    }
}
