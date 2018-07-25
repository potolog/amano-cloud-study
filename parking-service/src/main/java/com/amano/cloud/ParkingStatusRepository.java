package com.amano.cloud;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "parking", path = "parking")
public interface ParkingStatusRepository extends JpaRepository<ParkingStatus, Long> {

    Car findByLicense(@Param("license") String license);
}
