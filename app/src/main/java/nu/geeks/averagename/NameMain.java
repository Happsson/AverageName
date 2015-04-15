package nu.geeks.averagename;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;

import java.lang.ref.SoftReference;
import java.util.ArrayList;


public class NameMain extends Activity {

    ListView listView;
    ArrayList<String> names;
    ArrayAdapter<String> nAdapter;
    Button bAdd, bAverage;
    EditText eName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name_main);

        bAdd = (Button) findViewById(R.id.bAdd);
        bAverage = (Button) findViewById(R.id.bAverage);
        eName = (EditText) findViewById(R.id.editText);
        listView = (ListView) findViewById(R.id.listView);

        eName.setText("");

        names = new ArrayList<String>();
        nAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, names);

        bAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(eName.getText().toString().length()>0){
                    names.add(eName.getText().toString().toUpperCase());
                    eName.setText("");
                    nAdapter.notifyDataSetChanged();
                }
            }
        });

        listView.setAdapter(nAdapter);

        bAverage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(names.size() > 0) {
                    String name = generateAverage();
                    new AlertDialog.Builder(NameMain.this)
                            .setTitle("Genomsnittsnamn")
                            .setMessage("Genomsnittliga namnet är " + name + "!")
                            .setPositiveButton("Ok!", null)
                            .setNegativeButton("Släng namn" , new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    names.clear();
                                    nAdapter.notifyDataSetChanged();
                                }
                            })
                            .show();
                }
            }
        });

    }

    private String generateAverage() {
        int nameLength = 0;

        for(String s : names){
            nameLength+=s.length();
        }


        nameLength = nameLength / names.size();
        int[] letters = new int[nameLength];


        int j = 0;

        StringBuilder name = new StringBuilder();

        for(int i = 0; i < nameLength; i++){
            int activeLetters = 0;
            for(String s : names){
                if(s.length() > i){
                    letters[i] += (int) s.charAt(i);
                    activeLetters++;
                }
            }
            letters[i] = letters[i] / activeLetters;
            name.append((char) letters[i]);
        }

        return name.toString();

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_name_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
