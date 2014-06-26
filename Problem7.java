public class Problem7 {

	public static void main(String[] args) {
		int HEADS = 72;
		int LEGS = 200;
		
		// how many dogs
		for(int i=1;i<73;i++) {
			for(int j=1;j<73;j++) {
				int people = i;
				int dogs = j;
				
				int head_count = (i+j);
				if (head_count!=72) continue;
				
				int leg_count = (i*2) + (j*4);
				if (leg_count!=200) continue;
				
				System.out.println("people: " + people);
				System.out.println("dogs: " + dogs);
				System.out.println();
				
			}
		}
	}

}