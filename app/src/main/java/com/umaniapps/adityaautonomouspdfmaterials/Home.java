package com.umaniapps.adityaautonomouspdfmaterials;


import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.FragmentTransaction;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.gauravk.bubblenavigation.BubbleNavigationLinearView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;
import java.util.List;

public class Home extends AppCompatActivity
{
    BottomNavigationView bottomNavigationView;

    FragmentTransaction fragmentTransaction;
    BubbleNavigationLinearView bubbleNavigationLinearView;

    ImageView imageview;


    private  final  int ID_HOME = 1;
    private  final  int ID_YOUTUBE = 2;
    private  final  int ID_PDF = 3;
    private  final  int ID_ROADMAP = 4;
    TextView textView;

    NavigationView navigationView;
    ActionBarDrawerToggle actionBarDrawerToggle;
    DrawerLayout drawerLayout;
    Toolbar toolbar;


    int images[] ={R.drawable.html_5,R.drawable.css,R.drawable.js,R.drawable.php,R.drawable.react
    ,R.drawable.nodejs};

    String names[]={"Html","css","js","php","react","nodejs"};

    List<ItemsModel> itemsList = new ArrayList<>();

    RelativeLayout AR_20,AR_19,AR_17,AR_16,AR_15,card,card2;
    CardView card3;
    private  ImageSlider imageSlider;
    GridView gridView;
    CustomAdapter customAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        navigationView = findViewById(R.id.navview);
        drawerLayout = findViewById(R.id.drawer);

        //adding customised toolbar
        toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        //toggle button
        actionBarDrawerToggle = new ActionBarDrawerToggle(this , drawerLayout,toolbar,R.string.navigation_open,R.string.navigation_close);
        drawerLayout.addDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();

        bottomNavigationView = findViewById(R.id.bottom_navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId())
                {

                    case R.id.homeb:
                        Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_SHORT).show();
                        //close drawer

                        break;
                    case R.id.youtubeb:
                        Intent intent1 = new Intent(Home.this,YouTube.class);
                        startActivity(intent1);
                        //close drawer

                        break;
                    case R.id.allpdfb:
                        Intent intent2 = new Intent(Home.this,AllPdf.class);
                        startActivity(intent2);
                        //close drawer

                        break;
                    case R.id.trackb:
                        Intent intent3 = new Intent(Home.this,RoadMaps.class);
                        startActivity(intent3);
                        //close drawer

