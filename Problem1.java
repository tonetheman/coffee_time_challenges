public class Problem1 {

	static class Base {
		public static int b10(int a, int b, int c) {
			return a*(10*10) + b*(10) + c*1;
		}
		public static int b9(int a, int b, int c) {
			return a*(9*9) + b * (9) + c*1;
		}
	}
	
	public static void main(String[] args) {
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				for(int k=1;k<10;k++) {
					if (Base.b10(i,j,k) == Base.b9(k,j,i)) {
						System.out.println(i + " " + j + " " + k);
					}
				}
			}
		}
	}


}