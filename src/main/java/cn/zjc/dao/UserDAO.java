package cn.zjc.dao;

import cn.zjc.domain.User;
import cn.zjc.mapper.CustomIMapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * @author zhangjinci
 * @version 2016/9/21 17:05
 * @function
 */
@Repository
public interface UserDAO extends CustomIMapper<User>{

    @Results(
            id = "citySingle",value = {
            @Result(property = "id",column = "ID",id = true),
            @Result(property = "userId",column = "USER_ID"),
            @Result(property = "name",column = "NAME"),
            @Result(property = "birth",column = "BIRTH"),
            @Result(property = "email",column = "EMAIL")
    })
    @Select("SELECT * FROM TB_AT_USER WHERE ID = #{id}")
    User selectById(Integer id);
}
