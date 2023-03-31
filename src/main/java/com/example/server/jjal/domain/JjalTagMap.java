package com.example.server.jjal.domain;

import com.example.server.jjal.common.domain.BaseTimeEntity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

import static javax.persistence.FetchType.LAZY;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class JjalTagMap extends BaseTimeEntity {
    @Id
    @GeneratedValue
    @Column(name = "JJAL_TAG_LIST")
    private Long id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "JJAL_ID")
    private Jjal jjal;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "TAG_ID")
    private Tag tag;


    public JjalTagMap(Jjal jjal, Tag tag) {
        this.jjal = jjal;
        this.tag = tag;
    }
}
