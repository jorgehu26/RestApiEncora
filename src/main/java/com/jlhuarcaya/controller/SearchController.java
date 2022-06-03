package com.jlhuarcaya.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.jlhuarcaya.model.Input;
import com.jlhuarcaya.model.Output;
import com.jlhuarcaya.service.SearchService;

@RestController
@RequestMapping("/api")
public class SearchController {
  
  @Autowired
  private SearchService searchService;

  @GetMapping("/word")
  public @ResponseBody Output getWord(@RequestBody Input in) {
    Output out = new Output();
    out = searchService.getWord(in);
    return out;
  }  
  
}
