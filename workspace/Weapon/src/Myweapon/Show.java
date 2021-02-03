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
	}
}
