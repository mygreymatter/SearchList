package com.mayo.searchlist;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;


public class ActMain extends Activity {

    String[] names = {"Rekha Lakshmipathi","Mahayogi Lakshmipathi","Sai Mabaka","Sai Rajesh"};
    ArrayAdapter<String> mAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.a_main);
        ListView namesList = (ListView) findViewById(R.id.names);
        EditText search = (EditText) findViewById(R.id.searchName);

        mAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, names);
        namesList.setAdapter(mAdapter);

        search.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
//                mAdapter.getFilter().filter(s);
                onSearchRequested();
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
    }

}