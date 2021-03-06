package com.paypal.bfs.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.NumberFormat;

import com.paypal.bfs.validations.NumericString;
import com.paypal.bfs.validations.ValidateAddressDetails;
import com.paypal.bfs.validations.ValidateEmployeeDetails;

import lombok.Data;

/**
 * 
 * @author vasanthnanduri
 * Description: This is an entity class which directly maps to the Address Table. validations are applied to the columns which do not accept null values.
 *
 */

@Entity
public class AddressEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	@Column
	@ValidateAddressDetails
	@NotEmpty(message = "line1 in address should not be blank.")
	String line1;
	
	@Column
	String line2;
	
	@Column
	@ValidateAddressDetails
	@NotEmpty(message = "City value should not be blank.")
	String city;
	
	@Column
	@ValidateAddressDetails
	@NotEmpty(message = "State value in address should not be blank.")
	String state;
	
	@Column
	@ValidateAddressDetails
	@NotEmpty(message = "Country value in address should not be blank.")
	String Country;
	
	@Column
	@ValidateAddressDetails
	@NotEmpty(message = "Zip code value in address should not be blank.")
	String zipCode;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	@Override
	public String toString() {
		return "AddressEntity [id=" + id + ", line1=" + line1 + ", line2=" + line2 + ", city=" + city + ", state="
				+ state + ", Country=" + Country + ", zipCode=" + zipCode + "]";
	}
	

}
