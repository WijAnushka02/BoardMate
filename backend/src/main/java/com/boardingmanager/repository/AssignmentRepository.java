package com.boardingmanager.repository;

import com.boardingmanager.entity.Assignment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AssignmentRepository extends JpaRepository<Assignment, Long> {
    List<Assignment> findByScheduleId(Long scheduleId);
    List<Assignment> findByUserId(Long userId);
}
