package lectureManager;

public class Project extends Lecture {
	private int total;
	public Project(String name, int i, int j, int k, int l) {
		// TODO Auto-generated constructor stub
		this.s = name;
		this.i = i;
		this.j = j;
		this.k = k;
		this.l = l;
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(s+" "+i+" "+j+" "+k+" "+l);
	}

	@Override
	public int calcTotal() {
		total= (int)(i*0.2+j*0.2+k*0.4+l*0.1);
		return total;
	}
	
}
