package com.techproed.schoolmanagementbackendb326.controller.businnes;

import com.techproed.schoolmanagementbackendb326.payload.response.business.ResponseMessage;
import com.techproed.schoolmanagementbackendb326.service.businnes.MeetingService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RequestMapping("/meeting")
@RestController
public class MeetingController {

  public final MeetingService meetingService;

  @PreAuthorize("hasAnyAuthority('Teacher')")
  @PostMapping("/save")
  public ResponseMessage<>saveMeeting(){

  }

}
