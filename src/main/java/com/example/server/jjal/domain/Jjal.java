package com.example.server.jjal.domain;


import com.example.server.jjal.dto.GetJjalListResponse;
import com.example.server.jjal.dto.GetJjalResponse;
import com.example.server.jjal.common.domain.BaseTimeEntity;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Jjal extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "JJAL_ID")
    private Long id;

    @Column
    private String image;

    @OneToMany(mappedBy = "jjal")
    private Set<JjalTagMap> jjalTagMaps = new HashSet<>();

    public Jjal(String image) {
        this.image = image;
    }


    public void addTag(Tag tag) {
        JjalTagMap jjalTagMap = new JjalTagMap(this, tag);
        jjalTagMaps.add(jjalTagMap);
        tag.getJjalTagMaps().add(jjalTagMap);
    }
}
