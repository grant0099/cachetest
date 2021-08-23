package com.example.mapper;

import com.example.bean.Employee;
import org.apache.ibatis.annotations.*;

/**
 * Created by grant on 2021/8/24.
 */
@Mapper
public interface EmployeeMapper {

    @Select("SELECT * FROM employee WHERE id=#{id}")
    public Employee getEmployeebyId(Integer id);

    @Update("Update employee SET lastName=#{lastName},email=#{email},gender=#{gender},d_id#{dId} WHERE id=#{id}")
    public void updateEmp(Employee employee);

    @Delete("DELETE FROM employee WHERE id=#{id}")
    public Employee delEmployeebyId(Integer id);

    @Insert("Insert INTO employee(lastName,email,gender,d_id) VALUES(#{lastName},#{email},#{gender},#{d_id})")
    public void insertUser(Employee employee);
}
