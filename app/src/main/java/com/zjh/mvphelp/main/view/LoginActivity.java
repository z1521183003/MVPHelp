package com.zjh.mvphelp.main.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.zjh.mvphelp.R;
import com.zjh.mvphelp.main.contract.LoginContract;
import com.zjh.mvphelp.main.presenter.LoginPresenterImpl;


public class LoginActivity extends AppCompatActivity implements LoginContract.View, View.OnClickListener {
    private EditText           et_username;
    private EditText           et_password;
    private Button             btn_login;
    private LoginPresenterImpl mLoginPresenter;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mLoginPresenter = new LoginPresenterImpl(this);
        initView();
    }
    
    private void initView() {
        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);
        btn_login = findViewById(R.id.btn_login);
        
        btn_login.setOnClickListener(this);
    }
    
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btn_login:
                mLoginPresenter.login();
                break;
            
        }
    }
    
    @Override
    public String getUserName() {
        return et_username.getText().toString().trim();
    }
    
    @Override
    public String getPassWord() {
        return et_password.getText().toString().trim();
    }
    
    @Override
    public void showToast(String msg) {
        Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
    }
    
    @Override
    public void setUserNmeErro(String msg) {
        et_username.setError(msg);
        showToast(msg);
    }
    
    @Override
    public void setPassWordErro(String msg) {
        et_password.setError(msg);
        showToast(msg);
    }
    
    
    @Override
    public void onSuccess() {
        showToast("登录成功");
    }
    
    
}
