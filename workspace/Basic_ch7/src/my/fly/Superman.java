package my.fly;

public class Superman extends Human{
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		super.eat();
		System.out.println("슈퍼맨은 그리고 빵도 먹는다.");
	}
	
	public void flying() {
		System.out.println("슈퍼맨은 망토를 펄럭이며 난다.");
	}

}
