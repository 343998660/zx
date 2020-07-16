package com.cinsos.zx.mapper;

import com.cinsos.zx.entity.User;

public interface UserMapper {
    User findUserPhone(Float user_phone);
    User findUserEmail(String user_email);
}
