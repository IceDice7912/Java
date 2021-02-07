package Myweapon;

public class Gun implements Repair {

	String type = "총";
	String data[]= {"총알", "화약"};
//	String use[] = {"발사", "장전"};
	
	public void use() {
		// TODO Auto-generated method stub
		System.out.println("총은 쏘고 장전한다.");
	}

	@Override
	public void Dorepair() {
		// TODO Auto-generated method stub
		System.out.println("총을 수리합니다.");
	}
	@Override
	public void Donotrepair() {
		// TODO Auto-generated method stub
		System.out.println("총을 수리하지 않습니다.");
	}
	@Override
	public void Checkdurability(int durability) {
		// TODO Auto-generated method stub
		System.out.println("총 내구도를 확인합니다 - 내구도 : " + durability);
	}
	
}
