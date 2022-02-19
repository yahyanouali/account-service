package com.account.service.domain;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Value;

@Value
@EqualsAndHashCode(callSuper = true)
@Builder
public class ErrorResultException extends RuntimeException {
  String type;
  String code;
  String message;
  int status;
}
