package com.omkabel1995.al_quran.Adapter;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.omkabel1995.al_quran.Menu.Menu_Utama;
import com.omkabel1995.al_quran.Model.Model_Surat;
import com.omkabel1995.al_quran.R;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class Adapter_Surat  extends RecyclerView.Adapter<Adapter_Surat.MyViewHolder> {
    Context context;
    List<Model_Surat> menu;
    public Adapter_Surat  (Context context, List<Model_Surat> data_menu) {
        this.context = context;
        this.menu= data_menu;
    }
    @Override
    public Adapter_Surat .MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.list_surat, parent, false);
        Adapter_Surat .MyViewHolder holder = new Adapter_Surat .MyViewHolder(view);
        return holder;
    }
    @Override
    public void onBindViewHolder(Adapter_Surat .MyViewHolder holder, final int position) {
     holder.Asma.setText(menu.get(position).getAsma());
     holder.Arti_Surat.setText(menu.get(position).getArti());
     holder.Jumlah_Ayat.setText(menu.get(position).getAyat());
     holder.Keterangan.setText(Html.fromHtml(menu.get(position).getKeterangan()));
     holder.Keterangan.setVisibility(View.GONE);
     holder.Nomor.setText(menu.get(position).getNomor());
     holder.Nama.setText(menu.get(position).getNama());


     holder.Detail.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             String data= String.valueOf(Html.fromHtml(menu.get(position).getKeterangan()));
             showdialog(data);
         }
     });
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//
//                Intent varIntent = new Intent(context, Dashboard.class);
//                varIntent.putExtra("SN", menu.get(position).getSn());
//                SharedPrefManager sharedPrefManager=new SharedPrefManager(context);
//                sharedPrefManager.saveSPString(SharedPrefManager.SP_Mac, menu.get(position).getSn());
////                varIntent.putExtra("NAMA", menu.get(position).getNama());
////                varIntent.putExtra("HARGA", menu.get(position).getHarga());
////                varIntent.putExtra("DESKRIPSI", menu.get(position).getDeskripsi());
////                varIntent.putExtra("GAMBAR_MENU", urlGambar);
////                varIntent.putExtra("GAMBAR", menu.get(position).getFoto());
//                context.startActivity(varIntent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return menu.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        @BindView(R.id.Asma)
        TextView Asma;
        @BindView(R.id.Arti_Surat)
        TextView Arti_Surat;
        @BindView(R.id.Nomor)
        TextView Nomor;
        @BindView(R.id.Nama)
        TextView Nama;
        @BindView(R.id.Ayat)
        TextView Jumlah_Ayat;
        @BindView(R.id.Keterangan)
        TextView Keterangan;
        @BindView(R.id.Baca)
        Button Baca;
        @BindView(R.id.DetailKeterangan)
        Button Detail;
        public MyViewHolder(View itemView) {
            super(itemView);
            ButterKnife.bind(this, itemView);
        }
    }
    public void showdialog( String data){
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle("Asbābun Nuzūl اسباب النزول");
        builder.setMessage(data);
        builder.setCancelable(true);
        builder.setPositiveButton("Tutup", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
//                Menu_Login.super.onBackPressed();
            }
        });
        builder.setNegativeButton("", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
//                Toast.makeText(context,"Terima Kasih",Toast.LENGTH_LONG).show();
            }
        });
        AlertDialog dialog = builder.create();
        dialog.show();
    }
}


