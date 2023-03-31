package com.example.server.jjal.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class CreateTagDto {

    private String name;

    public CreateTagDto(String name) {
        this.name = name;
    }
}
