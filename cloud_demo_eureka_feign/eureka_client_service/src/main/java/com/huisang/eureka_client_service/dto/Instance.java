package com.huisang.eureka_client_service.dto;

import lombok.Data;

/**
 * @author zhouhui5
 * @version 1.0
 * @date 2021/3/16 15:40
 */
@Data
public class Instance {
    private String name;
    private String desc;

    public Instance(){}
    public Instance(String sercieId){this.name=sercieId;desc="no desc";}
}
