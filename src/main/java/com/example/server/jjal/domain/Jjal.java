package com.example.server.jjal.domain;


import com.example.server.jjal.common.domain.BaseTimeEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Jjal extends BaseTimeEntity {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String image;


}
