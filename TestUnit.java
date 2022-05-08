package BaoCao;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestUnit {
	@Test 
	public void taosanpham() {
		SanPham A = new SanPham();
		final float excepted = 0.f;
		final float actual = A.laygia();
		assertEquals(excepted,actual);
	}
	@Test 
	public void taosanpham1() {
		SanPham A = new SanPham("M1","coca",9000);
		final float excepted = 9000;
		final float actual = A.laygia();
		assertEquals(excepted,actual);
	}
	@Test 
	public void cart() {
		cart s = new cart();
		final int excepted = 0;
		final float actual = s.layloai();
		assertEquals(excepted,actual);
	}
	@Test 
	public void delecart() {
		cart s = new cart();
		final int excepted = s.layloai()-1;
		s.delete();
		final float actual = s.layloai();
		assertEquals(excepted,actual);
	}
}
