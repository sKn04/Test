package com.web.springboot_practiceexam1;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/checkin")
public class CheckinController {
  @Autowired
  private CheckinService cs;
  @GetMapping("/all")
  public List<Checkin> getallCheckin(){
	  return cs.getallCheckin();
  }
  @GetMapping("/{id}")
  public Optional<Checkin> getcheckinbyID(Integer id){
	  return cs.getcheckinbyID(id);
  }
  @PostMapping("/")
  public Checkin createCheckin(Checkin c) {
	  return cs.createCheckin(c);
  }
  @PutMapping("/{id}")
  public Checkin updateCheckin(Integer id, Checkin c){
	  return cs.updateCheckin(id, c);
  }
  @DeleteMapping("/{id}")
  public String deletecheckin(Integer id) {
	  cs.deletecheckin(id);
	  return "Deleted successfully";
  }
  
}
