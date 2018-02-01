package com.paul.mappers;

import com.paul.entity.Course;
import  java.util.*;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/25/2018
 * Time: 4:55 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public interface CourseMapper {

    List<Course>  searshCourses(Map<String,Object> map);

    List<Course> searchCoursesByTutors(Map<String,Object> map);
}
