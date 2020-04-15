package com.model;

public class TrainDetail {
	private int trainno;
	private String source;
	private String destination;
	
	
	public TrainDetail(int trainno, String source, String destination) {
		super();
		this.trainno = trainno;
		this.source = source;
		this.destination = destination;
	}
	public int getTrainno() {
		return trainno;
	}
	public void setTrainno(int trainno) {
		this.trainno = trainno;
	}
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getDestination() {
		return destination;
	}
	public void setDestination(String destination) {
		this.destination = destination;
	}
	@Override
	public String toString() {
		return "TrainDetail [trainno=" + trainno + ", source=" + source + ", destination=" + destination + "]";
	}
	
}
