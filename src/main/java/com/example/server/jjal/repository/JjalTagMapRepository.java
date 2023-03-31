package com.example.server.jjal.repository;

import com.example.server.jjal.domain.JjalTagMap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JjalTagMapRepository extends JpaRepository<JjalTagMap, Long> {

}
