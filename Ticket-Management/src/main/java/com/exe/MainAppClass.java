package com.exe;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.dao.TicketDao;
import com.model.TrainDetails;

public class MainAppClass {
	static Scanner scn = new Scanner(System.in);
	public static void main(String[] args) {
		
		TicketDao tic= new TicketDao();
		
		int ch=0;
		do {
			System.out.println("Enter your choice :");
			System.out.println("1. Admin Login");
			System.out.println("2. Show Trains");
			System.out.println("3. Book Ticket");
			System.out.println("4. Cancel Ticket");
			System.out.println("5. Exit");
			ch=scn.nextInt();
			switch(ch) {
			case 1: System.out.println("---------------------------------------------------------");
					System.out.println("Enter the login id:");
					String loginid=scn.next();
					System.out.println("Enter the password:");
					String password=scn.next();
					System.out.print(tic.login(loginid,password));
					System.out.println("---------------------------------------------------------");
					break;
				
			case 2:System.out.println("---------------------------------------------------------"); 
					tic.showTrains();
					System.out.println("---------------------------------------------------------");
					break;
				
			case 3: System.out.println("---------------------------------------------------------");
					System.out.println("Enter the train number: ");
					int trainno=scn.nextInt();
					tic.bookTicket(trainno);
					System.out.println("---------------------------------------------------------");
					break;
				
			case 4: System.out.println("---------------------------------------------------------");
					System.out.println("Enter the ticket number: ");
					int ticknn=scn.nextInt();
					tic.bookTicket(ticknn);
					System.out.println("---------------------------------------------------------");
					
			case 5:	System.out.println("Exited !!");
					System.exit(0);
					break;
			default: System.out.println("Wrong choice");
			}
		}while(ch!=5);
	}
}
