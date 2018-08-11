package com.zjh.mvphelp.main.presenter;


import com.zjh.mvphelp.main.contract.LoginContract;
import com.zjh.mvphelp.main.model.LoginModelImpl;
import com.zjh.mvphelp.main.view.LoginActivity;

/**
 * 作者 : 张建宏
 * 创建时间 ：2018-08-11 15:01
 * 说明 ：Presenter实现
 */
public class LoginPresenterImpl implements LoginContract.Presenter {
    private final LoginActivity  mLoginActivity;
    private final LoginModelImpl mLoginModel;
    
    public LoginPresenterImpl(LoginActivity loginActivity) {
        this.mLoginActivity = loginActivity;
        mLoginModel = new LoginModelImpl();
    }
    
    public void login() {
        String username = mLoginActivity.getUserName();
        String password = mLoginActivity.getPassWord();
        
        int login = mLoginModel.login(username, password);
        switch (login) {
            case 0:
                mLoginActivity.onSuccess();
                break;
            case -1:
                mLoginActivity.showToast("账号和密码不能为空");
                break;
            case -2:
                mLoginActivity.setUserNmeErro("用户名错误");
                break;
            case -3:
                mLoginActivity.setPassWordErro("密码错误");
                break;
        }
        
        
    }
}
