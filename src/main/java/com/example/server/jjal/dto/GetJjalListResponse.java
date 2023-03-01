package com.example.server.jjal.dto;


import com.example.server.jjal.domain.Jjal;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.Slice;

@Getter
@NoArgsConstructor
public class GetJjalListResponse {

    private Slice<GetJjalResponse> getJjalResponses;


    public GetJjalListResponse(Slice<GetJjalResponse> getJjalResponses){
        this.getJjalResponses = getJjalResponses;
    }

}
