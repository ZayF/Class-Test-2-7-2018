import java.util.Scanner;
public class PhoneTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone phone1=new Phone("Apple","iPhone7",2016,600);
		System.out.println(phone1.Brand);
		
		Phone phone2=new Phone("Apple","iPhone8",2017,1000);
		System.out.println(phone2.Brand);
		
		Phone phone3=new Phone("Apple","iPhoneX",2017,1500);
		System.out.println(phone2.Brand);
		
		System.out.println("Which phone would you like to buy");
		Scanner scan=new Scanner(System.in);
		String phone=scan.nextLine();
		
		System.out.println(phone1.price);
		System.out.println(phone2.price);
		System.out.println(phone3.price);
	}
	}

