package com.paul.base;

import java.io.Serializable;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/3/2018
 * Time: 3:12 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class BaseEntity  implements Serializable{
    /**
     *
     * <p>
     * 分页页码，默认页码为1
     *<p>
     */
    protected  int page=1;

    /**
     *
     * <p>
     *分页每页数量，默认20条
     *<p>
     */
    protected  int size=20;

    /**
     *
     * <p>
     *排序列名称，默认为id 即根据数据库中哪些字段来排序，这里的排序字段不是数据库内的字段名而是实体内的属性名
     *<p>
     */
    protected  String sidx="id";

    /**
     *
     * <p>
     *排序方式
     *<p>
     */
    protected String sord = "asc";//默认为升序 asc  降序为desc

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getSidx() {
        return sidx;
    }

    public void setSidx(String sidx) {
        this.sidx = sidx;
    }

    public String getSord() {
        return sord;
    }

    public void setSord(String sord) {
        this.sord = sord;
    }
}
