package com.polaris.sericefeign.client;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
@FeignClient(value = "demo1")
public interface ClientDemo {
        @RequestMapping(value = "/hi",method = RequestMethod.GET)
        String msg(@RequestParam(value = "name") String name);

}
