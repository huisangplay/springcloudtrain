package com.huisang.eureka_client.controller;

import com.huisang.eureka_client.api.FeignServiceClient;
import com.huisang.eureka_client.dto.Instance;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author zhouhui5
 * @version 1.0
 * @date 2021/3/16 16:47
 */
@RestController
@RequestMapping("/t")
public class FeignClientController {
    FeignServiceClient feignServiceClient;

    public FeignClientController(FeignServiceClient feignServiceClient){
        this.feignServiceClient=feignServiceClient;
    }

    @PostMapping("/feign")
    public Instance FeignServiceRemote(String serviceId){
        return feignServiceClient.getInstanceByServiceId(serviceId);
    }
}
