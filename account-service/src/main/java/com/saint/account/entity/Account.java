package com.saint.account.entity;

import lombok.Data;

import java.math.BigDecimal;

@Entity
@Table(name = "account_tbl")
@DynamicUpdate
@DynamicInsert
@Data
public class Account {
    @Id
    private Long id;
    private String userId;
    private BigDecimal money;
}