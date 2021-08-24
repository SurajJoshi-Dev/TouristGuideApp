package com.example.mynewtask;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import java.util.ArrayList;

import Adapters.RecipeAdapter;
import Classes.RecyclerItemClickListener;
import Model.RecipeModel;

public class recycler_main extends AppCompatActivity {
    RecyclerView recylerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recycler);

        recylerview = findViewById(R.id.recylerView);

        ArrayList<RecipeModel> list = new ArrayList<>();
        list.add(new RecipeModel(R.drawable.kdr, "Kedarnath Dham"));
        list.add(new RecipeModel(R.drawable.badrinathtemple, "Badrinath Dham"));
        list.add(new RecipeModel(R.drawable.yamunotridham, "Yamunotri Dham"));
        list.add(new RecipeModel(R.drawable.gangotritemple, "Gangotri Dham"));
        list.add(new RecipeModel(R.drawable.choptatungnath, "Chopta Tungnath"));
        list.add(new RecipeModel(R.drawable.roop, "Roopkund Trek"));
        list.add(new RecipeModel(R.drawable.choptatungnath, "Dodital Trek"));
        list.add(new RecipeModel(R.drawable.yamunotridham, "Brahmtal Trek"));
        list.add(new RecipeModel(R.drawable.kedarkanthatrek, "KedarKantha Trek"));
        list.add(new RecipeModel(R.drawable.dayarabugyaltrek, "Dayara Bugyal "));
        list.add(new RecipeModel(R.drawable.panchachulbasecamp, "Panchachula Trek"));

        list.add(new RecipeModel(R.drawable.kdr, "Kedarnath Dham"));
        list.add(new RecipeModel(R.drawable.badrinathtemple, "Badrinath Dham"));
        list.add(new RecipeModel(R.drawable.yamunotridham, "Yamunotri Dham"));
        list.add(new RecipeModel(R.drawable.gangotritemple, "Gangotri Dham"));
        list.add(new RecipeModel(R.drawable.choptatungnath, "Chopta Tungnath"));
        list.add(new RecipeModel(R.drawable.roop, "Roopkund Trek"));
        list.add(new RecipeModel(R.drawable.choptatungnath, "Dodital Trek"));
        list.add(new RecipeModel(R.drawable.yamunotridham, "Brahmtal Trek"));
        list.add(new RecipeModel(R.drawable.kedarkanthatrek, "KedarKantha Trek"));
        list.add(new RecipeModel(R.drawable.dayarabugyaltrek, "Dayara Bugyal "));
        list.add(new RecipeModel(R.drawable.panchachulbasecamp, "Panchachula Trek"));

        list.add(new RecipeModel(R.drawable.kdr, "Kedarnath Dham"));
        list.add(new RecipeModel(R.drawable.badrinathtemple, "Badrinath Dham"));
        list.add(new RecipeModel(R.drawable.yamunotridham, "Yamunotri Dham"));
        list.add(new RecipeModel(R.drawable.gangotritemple, "Gangotri Dham"));
        list.add(new RecipeModel(R.drawable.choptatungnath, "Chopta Tungnath"));
        list.add(new RecipeModel(R.drawable.roop, "Roopkund Trek"));
        list.add(new RecipeModel(R.drawable.choptatungnath, "Dodital Trek"));
        list.add(new RecipeModel(R.drawable.yamunotridham, "Brahmtal Trek"));
        list.add(new RecipeModel(R.drawable.kedarkanthatrek, "KedarKantha Trek"));
        list.add(new RecipeModel(R.drawable.dayarabugyaltrek, "Dayara Bugyal "));
        list.add(new RecipeModel(R.drawable.panchachulbasecamp, "Panchachula Trek"));

        list.add(new RecipeModel(R.drawable.kdr, "Kedarnath Dham"));
        list.add(new RecipeModel(R.drawable.badrinathtemple, "Badrinath Dham"));
        list.add(new RecipeModel(R.drawable.yamunotridham, "Yamunotri Dham"));
        list.add(new RecipeModel(R.drawable.gangotritemple, "Gangotri Dham"));
        list.add(new RecipeModel(R.drawable.choptatungnath, "Chopta Tungnath"));
        list.add(new RecipeModel(R.drawable.roop, "Roopkund Trek"));
        list.add(new RecipeModel(R.drawable.choptatungnath, "Dodital Trek"));
        list.add(new RecipeModel(R.drawable.yamunotridham, "Brahmtal Trek"));
        list.add(new RecipeModel(R.drawable.kedarkanthatrek, "KedarKantha Trek"));
        list.add(new RecipeModel(R.drawable.dayarabugyaltrek, "Dayara Bugyal "));
        list.add(new RecipeModel(R.drawable.panchachulbasecamp, "Panchachula Trek"));


        RecipeAdapter adapter = new RecipeAdapter(list, this);
        recylerview.setAdapter(adapter);


        //****************  LinearLayoutManager 1-Vertical, 2-Horizontal***********
