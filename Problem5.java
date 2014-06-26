public class Problem5 {
	public static void main(String[] args) {
		int count=0,odd_count=0;
		for(int i=1;i<6+1;i++) {
			for(int j=1;j<6+1;j++) {
				for(int k=1;k<6+1;k++) {
					int total = i * j * k;
					if (total%2==1) odd_count++;
					count++;
				}
			}
		}
		System.out.println(odd_count + " " + count);
		System.out.println(((double)odd_count)/((double)count));
	}
}