package com.example.server.jjal.dto;


import com.example.server.jjal.domain.Jjal;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
public class GetJjalResponse {

    private Long id;

    private String image;


    @Builder
    public GetJjalResponse(Long id, String image){
        this.id = id;
        this.image = image;
    }

    public GetJjalResponse(final Jjal jjal){
        this.id = jjal.getId();
        this.image = jjal.getImage();
    }

}