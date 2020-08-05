package com.cg.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.beans.Slots;

public interface SlotDao extends JpaRepository<Slots, Integer> {

}
