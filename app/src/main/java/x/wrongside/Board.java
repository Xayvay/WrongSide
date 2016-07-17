package x.wrongside;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Board extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.content_board);

        GridView gridview = (GridView) findViewById(R.id.gridview);
        gridview.setAdapter(new SquareAdapter(this));

        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
//                Toast.makeText(Board.this, "" + position,
//                        Toast.LENGTH_SHORT).show();
            }
        });
    }

}
