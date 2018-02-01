package com.paul.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/4/2018
 * Time: 4:32 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
//商品分类信息实体
@Entity
@Table(name = "good_types")
public class GoodTypeEntity implements Serializable {
    @Id
    @GeneratedValue
    @Column(name = "tgt_id")
    private  Long id;

    @Column(name = "tgt_name")
    private  String name;

    @Column(name = "tgt_is_show")
    private  int isShow;

    @Column(name = "tg_unit")
    private  String unit;

    @Column(name = "tgt_order")
    private  int order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getIsShow() {
        return isShow;
    }

    public void setIsShow(int isShow) {
        this.isShow = isShow;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }
}
