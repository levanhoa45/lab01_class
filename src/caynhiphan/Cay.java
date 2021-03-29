package caynhiphan;

public class Cay {
	Nut top;

	public Cay() {
		top = null;
	}

	public boolean isEmpty() {
		return top == null;
	}
	public void duyetDauNLR(Nut top) {
		if (top != null) {
			System.out.println(top.info + " ");
			duyetDauNLR(top.left);
			duyetDauNLR(top.right);
		}
	}
	public void duyetGiuaRNL(Nut top) {
		
		if( top != null) {
			duyetGiuaRNL(top.left);
			System.out.printf(top.info + " ");
			duyetGiuaRNL(top.right);
		}
	}
	public void duyetTraiLNR(Nut top) {
		if( top != null) {
			duyetGiuaRNL(top.left);
			System.out.printf(top.info + " ");
			duyetGiuaRNL(top.right);
		}
	}
	public Nut newTree(int x, Nut left, Nut right) {
			Nut p = new Nut(x);
			p.left = left;
			p.right = right;
			return p;
	}
	//chen nut
	public void chenNut(Nut top,int x) {
		if(top == null) {
			Nut p = new Nut(x);
			p.left = null;
			p.right = null;
			top = p;
		}else {
			if(top.info > x) {
				chenNut(top.left, x);
			}else {
				if(top.info < x) {
					chenNut(top.right, x);
				}else
					System.out.println("đã tồn tại nut này");
			}
		}
	}
	// ktra rong
	public void check(Nut top) {
		if(top != null) 
			System.out.println("Cây C không rỗng ");
		else 
			System.out.println("Cây C rỗng");
	}
	//dem nut
	public int DemNut(Nut top) {
		if(top != null) {
			return 1 + DemNut(top.left) + DemNut(top.right);
		}else {
			return 0;
		}
	}
	//dem la
	public int DemLa(Nut top) {
		if(top!= null) {
			if(top.left == null && top.right == null)  {
				return 1 ;
			}
			else
				return DemLa(top.left) + DemLa(top.right);
		}
		return 0;
	}
	//dem nua la
	public void demNuaLa(Nut top) {
		if(top != null) {
			if(top.left == null && top.right != null || top.left !=null && top.right == null){
				System.out.print(top.info + " ");
			}
				demNuaLa(top.left);
				demNuaLa(top.right);
		}
	}
	//dem trung gian
	public void demTrungGian(Nut top) {
		if(top != null) {
		
		}
	}
	
}
