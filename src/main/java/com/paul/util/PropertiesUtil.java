package com.paul.util;

import java.util.ResourceBundle;
import java.util.Locale;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 12/25/2017
 * Time: 4:31 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
//PropertiesUtil是用于读取*.properties配置文件的工具类
public class PropertiesUtil {
    private final ResourceBundle resourceBundls;
    private final  String fileName;
/**
 *
 * 构造函数实例化部分对象，获取文件资源对象
 *@param filename
 */
public  PropertiesUtil(String fileName){

      this.fileName=fileName;
      Locale locale=new Locale("zh","CN");
      this.resourceBundls=ResourceBundle.getBundle(this.fileName,locale);

}
/**
 * 根据传入的key获取对象的值
 *
 * @param key properties文件对应的key
 * @return String 解析后的对应key的值
 */
public  String getValue(String key){

    String messgae=this.resourceBundls.getString(key);
    return  messgae;

}
}