package devdreamers.dev.headerandfooterrv;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<ItemPojo> mList = new ArrayList<>();
        String [] mNames = {"Jose", "Luis" ,"Pablo" ,"Gerardo","Karla","Lulu"};
        Random n = new Random(5);
        for (String m : mNames){
            ItemPojo item = new ItemPojo(mNames[n.nextInt(5)]);
            mList.add(item);
        }

        mRecyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        mRecyclerView.setLayoutManager(llm);
        mRecyclerView.setHasFixedSize(true);
        adapter = new HeaderFooterAdapter(getApplicationContext(),mList);
        mRecyclerView.setAdapter(adapter);



    }
}
