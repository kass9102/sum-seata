package com.saint.account.repository;

import com.saint.account.entity.Account;

public interface AccountDAO extends JpaRepository<Account, Long> {

    Account findByUserId(String userId);

}
