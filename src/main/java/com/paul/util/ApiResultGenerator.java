package com.paul.util;

import com.paul.entity.ApiResult;
import  java.util.*;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/9/2018
 * Time: 11:12 AM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class ApiResultGenerator {
    /**
     * 创建普通消息方法
     *
     * @param flag    执行接口状态，true：执行成功，false：执行失败
     * @param msg     返回消息内容
     * @param result  返回结果
     * @param jumpurl 跳转路径
     */
    public static ApiResult result(boolean flag, String msg, Object result, String jumpurl, int rows, Throwable throwable) {

        //创建返回对象
        ApiResult apiResult = ApiResult.newInstance();
        apiResult.setFlag(flag);
        apiResult.setMsg(msg == "" ? "执行成功" : msg);
        apiResult.setResult(result);
        apiResult.setJumpUrl(jumpurl);
        apiResult.setTime(System.currentTimeMillis());
        apiResult.setRows(rows);
        return apiResult;

    }

    /**
     * 返回执行成功视图方法
     *
     * @param result 执行成功后的返回内容
     * @return
     */
    public static ApiResult successResult(Object result) {

        //rows默认为0
        int rows = 0;
        //如果是集合
        if (result instanceof List){
            //获取总数量
            rows = ((List) result).size();

        }

        return result(true, "", "", "", rows, null);
    }

    /**
     * 执行失败后返回视图方法
     * @param msg 执行失败后的错误信息内容
     * @return
     */
    public  static  ApiResult errorResult(String msg,Throwable throwable)
    {

        return  result(false,msg,"","",0,throwable);
    }
}