package core.app1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping(value="products", produces = {APPLICATION_JSON_VALUE})
@RestController
public class ProductController {

    @Value("${server.port}")
    private int serverPort;

    @GetMapping
    public ResponseEntity getProducts() {
        return ResponseEntity.ok().body("Returning products from " + serverPort);
    }

}
