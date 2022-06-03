package com.jlhuarcaya.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jlhuarcaya.model.Input;
import com.jlhuarcaya.model.Output;

@Service
public class SearchService {

  public Output getWord(Input in) {
    Output out = new Output();
    int isEqual = 0;
    Integer amount = 0;
    List<String> permutation = new ArrayList<String>();
    String[] words = in.getText().toLowerCase().replace(";", "").replace(".", "").replace(",", "").split(" ");
    
    for (String word:words) {
      isEqual = 0;
      for (char letter:word.toCharArray()) {
        if(in.getWord().toLowerCase().indexOf(letter) == -1) {
          isEqual++;
        }
      }
      if (isEqual == 0) {
        amount++;        
        permutation.add(word);
      }
    }
      
    out.setAmount(amount);
    out.setPermutation(permutation);
    
    return out;   
  }
  
}
