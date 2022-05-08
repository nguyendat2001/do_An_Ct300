package BaoCao;

import java.util.Scanner;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.BufferedReader;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.io.BufferedReader;
/**
 * Chuong trinh Giohang
 * @author ASUS
 *
 */


public class Classmain {
	/**
	 * Ham main
	 * @param args
	 * @throws FileNotFoundException
	 */
	
	public static void main(String[] args) throws FileNotFoundException {
		
		Scanner sc = new Scanner(System.in);
//		System.out.println("Nhap so loai san pham");
		int SL[] = new int[100];
//		int n = sc.nextInt(); 
		SanPham ds[] = new SanPham[100];  
//		
		SanPham ds1[] = new SanPham[100];
		
		ds1[0] = new SanPham("T1", "coca", 5000);
		ds1[1] = new SanPham("T2", "pesi", 6000);
		ds1[2] = new SanPham("T3", "Sting", 8700);
		
		int n=0;
		int n1=3;
		while(true) {
			System.out.println("nhap vao \n1 neu la admin\n2 neu la nguoi dung ");
			int s = sc.nextInt();
			if(s==1) {
				System.out.println("nhap vao \n1 neu muon them san pham\n2 neu muon sua\n3 neu muon xoa\n4 neu muon in");
				int a1 = sc.nextInt();
				if(a1 == 1) {
					System.out.println("nhap vao so san pham muon them :");
					int soSP = sc.nextInt();
					for(int i=n1 ; i<n1 + soSP ; i++) {		
						ds1[i] = new SanPham();
						System.out.println("nhap vao sp thu :"+(i+1)+" cua danh sach");
						ds1[i].nhapSP();
					}
					n1+=soSP;
				}else if(a1 == 2) {
					String ten1 = new String();
					Scanner sc1 = new Scanner(System.in);
					System.out.println("nhap Ten san pham muon sua: ");
					ten1 = sc1.nextLine();
					int j;
					for(j=0 ; j<n1;j++) {
						if(ten1.equals(ds1[j].layten())) {
							break;
						}
					}
					ds1[j].nhapSP();
				}else if(a1 == 3) {
					String ten1 = new String();
					Scanner sc1 = new Scanner(System.in);
					System.out.println("nhap Ten san pham muon xoa: ");
					ten1 = sc1.nextLine();
					int j;
					for(j=0 ; j<n1;j++) {
						if(ten1.equals(ds1[j].layten())) {
							break;
						}
					}
					for(;j<n1;j++) {
						ds1[j]=ds1[j+1];
					}
					n1--;
				}else if(a1 == 4) {
					for(int j=0 ; j<n1;j++) {
						ds1[j].inSP();
					}
				}
			}
			else{
				while(true) {

				System.out.println("\nnhap vao :\n1 neu muon them San Pham vao Gio Hang\n2 neu muon xoa San Pham ra gio hang\n3 neu muon sua Soluong\n4 neu muon xem san pham trong gio hang\n5 neu muon tim\n6 neu muon dung");
				int x = sc.nextInt();
				if (x == 1) {
					Scanner sc1 = new Scanner(System.in);
					System.out.println("co danh sach san pham nhu sau:");
					for(int i=0;i<n1;i++) {
						ds1[i].inSP();
					}
					System.out.println("nhap ten san pham muon them");
					String tenSP = new String();
					tenSP = sc1.nextLine();
					int tmp=0;
					for(int i=0;i<n1;i++) {
						if(tenSP.equals(ds1[i].layten())) {
							ds[n] = new SanPham(ds1[i]);
							System.out.println("nhap vao so luong: ");
							SL[n] = sc1.nextInt();
							n++;
							tmp=1;
							break;
						}
					}
					
					if(tmp==1) {
						System.out.println("them san pham thanh cong");
					}
					
				}
				else if (x == 2) {
					String ten1 = new String();
					Scanner sc1 = new Scanner(System.in);
					System.out.println("nhap Ten san pham muon xoa: ");
					ten1 = sc1.nextLine();
					int j;
					for(j=0 ; j<n;j++) {
						if(ten1.equals(ds[j].layten())) {
							break;
						}
					}
					for(;j<n;j++) {
						ds[j]=ds[j+1];
						SL[j] =SL[j+1];
					}
					n--;
				}else if(x == 3) {
					String ten1 = new String();
					Scanner sc1 = new Scanner(System.in);
					System.out.println("nhap Ten san pham muon sua so luong: ");
					ten1 = sc1.nextLine();
					int j;
					for(j=0 ; j<n;j++) {
						if(ten1.equals(ds[j].layten())) {
							break;
						}
					}
					System.out.println("nhap so luong san pham: ");
					SL[j]= sc.nextInt();
				}
				else if(x == 4) {
					for(int i=0;i<n;i++) {
						System.out.println("san pham thu: " +(i+1)+"\n");
						ds[i].inSP();
						System.out.println("So luong: " +(SL[i])+"\n");
					}
				}
				else if(x == 5) {
					String ten1 = new String();
					Scanner sc1 = new Scanner(System.in);
					System.out.println("nhap Ten san pham muon Tim: ");
					ten1 = sc1.nextLine();
					int j;
					int tmp=0;
					for(j=0 ; j<n;j++) {
						if(ten1.equals(ds[j].layten())) {
							ds[j].inSP();
							System.out.println("So luong: "+SL[j]);
							tmp=1;
						}
					}
					if(tmp==0) {
						System.out.println("khong tim thay san pham");
					}
				}

				else {
					break;
				}
				}
			}
		
		}
//		for(int i=0;i<n;i++) {
//			ds[i].inSP();
//		}
	}
}
