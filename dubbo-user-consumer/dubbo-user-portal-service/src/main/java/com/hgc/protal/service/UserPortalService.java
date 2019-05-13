package com.hgc.protal.service;

import com.hgc.common.dto.UserProviderResponse;
import com.hgc.entity.User;

public interface UserPortalService {

    UserProviderResponse addUser(User user);

    UserProviderResponse modifyUser(User user);

    UserProviderResponse getUserById(Long id);

    UserProviderResponse deleteUser(Long[] ids);

    UserProviderResponse listUsers(int page, int rows);
}