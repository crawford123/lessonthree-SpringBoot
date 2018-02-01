package com.paul.entity;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 12/25/2017
 * Time: 4:40 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public enum MailContentTypeEnum {
    HTML("text/html;charset=UTF-8"),//html格式
    TEXT("text");

   private  String value;

   MailContentTypeEnum(String value){

       this.value=value;
   }
   public  String getValue(){

       return  value;
   }

}
