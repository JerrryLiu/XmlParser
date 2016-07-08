package com.sky.xmlparser;

import android.app.Activity;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.apkfuns.logutils.LogUtils;

import org.xutils.common.Callback;
import org.xutils.http.RequestParams;
import org.xutils.x;

public class MainActivity extends Activity {

    private Button xmlParser;
    private TextView showText;
    private String TAG ="LiuDongBing";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showText = (TextView) findViewById(R.id.textView);
        xmlParser = (Button) findViewById(R.id.xml_bt);
        xmlParser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showText.setText("LiuDongBing");
                getXmlFile();
                LogUtils.d("Test 02");
            }
        });

    }

    private void getXmlFile() {
        String url = "https://www.baidu.com";
        LogUtils.d("Test03");
        RequestParams params = new RequestParams(url);
        LogUtils.d("Test 04");
        Callback.Cancelable cancelable = x.http().get(params, new Callback.CommonCallback<String>() {

            @Override
            public void onCancelled(CancelledException arg0) {
                Log.d(TAG, "onCancelled: ");
                // TODO Auto-generated method stub

            }

            @Override
            public void onError(Throwable arg0, boolean arg1) {
                Log.d(TAG, "onError: ");
                // TODO Auto-generated method stub

            }

            @Override
            public void onFinished() {
                // TODO Auto-generated method stub
                Log.d(TAG, "onFinished: ");

            }

            @Override
            public void onSuccess(String arg0) {
                Log.d(TAG, "onSuccess: ");
                LogUtils.d("onSuccess" + arg0);
            }
        });
//        cancelable.cancel();
    }

}
