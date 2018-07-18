package com.polaris.sericefeign.client;

public class Error implements ClientDemo {
    @Override
    public String msg(String name) {
        return "error";
    }
}
