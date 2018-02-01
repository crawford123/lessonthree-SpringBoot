package com.paul.service;

import com.paul.entity.Course;
import com.paul.entity.UserPic;
import com.paul.mappers.CourseMapper;
import com.paul.mappers.UserPicMapper;
import com.paul.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/26/2018
 * Time: 12:27 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class UserPicService {


    public  void insertUserPic(){
        byte[] pic = null;
        try {
            File file = new File("F:\\photo\\background\\1.jpg");
            InputStream inputStream = new FileInputStream(file);
            pic = new byte[inputStream.available()];
            inputStream.read(pic);
            inputStream.close();
        }catch (FileNotFoundException e)
        {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        String name="UserName";
        String bio="put some length bio here";
        UserPic userPic = new UserPic(0,name,pic,bio);

        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();

        try {

            UserPicMapper mapper = sqlSession.getMapper(UserPicMapper.class);
            mapper.insertUserPic(userPic);
            sqlSession.commit();
        } finally {
            //If sqlSession is not closed
            //then database Connection associated this sqlSession will not be returned to pool
            //and application may run out of connections.
            sqlSession.close();
        }


    }

    public  void getUserPicById(){

        UserPic userPic=null;
        SqlSession sqlSession=MyBatisSqlSessionFactory.openSession();

        try{
            UserPicMapper mapper = sqlSession.getMapper(UserPicMapper.class);
            userPic=mapper.getUserPicById(1);

        }finally {
            sqlSession.close();
        }
        byte[] pic = userPic.getPic();
        try{
            File file = new File("F:\\photo\\background\\1.jpg");
            OutputStream os = new FileOutputStream(file);
            os.write(pic);
            os.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){

            e.printStackTrace();
        }
    }



}
