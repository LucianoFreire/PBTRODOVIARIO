package com.example.patipan.traininglistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;


public class ListAdapter extends BaseAdapter {
    Context context;
    //Veiculos veic = new Veiculos();
    Veiculos veiculos;

    ListAdapter(Context context, Veiculos veiculos) {
        this.context = context;
        this.veiculos = veiculos;
    }

    @Override
    public int getCount() {
        if (veiculos == null)
            return 0;
        if (veiculos.getVeic() == null)
            return 0;

        return veiculos.getVeic().size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;

        LayoutInflater mInflater =
                (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = mInflater.inflate(R.layout.list_item, parent, false);
//        if(convertView != null){
//            view = convertView;
//        }else {
//            view = mInflater.inflate(R.layout.list_item, parent, false);
//        }

        TextView textView = (TextView) view.findViewById(R.id.title);
        ImageView imageView = (ImageView) view.findViewById(R.id.image);
        TextView textDesc = (TextView) view.findViewById(R.id.desc);


        if (veiculos != null && veiculos.getVeic() != null) {
            textView.setText(veiculos.getVeic().get(position).getModelo());
            imageView.setImageResource(veiculos.getVeic().get(position).getResId());
            textDesc.setText(veiculos.getVeic().get(position).getDescricao());
        }


//        if (convertView != null)
//            view = convertView;
        return view;


    }
}
