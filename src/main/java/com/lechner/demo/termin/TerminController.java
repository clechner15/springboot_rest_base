package com.lechner.demo.termin;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The Class TerminController.
 */
@RestController
public class TerminController {
	
	/** The repo. */
	@Autowired
	private  TerminRepository repo;

	/**
	 * Gets the termine.
	 *
	 * @return the termine
	 */
	@GetMapping("/termine")
	public List<Termin> getTermine()
	{
		return repo.findAll();
	}
	
}
