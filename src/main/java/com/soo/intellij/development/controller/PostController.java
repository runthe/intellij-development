package com.soo.intellij.development.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@RestController
public class PostController {

  @PostMapping("/group")
  public GroupDto post(@RequestBody GroupDto groupDto) {
    return groupDto;
  }

  @Setter
  @Getter
  @NoArgsConstructor
  private static class GroupDto {
    private String groupName;
    private List<String> members;
    private DateObj date;

    @Setter
    @Getter
    @NoArgsConstructor
    private class DateObj {
      private int year;
      private int month;
      private int day;
    }
  }
}
