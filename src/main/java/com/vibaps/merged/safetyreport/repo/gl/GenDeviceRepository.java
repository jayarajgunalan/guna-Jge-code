package com.vibaps.merged.safetyreport.repo.gl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.vibaps.merged.safetyreport.entity.gl.GenDevice;

@Repository
public interface GenDeviceRepository extends JpaRepository<GenDevice,Long>{

	@Query("select d from GenDevice d where d.deviceId=:deviceId and d.refComDatabaseId=:refComDatabaseId")
	GenDevice findBydeviceIdAndrefComDatabaseId(String deviceId,Long refComDatabaseId);
}
