package com.pjain.PersonalCV.Service;

import org.springframework.stereotype.Service;

import com.pjain.PersonalCV.Model.PersonalDetailsModel;

@Service
public interface PersonalDetailsService {

	PersonalDetailsModel getPersonalDetails(Integer id);

	PersonalDetailsModel savePersonalDetails(PersonalDetailsModel detailsModel);

}
