package com.web.springboot_practiceexam1;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="checkin")
public class Checkin {
   @Id
   @GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private String checkinDate;
   @OneToMany(cascade=CascadeType.ALL)
   private Guest guest;
   
public Checkin() {
}
public Checkin(int id, String checkinDate, Guest guest) {
	
	this.id = id;
	this.checkinDate = checkinDate;
	this.guest = guest;
}
public Guest getGuest() {
	return guest;
}
public void setGuest(Guest guest) {
	this.guest = guest;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getCheckinDate() {
	return checkinDate;
}
public void setCheckinDate(String checkinDate) {
	this.checkinDate = checkinDate;
}
   
   
}
