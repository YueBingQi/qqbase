package com.ybq.qq.demo.dao;

import com.ybq.qq.demo.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.Alias;
import org.springframework.stereotype.Repository;
@Mapper
@Repository
@Alias("userMapper")
public interface UserMapper {
    @Select("select account,password,username from qq_user where account=#{account} and password=#{password}")
    public User selectById(String account,String password);
}
