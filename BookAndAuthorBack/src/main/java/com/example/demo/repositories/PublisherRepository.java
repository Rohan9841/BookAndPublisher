package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Publisher;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher,Long>{

}
