package com.education.online.fragment.dialog;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import com.education.online.R;
import com.education.online.bean.CategoryBean;
import com.education.online.fragment.BaseFragment;
import com.education.online.inter.DialogCallback;
import com.education.online.util.ImageUtil;

import java.util.ArrayList;

/**
 * Created by Administrator on 2016/8/19.
 */
public class SelectorOrder extends BaseFragment {

    private ImageView pressView=null;
    private int pressPos=0;
    private String[] names;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.selector_byorder,container,false);
        names=getArguments().getStringArray("Names");
        initView(view);

        return view;
    }

    private void initView(View v) {
        LayoutInflater inflater=LayoutInflater.from(getActivity());
        LinearLayout layout= (LinearLayout) v;
        LinearLayout.LayoutParams llp=new LinearLayout.LayoutParams(-1, ImageUtil.dip2px(getActivity(), 50));
        for(int i=0;i<names.length;i++){
            final int j=i;
            View item=inflater.inflate(R.layout.selector_by_order_item, null);
            TextView nameTxt= (TextView) item.findViewById(R.id.nameTxt);
            if(names[i].length()>0) {
                nameTxt.setText(names[i]);
                final ImageView img = (ImageView) item.findViewById(R.id.checkIcon);
                if (i == pressPos) {
                    pressView = img;
                    img.setImageResource(R.mipmap.icon_round_right);
                }
                item.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        pressPos = j;
                        pressView.setImageResource(R.mipmap.icon_round);
                        img.setImageResource(R.mipmap.icon_round_right);
                        pressView = img;
                        ((DialogCallback) getActivity()).closeDialog();
                        ((DialogCallback) getActivity()).onSelected(pressPos);
                    }
                });
            }else
                item.setVisibility(View.INVISIBLE);
            layout.addView(item, llp);
        }
    }
}
