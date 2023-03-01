package com.example.server.jjal.contoller;


import com.example.server.jjal.domain.Jjal;
import com.example.server.jjal.dto.GetJjalListResponse;
import com.example.server.jjal.dto.GetJjalResponse;
import com.example.server.jjal.dto.CreateJjalRequest;
import com.example.server.jjal.dto.CreateJjalResponse;
import com.example.server.jjal.repository.JjalRepository;
import com.example.server.jjal.service.JjalService;
import io.swagger.v3.oas.annotations.Operation;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Slice;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    

    @Operation(description = "이미지 업로드")
    @PostMapping("/jjal/img")
    public ResponseEntity uploadImage(){

        return new ResponseEntity(HttpStatus.OK);
    }

    @Operation(description = "게시물 상세조회")
    @GetMapping("/jjal/{JjjalId}")
    public ResponseEntity<GetJjalResponse> getJjal(@PathVariable Long JjalId){

        Jjal jjal = jjalService.getJjal(JjalId);

        GetJjalResponse getJjalResponse = GetJjalResponse.builder()
                .id(jjal.getId())
                .image(jjal.getImage())
                .build();

        return new ResponseEntity(getJjalResponse,HttpStatus.OK);
    }

    @Operation(description = "게시물 리스트 조회")
    @GetMapping("/jjals")
    public ResponseEntity<Slice<GetJjalResponse>> getJjalList(@RequestParam int page, @RequestParam int size) {

        Slice<Jjal> jjals = jjalService.getJjalList(page, size);

        Slice<GetJjalResponse> jjalResponses = jjals.map(jjal -> new GetJjalResponse(jjal));

        return new ResponseEntity(jjalResponses, HttpStatus.OK);
    }

    @Operation(description = "이미지 다운로드")
    @GetMapping("/jjal/img")
    public ResponseEntity downloadImage(){


        return new ResponseEntity(HttpStatus.OK);
    }


}

