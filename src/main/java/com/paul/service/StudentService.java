package com.paul.service;

import com.paul.entity.Student;
import com.paul.mappers.StudentMapper;
import com.paul.util.MyBatisSqlSessionFactory;
import com.sun.rowset.internal.Row;
import org.apache.ibatis.session.ResultContext;
import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.RowBounds;
import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/20/2018
 * Time: 4:30 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class StudentService {

    private Logger logger = LoggerFactory.getLogger(getClass());
    public List<Student> findAllStudents(){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try
        {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
           /* List<Student> students = sqlSession.selectList("com.paul.mappers.Student.StudentMapper.findAllStudents");*/
            return  studentMapper.findAllStudents();
        }finally {
            //If sqlSession is not closed
            //then database Connection associated this sqlSession will not be returned to pool
            //and application may run out of connections.
            sqlSession.close();
        }

    }
    public List<Map<String,Object>>  findAllStudentsMap(){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try
        {
            List<Map<String,Object>> studentMapList =sqlSession.selectList("com.paul.mappers.StudentMapper.findAllStudentsMap");
            for (Map<String,Object> studentMap:studentMapList)
            {
                System.out.println("stud_id :"+studentMap.get("stud_id"));
                System.out.println("name:"+studentMap.get("name"));
                System.out.println("email:"+studentMap.get("email"));
                System.out.println("phone:"+studentMap.get("phone"));
            }
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return  studentMapper.findAllStudentsMap();
        }finally {
            //If sqlSession is not closed
            //then database Connection associated this sqlSession will not be returned to pool
            //and application may run out of connections.
            sqlSession.close();
        }

    }
    public  Student findStudentById(Integer studId)
    {
        logger.debug("Select Student By ID :{}",studId);
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try
        {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            //不通过Mapper接口执行映射的SQL语句。
            //Student student = (Student)sqlSession.selectOne("com.paul.mappers.StudentMapper.findStudentById",studId);
            //Student student = sqlSession.selectOne("com.paul.mappers.StudentMapper.findStudentById",studId);//可以不用强制转换
            return  studentMapper.findStudentById(studId);
        }finally {
            //If sqlSession is not closed
            //then database Connection associated this sqlSession will not be returned to pool
            //and application may run out of connections.
            sqlSession.close();
        }

    }

    public Map<String,Object> findStudentByIdMap(Integer studId){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try
        {
          /*  Map<String,Object> studentMap=sqlSession.selectOne("com.paul.mappers.StudentMapper.findStudentByIdMap",studId);
            System.out.println("stud_id :"+studentMap.get("stud_id"));
            System.out.println("name:"+studentMap.get("name"));
            System.out.println("email:"+studentMap.get("email"));
            System.out.println("phone:"+studentMap.get("phone"));*/
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            return  studentMapper.findStudentByIdMap(studId);
        }finally{
            //If sqlSession is not closed
            //then database Connection associated this sqlSession will not be returned to pool
            //and application may run out of connections.
            sqlSession.close();
        }

    }

    public  void createStudent(Student student)
    {

        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try {
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            studentMapper.insertStudent(student);//可以不用返回受影响的行数
            /*int count =sqlSession.insert("com.paul.mappers.StudentMapper.insertStudent", student);//返回受影响的行数*/
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }

    }

    public  void updateStudent(Student student){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try {
            //int noOfRowsUpdated=sqlSession.update("com.paul.mappers.StudentMapper.updateStudent",student);//sqlSession.update() 方法返回执行UPDATE语句之后影响的行数。
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            studentMapper.updateStudent(student);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }


    }

    public  void deleteStudents(Integer  studId){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try {
           // int noOfRowsDeleted=sqlSession.delete("com.paul.mappers.StudentMapper.deleteStudent",studId);//sqlSession.delete() 方法返回执行DELETE语句之后影响的行数。
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            studentMapper.deleteStudent(studId);
            sqlSession.commit();
        }finally {
            sqlSession.close();
        }


    }

    public List<Student> finaAllStudentByNameEmail(String name,String email){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
            List<Student> studentList = studentMapper.findAllStudentByNameEamil(name,email);
            return studentList;
        }finally {
            sqlSession.close();
        }

    }



   /* public  void findAllStudentsMap(){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            Map<Integer,Student> studentMap =sqlSession.selectMap("com.paul.mappers.StudentMapper.findAllStudent","studId");

        }finally {
            sqlSession.close();
        }

    }*/

    /*使用RowBounds对结果集进行分页*/
    public  List<Student> findAllStudentRowBounds(){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            int offset=0,limit=25;
            RowBounds rowBounds=new RowBounds(offset,limit);
            StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
            List<Student> studentList=studentMapper.findAllStudentRowBounds(rowBounds);
            return studentList;
        }finally {
            sqlSession.close();
        }

    }

    public  Map<Integer,String>  getStudentIdNameMap(){

        Map<Integer,String> map = new HashMap<Integer,String>();
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{

            sqlSession.select("com.paul.mappers.StudentMapper.findAllStudents", new ResultHandler() {
                @Override
                public void handleResult(ResultContext resultContext) {
                      Student student = (Student)resultContext.getResultObject();
                      map.put(student.getStudId(),student.getName());
                }
            });

        }finally {
            sqlSession.close();
        }
        return map;
    }


      public Student selectStudentWithAddress(int studId){
          SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
          try{
              StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
              Student student=studentMapper.selectStudentWithAddress(studId);
              System.out.println("Student:"+student);
              System.out.println("Address:"+student.getAddress());
              return student;
          }finally {
              sqlSession.close();
          }


      }
    public Student findStudentWithAddress(int studId){
        SqlSession sqlSession = MyBatisSqlSessionFactory.openSession();
        try{
            // int studId=1;
            StudentMapper studentMapper=sqlSession.getMapper(StudentMapper.class);
            Student student=studentMapper.findStudentWithAddress(studId);
            System.out.println("Student:"+student);
            System.out.println("Address:"+student.getAddress());
            return student;
        }finally {
            sqlSession.close();
        }


    }


}
