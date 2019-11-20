package ch.plj.uek223.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/product")
public class ProductController {

  @GetMapping("")
  public ResponseEntity<String> getHello(){
    String hello = "Hello World";
    return new ResponseEntity<>(hello, HttpStatus.OK);
  }
}
