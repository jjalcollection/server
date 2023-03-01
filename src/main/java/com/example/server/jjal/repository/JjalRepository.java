package com.example.server.jjal.repository;


import com.example.server.jjal.domain.Jjal;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JjalRepository extends JpaRepository<Jjal, Long> {
    Slice<Jjal> findSliceBy(Pageable pageable);
}
