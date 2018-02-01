package com.paul.entity;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/26/2018
 * Time: 12:06 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class UserPic {
    private  int id;
    private String name;
    private byte[] pic;//MyBatis把BLOB列映射到byte[] 类型上。
    private String bio;//MyBatis将CLOB类型的列映射到java.lang.String类型上

    public  UserPic(int id,String name,byte[] pic,String bio){
        this.id=id;
        this.name=name;
        this.pic=pic;
        this.bio=bio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte[] getPic() {
        return pic;
    }

    public void setPic(byte[] pic) {
        this.pic = pic;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }


}
