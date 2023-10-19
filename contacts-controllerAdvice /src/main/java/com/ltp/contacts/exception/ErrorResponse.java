package com.ltp.contacts.exception;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

public class ErrorResponse {

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy hh:mm:ss")
    private LocalDateTime timeStamps;
    private String message;


  public ErrorResponse(String message) {
    timeStamps = LocalDateTime.now();
    this.message = message;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public LocalDateTime getTimeStamps() {
    return this.timeStamps;
  }

  public void setTimeStamps(LocalDateTime timeStamps) {
    this.timeStamps = timeStamps;
  }

}
