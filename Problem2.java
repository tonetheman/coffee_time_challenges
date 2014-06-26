public class Problem2 {

	public static void main(String[] args) {
		int M = 1000000;
		
		for(int i=1;i<100000;i++) {
			for(int j=1;j<100000;j++) {
				if ((i%10)==0) continue;
				if ((j%10)==0) continue;
				int total = i * j;
				if (total==M) {
					System.out.println(i + " " + j);
				}
			}
		}
	}

}