package com.model;

public class Ticket {
	private int id;
	private int ticketnum;
	public int getTicketnum() {
		return ticketnum;
	}
	@Override
	public String toString() {
		return "Ticket [id=" + id + ", ticketnum=" + ticketnum + ", trainnum=" + trainnum + ", totalprice=" + totalprice
				+ ", trickettype=" + trickettype + "]";
	}
	public Ticket(int id, int ticketnum, int trainnum, int totalprice, String trickettype) {
		super();
		this.id = id;
		this.ticketnum = ticketnum;
		this.trainnum = trainnum;
		this.totalprice = totalprice;
		this.trickettype = trickettype;
	}
	public void setTicketnum(int ticketnum) {
		this.ticketnum = ticketnum;
	}
	private int trainnum;
	private int totalprice;
	//private TicketType ticketType;
	private String trickettype;
	
	public String getTrickettype() {
		return trickettype;
	}
	public void setTrickettype(String trickettype) {
		this.trickettype = trickettype;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTrainnum() {
		return trainnum;
	}
	public void setTrainnum(int trainnum) {
		this.trainnum = trainnum;
	}
//	public TicketType getTicketType() {
//		return ticketType;
//	}
//	public void setTicketType(TicketType ticketType) {
//		this.ticketType = ticketType;
//	}
	
}
