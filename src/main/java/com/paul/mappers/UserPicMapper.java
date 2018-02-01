package com.paul.mappers;

import com.paul.entity.UserPic;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/26/2018
 * Time: 12:25 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public interface UserPicMapper {
    void insertUserPic(UserPic userPic);
    UserPic getUserPicById(int id);

}
