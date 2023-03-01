package com.example.server.jjal.repository;


import com.example.server.jjal.domain.jjal;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface jjalRepository extends JpaRepository<jjal, Long> {
}
