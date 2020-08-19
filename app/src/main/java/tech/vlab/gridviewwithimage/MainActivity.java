package tech.vlab.gridviewwithimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    GridView gvImage;
    ArrayList<PhoTo> arrayList;
    PhotoAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AddImage();
        adapter = new PhotoAdapter(this, R.layout.photo, arrayList);
        gvImage.setAdapter(adapter);
    }

    private void AddImage(){
        gvImage = (GridView) findViewById(R.id.gridview);
        arrayList = new ArrayList<>();
        arrayList.add(new PhoTo("Hình số 1", R.drawable.a));
        arrayList.add(new PhoTo("Hình số 2", R.drawable.a));
        arrayList.add(new PhoTo("Hình số 3", R.drawable.a));
        arrayList.add(new PhoTo("Hình số 1", R.drawable.a));
        arrayList.add(new PhoTo("Hình số 2", R.drawable.a));
        arrayList.add(new PhoTo("Hình số 3", R.drawable.a));
        arrayList.add(new PhoTo("Hình số 1", R.drawable.a));
        arrayList.add(new PhoTo("Hình số 2", R.drawable.a));
        arrayList.add(new PhoTo("Hình số 3", R.drawable.a));
    }
}
