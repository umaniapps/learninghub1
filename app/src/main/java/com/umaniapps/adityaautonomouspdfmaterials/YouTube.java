package com.umaniapps.adityaautonomouspdfmaterials;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.SearchView;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;

import java.util.ArrayList;
import java.util.List;

public class YouTube extends AppCompatActivity
{


    int images[] = {R.drawable.python, R.drawable.python, R.drawable.django2, R.drawable.computervision,
            R.drawable.flask, R.drawable.ai2,R.drawable.ml1, R.drawable.python2};
    String names[] = {"Python 3", "Python Advanced", "Django", "Computer Vision using Python", "Flask using Python", "Python for A.I",
            "Machine Learning using Python", "Python"};
    List<ItemsModel> itemsList = new ArrayList<>();
    GridView gridView1;
    CustomAdapter customAdapter;

    //grid2
    int images2[] = {R.drawable.html_5, R.drawable.css, R.drawable.js, R.drawable.bootstrap, R.drawable.vue
            , R.drawable.react,R.drawable.angular, R.drawable.js, R.drawable.php, R.drawable.django2, R.drawable.rubyonrails
            , R.drawable.nodejs,R.drawable.aspnet, R.drawable.redis, R.drawable.mongodb,R.drawable.mysql1,
            R.drawable.java,R.drawable.mssql, R.drawable.couchdb,R.drawable.postgre, R.drawable.cassandra};
    String names2[] = {"Html", "Css", "Java script","Bootstrap", "Vue", "React JS", "Angular JS",
            "JavaScript Advanced","PHP", "Django(python)","Ruby on Rails","Spring(java)", "Node JS",
            "ASP.NET", "Redis", "Mongo DB", "My SQL", "MS SQL","Couch DB","Postgres","Cassandra"};
    List<ItemsModel2> itemsList2 = new ArrayList<>();
    GridView gridView2;
    CustomAdapter2 customAdapter2;

    int images3[] = {R.drawable.js, R.drawable.js, R.drawable.nextjs, R.drawable.gatsbyjs, R.drawable.typescript
            , R.drawable.vue,R.drawable.react, R.drawable.angular, R.drawable.emberjs, R.drawable.elm,
            R.drawable.expressjs, R.drawable.nodejs,R.drawable.jquery, R.drawable.deno};
    String names3[] = {"JavaScript", "Javascript Advanced", "Next JS", "Gatsby", "Typescript",
            "Vue JS","React Development", "Angular JS", "Ember JS", "Elm Programming", "Express JS",
            "Node JS","JQuery","Deno"};
    List<ItemsModel3> itemsList3 = new ArrayList<>();
    GridView gridView3;
    CustomAdapter3 customAdapter3;

    int images4[] = {R.drawable.hacking, R.drawable.hacker, R.drawable.cybersecurity, R.drawable.cryptography };
    String names4[] = {"Ethical Hacking", "Hacking Advanced", "Cyber Security", "Cryptography"};
    List<ItemsModel4> itemsList4 = new ArrayList<>();
    GridView gridView4;
    CustomAdapter4 customAdapter4;



