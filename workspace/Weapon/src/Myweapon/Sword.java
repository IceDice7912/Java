package Myweapon;

public class Sword implements Repair {
	
	String type = "검";
	String data[]= {"철", "나무"};
//	String use[] = {"베기", "휘두르기"};

	public void use() {
		// TODO Auto-generated method stub
		System.out.println("검은 베고 휘두른다.");
	}
	
@Override
public void Dorepair() {
	// TODO Auto-generated method stub
	System.out.println("검을 수리합니다.");
}
@Override
public void Donotrepair() {
	// TODO Auto-generated method stub
	System.out.println("검을 수리하지 않습니다.");
}
@Override
public void Checkdurability(int durability) {
	// TODO Auto-generated method stub
	System.out.println("검 내구도를 확인합니다 - 내구도 : " + durability);
}


}
