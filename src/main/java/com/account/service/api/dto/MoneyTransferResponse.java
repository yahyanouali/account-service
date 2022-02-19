package com.account.service.api.dto;

import com.account.service.domain.TransferResult;
import lombok.Builder;
import lombok.Value;

import java.math.BigInteger;
import java.time.Instant;

@Value
@Builder
public class MoneyTransferResponse {
  Long id;
  String senderAccountId;
  String receiverAccountId;
  BigInteger amount;
  TransferResult result;
  Instant timeStamp;
}
