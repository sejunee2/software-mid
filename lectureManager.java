package lectureManager;

import java.util.ArrayList;
public class lectureManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Lecture> lecture = new ArrayList();
		
		Lecture lec = new Theory("�ü��", 100,90,90);
		lecture.add(lec);
		lec = new Project("����Ʈ�������",100,90,90,100);
		lecture.add(lec);
		lec = new Project("����������Ʈ",100,80,90,100);
		lecture.add(lec);
		
		for(Lecture lc : lecture) {
			lc.print();
			System.out.println(lc.calcTotal());
		}
	}
}