package com.saint.account;

@SpringBootApplication
@EnableFeignClients
@EnableJpaRepositories
public class AccountApplication {

    public static void main(String[] args) {
        SpringApplication.run(AccountApplication.class, args);
    }
}