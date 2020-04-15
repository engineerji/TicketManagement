package com.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.model.LoginDetails;
import com.model.Ticket;
import com.model.TrainDetail;
import com.model.TrainDetails;

public class TicketDao {
	private static List<Ticket> bookingList = new ArrayList<Ticket>();
	static int ticketid=1;
	Scanner scn = new Scanner(System.in);
	ApplicationContext ctx = new FileSystemXmlApplicationContext("spring-config.xml");
	
	public String login(String username,String password) {
		LoginDetails log = (LoginDetails)ctx.getBean("login");
		if(username.equalsIgnoreCase(log.getUsername()) && password.equals(log.getPassword())) {
			new TicketDao().showTrains();
			return "Successfully Login";
		}
		return "Invalid Username/Password";
	}
	
	public void showTrains() {
		TrainDetails details= (TrainDetails)ctx.getBean("traininfo");
		List<TrainDetail> list=details.getTrainList();
		System.out.println("Train Number  Train Source  Train Destination");
		for(TrainDetail train:list) {
			System.out.println(train.getTrainno()+"            "+train.getSource()+"             "+train.getDestination());
		}
	}
	public void bookTicket(int trainno) {
		TrainDetails details= (TrainDetails)ctx.getBean("traininfo");
		int valid=0;
		List<TrainDetail> list=details.getTrainList();
		for(TrainDetail train:list) {
			if(trainno== train.getTrainno()) {
				valid=1;
			}
		}
		if(valid==0) {
			System.out.println("Enter the valid Train Number :");
			return;
		}
		System.out.println("Enter the number of tickets:");
		int num=scn.nextInt();
		int price=400;
		System.out.println("Enter the ticket type:\n1. AC\n2.Non AC");
		int type=scn.nextInt();
		if(type==1) {
			Ticket tick= new Ticket(ticketid,num,trainno,(400+200)*num,"AC");
			bookingList.add(tick);
			System.out.println(tick);
			System.out.println("Booked");
		}
		else if(type==2) {
			Ticket tick= new Ticket(ticketid,num,trainno,(400)*num,"SL");
			bookingList.add(tick);
			System.out.println(tick);
			System.out.println("Booked");
		}
	}
	public void cancelTicket(int ticketno) {
		System.out.println("Cancelling");
		for(Ticket tick:bookingList) {
			if(tick.getId()==ticketno) {
				if(tick.getTrickettype().equals("AC")) {
					System.out.println("Refunded Money is :"+(tick.getTotalprice()-tick.getTicketnum()*100));
					bookingList.remove(tick);
					return ;
				}
			}
		}
			System.out.println("No such ticket is booked.");
			return;
		
		
	}
}
