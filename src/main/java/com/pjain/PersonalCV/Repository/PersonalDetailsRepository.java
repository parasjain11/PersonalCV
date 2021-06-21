package com.pjain.PersonalCV.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pjain.PersonalCV.Entity.PersonalEntity;

@Repository
public interface PersonalDetailsRepository extends JpaRepository<PersonalEntity, Integer>{

}
