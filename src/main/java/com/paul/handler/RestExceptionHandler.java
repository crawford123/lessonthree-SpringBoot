package com.paul.handler;

import com.paul.entity.ApiResult;
import com.paul.util.ApiResultGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/9/2018
 * Time: 10:56 AM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@ControllerAdvice(annotations = RestController.class)
@ResponseBody
public class RestExceptionHandler {

    /**
     *
     * 默认统一异常处理方法
     * @param e 默认Exception异常对象
     * @return
     *
     */
    @ExceptionHandler//@ExceptionHandler注解用来配置需要拦截的异常类型，默认是全局类型
    @ResponseStatus//@ResponseStatus注解用于配置遇到该异常后返回数据时的StatusCode的值，我们这里默认使用值500。
    public ApiResult runtimeExceptionHandler(Exception e){

        return  ApiResultGenerator.errorResult(e.getMessage(),e);


    }
}
