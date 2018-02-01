package com.paul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;


/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/21/2018
 * Time: 3:31 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@Controller
@RequestMapping(value = "/uploadPage")
public class UploadController {
    /**
     *
     * 初始化上传文件界面，跳转到index.jsp
     */
    @RequestMapping(value = "/UploadFile",method = RequestMethod.GET)
    public  String UploadFile(){

        return "UploadFile";
    }
    /**
     * 上传文件方法
     * @param file 前台上传的文件对象
     */
    @RequestMapping(value = "/upload",method = RequestMethod.POST)
    public @ResponseBody String upload(HttpServletRequest request,MultipartFile file)
    {
        try{
            //上传目录地址
            String uploadDir = request.getSession().getServletContext().getRealPath("/")+"upload/";
            //如果目录不存在，自动创建文件夹
            File dir = new File(uploadDir);
            if(!dir.exists())
            {
                dir.mkdir();
            }
            //上传文件名
            String filename = file.getOriginalFilename();
            //服务器端保存的文件对象
            File serverFile = new File(uploadDir+filename);
            //将上传的文件写入到服务器端文件里
            file.transferTo(serverFile);

        }catch (Exception e)
        {
            //打印错误堆栈信息
            e.printStackTrace();
            return "上传失败";
        }
       return  "上传成功";
    }

}
