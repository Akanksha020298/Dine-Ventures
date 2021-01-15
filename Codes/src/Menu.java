import java.util.ArrayList;
import java.util.List;

public class Menu
 {
private int menuID;
public int getMenuID() {
	return menuID;
}
public void setMenuID(int menuID) {
	this.menuID = menuID;
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
private String title;
private String description;
private List<String> menusections= new ArrayList<>();
public List<String> getMenusections() {
	return menusections;
}
public void setMenusections(List<String> menusections) {
	this.menusections = menusections;
}


public boolean addMenuSection(); //update menu
}
