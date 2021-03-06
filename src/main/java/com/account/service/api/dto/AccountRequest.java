package com.account.service.api.dto;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;


@Value
@Builder
public class AccountRequest {
  @NotNull String accountId;
  @NotNull String name;
  @NotNull String owner;
  BigInteger balance;

}
