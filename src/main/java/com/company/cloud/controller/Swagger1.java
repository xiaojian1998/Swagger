package com.company.cloud.controller;

import com.company.cloud.entity.User;
import io.swagger.annotations.*;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags="接口所在的类")
@RequestMapping("swagger1")
public class Swagger1 {

    @RequestMapping(value = "swagger1测试",method = RequestMethod.POST)
    @ApiResponses({

            @ApiResponse(code = 200,message = "正常请求通过"),
            @ApiResponse(code = 401,message = "未经授权"),
            @ApiResponse(code = 403,message = "请求接收到，拒绝提供服务"),
            @ApiResponse(code = 404,message = "请求资源不存在")
    })

    @ApiOperation(value = "这个描述方法的作用")//描述接口
    public String Swagger1(@ApiParam(name = "username",value = "这是用户名",defaultValue = "这是用户名默认值",required = true) String userName
            ,@ApiParam(name = "password",value = "这是用户密码",defaultValue = "这是用户密码默认值",required = true) String password){

        return "测试";

    }










    @RequestMapping(value = "GET-User",method = RequestMethod.POST)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "User",value = "这是一个实体类",dataType = "User",required = true),
    })
    @ApiResponses({
            @ApiResponse(code = 200,message = "正常请求通过"),
            @ApiResponse(code = 404,message = "资源不存在")
    })
    @ApiOperation(value = "获取用户信息")
    public User getTestUser(@RequestBody User user){

        return user;
    }










    @RequestMapping(value = "GET-User2",method = RequestMethod.POST)
    @ApiResponses({
            @ApiResponse(code = 200,message = "正常请求通过"),
            @ApiResponse(code = 404,message = "资源不存在")
    })
    @ApiOperation(value = "获取用户信息")
    public User getTestUser02(@ApiParam(name = "User",required = true,value = "用户实体参数") @RequestBody User user){

        return user;
    }








}
