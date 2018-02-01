package com.paul.service;

import com.paul.entity.Course;
import com.paul.entity.Tutor;
import com.paul.mappers.CourseMapper;
import com.paul.mappers.TutorMapper;
import com.paul.util.MyBatisSqlSessionFactory;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/25/2018
 * Time: 4:57 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class CourseService {

    private Logger logger = LoggerFactory.getLogger(getClass());


    /*根据一系列搜索条件来搜索课程内容*/
    public void  searshCourses() {

        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();

        try {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("tutorId", 1);
            map.put("courseName", "%java%");
            map.put("startDate", new Date());
            CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
            List<Course> courseList = mapper.searshCourses(map);
            for (Course course : courseList) {
                System.out.println(course);
            }
        } finally {
            //If sqlSession is not closed
            //then database Connection associated this sqlSession will not be returned to pool
            //and application may run out of connections.
            sqlSession.close();
        }
    }


    /*根据tutorId构成的集合来查找课程信息*/
    public void  searchCoursesByTutors() {

        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();

        try {
            Map<String, Object> map = new HashMap<String, Object>();
            List<Integer> tutorIds = new ArrayList<Integer>();
            tutorIds.add(1);
            tutorIds.add(2);
            tutorIds.add(3);
            map.put("tutorIds",tutorIds);
            CourseMapper mapper = sqlSession.getMapper(CourseMapper.class);
            List<Course> courseList = mapper.searchCoursesByTutors(map);
            for (Course course : courseList) {
                System.out.println(course);
            }
        } finally {
            //If sqlSession is not closed
            //then database Connection associated this sqlSession will not be returned to pool
            //and application may run out of connections.
            sqlSession.close();
        }
    }



}
