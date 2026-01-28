package Resit_FA_LOWKAHSHENG_SCSJ2500286;
public class Building {
	static String name;
	static String purpose;
	protected Building (String name, String purpose) {
	}
	public static void Dairy (String n, String p)
	{
		name = n;
		purpose = p;}
		
	public void displayInfo(){	
		System.out.println("Name:" + name);
		System.out.println("Purpose:" + purpose);}
		
	public static void main(String[]args) {
	Building d = new Building (name = "Library", purpose = "Study Area");
	Building e = new Building (name = "Canteen", purpose = "Dining Area");
	d.displayInfo();
	e.displayInfo();
	}	
}

