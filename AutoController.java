package com.Automotora.ventadeautos.Auto;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/auto")
@RequiredArgsConstructor
public class AutoController {
   

   private final AutoService autoService;

  @PostMapping
  public void createAuto(@RequestBody auto auto){
     autoService.createAuto(auto);
  }
  
  

}
