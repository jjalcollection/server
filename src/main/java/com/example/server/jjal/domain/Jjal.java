package com.example.server.jjal.domain;


import com.example.server.jjal.dto.GetJjalListResponse;
import com.example.server.jjal.dto.GetJjalResponse;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
public class Jjal {

    @Id
    @GeneratedValue
    @Column
    private Long id;

    @Column
    private String image;


    public Jjal(Long id, String image){
        this.id = id;
        this.image = image;
    }




}
