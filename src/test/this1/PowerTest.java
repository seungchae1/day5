package test.this1;

public class PowerTest {
	private int n;
	
	public void power(int n) {
		this.n = n * n;
		System.out.printf("%d의 제급은 %d입니다 \n", n, this.n);
	}
	
	public int power(int x, int y) {
		n=1;
		for(int i=1; i<=y; i++) {
			n*=x;
		}
		return n;
	}
}
