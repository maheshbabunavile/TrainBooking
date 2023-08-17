package java1;
import java.util.Scanner;
class Trains
{
	String tName;
	int modelno;
	String category;
	double time;
	public Trains(String tName,int modelno,String category,double time)
	{
		this.tName=tName;
		this.modelno=modelno;
		this.category=category;
		this.time=time;
	}
	public static void stops()
	{
		
	}
	public String toString() {
		return "Trains [ tName = " + tName + ", modelno = " + modelno + ", category = " + category + ", time = " + time + " ]";
	}
	public void setTime(double newTime)
	{
		this.time=newTime;
	}
}
class Passenger extends Trains
{
	public Passenger(String tName, int modelno, String category, double time) {
		super(tName, modelno, category, time);	
	}
}
class Express extends Trains
{

	public Express(String tName, int modelno, String category, double time) {
		super(tName, modelno, category, time);	
	}
}
class SuperFast extends Trains
{
	public SuperFast(String tName, int modelno, String category, double time) {
		super(tName, modelno, category, time);
	}
}
class PassengerDetails
{
	String name;
	int age;
	long adhar;
	char gender;
	
	public PassengerDetails(String name, int age, long adhar, char gender) {
		this.name = name;
		this.age = age;
		this.adhar = adhar;
		this.gender = gender;
	}
	public void setName(String newName)
	{
		this.name=newName;
	}
	public void setAge(int newAge)
	{
		this.age=newAge;
	}
	public void setAdhar(long newAdhar)
	{
		this.adhar=newAdhar;
	}
	public void setGender(char newGender)
	{
		this.gender=newGender;
	}
	public String getName()
	{
		return name;
	}
	public int getAge()
	{
		return age;
	}
	public long getAdhar()
	{
		return adhar;
	}
	public long getGender()
	{
		return gender;
	}
		
	@Override
	public String toString() {
		return "PassengerDetails [ name = " + name + ", age = " + age + ", adhar = " + adhar + ", gender = '" + gender
				+ "']";
	}
}
class Inputs
{
	
	
	public static int priceTrain(int a)
	{
		if(a==1)
		{
			return 100;
		}
		else if(a==2) {
			return 150;
		}
		else if(a==3) {
			return 200;
		}
		else if(a==4) {
			return 250;
		}
		else if(a==5) {
			return 400;
		}
		else if(a==6) {
			return 500;
		}
		
		return 0;
		
	}
	public static void payment()
	{
		Scanner scan = new Scanner(System.in);
		
		//if(p==null || p1==null)
		
		System.out.println("Please Select payment mode");
		System.out.println(" for Credit/ Debit card---=>Press 1");
		System.out.println(" for Upi payment---=>Press 2");
		System.out.println(" for Cash---=>Press 3");
		int pay=scan.nextInt();
		switch (pay)
		{
			case 1:
				System.out.println("please Give Us your card details");
				System.out.println("Enter your card details:");
				System.out.println("Enter your card number:");
				int card=scan.nextInt();
				System.out.println(card);
				System.out.println("Enter your card four digit pin:");
				int cardpin=scan.nextInt();
				System.out.println("* * * *");
				System.out.println("Your payment is Processing.....");
				System.out.println("please wait a for a minute----");
				System.out.println("Your Payment is Successfull....ThankYou...");
				break;
			case 2:
				System.out.println("Enter UPI number:");
				String upi = scan.next();
				System.out.println("Your UPI number is:"+ upi);
				System.out.println("Press=> 1 for Confirm");
				System.out.println("Press=> 2 for Re-enter upi number");
				int upiVer=scan.nextInt();
				switch (upiVer)
				{
					case 1:
						System.out.println("----Thank You----:");
						System.out.println("Your payment is Processing.....");
						System.out.println("please wait a for a minute----");
						System.out.println("Your Payment is Successfull....ThankYou...");
						break;
					case 2:
						String upi0 = scan.nextLine();
						String upi1 = scan.nextLine();
						System.out.println("Your UPI number is:"+upi1);
				
						System.out.println("Your payment is Processing.....");
						System.out.println("please wait a for a minute----");
						System.out.println("Your Payment is Successfull....ThankYou...");
						break;
				}
				break;
				
			case 3:
				System.out.println("Please pay the cash at counter");
				System.out.println("ThankYou Sir");
				break;
			}
	}
	public static int properAdhar(long l)
	{
		int c=0;
		while(l!=0)
		{
			l=l/10;
			c++;
		}
		System.out.println(c);
		return c;
		
	}
	public static void passengerInputs()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Please register....give your Details");
		System.out.println("Enter Your name...");
		String sName=scan.next();
		System.out.println("Enter your age");
		int sAge = scan.nextInt();
		System.out.println("Enter the 12 Digits Adhar number");
		long sAdhar=scan.nextLong(12);
		
