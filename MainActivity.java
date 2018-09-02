package com.sofirdausyafia.aplsewamobil;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    protected ListView lv;
    protected ListAdapter adapter;
    SimpleAdapter Adapter;
    HashMap<String, String> map;
    ArrayList<HashMap<String, String>> myList;
    String[] Ing;
    String[] Gbr;
    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setTitle("Sewa Mobil");
        setContentView(R.layout.activity_main);

        lv = (ListView) findViewById(R.id.lv);
        Ing = new String[]{"Astra Sigra","Honda Brio","Mercedes Benz","Toyota Agya","Toyota Avanza"};
        Gbr = new String[] {Integer.toString(R.drawable.astrasigra),
                Integer.toString(R.drawable.hondabrio),
                Integer.toString(R.drawable.mercedesbenz),
                Integer.toString(R.drawable.toyotaagya),
                Integer.toString(R.drawable.toyotaavanza),
        };
        myList = new ArrayList<HashMap<String, String>>();
        for (int i = 0; i < Ing.length; i++){
            map = new HashMap<String, String>();
            map.put("list-ing", Ing[i]);
            map.put("gbr", Gbr[i]);
            myList.add(map);
        }
        Adapter = new SimpleAdapter(this, myList, R.layout.layout_content_lv,
                new String[]{"list-ing","gbr"},
                new int[] {R.id.tv, R.id.imgv}
        );
        lv.setAdapter(Adapter);
    }
}
