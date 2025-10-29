package h2;

public class H2_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 2, j = 3, k = 4, max = i, min = i;

		if (j < min) {
			min = j;
		}
		if (k < min) {
			min = k;
		}
		if (i > max) {
			max = i;
		}
		if (k > max) {
			max = k;
		}
		System.out.println(min);
		
		System.out.println(max);
		
	}

}
