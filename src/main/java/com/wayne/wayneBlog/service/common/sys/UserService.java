package com.wayne.wayneBlog.service.common.sys;

import com.wayne.wayneBlog.entity.UserBean;
import com.wayne.wayneBlog.entity.common.sys.User;

public interface UserService {
    User findUserByName(String username);
}
