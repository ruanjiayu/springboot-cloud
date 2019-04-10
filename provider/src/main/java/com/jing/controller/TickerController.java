package com.jing.controller;

import com.jing.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author ruanjiayu
 * @dateTime 2019/4/10 11:01
 */

@RestController
public class TickerController {


    @Autowired
    TicketService ticketService;

    @GetMapping("/ticket")
    public String getTicker(){
        return ticketService.getTicket();
    }

}
