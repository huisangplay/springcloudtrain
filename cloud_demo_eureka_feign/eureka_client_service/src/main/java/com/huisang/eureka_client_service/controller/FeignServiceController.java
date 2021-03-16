package com.huisang.eureka_client_service.controller;

import com.huisang.eureka_client_service.dto.Instance;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouhui5
 * @version 1.0
 * @date 2021/3/16 15:09
 */
@RestController
@RequestMapping("/feign-service")
public class FeignServiceController {
    @PostMapping("/instance")
    public Instance getInstanceByServiceId(@RequestBody String serviceId){
        return new Instance(serviceId);
    }
}
