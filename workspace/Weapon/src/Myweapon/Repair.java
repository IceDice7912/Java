package Myweapon;

public interface Repair {
	public int MAX_Durability=100;
	public int MIN_Durability=0;
	
	public void Dorepair();
	public void Donotrepair();
	public void Checkdurability(int durability);
	
	default void setwrap(boolean wrap) {
		if(wrap) {
			System.out.println("밀봉 처리합니다.");
		} else {
			System.out.println("밀봉 해제합니다.");
		}
	}
	
	static void changeWeapon() {
		System.out.println("무기를 교체합니다.");
	}
}
