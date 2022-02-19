package com.account.service.domain.service;

import com.account.service.domain.Transfer;
import com.account.service.domain.service.command.SendMoneyCommand;

import javax.validation.Valid;

public interface TransferMoneyUseCase {
  Transfer transferMoney(@Valid final SendMoneyCommand command);
}