                        break;
                }
                return true;
            }
        });


        //when an item is selected from menu
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener()
        {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId())
                {
                    case R.id.home3:
                        Toast.makeText(getApplicationContext(),"Home",Toast.LENGTH_SHORT).show();
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.youtube1:
                        openActivity2();
                        //close drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.pdf1:
                        openActivity3();
                        //close drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.roadmaps1:
                        openActivity4();
                        //close drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;

                    case R.id.moreapps1:
                        moreapps();
                        //close drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.feedback1:
                        Toast.makeText(getApplicationContext(),"coming soon",Toast.LENGTH_SHORT).show();
                        //close drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.settings1:
                        Toast.makeText(getApplicationContext(),"coming  soon",Toast.LENGTH_SHORT).show();
                        //close drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.about1:
                        openActivity6();
                        //close drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    case R.id.exit1:
                        onBackPressed();
                        //close drawer
                        drawerLayout.closeDrawer(GravityCompat.START);
                        break;
                    /*case R.id.homeb:
                        Toast.makeText(getApplicationContext()," coming soonb",Toast.LENGTH_SHORT).show();
                        //close drawer

                        break;
                    case R.id.youtubeb:
                        Toast.makeText(getApplicationContext()," coming soonb1",Toast.LENGTH_SHORT).show();
                        //close drawer

                        break;
                    case R.id.allpdfb:
                        Toast.makeText(getApplicationContext()," coming soonb2",Toast.LENGTH_SHORT).show();
                        //close drawer

                        break;
                    case R.id.trackb:
                        Toast.makeText(getApplicationContext()," coming soonb3",Toast.LENGTH_SHORT).show();
                        //close drawer

                        break;*/

                }

                return true;
            }
        });












        imageSlider = findViewById(R.id.slider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel("https://i.picsum.photos/id/370/4928/3264.jpg?hmac=UGe0txSnG4hhV-fAoi7e3mTnvQFhYYNcPJJbYFePh5Q", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.picsum.photos/id/445/4256/2819.jpg?hmac=99qT1IPidZrzaXTgG1ixRRVwElWXUlNepU2k692G44c", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.picsum.photos/id/20/3670/2462.jpg?hmac=CmQ0ln-k5ZqkdtLvVO23LjVAEabZQx2wOaT4pyeG10I", ScaleTypes.FIT));
        slideModels.add(new SlideModel("https://i.picsum.photos/id/201/5184/3456.jpg?hmac=3SX-1t9hHlAmc653Ox-EmJonZBCaCSK5b9FayvY4sbI", ScaleTypes.FIT));




        imageSlider.setImageList(slideModels,ScaleTypes.FIT);


        gridView = findViewById(R.id.gridview1);

        for(int i=0; i< names.length;i++){

            ItemsModel itemsModel = new ItemsModel(names[i],images[i]);
            itemsList.add(itemsModel);

        }

        customAdapter = new CustomAdapter(itemsList,this);
        gridView.setAdapter(customAdapter);







        AR_20 = findViewById(R.id.AR_20);

        AR_20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity1();

            }


        });

        card = findViewById(R.id.card);

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl("https://www.youtube.com/watch?v=KsNabzrQca8");
            }
        });
        card2 = findViewById(R.id.card2);

        card2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl1("https://www.youtube.com/watch?v=VPvVD8t02U8");
            }
        });
        card3 = findViewById(R.id.card3);

        card3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                gotoUrl2("https://www.youtube.com/channel/UCMNULLz42OXFrQvHnX7NANQ");
            }
        });


    }
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.nav_menu, menu);

        for(int i=0;i<menu.size();i++){
            MenuItem menuItem = menu.getItem(i);
            SpannableString spannable = new SpannableString(
                    menu.getItem(i).getTitle().toString()
            );

            spannable.setSpan(new ForegroundColorSpan(Color.BLACK),
                    0,spannable.length(),0);
            menuItem.setTitle(spannable);

        }
        return true;
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle item selection
        switch (item.getItemId()) {

            case R.id.share:
            case R.id.app_share:
                appshare();
                return true;
            case R.id.about:
                onNewIntent();
                return true;
            case R.id.rating:
                rating();
                return true;

            case R.id.moreapps:
                moreapps();
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }


    }




    private void appshare()
    {

        Intent intent= new Intent();
        intent.setAction(Intent.ACTION_SEND);
        intent.setType("text/plain");
        String shareBody = "Hi Friends,\n" +
                "If You are in B.TECH ,I recommend you this amazing application for your  JNTUA,JNTUK exam preparations.\n" +
                "https://play.google.com/store/apps/details?id=com.umaniapps.jnturesources";
        String shareSub = "Calculator App";
        intent.putExtra(Intent.EXTRA_SUBJECT,shareSub);
        intent.putExtra(Intent.EXTRA_TEXT,shareBody);
        intent=Intent.createChooser(intent,"Share Via");
        startActivity(intent);
    }



    private void moreapps()
    {

        String str ="https://play.google.com/store/search?q=pub:U MANI KUMAR";
        startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(str)));


    }

    private void rating()
    {
        Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=com.umaniapps.jnturesources");
        Intent i = new Intent(Intent.ACTION_VIEW,uri);
        startActivity(i);
    }
    private void onNewIntent()
    {
        Intent intent= new Intent(this,Home.class);
        startActivity(intent);
    }

    private void openActivity1() {
        Intent intent= new Intent(this, R20_PDF_MATERIALS.class);
        startActivity(intent);
    }

    private void openActivity2() {
        Intent intent= new Intent(this, YouTube.class);
        startActivity(intent);
    }
    private void openActivity3() {
        Intent intent= new Intent(this, AllPdf.class);
        startActivity(intent);
    }
    private void openActivity4() {
        Intent intent= new Intent(this, RoadMaps.class);
        startActivity(intent);
    }
    private void openActivity5() {
        Intent intent= new Intent(this, Home.class);
        startActivity(intent);
    }
    private void openActivity6() {
        Intent intent= new Intent(this, About.class);
        startActivity(intent);
    }


    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    private void gotoUrl1(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }
    private void gotoUrl2(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
    }

    public class CustomAdapter extends BaseAdapter {

        private  List<ItemsModel> itemsModelList;
        private List<ItemsModel> itemsModelListFiltered;
        private Context context;

        public CustomAdapter(List<ItemsModel> itemsModelList, Context context) {
            this.itemsModelList = itemsModelList;
            this.itemsModelListFiltered = itemsModelList;
            this.context = context;
        }

        @Override
        public int getCount() {
            return itemsModelListFiltered.size();
        }


        @Override
        public Object getItem(int position) {
            return null;
        }


        @Override
        public long getItemId(int position) {
            return position;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {

            View view =getLayoutInflater().inflate(R.layout.row_items, null);

            ImageView imageView = view.findViewById(R.id.imageView);
            TextView textView = view.findViewById(R.id.tvName);


            imageView.setImageResource(itemsModelListFiltered.get(position).getImage());
            textView.setText(itemsModelListFiltered.get(position).getName());

            return view;
        }
    }
    @Override
    public void onBackPressed() {

        AlertDialog.Builder builder = new AlertDialog.Builder(Home.this);
        builder.setTitle(R.string.app_name);

        builder.setIcon(R.mipmap.ic_launcher);
        builder.setMessage("Do you want to exit?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }



}