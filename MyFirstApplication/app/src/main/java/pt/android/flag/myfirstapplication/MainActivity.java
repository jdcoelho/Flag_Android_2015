package pt.android.flag.myfirstapplication;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //+..serve para associar este layout a activity do desenhamos
        setContentView(R.layout.activity_main);

        final TextView txtCounter = (TextView)findViewById(R.id.txtCounter);
        txtCounter.setText("0");

        Button btnIncr = (Button)findViewById(R.id.btnIncr);
        btnIncr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int current = Integer.parseInt(txtCounter.getText().toString());
                txtCounter.setText((current + 1) + "");
            }
        });

        Button btnDecr = (Button)findViewById(R.id.btnDecr);
        btnDecr.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                int current = Integer.parseInt(txtCounter.getText().toString());
                txtCounter.setText((current - 1) + "");
            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
}
