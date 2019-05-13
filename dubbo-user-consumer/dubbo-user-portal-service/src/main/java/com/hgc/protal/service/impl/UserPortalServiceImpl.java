package com.hgc.protal.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.hgc.common.dto.UserProviderResponse;
import com.hgc.entity.User;
import com.hgc.protal.service.UserPortalService;
import com.hgc.provider.user.UserProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserPortalServiceImpl implements UserPortalService {

    @Reference
    UserProviderService userProviderService;

    @Override
    public UserProviderResponse addUser(User user) {
        UserProviderResponse response = this.userProviderService.saveUser(user);
        return response;
    }

    @Override
    public UserProviderResponse modifyUser(User user) {
        UserProviderResponse response = this.userProviderService.modifyUser(user);
        return response;
    }

    @Override
    public UserProviderResponse getUserById(Long id) {
        UserProviderResponse response = this.userProviderService.findUserById(id);
        return response;
    }

    @Override
    public UserProviderResponse deleteUser(Long[] ids) {
        List<Long> idList = new ArrayList<>();
        for(Long id : ids){
            idList.add(id);
        }
        UserProviderResponse response = this.userProviderService.removeUsersById(idList);
        return response;
    }

    @Override
    public UserProviderResponse listUsers(int page, int rows) {

        UserProviderResponse response = this.userProviderService.findUserByPage(page, rows);

        return response;
    }
}
