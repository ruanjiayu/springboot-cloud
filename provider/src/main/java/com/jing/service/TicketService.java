package com.jing.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author ruanjiayu
 * @dateTime 2019/4/10 10:57
 */

@Service
public class TicketService {

    @Value("${server.port}")
    private String port;

    public String getTicket(){
        System.out.println(port);
        return "《厉害了，我的国》";
    }

}
