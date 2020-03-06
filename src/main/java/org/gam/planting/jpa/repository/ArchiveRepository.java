package org.gam.planting.jpa.repository;

import org.gam.planting.jpa.entity.Archive;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArchiveRepository extends JpaRepository<Archive, Long> {
}