package com.manoranjan.appservice.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="customer_info")
public class Customer implements Serializable{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int id;
	@Column(nullable=false)
private String name;
private String add;
@OneToMany(cascade=CascadeType.ALL)
List<BankAccount>accounts;
public Customer() {
	
}
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
public String getAdd() {
	return add;
}
public void setAdd(String add) {
	this.add = add;
}
public List<BankAccount> getAccounts() {
	return accounts;
}
public void setAccounts(List<BankAccount> accounts) {
	this.accounts = accounts;
}
public Customer(int id, String name, String add, List<BankAccount> accounts) {
	super();
	this.id = id;
	this.name = name;
	this.add = add;
	this.accounts = accounts;
}
@Override
public String toString() {
	return "Customer [id=" + id + ", name=" + name + ", add=" + add + ", accounts=" + accounts + "]";
}
}
