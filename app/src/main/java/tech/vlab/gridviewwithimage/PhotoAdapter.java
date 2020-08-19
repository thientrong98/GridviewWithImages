package tech.vlab.gridviewwithimage;

import android.content.Context;
import android.provider.ContactsContract;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

public class PhotoAdapter extends BaseAdapter {
    private Context context;
    private int layout;
    private List<PhoTo> photoList;

    public PhotoAdapter(Context context, int layout, List<PhoTo> photoList){
        this.context = context;
        this.layout = layout;
        this.photoList = photoList;
    }


    @Override
    public int getCount() {
        return photoList.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    private class ViewHolder{
        ImageView imageView;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
//        Log.d("hehe 1233:", String.valueOf(position));
        ViewHolder holder;
        if(convertView == null){
            holder = new ViewHolder();
            LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(layout, null);
            holder.imageView = (ImageView) convertView.findViewById(R.id.img);
            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        PhoTo photo = photoList.get(position);

        holder.imageView.setImageResource(photo.getPhoto());
//        holder.imageView.setImageResource(R.drawable.a);

//        Log.d("hehe", String.valueOf(convertView));
        return convertView;
    }
}
