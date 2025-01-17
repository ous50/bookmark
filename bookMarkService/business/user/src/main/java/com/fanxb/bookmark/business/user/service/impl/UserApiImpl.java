package com.fanxb.bookmark.business.user.service.impl;

import com.fanxb.bookmark.business.api.UserApi;
import com.fanxb.bookmark.business.user.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author fanxb
 * @date 2021/8/20 下午2:15
 */
@Service
public class UserApiImpl implements UserApi {
    private final UserDao userDao;

    @Autowired
    public UserApiImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void versionPlus(int userId) {
        userDao.updateUserVersion(userId);
    }

    @Override
    public void allUserVersionPlus() {
        userDao.updateAllBookmarkUpdateVersion();
    }
}
