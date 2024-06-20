package com.ts.ts_umt_service_1780.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ts.ts_umt_service_1780.entity.CompleteRegistrationEntity;


@Repository
public interface CompleteRegistrationRepo extends JpaRepository<CompleteRegistrationEntity, String>{
	public CompleteRegistrationEntity findByUserEmail(String userEmail);
}
