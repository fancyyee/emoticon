package com.example.table;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public int weeknum=weeknum_int();
    public int hidemode=0;//0是隐藏，1是显示
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);//删除标题栏
        setContentView(R.layout.activity_main);
        TextView textView=findViewById(R.id.textView8);
        String week="这是第"+weeknum_string()+"周";
        textView.setText(week);
        Button[][][] button_select=button_select();
        Button[][] discover=button_select[0];
        Button[][] cover=button_select[1];
        for(int i=0;i<discover.length;i++){
            for(int j=0;j<discover[i].length;j++){
                discover[i][j].setVisibility(View.VISIBLE);
                discover[i][j].setBackgroundColor(Color.parseColor("#C6EFCE"));

            }
        }
        for(int i=0;i<cover.length;i++){
            for(int j=0;j<cover[i].length;j++){
                cover[i][j].setVisibility(View.INVISIBLE);
                cover[i][j].setBackgroundColor(Color.parseColor("#D6D7D7"));

            }
        }
    }
    public void text_set(View view){
        TextView textView=findViewById(R.id.textView8);
        String week="这是第"+weeknum_string()+"周";
        textView.setText(week);
    }
    public String weeknum_string(){//转化成String
        String response=Integer.toString(weeknum);
        return response;
    }
    public int weeknum_int(){//转化成int
        long result=weeknum();
        String out=Long.toString(result);//long型数字转String
        int response=Integer.parseInt(String.valueOf(out));//把String转化为int
        return response;
    }
    public long weeknum(){//获取周数
        long week_num=604800000;//一周的unix时间
        long starttime=1598198400000L;//8月24日0点的unix时间
        long timemen=System.currentTimeMillis();//获取当前的unix时间
        long result=timemen-starttime;
        result=result/week_num;
        return result;
    }


    public void button11(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("军事理论")//标题
                .setMessage("教师：周剑波\n" +
                        "时间：6-17周\n" +
                        "地点：巡天楼2楼报告厅")//内容
                .create();
        alertDialog1.show();
    }
    public void button12(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("民航概论")//标题
                .setMessage("教师：吴东苏\n" +
                        "时间：6-17周\n" +
                        "地点：T1209")//内容
                .create();
        alertDialog1.show();
    }
    public void button13(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("高等数学Ⅱ(1)")//标题
                .setMessage("教师：方谋耶\n" +
                        "时间：6-19周\n" +
                        "地点：T1309")//内容
                .create();
        alertDialog1.show();
    }
    public void button15(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("未来航空运输系统")//标题
                .setMessage("教师：乐美龙\n" +
                        "时间：6-9周\n" +
                        "地点：T1509")//内容
                .create();
        alertDialog1.show();
    }
    public void button21(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("思想道德修养与法律基础")//标题
                .setMessage("教师：张轶瑶\n" +
                        "时间：6-17周\n" +
                        "地点：T1407")//内容
                .create();
        alertDialog1.show();
    }
    public void button22(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("未来航空运输系统")//标题
                .setMessage("教师：乐美龙\n" +
                        "时间：6-9周\n" +
                        "地点：T1411")//内容
                .create();
        alertDialog1.show();
    }
    public void button23(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("大学英语Ⅲ")//标题
                .setMessage("教师：毛红霞\n" +
                        "时间：6-19周\n" +
                        "地点：T1503")//内容
                .create();
        alertDialog1.show();
    }
    public void button24(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("计算思维导论")//标题
                .setMessage("教师：朱玉莲\n" +
                        "时间：6-17周\n" +
                        "地点：T1417")//内容
                .create();
        alertDialog1.show();
    }
    public void button32(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("高等数学Ⅱ(1)")//标题
                .setMessage("教师：方谋耶\n" +
                        "时间：6-18周\n" +
                        "地点：T1309")//内容
                .create();
        alertDialog1.show();
    }
    public void button33(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("思想道德修养与法律基础")//标题
                .setMessage("教师：张轶瑶\n" +
                        "时间：6-17周\n" +
                        "地点：T1407")//内容
                .create();
        alertDialog1.show();
    }
    public void button41(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("大学英语Ⅲ（上机）")//标题
                .setMessage("教师：于海飞\n" +
                        "时间：6-19周\n" +
                        "地点：2楼C机房")//内容
                .create();
        alertDialog1.show();
    }
    public void button42(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("体育（一）")//标题
                .setMessage("教师：张亚菲\n" +
                        "时间：6-18周\n" +
                        "地点：操场")//内容
                .create();
        alertDialog1.show();
    }
    public void button44(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("大学生心理健康教育")//标题
                .setMessage("教师：陈瑜，杨雪花\n" +
                        "时间：6-11周\n" +
                        "地点：T1207")//内容
                .create();
        alertDialog1.show();
    }
    public void button52(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("高等数学Ⅱ(1)")//标题
                .setMessage("教师：方谋耶\n" +
                        "时间：6-18周\n" +
                        "地点：T1309")//内容
                .create();
        alertDialog1.show();
    }
    public void button73(View view){
        AlertDialog alertDialog1=new AlertDialog.Builder(this)
                .setTitle("认识身边的系统")//标题
                .setMessage("教师：张生润\n" +
                        "时间：10-13周\n" +
                        "地点：T1303")//内容
                .create();
        alertDialog1.show();
    }


    public Button[][][] button_select(){//{在时间内的button，不在时间范围内的button}
        Button button11=findViewById(R.id.button11);
        Button button12=findViewById(R.id.button12);
        Button button13=findViewById(R.id.button13);
        Button button15=findViewById(R.id.button15);
        Button button21=findViewById(R.id.button21);
        Button button22=findViewById(R.id.button22);
        Button button23=findViewById(R.id.button23);
        Button button24=findViewById(R.id.button24);
        Button button32=findViewById(R.id.button32);
        Button button33=findViewById(R.id.button33);
        Button button41=findViewById(R.id.button41);
        Button button42=findViewById(R.id.button42);
        Button button44=findViewById(R.id.button44);
        Button button52=findViewById(R.id.button52);
        Button button73=findViewById(R.id.button73);
        Button[] week10_13={button73};
        Button[] week6_9={button15,button22};
        Button[] week6_11={button44};
        Button[] week6_17={button11,button12,button21,button24,button33};
        Button[] week6_18={button32,button42,button52};
        Button[] week6_19={button13,button23,button41};
        Button[][] week_in={};
        Button[][] week_out={};
        if(weeknum>5){
            if(weeknum>9){
                if(weeknum>11){
                    if(weeknum>13){
                        if(weeknum>17){
                            if(weeknum>18){
                                if(weeknum>19){
                                    week_out= new Button[][]{week6_9,week6_11,week10_13,week6_17,week6_18,week6_19};
                                }
                                else{
                                    week_in= new Button[][]{};
                                    week_out= new Button[][]{week6_9,week6_11,week10_13,week6_17,week6_18};
                                }
                            }
                            else{
                                week_in= new Button[][]{week6_18, week6_19};
                                week_out= new Button[][]{week6_9,week6_11,week10_13,week6_17};
                            }
                        }
                        else{
                            week_in= new Button[][]{week6_17, week6_18, week6_19};
                            week_out= new Button[][]{week6_9,week6_11,week10_13};
                        }
                    }
                    else{
                        week_in= new Button[][]{week10_13, week6_17, week6_18, week6_19};
                        week_out= new Button[][]{week6_9,week6_11};
                    }
                }
                else {
                    week_in= new Button[][]{week10_13, week6_11, week6_17, week6_18, week6_19};
                    week_out= new Button[][]{week6_9};
                }
            }
            else {
                week_in= new Button[][]{week6_9, week6_11, week6_17, week6_18, week6_19};
                week_out= new Button[][]{week10_13};
            }
        }
        else{
            week_out= new Button[][]{week6_9, week6_18, week6_17, week6_11, week6_19};
        }
        Button[][][]response={week_in,week_out};
        return  response;
    }
    public void button_hide(View view){
        Button[][][] button_select=button_select();
        Button[][] discover=button_select[0];
        Button[][] cover=button_select[1];
        for(int i=0;i<discover.length;i++){
            for(int j=0;j<discover[i].length;j++){
                discover[i][j].setVisibility(View.VISIBLE);
                discover[i][j].setBackgroundColor(Color.parseColor("#C6EFCE"));
            }
        }
        for(int i=0;i<cover.length;i++){
            for(int j=0;j<cover[i].length;j++){
                cover[i][j].setVisibility(View.INVISIBLE);
                cover[i][j].setBackgroundColor(Color.parseColor("#D6D7D7"));
            }
        }
    }
    public void button_discover(View view){
        Button[][][] button_select=button_select();
        Button[][] discover=button_select[0];
        Button[][] cover=button_select[1];
        for(int i=0;i<discover.length;i++){
            for(int j=0;j<discover[i].length;j++){
                discover[i][j].setVisibility(View.VISIBLE);
                discover[i][j].setBackgroundColor(Color.parseColor("#C6EFCE"));
            }
        }
        for(int i=0;i<cover.length;i++){
            for(int j=0;j<cover[i].length;j++){
                cover[i][j].setVisibility(View.VISIBLE);
                cover[i][j].setBackgroundColor(Color.parseColor("#D6D7D7"));
            }
        }
    }
    public void weeknum_up(View view){
        weeknum=weeknum+1;
        button_deal(view);
        text_set(view);
    }
    public void weeknum_down(View view){
        weeknum=weeknum-1;
        button_deal(view);
        text_set(view);
    }
    public void button_deal(View view){
        switch (hidemode){
            case 0:
                button_hide(view);
                break;
            case 1:
                button_discover(view);
                break;
        }
    }
    public void switch_button(View view){
        switch (hidemode){
            case 0:
                hidemode=1;
                break;
            case 1:
                hidemode=0;
                break;
        }
        button_deal(view);
    }
}