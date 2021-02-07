package Myweapon;

public class Show {

	public static void main(String[] args) {
		
		Sword s = new Sword();
		System.out.println("무기 타입 : " + s.type);
		System.out.print("무기 재료 : ");
			for(int i=0; i<s.data.length; i++)
					{
						System.out.print(s.data[i]+" ");
					}
		System.out.println();
		s.use();
		Repair rps = null;
		rps = new Sword();
		rps.Dorepair();
		rps.Donotrepair();
		rps.Checkdurability(50);
		
		System.out.println();
		
		Gun g = new Gun();
		System.out.println("무기 타입 : " + g.type);
		System.out.print("무기 재료 : ");
			for(int i=0; i<g.data.length; i++)
					{
						System.out.print(g.data[i]+" ");
					}
		System.out.println();
		g.use();
		Repair rpg = null;
		rpg = new Gun();
		rpg.Dorepair();
		rpg.Donotrepair();
		rpg.Checkdurability(75);
		
		System.out.println();
		
		Shield sh = new Shield();
		System.out.println("무기 타입 : " + sh.type);
		System.out.print("무기 재료 : ");
			for(int i=0; i<sh.data.length; i++)
					{
						System.out.print(sh.data[i]+" ");
					}
		System.out.println();
		sh.use();
		Repair rpsh = null;
		rpsh = new Sword();
		rpsh.Dorepair();
		rpsh.Donotrepair();
		rpsh.Checkdurability(25);
		
		System.out.println();		
	}
}
