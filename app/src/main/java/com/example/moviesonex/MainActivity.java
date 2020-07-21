package com.example.moviesonex;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

//public class MainActivity extends AppCompatActivity  {
//    MyRecyclerViewAdapter adapter;
//      int mData[] = new int[] {R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8,R.drawable.pic9,R.drawable.pic10,R.drawable.pic11};
//
//    String mData[] ={"1","2","3"};
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);
//
//        GridLayoutManager gridLayout = new GridLayoutManager(this,3);
//
//        RecyclerView recyclerView = findViewById(R.id.recycler_view);
//
//        recyclerView.setLayoutManager(gridLayout);
//
//        adapter = new MyRecyclerViewAdapter(this, mData);
//
//        recyclerView.setAdapter(adapter);
//
//    }
//}



public class MainActivity extends AppCompatActivity  {
    MyRecyclerViewAdapter adapter;
      int[] mData = new int[] {R.drawable.pic1,R.drawable.pic2,R.drawable.pic3,R.drawable.pic4,R.drawable.pic5,R.drawable.pic6,R.drawable.pic7,R.drawable.pic8,R.drawable.pic9,R.drawable.pic10,R.drawable.pic11};

//    String mData[] ={"1","2","3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayoutManager gridLayout = new GridLayoutManager(this,3);

        RecyclerView recyclerView = findViewById(R.id.recycler_view);

        recyclerView.setLayoutManager(gridLayout);

        adapter = new MyRecyclerViewAdapter(this, mData);

        recyclerView.setAdapter(adapter);

    }
}
