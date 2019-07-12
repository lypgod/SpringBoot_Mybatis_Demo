package cn.com.dxn.demo.model.mapper;

import cn.com.dxn.demo.model.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserMapper {
    List<User> findAll();

    @Select("SELECT * FROM User WHERE userName = #{userName}")
    User findByUserName(@Param("userName") String userName);

    void save(User user);
}
