package BaoCao;

import java.util.Scanner;

public class SanPham {
	private String MaSP,TenSP;
	private float GiaSP;
	
	public SanPham() {
		MaSP = new String();
		TenSP = new String();
		GiaSP = 0.f;
	}
	
	public SanPham(String MaSP,String TenSP,float GiaSP) {
		this.MaSP = new String(MaSP);
		this.TenSP = new String(TenSP);
		this.GiaSP = GiaSP;
	}
	
	public SanPham(SanPham A) {
		this.MaSP = new String(A.MaSP);
		this.TenSP = new String(A.TenSP);
		this.GiaSP = A.GiaSP;
		
	}
	
	public void nhapSP() {
		Scanner sc = new Scanner(System.in);
		System.out.println("nhap ma San pham: ");
		MaSP = sc.nextLine();
		System.out.println("nhap Ten San pham: ");
		TenSP = sc.nextLine();
		System.out.println("nhap Gia San pham: ");
		GiaSP = sc.nextFloat();
	}
	
	public String toString () {
		return ("Ma: "+MaSP+" | Ten San Pham: "+TenSP+" | Don Gia: "+GiaSP);
	}
	
	public void inSP() {
		System.out.println("Ma: "+MaSP+" | Ten San Pham: "+TenSP+" | Don Gia: "+GiaSP);
	}
	
	public String layma() {
		return MaSP;
	}
	
	public String layten() {
		return TenSP;
	}
	
	public float laygia() {
		return GiaSP;
	}
}
