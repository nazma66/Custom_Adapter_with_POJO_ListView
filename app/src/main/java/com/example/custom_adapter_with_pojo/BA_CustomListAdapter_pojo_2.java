package com.example.custom_adapter_with_pojo;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class BA_CustomListAdapter_pojo_2 extends BaseAdapter {

 private Context context;
 private ArrayList<Item> items;
 public BA_CustomListAdapter_pojo_2(Context context, ArrayList<Item> items) {
  this.context = context;
  this.items = items;

 }



 @Override
 public int getCount() {
  return items.size();
 }

 @Override
 public Object getItem(int position) {
  return items.get(position);
 }

 @Override
 public long getItemId(int position) {
  return position;
 }

 @Override
 public View getView(int position, View convertView, ViewGroup parent) {
  VHolder vh;
  if (convertView == null) {


   convertView = LayoutInflater.from(context).inflate(R.layout.main_layout_02, parent, false);
   vh = new VHolder(convertView);
   convertView.setTag(vh);
  } else {
   vh = (VHolder) convertView.getTag();
  }
//  Item currentItem;

  Item currentItem = (Item) getItem(position);
  vh.itemName.setText(currentItem.getItemName());
  vh.itemDescription.setText(currentItem.getItemDescription());
  vh.itemDate.setText(currentItem.getItemDate());


  vh.itemPrice.setText(String.valueOf(currentItem.getItemPrice()));
  vh.itemDouble.setText(String.valueOf(currentItem.getItemDouble()));

  return convertView;

 }

 private class VHolder {
  TextView itemName;
  TextView itemDescription;
  TextView itemDate, itemDouble,itemPrice;


  public VHolder(View view) {
   itemName = (TextView) view.findViewById(R.id.textView1);
   itemDescription = (TextView) view.findViewById(R.id.textView2);
   itemDate = (TextView) view.findViewById(R.id.textView3);
   itemPrice = (TextView) view.findViewById(R.id.textView);
   itemDouble = (TextView) view.findViewById(R.id.textView4);

  }
 }
}
