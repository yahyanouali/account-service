package com.account.service.domain;


import lombok.Builder;
import lombok.Value;

import java.math.BigInteger;
import java.time.Instant;

@Value
@Builder
public class Transfer {
  Long id;
  String senderAccountId;
  String receiverAccountId;
  BigInteger amount;
  TransferResult result;
  String detail;
  Instant createdAt;
}
