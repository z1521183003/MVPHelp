package com.zjh.mvphelp.main.model;


import com.zjh.mvphelp.main.User;
import com.zjh.mvphelp.main.contract.LoginContract;

/**
 * 作者 : 张建宏
 * 创建时间 ：2018-08-11 15:01
 * 说明 ：Mode实现
 */
public class LoginModelImpl implements LoginContract.Model {
    private final User u;
    
    public LoginModelImpl() {
        u = new User();
        u.setUsername("zjh");
        u.setPassword("123");
    }
    
    @Override
    public int login(String username, String password) {
        if (username == null || username.equals("") && password == null || password.equals("")) {
            return -1;
        } else {
            if (username.equals(u.getUsername())) {
                if (password.equals(u.getPassword())) {
                    return 0;
                } else {
                    return -3;
                }
            } else {
                return -2;
            }
            
            
        }
    }
}
