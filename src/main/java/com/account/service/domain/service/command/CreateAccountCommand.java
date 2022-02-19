package com.account.service.domain.service.command;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;

@Value
@Builder
public class CreateAccountCommand {
  @NotNull String accountId;

  @NotNull String name;

  @NotNull String owner;

  BigInteger balance;
}
