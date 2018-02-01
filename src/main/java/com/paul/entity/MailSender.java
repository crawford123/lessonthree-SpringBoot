package com.paul.entity;
import java.util.List;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 12/25/2017
 * Time: 4:14 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
//邮件发送者实体
public class MailSender {
    //邮件实体
    private  static  MailEntity mailEntity=new MailEntity();

    /**
     * 设置邮件标题
     * @param title 标题信息
     * @return
     *
     */
 public  MailSender title(String title){

     mailEntity.setTitle(title);
     return  this;

 }
    /**
     * 设置邮件内容
     * @param content
     * @return
     *
     */
public MailSender content(String content){


    mailEntity.setContent(content);
    return  this;
}
/**
 * 设置邮件格式
 * @param typeEnum
 * @return
 *
 */
public MailSender contentType(MailContentTypeEnum typeEnum){
    mailEntity.setContentType(typeEnum.getValue());
    return  this;
}

/**
 * 设置请求目标邮件地址
 * @param targets
 * @return
 *
 */
public  MailSender targets(List<String> targets){

    mailEntity.setList(targets);

    return  this;
}
/**
 * 执行发送邮件
 * @throws Exception 如果发送失败会抛出异常信息
 *
 */
public  void send() throws  Exception{

    //默认使用html内容发送
    if(mailEntity.getContentType()==null){

        mailEntity.setContentType(MailContentTypeEnum.HTML.getValue());
    }
    if(mailEntity.getTitle()==null||mailEntity.getTitle().trim().length()==0){


        throw new Exception("邮件标题没有设置，调用title方法设置");
    }
    if(mailEntity.getContent()==null||mailEntity.getContent().trim().length()==0){


        throw new Exception("邮件内容没有设置，调用content方法设置");
    }

    if(mailEntity.getList().size()==0){

        throw new Exception("没有接收者邮箱地址，调用targets方法设置");


    }

}


}
