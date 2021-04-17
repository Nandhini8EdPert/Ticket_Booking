package ticketBooking;
import java.util.*;
import java.time.LocalDate;

import com.nandhini.ShortModules;

public class Tb {
	public static void main(String[] args) {
		ShortModules obj =new ShortModules();//CREATING OBJECT FOR SHORT MODULES
		Scanner ip = new Scanner(System.in);
		
		/****** GETTING USER MOBILE NO ******/
		 obj.userId();
		
		 /******* GETTING PASSWORD ******/
		 obj.pwd();
		
		/****** TICKET AVAILABILITY ********/
		System.out.println("** Ticket availability **");
		String arr []= {"1. ABC --- Rs.200", "2. PQR --- Rs.170", "3. XYZ --- Rs.150"};
		for(int i=0; i<3;i++) {
		System.out.println(arr[i]);}
		System.out.println("Enter your choice of movie: ");
		int wish= ip.nextInt();
		System.out.println("Number of tickets you want to book: ");
		int num = ip.nextInt();
		System.out.println("Enter the number of Adults(60+): ");
		int adults = ip.nextInt();
		int lessThan60= num-adults;
		obj.ticketAmtCalc(lessThan60,wish,adults);
		
		/****** DATE CHECK *******/
		System.out.println("Enter the date o watch your movie: ");
		String datestr =ip.next();
		LocalDate bdate = LocalDate.parse(datestr);
		obj.dateChecking(bdate);
		
		/******** TIME YOU WISH TO WATCH MOVIE *******/
		System.out.println("Enter your show time 1)10AM 2)2PM 3)5PM (hh:mm:ss): ");
		String btime = ip.next();
		obj.getTime(btime);	
		

		/******* CARD VALIDITY DATE CHECKING *******/
		System.out.println("Enter your card Expiry date(yyyy-mm): ");
		String cardex = ip.next();
		obj.creditcardValidyear(cardex);
		System.out.println("Thank you for visiting!!");
	}

	}


