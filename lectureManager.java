package lectureManager;

import java.util.ArrayList;
public class lectureManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Lecture> lecture = new ArrayList();
		
		Lecture lec = new Theory("운영체제", 100,90,90);
		lecture.add(lec);
		lec = new Project("소프트웨어공학",100,90,90,100);
		lecture.add(lec);
		lec = new Project("졸업프로젝트",100,80,90,100);
		lecture.add(lec);
		
		for(Lecture lc : lecture) {
			lc.print();
			System.out.println(lc.calcTotal());
		}
	}
}