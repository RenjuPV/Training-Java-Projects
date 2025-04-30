package com.training.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Entity
@Table (name="stores")
public class Store {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@EqualsAndHashCode.Include 
	private int Id;
	private String storeAddress;
	
	@Column
	@NotEmpty(message="Store In Charge name is mandatory...Cannot be left blank")
	@Size(min=4,max=20,message="Length of Name should be between 3 to 20 ")
	private String storeInChargeName;
	
	@Column
	@Pattern(regexp="^[0-9]{10}$",message="Phone number must be exactly 10 digits")
	private String storeInChargePhoneNum;
	
	private int cityId;
	
	
	
	

}
