package com.paul.service;

import com.paul.entity.Course;
import com.paul.entity.Tutor;
import com.paul.mappers.TutorMapper;
import com.paul.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/25/2018
 * Time: 4:30 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class TutorService {
    private Logger logger = LoggerFactory.getLogger(getClass());

    public Tutor findTutorById(int tutorId){

        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();

        try
        {
            TutorMapper tutorMapper = sqlSession.getMapper(TutorMapper.class);
            Tutor tutor = tutorMapper.findTutorById(tutorId);
            System.out.println(tutor);
            List<Course> courseList = tutor.getCourses();
            for(Course course:courseList){

                System.out.println(course);

            }
            return tutor;
        }finally {
            //If sqlSession is not closed
            //then database Connection associated this sqlSession will not be returned to pool
            //and application may run out of connections.
            sqlSession.close();
        }

    }




}
