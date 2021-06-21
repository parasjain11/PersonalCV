package com.pjain.PersonalCV.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pjain.PersonalCV.Entity.CertificationsEntity;
import com.pjain.PersonalCV.Entity.EducationEntity;
import com.pjain.PersonalCV.Entity.ExperienceEntity;
import com.pjain.PersonalCV.Entity.HobbiesEntity;
import com.pjain.PersonalCV.Entity.PersonalEntity;
import com.pjain.PersonalCV.Entity.SkillsEntity;
import com.pjain.PersonalCV.Entity.ToolsEntity;
import com.pjain.PersonalCV.Model.PersonalDetailsModel;
import com.pjain.PersonalCV.Repository.PersonalDetailsRepository;

@Service
public class PersonalDetailsServiceImpl implements PersonalDetailsService{
	/*
	 * @Autowired PersonalDetailsRepository personalDetailsRepository;
	 */
	
	@PersistenceContext
	private EntityManager em;

	@Override
	public PersonalDetailsModel getPersonalDetails(Integer id) {
		PersonalDetailsModel personalDetails = new PersonalDetailsModel();
		
		PersonalEntity personalEntity = new PersonalEntity(); 
		personalEntity = em.find(PersonalEntity.class, id);
		
		
		List<CertificationsEntity> certiLst = em.createNamedQuery("getAllCertificatesByPersonId", CertificationsEntity.class)
                .setParameter(1, id)
                .getResultList();
		return personalDetails;
	}

	@Override
	@Transactional
	public PersonalDetailsModel savePersonalDetails(PersonalDetailsModel detailsModel) {
		PersonalEntity personalEntity= new PersonalEntity();
		personalEntity.setAddress(detailsModel.getAddress());
		personalEntity.setDated(detailsModel.getDated());
		personalEntity.setDomain(detailsModel.getDomain());
		personalEntity.setEmailId(detailsModel.getEmailId());
		personalEntity.setMobileNo(detailsModel.getMobileNo());
		personalEntity.setName(detailsModel.getName());
		personalEntity.setSummary(detailsModel.getSummary());
		personalEntity.setSkillDesignation(detailsModel.getSkillDesignation());
		
		
		detailsModel.getCertificationsEntityList().stream().forEach(i -> {
			CertificationsEntity ce = new CertificationsEntity(i.getSkillName(), i.getCertificateName(), i.getCertificateDesc());
			ce.setPersonId(personalEntity);
			personalEntity.getCertList().add(ce);
			em.persist(ce);
			});
		
		detailsModel.getEducationDetailsEntityList().stream().forEach(i -> {
			EducationEntity ee = new EducationEntity(i.getStandardName(), i.getInstituteName(), i.getStartDate(), i.getEndDate(), i.getScores());
			ee.setPersonId(personalEntity);
			personalEntity.getEdudtlsList().add(ee);
			em.persist(ee);
			});

		detailsModel.getExperienceEntityList().stream().forEach(i -> {
			ExperienceEntity ee = new ExperienceEntity(i.getDesignation(), i.getClientName(), i.getCompanyName(), i.getStartDate(), i.getEndDate(), i.getExperienceDesc(), i.getRolesResponsibility1(), i.getRolesResponsibility2(), i.getRolesResponsibility3(), i.getRolesResponsibility4(), i.getRolesResponsibility5(), i.getRolesResponsibility6());
			ee.setPersonId(personalEntity);
			personalEntity.getExpList().add(ee);
			em.persist(ee);
			});
		
		detailsModel.getHobbiesEntityList().stream().forEach(i -> {
			HobbiesEntity he = new HobbiesEntity(i.getHobbyName(), i.getHobbyDesc());
			he.setPersonId(personalEntity);
			personalEntity.getHobList().add(he);
			em.persist(he);
			});
		
		detailsModel.getSkillsEntityList().stream().forEach(i -> {
			SkillsEntity se = new SkillsEntity(i.getSkillName(), i.getSkillDesc());
			se.setPersonId(personalEntity);
			personalEntity.getSkilList().add(se);
			em.persist(se);
			});
		
		detailsModel.getToolsEntityList().stream().forEach(i -> {
			ToolsEntity te = new ToolsEntity(i.getToolName(),i.getToolDesc());
			te.setPersonId(personalEntity);
			personalEntity.getToolList().add(te);
			em.persist(te);
			});
		
		em.persist(personalEntity);
		return detailsModel;
	}

}
