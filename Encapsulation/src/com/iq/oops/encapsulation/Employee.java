package com.iq.oops.encapsulation;

public class Employee {
  private int eid;
  private String ename;
  
  public void setEid(int eid) {
	  this.eid=eid;
  }
  
  public int getEid() {
	  return eid;
  }

public void setEname(String ename) {
	this.ename = ename;
}

public String getEname() {
	return ename;
}

public Employee(int eid, String ename) {
	super();
	this.eid = eid;
	this.ename = ename;
}

  

  
 
}
