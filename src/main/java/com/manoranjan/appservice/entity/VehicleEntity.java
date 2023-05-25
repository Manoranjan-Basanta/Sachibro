package com.manoranjan.appservice.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="vehicle_info")
public class VehicleEntity implements Serializable{
	@Id
	@GenericGenerator(name="auto",strategy="increment")
	@GeneratedValue(generator="auto")
	@Column(name="alt_key")
  private long altkey;
	@Column(name="name")
  private String name;
	@Column(name="model_number")
  private String modelNumber;
	@Column(name="engine_number")
  private String EngineNumber;
	@Column(name="price")
  private double price;
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="foreign_key")
	private RegistrationDetails details;
	public long getAltkey() {
		return altkey;
	}
	public void setAltkey(long altkey) {
		this.altkey = altkey;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public String getEngineNumber() {
		return EngineNumber;
	}
	public void setEngineNumber(String engineNumber) {
		EngineNumber = engineNumber;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
		
	}
	public RegistrationDetails getDetails() {
		return details;
	}
	public void setDetails(RegistrationDetails details) {
		this.details = details;
	}
	@Override
	public String toString() {
		return "VehicleEntity [altkey=" + altkey + ", name=" + name + ", modelNumber=" + modelNumber + ", EngineNumber="
				+ EngineNumber + ", price=" + price + ", details=" + details + "]";
	}
}
