package com.pjain.PersonalCV.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pjain.PersonalCV.Model.PersonalDetailsModel;
import com.pjain.PersonalCV.Service.PersonalDetailsService;

@RestController
@RequestMapping(path = "/personalDetails")
public class PersonalDetailsController {
	
	@Autowired
	PersonalDetailsService personalDetailsService;
	
	@GetMapping(path = "/getPersonalDetails/{id}")
	public PersonalDetailsModel getPersonalDetails(@PathVariable Integer id) {
		PersonalDetailsModel personalDetails = new PersonalDetailsModel();
		personalDetails = personalDetailsService.getPersonalDetails(id);
		return personalDetails;
	}
	
	@PostMapping(path = "/savePersonalDetails")
	public ResponseEntity<PersonalDetailsModel> savePersonalDetails(@RequestBody PersonalDetailsModel detailsModel) {		
		detailsModel = personalDetailsService.savePersonalDetails(detailsModel);
		return ResponseEntity.ok(detailsModel);
	}
}
