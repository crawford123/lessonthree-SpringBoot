package com.paul.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/3/2018
 * Time: 3:06 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
@NoRepositoryBean
public interface BaseRepository<T,PK extends Serializable> extends JpaRepository<T,PK>{








}

