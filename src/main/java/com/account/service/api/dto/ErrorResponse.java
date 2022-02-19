package com.account.service.api.dto;

import lombok.Builder;
import lombok.Value;

@Value
@Builder
public class ErrorResponse {
  String type;
  String code;
  int status;
  String message;
}
