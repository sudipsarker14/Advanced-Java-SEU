package com.seu.hello_spring;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/demo-rest")
public class DemoRestController {

    @GetMapping("/hello")
    public Response hello(@RequestParam("name") String name) {
        Response response = new Response();
        response.setCode("OK");
        response.setMsg("Successful");

        return response;
    }

    @PostMapping("/student-create")
    public ResponseEntity<Response> student(@RequestBody Student student) {
        Response response = new Response();
        response.setCode("OK");
        response.setMsg("Successful");
//        response.setTest("Test");

        return ResponseEntity.internalServerError().body(response);
    }
}