		System.out.println("Enter Gender");
		char sGender=scan.next().charAt(0);
		PassengerDetails p = new PassengerDetails(sName, sAge, sAdhar, sGender);
		System.out.println("Intializaion is completed");
		System.out.println(p);
		System.out.println("Do you want to Modify the Details");
		System.out.println("Press 1 for Modify"); 
		System.out.println("Press 2 for Continue to TrainsList"); 
		int m=scan.nextInt();
		switch(m)
		{
			case 1:
				System.out.println("Enter the name...");
				String sName2=scan.next();
				System.out.println("Enter the age");
				int sAge2 = scan.nextInt();
				System.out.println("Enter the 12 Digits Adhar number");
				long sAdhar2=scan.nextLong(12);
				System.out.println("Enter Gender");
				char sGender2=scan.next().charAt(0);
				PassengerDetails p1 = new PassengerDetails(sName2, sAge2, sAdhar2, sGender2);
				System.out.println("Re--Intializaion is completed");
				System.out.println(p1);
			case 2:
				break;
		}
	}
	public static void trainsList()
	{
		Trains pas1=new Passenger("Krishna",12135,"Passenger",8.15);
		Trains pas2=new Passenger("charminar",12136,"Passenger",9.20);
		Trains exp1=new Express("Konark",12145,"Express",7.45);
		Trains exp2=new Express("Shathavahana",12146,"Express",9.20);
		Trains sup1=new SuperFast("Secunderabad",12155,"Express",7.45);
		Trains sup2=new SuperFast("Gouthami",12156,"Express",9.20);
		Scanner scan= new Scanner(System.in);
		System.out.println("-------------------------Welcome To Indian Railways-------------------------");
		System.out.println("There are 3 Types of Trains are there...");
		System.out.println("press 1 for Passengers Trains List");
		System.out.println("press 2 for Express Trains list");
		System.out.println("press 3 for SuperFast Trains list");
		int b=scan.nextInt();
		switch(b)
		{
			case 1:
				System.out.println(pas1);
				System.out.println(pas2);
				System.out.println("Press 1 for Krishna Train");
				System.out.println("Press 2 for Charminar Train");
				int pasPrice=scan.nextInt();
				int price1=priceTrain(pasPrice);
				System.out.println("The Train Ticket Price is "+price1+" Rupees");
				if(a1==2)
				{
					passengerInputs();
				}
				payment();
				break;
			case 2:
				System.out.println(exp1);
				System.out.println(exp2);
				System.out.println("Press 3 for Konark Train");
				System.out.println("Press 4 for Shathavahana Train");
				int expPrice=scan.nextInt();
				int price2=priceTrain(expPrice);
				System.out.println("The Train Ticket Price is "+price2+" Rupees");
				if(a1==2)
				{
					passengerInputs();
				}
				payment();
				break;
			case 3:
				System.out.println(sup1);
				System.out.println(sup2);
				System.out.println("Press 5 for Secunderabad Train");
				System.out.println("Press 6 for GOuthami Train");
				int supPrice=scan.nextInt();
				int price3=priceTrain(supPrice);
				System.out.println("The Train Ticket Price is "+price3+" Rupees");
				if(a1==2)
				{
					passengerInputs();
				}
				payment();
				break;
		}
		
	}
	static int a1=0;
	public static void inputsDetails()
	{
		
		Scanner scan = new Scanner(System.in);
		System.out.println();
		System.out.println();
		System.out.println("Do you want to Register First...");
		System.out.println("Press 1 for Registration");
		System.out.println("Press 2 for to See Train Details");
		System.out.println("Press 3 to Login only for [Department] ");
		int a = scan.nextInt();
		a1=a;
		switch(a)
		{
		 	case 1:
		 		passengerInputs();
			case 2:
				trainsList();
			case 3:
				System.out.println("Please Regester First");
				System.out.println("Enter Your name...");
				String tmasterName=scan.next();
				System.out.println("Enter your age");
				int tmasterAge = scan.nextInt();
				TrainMaster m=new TrainMaster(tmasterName,tmasterAge);
				System.out.println(m.toString());
				m.trainMaster();
				break;	 		
		}
	}	
}
class TrainMaster
{
	static Scanner scan= new Scanner(System.in);
	String trainMasterName;
	int trianMasterAge;
	static String userName;
	static String userPassward;
	
	public static void trainMaster()
	{
		System.out.println("Create the UserDetails...");
		System.out.println("Enter the UserName...");
		String user=scan.next();
		userName=user;
		System.out.println("Enter the Passward ");
		while(true) {
				String passward=scan.next();
					if(isStrongPassward(passward))
					{
						userPassward=passward;
						System.out.println("Strog Passward...");
						break;
					}
					else if(isStrongPassward(passward)==false)
					{
						System.out.println("Enter the Strong passwars....");
						
					}
				}
		System.out.println("Press 1 for Login");
		int e=scan.nextInt();
		switch(e) 
		{
			case 1:
				login();
		}
	}
	public static void login() {
		System.out.println("Please Login");
		System.out.println("Enter UserID");
		while(true) {
				String userID=scan.next();
				if(userName.equals(userID))
				{
					System.out.println("Correct");
					break;
				}
				else
				{
					System.out.println("Enter the Valid UserID...");
				}
		}
		System.out.println("Enter the Passward");
		while(true)
		{
			String pass=scan.next();
			if(userPassward.equals(pass))
			{
				System.out.println("Correct");
				break;
			}
			System.out.println("Enter the Valid Passward");	
		}
		
	}
	
	@Override
	public String toString() {
		
		return "TrainMaster [trainMasterName=" + trainMasterName + ", trianMasterAge=" + trianMasterAge + "]";
	}

	TrainMaster(String trainMasterName, int trianMasterAge) {
		super();
		this.trainMasterName = trainMasterName;
		this.trianMasterAge = trianMasterAge;
	}
	public static boolean isStrongPassward(String s)
	{
		int n=s.length()-1;
		int upper=0;
		int lower=0;
		int digit=0;
		int symbol=0;
		for(int i=0;i<=n;i++)
		{
			char ch=s.charAt(i);
			if(ch>=65&&ch<=90)
			{
				upper++;
			}
			else if(ch>=97 && ch<=122)
			{
				lower++;
			}
			else if(ch>=48 && ch<=57)
			{
				digit++;
			}
			else {
				symbol++;
			}
		}
		if((n+1)>=8 && upper>=1 && lower>=1 && digit >=1 && symbol>=1)
		{
			return true;
		}
		return false;
	}
}
public class PracticeTrain {
	public static void details(Trains t)
	{
		System.out.println(t.toString());
	}
	public static void main(String[] args) 
	{
		Inputs.inputsDetails();
	}
}