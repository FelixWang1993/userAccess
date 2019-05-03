package com.maya.useraccess.service;

import com.maya.useraccess.model.UserModel;

import java.util.List;

/**
 * This is the base class of all ServiceImpl within user access domain. Any common methods of this domain should be in this class.
 *
 * @author KSC
 */
public interface UserService {
    List<UserModel> getAllUsers();

    int addUsers(UserModel user);

    int removeUserById(Long userId);

}