//        LinearLayoutManager layoutManager =new LinearLayoutManager(this);
//        recylerview.setLayoutManager(layoutManager);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recylerview.setLayoutManager(layoutManager);

//            LinearLayoutManager layoutManager =new LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false);
//        recylerview.setLayoutManager(layoutManager);


        //************GridLayoutManager****************
        //   GridLayoutManager gridLayoutManager=new GridLayoutManager(this,2);
        //   recylerview.setLayoutManager(gridLayoutManager);

        //************StaggeredGridLayoutManager  1-Vertical , 2-Horizontal***************************

        //    StaggeredGridLayoutManager staggeredGridLayoutManager=new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        //    recylerview.setLayoutManager(staggeredGridLayoutManager);

        recylerview.addOnItemTouchListener(new RecyclerItemClickListener(this, recylerview, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                switch (position) {
                    case 0:

                        Intent intent = new Intent(recycler_main.this, ScrollingActivity.class);
                        startActivity(intent);
                        Toast.makeText(recycler_main.this, "First Item is Clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case 1:
                        Intent intent1 = new Intent(recycler_main.this, ScrollingActivity.class);
                        startActivity(intent1);
                        Toast.makeText(recycler_main.this, "Second Item is Clicked", Toast.LENGTH_SHORT).show();

                        break;

                    case 2:
                        Intent intent2 = new Intent(recycler_main.this, ScrollingActivity.class);
                        startActivity(intent2);
                        Toast.makeText(recycler_main.this, "Third Item is Clicked", Toast.LENGTH_SHORT).show();
                        break;

                    case 3:
                        Intent intent3 = new Intent(recycler_main.this, ScrollingActivity.class);
                        startActivity(intent3);
                        break;

                    case 4:
                        Intent intent4 = new Intent(recycler_main.this, ScrollingActivity.class);
                        startActivity(intent4);
                        break;

                    case 5:
                        Intent intent5 = new Intent(recycler_main.this, ScrollingActivity.class);
                        startActivity(intent5);
                        break;

                    case 6:
                        Intent intent6 = new Intent(recycler_main.this, ScrollingActivity.class);
                        startActivity(intent6);
                        break;

                    case 7:
                        Intent intent7 = new Intent(recycler_main.this, ScrollingActivity.class);
                        startActivity(intent7);
                        break;

                    case 8:
                        Intent intent8 = new Intent(recycler_main.this, ScrollingActivity.class);
                        startActivity(intent8);
                        break;
                    default:
                }
            }

            @Override
            public void onLongItemClick(View view, int position) {

            }
        }));
    }
}


      /*  switch (postion) {
            case 0:
                Toast.makeText(this, "First Item is Clicked", Toast.LENGTH_SHORT).show();

                //   Intent intent=new Intent(recycler_main.this,ScrollingActivity1.class);
                // startActivity(intent);
                break;
            case 1:
                Toast.makeText(this, "Second Item is Clicked", Toast.LENGTH_SHORT).show();
                // Intent intent=new Intent(recycler_main.this,ScrollingActivity1.class);
                //  startActivity(intent);
                break;
            case 2:
                Toast.makeText(this, "Third Item is Clicked", Toast.LENGTH_SHORT).show();

                //  Intent intent=new Intent(recycler_main.this,ScrollingActivity1.class);
                //startActivity(intent);
                break;
            // case 3:
            //  Intent intent=new Intent(recycler_main.this,ScrollingActivity1.class);
            //startActivity(intent);
            // break;
            case 4:
                Intent intent = new Intent(recycler_main.this, ScrollingActivity1.class);
                startActivity(intent);
                break;
            case 5:
                Intent intent = new Intent(recycler_main.this, ScrollingActivity1.class);
                startActivity(intent);
                break;
            case 6:
                Intent intent = new Intent(recycler_main.this, ScrollingActivity1.class);
                startActivity(intent);
                break;
            case 7:
                Intent intent = new Intent(recycler_main.this, ScrollingActivity1.class);
                startActivity(intent);
                break;
            case 8:
                Intent intent = new Intent(recycler_main.this, ScrollingActivity1.class);
                startActivity(intent);
                break;
            default:
        }

    ));}

   */



