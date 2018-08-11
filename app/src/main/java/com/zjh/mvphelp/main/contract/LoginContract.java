package com.zjh.mvphelp.main.contract;

/**
 * 作者 : 张建宏
 * 创建时间 ：2018-08-11 15:01
 * 说明 ：MVP接口定义
 */
public interface LoginContract {
    interface Model {
        
        int login(String username, String password);
    }
    
    interface View {
        String getUserName();
        
        String getPassWord();
        
        void showToast(String msg);
        
        void setUserNmeErro(String msg);
        
        void setPassWordErro(String msg);
        
        void onSuccess();
        
        
    }
    
    interface Presenter {
    
    }
}
