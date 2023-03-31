package com.example.server.jjal.service;


import com.example.server.jjal.domain.Jjal;
import com.example.server.jjal.domain.JjalTagMap;
import com.example.server.jjal.domain.Tag;
import com.example.server.jjal.repository.JjalRepository;
import com.example.server.jjal.repository.JjalTagMapRepository;
import com.example.server.jjal.repository.TagRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Slice;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
@Transactional
public class JjalService {

    private final JjalRepository jjalRepository;

    private final JjalTagMapRepository jjalTagMapRepository;

    private final TagRepository tagRepository;

    public Jjal createJjal(String image, Set<String> tagList) {
        Jjal jjal = new Jjal(image);

        List<Tag> tags = new ArrayList<>();
        for (String name : tagList) {
            Tag tag = tagRepository.findByName(name).orElseGet(() -> {
                Tag newTag = new Tag(name);
                tagRepository.save(newTag);
                return newTag;
            });
            tags.add(tag);
        }

        for (Tag tag : tags) {
            jjal.addTag(tag);
        }

        for (JjalTagMap jjalTagMap : jjal.getJjalTagMaps()) {
            jjalTagMapRepository.save(jjalTagMap);
        }

        return jjalRepository.save(jjal);
    }


    public Jjal getJjal(Long jjalId) {
        Optional<Jjal> byId = jjalRepository.findById(jjalId);
        Jjal jjal = byId.get();

        return jjal;
    }

    public Slice<Jjal> getJjalList(Tag tag, int page, int size) {

        Slice<Jjal> jjals;
        PageRequest pageRequest = PageRequest.of(page, size);

        jjals = jjalRepository.findSliceBy(tag, pageRequest);

        return jjals;
    }

}
