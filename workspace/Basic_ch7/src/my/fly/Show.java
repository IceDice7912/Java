package my.fly;

public class Show {
	
//	public void airShow(Object o) {
//		if(o instanceof Bird) {
//			Bird b = (Bird)o;
//			b.fly();
//		}else if (o instanceof Superman) {
//			Superman s = (Superman) o;
//			s.flying();
//		}else if (o instanceof Airplane) {
//			Airplane a = (Airplane) o;
//			a.flight();
//		}else {
//			System.out.println("에어쇼를 할 수 없습니다.");
//		}
//	}

	public void airShow(Flyer f) {
		f.fly();
	}
	
	
}
