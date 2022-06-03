package com.jlhuarcaya.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Output {
  
  @JsonProperty("Amount of permutations found")
  private Integer amount;
  @JsonProperty("Permutations found")
  private List<String> permutation;
  
  public Integer getAmount() {
    return amount;
  }
  public void setAmount(Integer amount) {
    this.amount = amount;
  }
  public List<String> getPermutation() {
    return permutation;
  }
  public void setPermutation(List<String> permutation) {
    this.permutation = permutation;
  }
  
}
