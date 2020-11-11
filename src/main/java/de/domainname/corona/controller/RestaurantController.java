package de.domainname.corona.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import de.domainname.corona.entity.Restaurant;


@RestController
@RequestMapping("/api/v1/restaurants")
public class RestaurantController {
	
	@GetMapping
	public List<Restaurant> getAll() {

		List<Restaurant> restaurants = new ArrayList<Restaurant>() ;
		
		/*Restaurant restaurant = new Restaurant();
		restaurant.setId(1);
		restaurant.setName("Zum blauen Engel");
		restaurant.setAddress("Engelstr. 13, 54111 Bonn");
		restaurant.setQrCode("Lücke");
		*/
		
		Restaurant restaurant2 = Restaurant.builder().id(2).address("Hofstr. 12").name("Hirsch").build();
		
		//restaurants.add(restaurant );
		restaurants.add(restaurant2);
		//List<Restaurant> restaurants = Collections.emptyList();  // ist cool ;-)
		//List<Restaurant> restaurants = Collections.singletonList(restaurant); 	
		
		return restaurants;
		
	}
	
	// Command Shift O --> imports !!!
	
	// Vorgehen
	// https://docs.oracle.com/javase/8/docs/api/java/util/List.html
	// Interface --> implementing classes --> ArrayList...!
	
	
	
	// nächste Woche: Einbindung in DB... / Docker ... !!
	// Verknüpfung mit André !!!
	
	
	
	
	

}


