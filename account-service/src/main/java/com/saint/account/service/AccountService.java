package com.saint.account.service;

import com.saint.account.entity.Account;
import com.saint.account.repository.AccountDAO;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class AccountService {

    private final AccountDAO accountDAO;

    private static final String ERROR_USER_ID = "1002";

    @Transactional(rollbackFor = Exception.class)
    public void debit(String userId, BigDecimal num) {
        Account account = accountDAO.findByUserId(userId);
        account.setMoney(account.getMoney().subtract(num));
        accountDAO.save(account);

        if (ERROR_USER_ID.equals(userId)) {
            throw new RuntimeException("account branch exception");
        }
    }
}