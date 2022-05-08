package BaoCao;

import java.util.Scanner;

public class cart {
	private SanPham A[];
	private int SL[];
	private int loai;
	
	public cart() {
		loai = 0;
//		A[] = new SanPham[loai];
		for(int i=0;i<loai;i++) {
			A[i] = new SanPham();
			SL[i]=0;
		}
	}
	
	public cart(cart ct) {
		loai = ct.loai;
//		A[] = new SanPham[loai];
		for(int i=0;i< ct.loai;i++) {
			A[i] = new SanPham(ct.A[i]);
			SL[i]=ct.SL[i];
		}
	}
	
	public void add() {
		Scanner sc = new Scanner(System.in);
		A[loai].nhapSP();
		System.out.println("nhap vao so luong san pham");
		SL[loai] = sc.nextInt();
		loai++;
	}
	
	public void delete(){
		Scanner sc = new Scanner(System.in);
		String ten1 = new String();
		System.out.println("nhap Ten san pham muon xoa: ");
		ten1 = sc.nextLine();
		int j;
		for(j=0 ; j<loai;j++) {
			if(ten1.equals(A[j].layten())) {
				break;
			}
		}
		for(;j<loai;j++) {
			A[j]=A[j+1];
		}
		loai--;
	}
	
	public void sua() {
		Scanner sc = new Scanner(System.in);
		String ten1 = new String();
		System.out.println("nhap Ten san pham muon xoa: ");
		ten1 = sc.nextLine();
		int j;
		for(j=0 ; j<loai;j++) {
			if(ten1.equals(A[j].layten())) {
				break;
			}
		}
		SL[j]=sc.nextInt();
	}
	
	public void search() {
		Scanner sc = new Scanner(System.in);
		String ten1 = new String();
		System.out.println("nhap Ten san pham muon tim: ");
		ten1 = sc.nextLine();
		int j;
		for(j=0 ; j<loai;j++) {
			if(ten1.equals(A[j].layten())) {
				break;
			}
		}
		
		A[j].inSP();
		System.out.println("so luong: "+SL[j]);
		
	}
	
	public void in() {
		for(int j=0 ; j<loai;j++) {
			A[j].inSP();
			System.out.println("so luong: "+SL[j]);
		}
	}
	
	public int layloai() {
		return loai;
	}
}
