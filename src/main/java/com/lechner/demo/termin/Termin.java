package com.lechner.demo.termin;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


/**
 * Sets the date.
 *
 * @param date the new date
 */
@Setter

/**
 * Gets the date.
 *
 * @return the date
 */
@Getter

/**
 * Instantiates a new termin.
 *
 * @param id the id
 * @param name the name
 * @param date the date
 */
@AllArgsConstructor

/**
 * Instantiates a new termin.
 */
@NoArgsConstructor

@Entity
public class Termin {
	
	/** The id. */
	@Id
	String id;
	
	/** The name. */
	String name;
	
	/** The date. */
	LocalDate date;

}
