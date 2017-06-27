package com.developer.aashish.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int image[]={R.drawable.a0,R.drawable.a1,R.drawable.a2,R.drawable.a3,R.drawable.a4,R.drawable.a5,R.drawable.a6,R.drawable.a7,R.drawable.a8,R.drawable.a9};
 String[] name={"Kitians","Starboys","Yogi","Surya kit","Prasoon","Anamika","Virendra kit","vivek sir","Quitent","Versa","Anmol"};
    String[] last={"2:11pm","2:08pm","2:06pm","1:41pm","11:23pm","10:10am","10:01am","9:44am","YESTERDAY","YESTERDAY"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView li=(ListView)findViewById(R.id.list);
        CustomAdapter cd=new CustomAdapter();
        li.setAdapter(cd);

    }
class CustomAdapter extends BaseAdapter{





    @Override
    public int getCount() {
        return image.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=getLayoutInflater().inflate(R.layout.listmenu,null);
        ImageView ima=(ImageView)convertView.findViewById(R.id.imageView);
        TextView tx=(TextView)convertView.findViewById(R.id.name);
        TextView tx1=(TextView)convertView.findViewById((R.id.time));

        ima.setImageResource(image[position]);

        tx.setText(name[position]);
        tx1.setText(last[position]);
        return convertView;






    }
        }
    }


