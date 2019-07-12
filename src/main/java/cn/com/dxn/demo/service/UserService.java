package cn.com.dxn.demo.service;

import cn.com.dxn.demo.common.exception.ValidationException;
import cn.com.dxn.demo.model.entity.User;
import cn.com.dxn.demo.model.mapper.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserService {
    @Resource
    private UserMapper userMapper;

    public List<User> getAllUsers() {
        return userMapper.findAll();
    }

    public User saveUser(User user) {
        if (userMapper.findByUserName(user.getUserName()) != null) {
            throw new ValidationException("用户名已经被注册！");
        }
        userMapper.save(user);
        return user;
    }

}
