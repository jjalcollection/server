package com.example.server.jjal.repository;

import com.example.server.jjal.domain.Jjal;
import com.example.server.jjal.domain.Tag;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import com.example.server.jjal.domain.Jjal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface JjalRepository extends JpaRepository<Jjal, Long> {

    @Query("SELECT j FROM JjalRepository j" +
            "left join FETCH j.jjalTagMaps" +
            "")
    Slice<Jjal> findSliceBy(Tag tag, Pageable pageable);

}
