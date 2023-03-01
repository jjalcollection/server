package com.example.server.jjal.contoller;


import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
@RequiredArgsConstructor
@Slf4j
public class jjalController {

    private final jjal

    @Operation("게시물 업로드")
    @PostMapping("/jjal")
    public ResponseEntity<> uploadPost()

}
