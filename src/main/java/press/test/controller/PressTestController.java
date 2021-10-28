package press.test.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/press/test")
@Slf4j
public class PressTestController {

  @GetMapping("/hello")
  @ResponseBody
  public String hello() {
    return "hello";
  }
}
