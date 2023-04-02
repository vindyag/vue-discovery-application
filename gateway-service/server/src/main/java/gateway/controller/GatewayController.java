package gateway.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value="/", produces = {APPLICATION_JSON_VALUE})
@RestController
public class GatewayController {

    @GetMapping
    public ResponseEntity getProducts() {
        return ResponseEntity.ok().body("welcome to gateway,.!");
    }

}
