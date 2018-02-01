package com.paul.mapper;

import com.paul.entity.TableUser;
import  java.util.*;
import org.apache.ibatis.annotations.*;
/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/10/2018
 * Time: 11:53 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@Mapper
public interface TableUserMapper {

    /**
     * 根据手机号码查询单个
     *
     * @param phone
     * @return
     */
    @Select("SELECT * FROM TABLE_USER WHERE PHONE = #{phone}")
    TableUser findUserByPhone(@Param("phone") String phone);

   /* @Insert("INSERT INTO TABLE_USER(NAME, PASSWORD, PHONE) VALUES(#{name},#{password},#{phone})")
    int insert(@Param("name") String name,@Param("password") String password,@Param("phone") String phone);*/

    /**
     * 添加操作，返回新增元素的ID
     * @param
     */
    @Insert("INSERT INTO TABLE_USER(NAME, PASSWORD, PHONE) VALUES(#{name},#{password},#{phone})")
    @Options(useGeneratedKeys = true,keyColumn = "id",keyProperty = "id")
    void insert(TableUser tableUser);

    /**
     * 更新操作
     *
     *@param tableUser
     *@return 受影响的行数
     */
    @Update("UPDATE TABLE_USER SET NAME=#{name},PHONE=#{phone} where ID=#{id}")
    Long update(TableUser tableUser);
    /**
     * 删除操作
     *
     * @param id
     * @return 受影响的行数
     */
    @Delete("DELETE FROM TABLE_USER WHERE ID=#{id}")
    Long delete(@Param("id") Long id);

    /**
     * 查询所有
     *
     * @return
     */
    @Select("SELECT * FROM TABLE_USER")
    List<TableUser>  selectAll();

    /**
     * 根据主键查询单个
     *
     * @param id
     * @return
     */
    @Select("SELECT * FROM WHERE TABLE_USER where id=#{id} ")
    TableUser selectById(@Param("id") Long id);
}
