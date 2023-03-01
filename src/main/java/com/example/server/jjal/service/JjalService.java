package com.example.server.jjal.service;


import com.example.server.jjal.domain.Jjal;
import com.example.server.jjal.repository.JjalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
@RequiredArgsConstructor
@Transactional
public class JjalService {

    private final JjalRepository jjalRepository;


    public Jjal getJjal(Long jjalId) {
        Optional<Jjal> byId = jjalRepository.findById(jjalId);
        Jjal jjal = byId.get();

        return jjal;
    }

    public Slice<Jjal> getJjalList(int page, int size) {

        Slice<Jjal> jjals;
        PageRequest pageRequest = PageRequest.of(page, size);

        jjals = jjalRepository.findSliceBy(pageRequest);

        return jjals;
    }
}
