package org.opensourceway.uvp.dao;

import org.opensourceway.uvp.entity.AffectedPackage;
import org.opensourceway.uvp.enums.VulnSource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface AffectedPackageRepository extends JpaRepository<AffectedPackage, UUID> {
    // Filter vulnerabilities that are withdrawn.
    @Query(value = """
            SELECT ap.*
            FROM vulnerability v
                JOIN affected_package ap ON v.id = ap.vuln_id
            WHERE
                v.withdrawn IS NULL
                AND ap.purl = :purl
                AND v.source = :#{#source?.name()}
            """,
            nativeQuery = true)
    List<AffectedPackage> findByPurlAndSource(String purl, VulnSource source);
}