package com.account.service.api.dto;

import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.NotNull;
import java.math.BigInteger;

@Value
@Builder
public class MoneyTransferRequest {
  @NotNull String senderAccountId;
  @NotNull String receiverAccountId;
  @NotNull BigInteger amount;
}
