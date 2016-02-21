package com.ohadr.security.examples.impl;

import org.springframework.stereotype.Component;

import com.ohadr.security.examples.DemoService;


@Component
public class DemoServiceImpl implements DemoService
{

    public String getTrustedMessage()
    {
        String demo = "It Works!!";
        return demo;
    }
}
