/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.hnue.mathutil;

/**
 *
 * @author Khuat Ngoc
 */
public class MathUtilLive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long result = MathUtil.getFactorial(5);
        System.out.println("5! = 120; actual: " + result);
        //kĩ thuật kiểm thử phần mềm: ước lượng xem giá trị thỏa mãn là gì
        // expected value: 5! = 120
        // mày viết hàm khi chạy thực tế là mấy - actual, giả sử 120
        // if expected == actual. hàm ngon trong tình huống này
//        MathUtil.getFactorial(-5);// ném ngoại lệ rồi, ai hiểu đưa cà chớn
        System.out.println("6! = 720; actual: " + MathUtil.getFactorial(6));
        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0));
// thêm code sau lần đầu tiên code lên server 11:49
        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0));
        System.out.println("3! = 6; actual: " + MathUtil.getFactorial(3));
        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0));
        System.out.println("0! = 1; actual: " + MathUtil.getFactorial(0));

    }

}
