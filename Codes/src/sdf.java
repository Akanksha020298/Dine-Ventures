import java.util.*;
public class sdf
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

System.out.println("Enter 1. Sign UP, 2. Sign IN");
switch(sc.nextInt()):
{
case 1:
System.out.println("Enter your phone number");
Long phone=c.nextLong();
File myFile = new File(String.valueOf(phone)+".txt");
        try
{
        if(!(myFile.exists()))
{ 				// checking file exist or not
            myFile.createNewFile(); 		// Creating new file
            System.out.println("New account created....");
FileWriter fr=new FileWriter(String.valueOf(phone)+".txt");
BufferedWriter br=new BufferedWriter(fr);
PrintWriter pr=new PrintWriter(br);
System.out.printn("Enter your name:")
pr.println(sc.next());
pr.println(phone);
System.out.printn("Enter your address:")
pr.println(sc.next());
pr.close();
        }
else{
            System.out.println("Account with that phone number already exist....");
        }
        }
catch (IOException e) {
            e.printStackTrace();
        }
break;
case 2:
System.out.println("Enter 1-update profile, 2- delete profile, 3-view your profile")
switch(sc.nextnt())
{
case 1:
System.out.println("Updating profile:");
FileWriter fr=new FileWriter(String.valueOf(phone)+".txt");
BufferedWriter br=new BufferedWriter(fr);
PrintWriter pr=new PrintWriter(br);
System.out.printn("Enter your name:")
pr.println(sc.next());
System.out.printn("Enter your address:")
pr.println(sc.next());
pr.close();
break;

case 2:
try
{
System.out.println("Enter your phone number");
Long phone=c.nextLong();
            File myFile = new File(String.valueOf(phone)+".txt");
            if(myFile.exists()){
                myFile.delete();
                System.out.println("Account deleted successfully....");
            }else{
                System.out.println("Account NOT Exisit....");
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
break;

case 3:
System.out.println("Enter your phone number");
Long phone=c.nextLong();
BufferedReader br = null;
        try{
            FileReader myFile  = new FileReader(String.valueOf(phone)+".txt");
            br = new BufferedReader(myFile);
            String line = null; 
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            e.printStackTrace();
        }finally{
            if(br != null) 
                try{ br.close(); }catch(IOException e){e.printStackTrace();}
        }   
break;
default:
System.out.println("Welcome !!");
}
break;
default:
System.out.println("Thankyou!!");
}
}
}



