package com.gudong.appkit.adapter;

import android.support.v7.widget.RecyclerView;
import java.util.List;

public abstract class BaseAppAdapter<VH extends RecyclerView.ViewHolder> extends RecyclerView.Adapter<VH> {
    protected List<AppEntity> mListData;

    public BaseAppAdapter(List<AppEntity> listData) {
        this.mListData = listData;
    }

    public void clear() {
        notifyItemRangeRemoved(0, mListData.size());
        this.mListData.clear();
    }

    public void addItem(int position, AppEntity entity) {
        this.mListData.add(position, entity);
        notifyItemInserted(position);
    }

    public void removeItem(AppEntity entity) {
        int position = mListData.indexOf(entity);
        if (position >= 0) {
            this.mListData.remove(position);
            notifyItemRemoved(position);
        }
    }

    @Override
    public int getItemCount() {
        return mListData.size();
    }
}


