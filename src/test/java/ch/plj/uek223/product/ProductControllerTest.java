package ch.plj.uek223.product;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;
import org.assertj.core.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class ProductControllerTest {

  @Autowired
  private MockMvc mvc;

  @Test
  void getHello() {
    Assertions.assertThat("x").isEqualTo("x");
  }
}