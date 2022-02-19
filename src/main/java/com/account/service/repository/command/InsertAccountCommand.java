package com.account.service.repository.command;

import lombok.Builder;
import lombok.Value;
import lombok.With;

import java.math.BigInteger;

@Value
@Builder
@With
public class InsertAccountCommand {
  String accountId;
  String name;
  String owner;
  BigInteger balance;
}
