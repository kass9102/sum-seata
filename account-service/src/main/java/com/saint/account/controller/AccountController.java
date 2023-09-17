package com.saint.account.controller;

import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@RestController
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class AccountController {

    private final AccountService accountService;

    @RequestMapping("/debit")
    public Boolean debit(String userId, BigDecimal money) {
        accountService.debit(userId, money);

        return true;
    }
}