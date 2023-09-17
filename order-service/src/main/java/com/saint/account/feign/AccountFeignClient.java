package com.saint.account.feign;

import java.math.BigDecimal;

@FeignClient(name = "account-service")
public interface AccountFeignClient {

    @GetMapping("/debit")
    Boolean debit(@RequestParam("userId") String userId, @RequestParam("money") BigDecimal money);
}