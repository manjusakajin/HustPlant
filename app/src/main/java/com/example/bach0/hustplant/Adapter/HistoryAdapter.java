package com.example.bach0.hustplant.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.bach0.hustplant.HistoryActivity;
import com.example.bach0.hustplant.Model.History;
import com.example.bach0.hustplant.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sakur on 4/11/2018.
 */

public class HistoryAdapter extends RecyclerView.Adapter<HistoryAdapter.HistoryHolder> {
    private Context mContext;
    private List<History> list;

    public HistoryAdapter(Context mContext) {
        this.mContext = mContext;
        list = new ArrayList<History>();
        List<String> list1 = new ArrayList<String>();
        list1.add("Water at Road 1");
        History history1 = new History("29 Mar 2018","Nhà hiệu bộ","Oak at Road 1",500,list1);
        History history2 = new History("30 Mar 2018","Cổng trường","Oak at Road 2",400,list1);
        list.add(history1);
        list.add(history2);
    }

    @Override
    public HistoryHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item_history, parent, false);
        return new HistoryHolder(view);
    }

    @Override
    public void onBindViewHolder(HistoryHolder holder, int position) {
        History item = list.get(position);
       holder.begin.setText(item.getBegin());
       holder.end.setText(item.getEnd());
       holder.time.setText(item.getTime());
       holder.total.setText("Total Routes : "+item.getTotalRoute()+" m");
    }

    @Override
    public int getItemCount() {
        return list == null ? 0 : list.size();
    }

    public void setOnItemClick(HistoryActivity historyActivity) {
    }


    class HistoryHolder extends RecyclerView.ViewHolder {
        TextView begin,end;
        TextView total,time;

        public HistoryHolder(View itemView) {
            super(itemView);
            time = (TextView)itemView.findViewById(R.id.time);
            begin = (TextView)itemView.findViewById(R.id.begin);
            end = (TextView)itemView.findViewById(R.id.end);
            total = (TextView)itemView.findViewById(R.id.totalRoutes);

        }
    }
}
