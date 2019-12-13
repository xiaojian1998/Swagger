package com.company.cloud.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@ApiModel(description = "这是一个用户实体")//,value = "用户类"
@Data
public class User {

    @ApiModelProperty(name = "username",value = "这个是用户账户")
    private String username;

    @ApiModelProperty(name = "password",value = "这个是用户密码")
    private String password;
}
