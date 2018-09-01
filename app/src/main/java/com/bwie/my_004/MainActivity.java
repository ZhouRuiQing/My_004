package com.bwie.my_004;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bwie.my_004.weight.BarGraphView;

public class MainActivity extends AppCompatActivity {

    private BarGraphView mBarGraphView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       /* initView();*/
    }
 /*   private void initView(){
        mBarGraphView = (BarGraphView)findViewById(R.id.custom_view);
        mBarGraphView.setAxisX(900, 9);
        mBarGraphView.setAxisY(700,7);

        int columnInfo[][] = new int[][]{{600, Color.BLUE},{500, Color.GREEN},{400, Color.RED},{300, Color.BLUE},
                {500, Color.YELLOW},{300, Color.LTGRAY},{200, Color.BLUE}};
        mBarGraphView.setColumnInfo(columnInfo);
    }*/
}
