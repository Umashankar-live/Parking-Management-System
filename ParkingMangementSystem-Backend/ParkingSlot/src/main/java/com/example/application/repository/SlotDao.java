package com.example.application.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.application.beans.Slots;

public interface SlotDao extends JpaRepository<Slots, Integer> {

}
