package com.maya.useraccess.service;

import com.maya.useraccess.mapper.UserModelMapper;
import com.maya.useraccess.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * This is the base class of all ServiceImpl within user access domain. Any common methods of this domain should be in this class.
 *
 * @author KSC
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    UserModelMapper mapper;

    @Override
    public List<UserModel> getAllUsers() {
        return mapper.selectAll();
    }

    @Override
    public int addUsers(UserModel user) {
        return mapper.insert(user);
    }

    @Override
    public int removeUserById(Long userId) {
        return mapper.deleteByPrimaryKey(userId);
    }
}
