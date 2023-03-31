package com.example.server.jjal.domain;


import com.example.server.jjal.common.domain.BaseTimeEntity;
import lombok.*;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Tag extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column(name = "TAG_ID")
    private Long id;

    @Column(name = "NAME", nullable = false)
    private String name;

    @OneToMany(mappedBy = "tag")
    private Set<JjalTagMap> jjalTagMaps = new HashSet<>();

    public Tag(String name) {
        this.name = name;
    }
}
