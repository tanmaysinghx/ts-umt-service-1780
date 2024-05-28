package com.ts.ts_umt_service_1780.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

import com.ts.ts_umt_service_1780.entity.OtpEntity;
import java.util.List;


@Repository       
public interface OtpRepo extends JpaRepository<OtpEntity, String>{
	public OtpEntity findByUserEmail(String userEmail);
}
