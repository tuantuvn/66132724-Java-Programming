package baitapvenha;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class baitap {
    public static void main(String[] args) throws IOException {
        
        // Tạo luồng nhập từ bàn phím
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // Nhập dữ liệu
        System.out.print("Nhap vao 1 chuoi: ");
        String s = br.readLine();

        // Xuất dữ liệu
        System.out.println("Chuoi vua nhap la: " + s);
    }
}