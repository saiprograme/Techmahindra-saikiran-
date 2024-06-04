import java.util.*;
public class Sim {
public int simId;
public String customerName;
public double balance;
public double ratePerSecond;
public String circle;
public Sim(int simId,String customerName,double balance,double ratePerSecond,String circle) {
	this.simId=simId;
	this.customerName=customerName;
	this.balance=balance;
	this.ratePerSecond=ratePerSecond;
	this.circle=circle;
}
public int getId() {
	return simId;
}
public void setId() {
	this.simId=simId;
}
public String getCn() {
	return customerName;
}
public void setCn() {
	this.customerName=customerName; 
}
public double getBn() {
	return balance;
}
public void setBn() {
	this.balance=balance;
}
public double getRPs() {
	return ratePerSecond;
}
public void setRPs() {
	this.ratePerSecond=ratePerSecond;
}
public String getC() {
	return circle;
}
public void setC() {
	this.circle=circle;
}
public String toString() {
    return simId + " " + customerName + " " + circle + " " + ratePerSecond;
}
}
