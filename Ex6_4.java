class Ex6_4 {
	public static void main(String args[]) {
		// 3)��ü�� ���� (mm�̶�� ����������)  
		MyMath mm = new MyMath();
		// 4)ȣ���� ���� ���
		long result1 = mm.add(5L, 3L);
		long result2 = mm.subtract(5L, 3L);
		long result3 = mm.multiply(5L, 3L);
		double result4 = mm.divide(5L, 3L);
		long result5 = mm.maxval(5L, 5L);
		mm.printGugudan(4);
	

		System.out.println("add(5L, 3L) = " + result1);
		System.out.println("subtract(5L, 3L) = " + result2);
		System.out.println("multiply(5L, 3L) = " + result3);
		System.out.println("divide(5L, 3L) = " + result4);
		System.out.println("maxvalue(5L,3L) =" + result5);
	}
 }

// 1) Mymath Ŭ������ �ۼ�	2)Ŭ���� �� �޼��� �ۼ�	3)��ü�� ���� 	4)ȣ���� ���� ���

//1) Mymath Ŭ������ �ۼ�
 class MyMath {
	 //2)Ŭ���� �� �޼��� �ۼ�
	long add(long a, long b) {
		long result = a + b;
		return result;
	//	return a + b;	// ���� �� ���� �̿� ���� �� �ٷ� ������ �� �� �ִ�.
	}
	long subtract(long a, long b) { return a - b; }
	long multiply(long a, long b) { return a * b; }
	double divide(double a, double b) {
		return a / b;
	}
	long maxval(long a, long b) {
		long result = 0;
		if(a>b) return a;
		if(a<b) return b;
		else return 100000000;
		
	}
	
	void printGugudan(int dan) {
		if(!(2<=dan &&dan<=9))
			return;
		for(int i=1; i<=dan ; i++) {
			System.out.printf("%d*%d = %d",i,dan,i*dan);
			System.out.println(" ");
		}
	}
 }
