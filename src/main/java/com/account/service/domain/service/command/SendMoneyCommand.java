package com.account.service.domain.service.command;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;

@Value
@Builder
public class SendMoneyCommand {
  @NotNull String senderAccountId;
  @NotNull String receiverAccountId;
  @NotNull BigInteger amount;
}
