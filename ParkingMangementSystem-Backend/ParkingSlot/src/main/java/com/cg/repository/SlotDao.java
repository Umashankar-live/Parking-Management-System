package com.cg.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.beans.Slots;

@Repository
public interface SlotDao extends JpaRepository<Slots, Integer> {
	@Query("Select p from Slots p Where p.location=?1")
	List<Slots> findSlotsByLocation(String location);

}
