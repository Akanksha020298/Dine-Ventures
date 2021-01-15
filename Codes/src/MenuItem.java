public class MenuItem 
{
public int getMenuItemID() {
		return menuItemID;
	}
	public void setMenuItemID(int menuItemID) {
		this.menuItemID = menuItemID;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
private int menuItemID;
private String title;
private String description;
private double price;
public boolean updatePrice(double price);
}

