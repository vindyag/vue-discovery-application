package core.app1.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;



import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RequestMapping
@RestController
public class ProductController {

    @Value("${server.port}")
    private int serverPort;

    @GetMapping("/products")
    public ResponseEntity<String> getProducts() {
        return ResponseEntity.ok().body("Returning products from " + serverPort);
    }

    @GetMapping("/")
    public ResponseEntity<String> getRoot() {
        return ResponseEntity.ok().body("Returning root from " + serverPort);
    }
}
