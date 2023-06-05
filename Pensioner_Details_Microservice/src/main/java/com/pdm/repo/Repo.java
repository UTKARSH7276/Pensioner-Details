package com.pdm.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pdm.entity.Details;

@Repository
public interface Repo extends JpaRepository<Details, Long>{

}