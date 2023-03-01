package com.example.server.jjal.service;


import com.example.server.jjal.domain.Jjal;
import com.example.server.jjal.repository.JjalRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@RequiredArgsConstructor
@Transactional
public class JjalService {

    private final JjalRepository jjalRepository;

    public Long createJjal(String image) {
        Jjal jjal = Jjal.builder()
                .image(image)
                .build();

        jjalRepository.save(jjal);

        return jjal.getId();
    }

}
