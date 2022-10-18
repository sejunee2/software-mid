package lectureManager;

public class Theory extends Lecture {
	private int total;
	public Theory(String name, int i, int j, int k) {
		// TODO Auto-generated constructor stub
		this.s = name;
		this.i = i;
		this.j = j;
		this.k = k;
	}
	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println(s+" "+i+" "+j+" "+k);
	}
	@Override
	public int calcTotal() {
		// TODO Auto-generated method stub
		total= (int)((i*0.2)+(j*0.4)+(k*0.4));
		return total;
	}

}
