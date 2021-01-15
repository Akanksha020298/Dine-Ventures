import java.util.*;
public class Restaurant
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
FileWriter fr=new FileWriter("Restaurants.txt");
BufferedWriter br=new BufferedWriter(fr);
PrintWriter pr=new PrintWriter(br);
System.out.println("Enter name of restaurant:");
pr.println(sc.next());
System.out.println("Enter restaurant's ID:");
pr.println(sc.nextInt());
pr.close();
        }
}