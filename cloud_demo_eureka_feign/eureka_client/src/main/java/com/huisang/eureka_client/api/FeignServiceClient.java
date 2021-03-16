package com.huisang.eureka_client.api;

import com.huisang.eureka_client.dto.Instance;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author zhouhui5
 * @version 1.0
 * @date 2021/3/16 15:38
 */

@FeignClient(name = "feign-service")
public interface FeignServiceClient {
    @PostMapping("/feign-service/instance")
    public Instance getInstanceByServiceId(@RequestBody String serviceId);
}
