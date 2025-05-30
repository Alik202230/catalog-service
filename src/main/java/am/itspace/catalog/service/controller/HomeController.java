package am.itspace.catalog.service.controller;

import am.itspace.catalog.service.config.PolarProperty;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
@RequiredArgsConstructor
public class HomeController {

  private final PolarProperty polarProperty;

  @GetMapping("/greeting")
  public String greeting() {
    return this.polarProperty.getGreeting();
  }

}