    Toolbar toolbar3;
    private ImageSlider imageSlider;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_you_tube);

        toolbar3 = findViewById(R.id.toolbar3);
        setSupportActionBar(toolbar3);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        toolbar3.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                OnBackPress();
            }
        });

        imageSlider = findViewById(R.id.slider);

        ArrayList<SlideModel> slideModels = new ArrayList<>();

        slideModels.add(new SlideModel(R.drawable.rp1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.rp1, ScaleTypes.FIT));
        slideModels.add(new SlideModel(R.drawable.rp1, ScaleTypes.FIT));


        imageSlider.setImageList(slideModels, ScaleTypes.FIT);


        //grid
        gridView1 = findViewById(R.id.gridview1);

        for (int i = 0; i < names.length; i++) {
            ItemsModel itemsModel = new ItemsModel(names[i], images[i]);
            itemsList.add(itemsModel);

        }

        // Implement On Item click listener
        gridView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                switch (position) {
                    case 0:
                        gotoUrl("https://www.youtube.com/watch?v=_uQrJ0TkZlc");
                        break;
                    case 1:
                        break;

                }
            }
        });
        customAdapter = new CustomAdapter(itemsList, this);
        gridView1.setAdapter(customAdapter);

        //grid2
        gridView2 = findViewById(R.id.gridview2);
        for (int i = 0; i < names2.length; i++) {
            ItemsModel2 itemsModel2 = new ItemsModel2(names2[i], images2[i]);
            itemsList2.add(itemsModel2);

        }
        customAdapter2 = new CustomAdapter2(itemsList2, this);
        gridView2.setAdapter(customAdapter2);

        //grid3
        gridView3 = findViewById(R.id.gridview3);
        for (int i = 0; i < names3.length; i++) {
            ItemsModel3 itemsModel3 = new ItemsModel3(names3[i], images3[i]);
            itemsList3.add(itemsModel3);

        }
        customAdapter3 = new CustomAdapter3(itemsList3, this);
        gridView3.setAdapter(customAdapter3);

        //grid4
        gridView4 = findViewById(R.id.gridview4);
        for (int i = 0; i < names4.length; i++) {
            ItemsModel4 itemsModel4 = new ItemsModel4(names4[i], images4[i]);
            itemsList4.add(itemsModel4);

        }
        customAdapter4 = new CustomAdapter4(itemsList4, this);
        gridView4.setAdapter(customAdapter4);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);

        MenuItem menuItem = menu.findItem(R.id.search_view1);
        SearchView searchView = (SearchView) menuItem.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                customAdapter.getFilter().filter(newText);
                return true;
            }
        });

        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.search_view1) {
            return true;
        }
        return super.onOptionsItemSelected(item);

    }


    public class CustomAdapter extends BaseAdapter implements Filterable
    {

        private List<ItemsModel> itemsModelList;
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

            View view = getLayoutInflater().inflate(R.layout.row_items, null);

            ImageView imageView = view.findViewById(R.id.imageView);
            TextView textView = view.findViewById(R.id.tvName);

            imageView.setImageResource(itemsModelListFiltered.get(position).getImage());
            textView.setText(itemsModelListFiltered.get(position).getName());

            return view;
        }


        public Filter getFilter() {
            Filter filter = new Filter() {
                @Override
                protected FilterResults performFiltering(CharSequence constraint) {
                    FilterResults filterResults = new FilterResults();
                    if (constraint == null || constraint.length() == 0) {
                        filterResults.count = itemsModelList.size();
                        filterResults.values = itemsModelList;
                    } else {
                        String searchStr = constraint.toString().toLowerCase();
                        List<ItemsModel> resultsData = new ArrayList<>();

                        for (ItemsModel itemsModel : itemsModelList) {
                            if (itemsModel.getName().contains(searchStr) || itemsModel.getName().contains(searchStr)) {
                                resultsData.add(itemsModel);
                            }
                            filterResults.count = resultsData.size();
                            filterResults.values = resultsData;
                        }
                    }
                    return filterResults;
                }

                @Override
                protected void publishResults(CharSequence constraint, FilterResults results) {

                    itemsModelListFiltered = (List<ItemsModel>) results.values;
                    notifyDataSetChanged();

                }
            };
            return filter;
        }


    }
    public class CustomAdapter2 extends BaseAdapter
    {

        private List<ItemsModel2> itemsModelList2;
        private List<ItemsModel2> itemsModelListFiltered2;
        private Context context2;

        public CustomAdapter2(List<ItemsModel2> itemsModelList2, Context context2) {
            this.itemsModelList2 = itemsModelList2;
            this.itemsModelListFiltered2 = itemsModelList2;
            this.context2 = context2;
        }

        @Override
        public int getCount() {
            return itemsModelListFiltered2.size();
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

            View view2 = getLayoutInflater().inflate(R.layout.row_items_2, null);

            ImageView imageView = view2.findViewById(R.id.g2_imageView);
            TextView textView = view2.findViewById(R.id.g2_tvName);

            imageView.setImageResource(itemsModelListFiltered2.get(position).getImage());
            textView.setText(itemsModelListFiltered2.get(position).getName());

            return view2;
        }



    }

    public class CustomAdapter3 extends BaseAdapter
    {

        private List<ItemsModel3> itemsModelList3;
        private List<ItemsModel3> itemsModelListFiltered3;
        private Context context3;

        public CustomAdapter3(List<ItemsModel3> itemsModelList3, Context context3) {
            this.itemsModelList3 = itemsModelList3;
            this.itemsModelListFiltered3 = itemsModelList3;
            this.context3 = context3;
        }

        @Override
        public int getCount() {
            return itemsModelListFiltered3.size();
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

            View view3 = getLayoutInflater().inflate(R.layout.row_items_3, null);

            ImageView imageView = view3.findViewById(R.id.g3_imageView);
            TextView textView = view3.findViewById(R.id.g3_tvName);

            imageView.setImageResource(itemsModelListFiltered3.get(position).getImage());
            textView.setText(itemsModelListFiltered3.get(position).getName());

            return view3;
        }



    }

    public class CustomAdapter4 extends BaseAdapter
    {

        private List<ItemsModel4> itemsModelList4;
        private List<ItemsModel4> itemsModelListFiltered4;
        private Context context4;

        public CustomAdapter4(List<ItemsModel4> itemsModelList4, Context context4) {
            this.itemsModelList4 = itemsModelList4;
            this.itemsModelListFiltered4 = itemsModelList4;
            this.context4 = context4;
        }

        @Override
        public int getCount() {
            return itemsModelListFiltered4.size();
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

            View view4 = getLayoutInflater().inflate(R.layout.row_items_4, null);

            ImageView imageView = view4.findViewById(R.id.g4_imageView);
            TextView textView = view4.findViewById(R.id.g4_tvName);

            imageView.setImageResource(itemsModelListFiltered4.get(position).getImage());
            textView.setText(itemsModelListFiltered4.get(position).getName());

            return view4;
        }



    }
    private void gotoUrl(String s) {
        Uri uri = Uri.parse(s);
        startActivity(new Intent(Intent.ACTION_VIEW,uri));
        
    }

    private void OnBackPress() {
        Intent intent = new Intent(this, Home.class);
        startActivity(intent);
    }
}