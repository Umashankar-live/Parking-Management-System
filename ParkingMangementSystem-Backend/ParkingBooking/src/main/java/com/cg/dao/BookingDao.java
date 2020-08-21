package com.cg.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cg.beans.BookSlot;

@Repository
public interface BookingDao extends JpaRepository<BookSlot, Integer> {

	@Query("Select b from BookSlot b Where b.location=?1")
	List<BookSlot> findByLocation(String location);

}
