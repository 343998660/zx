package com.cinsos.zx.service;

import com.cinsos.zx.entity.User;

public interface UserService {
    User findUserPhone(Float user_phone);
    User findUserEmail(String user_email);
}
