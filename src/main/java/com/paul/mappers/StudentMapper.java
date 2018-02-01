package com.paul.mappers;

import com.paul.entity.Student;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.session.RowBounds;

import java.util.*;
/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/20/2018
 * Time: 4:28 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
//让我们创建一个StudentMapper接口，其定义的方法名和在Mapper XML配置文件定义的SQL映射语句名称相同；
public interface  StudentMapper {

    List<Student> findAllStudents();
    List<Map<String,Object>>  findAllStudentsMap();
    Student findStudentById(Integer studId);
    Map<String,Object> findStudentByIdMap(Integer studId);
    void insertStudent(Student student);//可以返回受影响的行数（返回值为int）
    void updateStudent(Student student);//可以返回受影响的行数（返回值为int）
    void deleteStudent(Integer id);//可以返回受影响的行数（返回值为int）
    List<Student> findAllStudentByNameEamil(String name,String email);
    List<Student> findAllStudentRowBounds(RowBounds rowBounds);
    Map<Integer,String> getStudentIdNameMap();
    Student selectStudentWithAddress(int studId);
    Student findStudentWithAddress(int studId);

    /*使用注解配置SQL映射器*/
    //使用@Insert
   /* @Insert("INSERT INTO STUDENTS(STUD_ID,NAME,EMAIl,ADDR_ID,PHONE) VALUES(#{studId},#{name},#{email},#{address.addrId},#{phone})")
    @Options(useGeneratedKeys = true,keyProperty = "studId")
    int insertStudent(Student student);
*/

   //有一些数据库如Oracle，并不支持AUTO_INCREMENT列属性，它使用序列（SEQUENCE）来产生主键的值。
    //这里我们使用了@SelectKey来生成主键值，并且存储到了student对象的studId属性上。由于我们设置了before=true,该语句将会在执行INSERT语句之前执行。
  /*  @Insert("INSERT INTO STUDENTS(STUD_ID,NAME,EMAIl,ADDR_ID,PHONE) VALUES(#{studId},#{name},#{email},#{address.addrId},#{phone})")
    @SelectKey(statement = "SELECT STUD_ID_SEQ.NEXTVAL FROM DUAL",keyProperty = "studId",resultType = int.class,before = true)
    int insertStudent(Student student);*/

    //如果你使用序列作为触发器来设置主键值，我们可以在INSERT语句执行后，从sequence_name.currval获取数据库产生的主键值。
  /*  @Insert("INSERT INTO STUDENTS(NAME,EMAIl,ADDR_ID,PHONE) VALUES(#{#{name},#{email},#{address.addrId},#{phone})")
    @SelectKey(statement = "SELECT STUD_ID_SEQ.CURRVAL FROM DUAL",keyProperty = "studId",resultType = int.class,before = false)
    int insertStudent(Student student);*/

  //使用@Update,使用了@Update的updateStudent()方法将会返回执行了update语句后影响的行数。
  /*  @Update("UPDATE STUDENTS SET NAME=#{name},EMAIL=#{email},PHONE=#{phone} WHERE STUD_ID=#{studId}")
    int updateStudent(Student student);*/

    //使用@Delete,使用了@Delete的deleteStudent()方法将会返回执行了delete语句后影响的行数。
   /* @Delete("DELETE FROM STUDENTS WHERE STUD_ID=#{studId}")
    int deleteStudent(int studId);*/

   //使用@Select
   //为了将列名和Studentbean属性名匹配，我们为stud_id起了一个studId的别名。如果返回了多行结果，将抛出 TooManyResultsException异常。
  /*  @Select("SELECT STUD_ID AS STUDID,NAME,EMAIL,PHONE FROM STUDENTS WHERE STUD_ID=#{studId}")
    Student findStudentById(Integer studId);*/
}
