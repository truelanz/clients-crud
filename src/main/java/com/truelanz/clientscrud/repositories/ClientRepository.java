package com.truelanz.clientscrud.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.truelanz.clientscrud.entities.Client;

public interface ClientRepository extends JpaRepository<Client, Long> {
    
}
