package com.onepiece.crm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.onepiece.crm.Personagens;

@Repository
public interface PersonagemRepository extends JpaRepository<Personagens, Long>{

	
}
