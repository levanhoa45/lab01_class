package caynhiphan;

public class main {

	public static void main(String[] args) {
		Cay c = new Cay();
		Nut p,q;
		p = c.newTree(31, c.newTree(29, c.newTree(10, null , c.newTree(20, null, null)), null), c.newTree(43, c.newTree(36, null, null), null));
		q = c.newTree(65, c.newTree(59, null, null), c.newTree(78, null, null));
		c.top = (c.newTree(54, p, q));
		
		c.check(c.top);
		System.out.println("Cây C theo LNR: ");
		c.duyetTraiLNR(c.top);
		System.out.println("\nSố nút trên cây là: " + c.DemNut(c.top));
		System.out.println("Số Nut lá trên cây là: " + c.DemLa(c.top));
		System.out.println("Số Nut nữa lá trên cây là: "  );
		c.demNuaLa(c.top);
		int v =(c.DemNut(c.top) - c.DemLa(c.top) - 1);
		System.out.println("\nSố Nut trung gian là: " + v);
		
	}

}
