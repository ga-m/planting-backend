package org.gam.planting.jpa.repository;

import org.gam.planting.jpa.entity.Goal;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GoalRepository extends JpaRepository<Goal, Long> {

    Goal findByMemberId(Long member_id);

}