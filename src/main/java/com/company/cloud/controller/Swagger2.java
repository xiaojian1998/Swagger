package com.company.cloud.controller;

import com.company.cloud.entity.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "接口所在的类",description = "这是一个测试接口类的东西，里边有很多的方法")
@RequestMapping("swagger2") //swaggerConfig 分组的描述
public class Swagger2 {

    @RequestMapping(value = "状态码已就绪",method = RequestMethod.POST)
    @ApiResponses({
            @ApiResponse(code = 201,message = "(已创建)请求成功并且服务器创建了新的资源"),
            @ApiResponse(code = 200,message = "正常请求通过"),
            @ApiResponse(code = 401,message = "未经授权"),
            @ApiResponse(code = 403,message = "请求接收到，拒绝提供服务"),
            @ApiResponse(code = 404,message = "请求资源不存在")
    })
    @ApiOperation(value = "获取用户信息")
    public User getTestUser(@ApiParam(name = "testUser",required = true,value = "用户实体参数") @RequestBody User user){

        return user;
    }
}
