/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hnue.mathutil;

/**
 *
 * @author Khuat Ngoc
 */
// ta viết cái class để cung cấp tiện ích cho nơi khác sài
// khi ta cung cấp tiện ích cho nơi khác xài, đó là lúc ta ko cần nhớ cái gì
// cho riêng ta, hàm static giúp ta làm điều này
public class MathUtil {

    // n! = 1.2.3.4.5...n
    //0! = 1! = 1
    // ko tính đc giai thừa cho số âm
    // 20! là vừa khớp kiểu long, kiểu long tối đa 18 con số 0
    // 21! lố kiểu long 
    // nếu đưa vào âm, 21! ta đéo tính, ta đập vào mặt ai sài hàm
    // một cái ngoại lệ, chửi éo tính đc
    // 
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid argument. n must be betweem be not");
            // hàm dùng liên ko cần return
        }
        if (n == 0 || n == 1) {
            return 1; // dừng ngay khi n đặc biệt
        }  // xúống tới đây n - 0..20
           //   chơi for hoạc đệ quy - recursion
           // kĩ thuật nhồi con heo đất, ốc bu dồn thịt
           // i = 2, i= 3, i= 4, .. i= n  nhồi liên tục i vào tích
           long product = 1;// tích khởi đầu bằng 1 nhồi 2 3 4 5 ... n
           for (int i = 2; i <= n; i++) {
           // product = product * i;
            product *= i;// product đang nhân với con i, đạp ngược lại
            // nhân từ 2
        }
        return product;
    }
}
