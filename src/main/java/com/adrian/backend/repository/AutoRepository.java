package com.adrian.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adrian.backend.model.Auto;


@Repository
public interface AutoRepository extends JpaRepository<Auto, Long> {

    Auto findByPlaca(String placa);
}
