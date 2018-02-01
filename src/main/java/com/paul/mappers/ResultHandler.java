package com.paul.mappers;

import org.hibernate.result.spi.ResultContext;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/26/2018
 * Time: 5:59 PM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public interface ResultHandler {

    void handleResult(ResultContext context);
}
