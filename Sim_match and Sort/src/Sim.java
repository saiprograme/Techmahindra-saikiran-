import java.util.*;
public class Sim {
public int id;
public String company;
public int balance;
public double ratePerSecond;
public String circle;
public Sim(int id,String company,int balance,double ratePerSecond,String circle) {
	this.id=id;
	this.company=company;
	this.balance=balance;
	this.ratePerSecond=ratePerSecond;
	this.circle=circle;
}
public int getID() {
	return id;
}
public void setID() {
	this.id=id;
}
public String getCom() {
	return company;
}
public void setCom() {
	this.company=company;
}
public int getBal() {
	return balance;
}
public void setBal() {
	this.balance=balance;
}
public double getRps() {
	return ratePerSecond;
}
public void setRps() {
	this.ratePerSecond=ratePerSecond;
}
public String getCircle() {
	return circle;
}
public void setCircle() {
	this.circle=circle;
}
}
