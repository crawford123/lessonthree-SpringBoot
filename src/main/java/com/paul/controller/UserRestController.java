package com.paul.controller;

import com.paul.base.BaseRepository;
import com.paul.entity.User;
import com.paul.jpa.UserEntityJPA;
import com.paul.jpa.UserJPA;
import com.paul.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value ="/restUser")
public class UserRestController {

    @Autowired
    private UserEntityJPA userEntityJPA;
    @Autowired
    private UserJPA userJPA;
   /* @Autowired
    private BaseRepository baseRepository;*/

  /* @Autowired
    private UserService userService;*/
    /**
     *查询用户列表方法
     * @return
     */

    @RequestMapping(value ="/list",method= RequestMethod.GET)
    public List<User>  list(){

        return userJPA.findAll();

    }

    /**
     * 添加、更新用户方法
     * @param user
     * @return
     */
    @RequestMapping(value ="/save",method =RequestMethod.GET)
    public User save(User user) {
       /* if(bindingResult.hasErrors()){
            return "to same page to shows error fields";
        }*/
        return userJPA.save(user);
    }
    /**
     * 删除用户方法
     * @param id 用户编号
     * @return
     */
    @RequestMapping(value = "/delete",method =RequestMethod.GET)
    public List<User> delete(Long id)
    {

        userJPA.delete(id);
        return userJPA.findAll();
    }
    @RequestMapping(value = "/add")
    public  String addInfo(){

        User user = new User();
        user.setId(4L);
        user.setUsername("测试");
        user.setAddress("测试地址");
        user.setAge(21);
        user.setPassword("测试密码");
        userJPA.save(user);
        return  "用户信息添加成功！！！";


    }
    @RequestMapping(value = "deleteInfo")
    public  String deleteInfo(Long userId){

         userJPA.delete(userId);
         return  "用户信息删除成功！！";
    }
    @RequestMapping(value = "/age")
    public  List<User> age(){

        return  userJPA.nativeQuery(20);


    }
    /**
     * 根据条件自定义编写删除删除SQL
     * @return
     */
    @RequestMapping(value = "/deleteWhere")
    public  String deleteWhere(){

        userJPA.deleteQuery("Rose","123654");
        return "自定义SQL删除数据成功";

    }
    /**
     * 分页查询测试
     * @param page 传入页码，从1开始
     * @return
     */
    @RequestMapping(value = "/cutpage")
    public List<User> cutPage(int page)
    {
        //设定User实体类的相关参数
        User user=new User();
        user.setSize(2);
        user.setSord("desc");
        user.setPage(page);

        //获取排序对象，equalsIgnoreCase为忽略字母大小写
        Sort.Direction sort_direction = Sort.Direction.ASC.toString().equalsIgnoreCase(user.getSord())?Sort.Direction.ASC:Sort.Direction.DESC;
        //设置排序对象参数
        Sort sort = new Sort(sort_direction,user.getSidx());

        //创建分页对象
        PageRequest pageRequest = new PageRequest(user.getPage()-1,user.getSize(),sort);
        //执行分页查询
        return userJPA.findAll(pageRequest).getContent();
    }
    /**
     * 查询用户列表
     * @Return
     */
   /* @RequestMapping(value = "/listUser")
    public List<User> listUser(){
        return userService.list();

    }*/
}
