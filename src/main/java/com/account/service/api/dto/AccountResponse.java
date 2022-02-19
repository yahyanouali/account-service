package com.account.service.api.dto;

import lombok.Builder;
import lombok.Value;

import java.math.BigInteger;
import java.time.Instant;


@Value
@Builder
public class AccountResponse {
  Long id;
  String accountId;
  String name;
  String owner;
  BigInteger balance;
  Instant createdAt;

}
