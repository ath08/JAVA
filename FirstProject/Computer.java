public class Computer{
	private int price;
	private String brand;
	private int memorySize;

	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public String getBrand(){
		return brand;
	}
	public void setBrand(String brand){
		this.brand = brand;
	}
	public int getMemosySize(){
		return memorySize;
	}
	public void setMemorySize(int memorySize){
		this.memorySize = memorySize;
	}

	public void printInfo(){
		System.out.printf("Price = %d, Brand = %s, Memory Size = %d\n", price, brand, memorySize);
	}

}