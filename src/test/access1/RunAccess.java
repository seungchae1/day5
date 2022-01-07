package test.access1;

import test.access2.BBB; //패키지가 다르면 import해서 사용해야 한다.

public class RunAccess {

	public static void main(String[] args) {
		AAA a = new AAA();
		a.test();
		
		BBB b = new BBB();
		b.test();

	}

}
