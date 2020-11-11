package de.domainname.corona.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
public abstract class Contact {
	
	private long id;
	private String name;
	private String address;
	private String qrCode; 

}



// Hausaufgaben für Martin:
/*
https://www.baeldung.com/lombok-builder-inheritance


Nächste Schritte:
- Klasse-Hierarchit
- Gäst-Controller
- Entity in Datenbank bringen
- Verknüpfung von Gästen und Restaurant (Gäste von einem Restaurant abfragen) One2Many...  

/api/v1/restaurants/{restaurantId}/guests


*/