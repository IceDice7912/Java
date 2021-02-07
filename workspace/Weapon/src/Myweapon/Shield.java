package Myweapon;

public class Shield implements Repair {
	
	String type = "방패";
	String data[]= {"합금", "플라스틱"};
//	String use[] = {"막기", "던지기"};

	public void use() {
		// TODO Auto-generated method stub
		System.out.println("방패는 막고 던진다.");
	}
	
	@Override
	public void Dorepair() {
		// TODO Auto-generated method stub
		System.out.println("방패를 수리합니다.");
	}
	@Override
	public void Donotrepair() {
		// TODO Auto-generated method stub
		System.out.println("방패를 수리하지 않습니다.");
	}
	@Override
	public void Checkdurability(int durability) {
		// TODO Auto-generated method stub
		System.out.println("방패 내구도를 확인합니다 - 내구도 : " + durability);
	}
}
