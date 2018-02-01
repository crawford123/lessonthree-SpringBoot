package com.paul.entity;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/9/2018
 * Time: 4:55 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class WiselyResponse {
    private String responseMessage;


    public  WiselyResponse(String responseMessage){

        this.responseMessage = responseMessage;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }
}
