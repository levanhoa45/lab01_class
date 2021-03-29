package caynhiphan;

public class Nut {
	int info;
	Nut right, left;
	public Nut(int x) {
		info = x;
	}
	public void inNut() {
		System.out.println(info + " ");
	}
}
