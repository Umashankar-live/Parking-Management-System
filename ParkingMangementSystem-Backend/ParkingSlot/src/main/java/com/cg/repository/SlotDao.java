package com.cg.repository;

<<<<<<< HEAD
import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
=======
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
>>>>>>> c5b7c5ad7c3b87832ba1a2a148a211facbc31065
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.beans.Slots;

@Repository
public interface SlotDao extends JpaRepository<Slots, Integer> {
<<<<<<< HEAD
	
	@Modifying
	@Transactional
	@Query("update Slots s set s.status = false where s.slotId = ?1")
	void update(int slotId );
=======
	@Query("Select p from Slots p Where p.location=?1")
	List<Slots> findSlotsByLocation(String location);
>>>>>>> c5b7c5ad7c3b87832ba1a2a148a211facbc31065

}
