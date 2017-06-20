package de.tum.in.www1.model;

import java.time.LocalDate;

public class Reservation {
	
	private String bike;
	private LocalDate startDate;
	private String startTime;
	
	public String getBike() {
		return bike;
	}
	public void setBike(String bike) {
		this.bike = bike;
	}
	public LocalDate getStartDate() {
		return startDate;
	}
	public void setStartDate(LocalDate startDate) {
		this.startDate = startDate;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String time) {
		this.startTime = time;
	}
	
	public void save() {
		//This method is supposed to store the reservation on the server
	}
}
