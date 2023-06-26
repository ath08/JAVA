public class Tester{
	public static void main(String[] args){
		Computer comp1 = new Computer();
		comp1.setPrice(1000);
		comp1.setBrand("Dell");
		comp1.setMemorySize(1024);

		System.out.println(comp1.getPrice());
		System.out.println(comp1.getBrand());
		System.out.println(comp1.getMemosySize());
		System.out.println("----------------------");

		comp1.printInfo();
		System.out.print("\n\n");


		Employee emp1 = new Employee();
		emp1.setExperience(15);
		emp1.setSalary(3500);

		System.out.println(emp1.getExperience());
		System.out.println(emp1.getSalary());
		System.out.println("----------------------");

		emp1.printInfo();

		System.out.println("\nCreate method which is getting Rectangle obj as an arg and calculates its surface");

		Rectangle r = new Rectangle();
		r.setHeight(5);
		r.setWidth(2);

		int surfaceArea = r.calculateRectangleSurface();
        System.out.println("Surface Area: " + surfaceArea);
			
		// System.out.print(r.calculatesRectangleSurface());

	}

	// public Rectangle calculatesRectangleSurface(Rectangle height, Rectangle width){
	// 	return  (height.getHeight() * width.getWidth()) / 2;
	// }
	
		
}