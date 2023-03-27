package org.opensourceway.uvp.dao;

import org.opensourceway.uvp.entity.AffectedPackage;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface AffectedPackageRepository extends JpaRepository<AffectedPackage, UUID> {
}