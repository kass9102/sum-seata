package com.saint.account.controller;

import lombok.RequiredArgsConstructor;

/**
 * @author Saint
 */
@RestController
@RequiredArgsConstructor(onConstructor = @_(@Autowired))
public class OrderController {

    private final OrderService orderService;

    @GetMapping("/create")
    public Boolean create(String userId, String commodityCode, Integer count) {

        orderService.create(userId, commodityCode, count);
        return true;
    }

}