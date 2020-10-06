package de.domainname.corona.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Restaurant {
	
	private long id;
	private String name;
	private String address;
	private String qrCode; // ggf. byte array (einlesen --> was gibt es schon)?
	

}
