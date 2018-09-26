package com.example.kosmos.netkpss;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import static com.example.kosmos.netkpss.R.string.Altbaslik2;

public class Main6Activity extends AppCompatActivity {


    private ExpandableListView listView;
    private ExpendapleListeAdapter listAdapter;
    private List<String> listDataHeader;
    private HashMap<String, List<String>> listHash;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);


        listView = (ExpandableListView) findViewById(R.id.lvExp);
        initData();
        listAdapter = new ExpendapleListeAdapter(this, listDataHeader, listHash);
        listView.setAdapter(listAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        });
    }


    private void initData() {
        listDataHeader = new ArrayList<>();
        listHash = new HashMap<>();

        listDataHeader.add("Ders1");
        listDataHeader.add("Ders2");
        listDataHeader.add("Ders3");
        listDataHeader.add("Ders4");

        List<String> Ders1 = new ArrayList<>();
        Ders1.add("Alt Başlık1");

        List<String> Ders2 = new ArrayList<>();

        Ders2.add("Alt Başlık2 ");
        Ders2.add("Alt Başlık3 ");
        Ders2.add("Alt Başlık4");
        Ders2.add(getString(R.string.altbaslik5));

        List<String> Ders3 = new ArrayList<>();
        Ders3.add("Alt Başlık6");
        Ders3.add("Alt Başlık7");
        Ders3.add("Alt Başlık8");
        Ders3.add("Alt Başlık9");

        List<String> Ders4 = new ArrayList<>();
        Ders4.add("Alt Başlık10");
        Ders4.add("Alt Başlık11");
        Ders4.add("Alt Başlık12");
        Ders4.add("Alt Başlık13");

        listHash.put(listDataHeader.get(0), Ders1);
        listHash.put(listDataHeader.get(1), Ders2);
        listHash.put(listDataHeader.get(2), Ders3);
        listHash.put(listDataHeader.get(3), Ders4);


    }

    }

