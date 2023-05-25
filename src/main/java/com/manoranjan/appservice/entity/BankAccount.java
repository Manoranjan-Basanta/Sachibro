package com.manoranjan.appservice.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class BankAccount implements Serializable {
	@Id
private int id;
	@Column(nullable=false)
private String name;
@Column(name="account_number",unique=true)
private String accountNumber;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAccountNumber() {
	return accountNumber;
}
public void setAccountNumber(String accountNumber) {
	this.accountNumber = accountNumber;
}
@Override
public String toString() {
	return "BankAccount [id=" + id + ", name=" + name + ", accountNumber=" + accountNumber + "]";
}
public BankAccount(int id, String name, String accountNumber) {
	super();
	this.id = id;
	this.name = name;
	this.accountNumber = accountNumber;
}
public BankAccount() {
	
}

}
