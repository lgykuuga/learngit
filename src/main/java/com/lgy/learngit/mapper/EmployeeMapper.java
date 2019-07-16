package com.lgy.learngit.mapper;

import com.lgy.learngit.bean.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

@Mapper
public interface EmployeeMapper {

    public Employee getEmployeeById(@PathVariable("id") Integer id);

    public void insertEmp(Employee employee);

}
