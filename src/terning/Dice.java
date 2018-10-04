package terning;
// Bund den kylling

public class Dice {
	// roll the die and return the value (1-6)
	public int roll() {
		int dx;
		do {
			float d1 = (float) Math.random();     // 0-1
			float d2 = d1 * 7;                     // 0-5
			int d3 = (int)Math.rint(d2);             // 0-5 integer
			dx = d3;
		} while(dx==0 || dx==7);
		return dx;                     // 1-6
	}

	// Dette er min, Jonatans kommentar.
	// roll the die n times and print the values
	public void rollMultiple(int n) {
		for (int i=1; i<=n; i++) {
			System.out.print(roll() + " ");
		}
	}
}
