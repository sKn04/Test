package com.web.springboot_practiceexam1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckinService {
@Autowired
private CheckinRepo cr;
 public List<Checkin> getallCheckin(){
	 return cr.findAll();
 }
 public Optional<Checkin> getcheckinbyID(Integer id){
	 return cr.findById(id);
 }
 public Checkin createCheckin(Checkin c) {
	 return cr.save(c);
 }
 public Checkin updateCheckin(Integer id, Checkin c){
	 return cr.findById(id).map(existingc->{
		 existingc.setCheckinDate(c.getCheckinDate());
		 return cr.save(existingc);
	 }).orElseThrow(()->new RuntimeException("noo checkin details found"));
 }
 public void deletecheckin(Integer id) {
	 cr.deleteById(id);
 }
 

}
