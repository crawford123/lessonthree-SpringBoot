package com.paul.typehandler;

import com.paul.entity.PhoneNumber;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * created with IntelliJ IDEA
 * User: FengZhi
 * Date: 1/22/2018
 * Time: 9:51 AM
 * Email:2045532295@qq.com
 * Addres:zhbit
 * Description:
 */
public class PhoneTypeHandler extends BaseTypeHandler<PhoneNumber> {


    @Override
    public void setNonNullParameter(PreparedStatement preparedStatement, int i, PhoneNumber parameter, JdbcType jdbcType) throws SQLException {

        preparedStatement.setString(i, parameter.getAsString());
    }

    @Override
    public PhoneNumber getNullableResult(ResultSet resultSet, String columnName) throws SQLException {
        return new PhoneNumber(resultSet.getString(columnName));
    }

    @Override
    public PhoneNumber getNullableResult(ResultSet resultSet, int columnIndex) throws SQLException {
        return new PhoneNumber(resultSet.getString(columnIndex));
    }

    @Override
    public PhoneNumber getNullableResult(CallableStatement callableStatement, int columnIndex) throws SQLException {
        return new PhoneNumber(callableStatement.getString(columnIndex));
    }
}
