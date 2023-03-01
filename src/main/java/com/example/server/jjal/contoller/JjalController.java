package com.example.server.jjal.contoller;


import com.example.server.jjal.dto.CreateJjalRequest;
import com.example.server.jjal.dto.CreateJjalResponse;
import com.example.server.jjal.service.JjalService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
@RequiredArgsConstructor
@Slf4j
public class JjalController {

    private final JjalService jjalService;

    @Operation(description = "게시물 업로드")
    @PostMapping("/jjal")
    public ResponseEntity<CreateJjalResponse> uploadPost(@RequestBody CreateJjalRequest createJjalRequest) {
        jjalService.createJjal(createJjalRequest.getImage());
        CreateJjalResponse response = CreateJjalResponse.builder().message("이미지 업로드에 성공했습니다.").build();
        return new ResponseEntity(response, HttpStatus.OK);
    }

}
