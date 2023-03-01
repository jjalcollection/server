package com.example.server.jjal.contoller;


import com.example.server.jjal.repository.jjalRepository;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/api/v1")
@RestController
@RequiredArgsConstructor
@Slf4j
public class jjalController {

    private final jjalRepository jjalRepository;

    @Operation(description = "게시물 업로드")
    @PostMapping("/jjal")
    public ResponseEntity uploadPost(){

        return new ResponseEntity(HttpStatus.OK);
    }

    @Operation(description = "이미지 업로드")
    @PostMapping("/jjal/img")
    public ResponseEntity uploadImage(){

        return new ResponseEntity(HttpStatus.OK);
    }

    @Operation(description = "게시물 상세조회")
    @GetMapping("/jjal")
    public ResponseEntity getBoard(){

        return new ResponseEntity(HttpStatus.OK);
    }

    @Operation(description = "게시물 리스트 조회")
    @GetMapping("/jjals")
    public ResponseEntity getBoardList(){

        return new ResponseEntity(HttpStatus.OK);
    }

    @Operation(description = "이미지 다운로드")
    @GetMapping("/jjal/img")
    public ResponseEntity downloadImage(){


        return new ResponseEntity(HttpStatus.OK);
    }



}
