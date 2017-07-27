package com.controller.store.store;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;


import com.controller.store.model.sale;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;


public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.findViewById(R.id.login_B).setOnClickListener(new login());
    }

    public class login implements OnClickListener{
        String username=null;
        String userpw=null;
        @Override
        public void onClick(View v) {
            System.out.println("进入Click操作");
            EditText usn=(EditText)findViewById(R.id.loginUMT);
            EditText usp=(EditText)findViewById(R.id.loginUPT);
            username=usn.getText().toString();
            userpw=usp.getText().toString();
            Log.e("账号密码",username+userpw);
            Runnable run=new Runnable(){
                @Override
                public void run() {
                    URL url=null;
                    try {
                        url=new URL("http://192.168.1.2:8088/myspringclient/sale/findlist");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                    HttpNet h=new HttpNet();
                    h.GetInfoFrom(url,"",username,userpw);
                }
            };
            new Thread(run).start();

        }
    }
    public  class HttpNet {
        public void GetInfoFrom(URL url,String data,String username,String userpw){
            try {
                HttpURLConnection cn=(HttpURLConnection)url.openConnection();
                cn.setRequestMethod("POST");
                cn.setInstanceFollowRedirects(true);
                cn.setRequestProperty("Charset", "UTF-8");
                // 设置文件类型
                cn.setRequestProperty("Content-Type", "text/xml; charset=UTF-8");
                // 设置请求参数，可通过Servlet的getHeader()获取
                cn.setRequestProperty("Cookie", "username=" + URLEncoder.encode(username, "UTF-8")+";userpw="+URLEncoder.encode(userpw, "UTF-8"));
                cn.connect();
                if(cn.getResponseCode()==200){
                    InputStream read=cn.getInputStream();
                    BufferedReader reader=new BufferedReader(new InputStreamReader(read));
                    String line=null;
                    if(reader.readLine()!=null){
                        Intent in=new Intent();
                        in.setClass(MainActivity.this,WorkActivity.class);
                        MainActivity.this.startActivity(in);



                    };
                    while ((line=reader.readLine())!=null){
                        Log.e("接收信息",line);

                    }
                }
                cn.disconnect();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
