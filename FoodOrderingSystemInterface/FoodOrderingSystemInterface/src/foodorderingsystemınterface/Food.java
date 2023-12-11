package foodorderingsystemınterface;
public class Food{
	private int foodID;
	private String foodName;
	private String kitchenType;
	private int unitPrice;
        private String foodType;
	private int unitInStock;

	public Food( String name, String kitchenType, int unitPrice, String foodType) {
		this.foodName = name;
		this.kitchenType = kitchenType;
		this.unitPrice = unitPrice;
		this.foodType=foodType;
	}

	public String getName() {
		return foodName;
	}

	public void setName(String name) {
		this.foodName = name;
	}
        public String getfoodType() {
		return foodType;
	}

	public void setfoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getFoodID() {
		return foodID;
	}

	public void setFoodID(int foodID) {
		this.foodID = foodID;
	}

	public String getKitchenType() {
		return kitchenType;
	}

	public void setKitchenType(String kitchenType) {
		this.kitchenType = kitchenType;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getUnitInStock() {
		return unitInStock;
	}

	public void setUnitInStock(int unitInStock) {
		this.unitInStock = unitInStock;
	}

        
}