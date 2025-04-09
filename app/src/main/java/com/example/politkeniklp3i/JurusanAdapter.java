package com.example.politkeniklp3i;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class JurusanAdapter extends RecyclerView.Adapter<JurusanAdapter.JurusanViewHolder> {

    private List<JurusanModel> jurusanList;
    private Context context;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onItemClick(JurusanModel jurusan);
    }

    public JurusanAdapter(Context context, List<JurusanModel> jurusanList, OnItemClickListener listener) {
        this.context = context;
        this.jurusanList = jurusanList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public JurusanViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.itemjurusan, parent, false);
        return new JurusanViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull JurusanViewHolder holder, int position) {
        JurusanModel jurusan = jurusanList.get(position);
        holder.bind(jurusan, listener);
    }

    @Override
    public int getItemCount() {
        return jurusanList.size();
    }

    public static class JurusanViewHolder extends RecyclerView.ViewHolder {
        private ImageButton btnJurusan;
        private TextView txtJurusan;

        public JurusanViewHolder(@NonNull View itemView) {
            super(itemView);
            btnJurusan = itemView.findViewById(R.id.btn_jurusan);
            txtJurusan = itemView.findViewById(R.id.txt_jurusan);
        }

        public void bind(final JurusanModel jurusan, final OnItemClickListener listener) {
            btnJurusan.setImageResource(jurusan.getImageResId());
            txtJurusan.setText(jurusan.getNamaJurusan());

            btnJurusan.setOnClickListener(v -> listener.onItemClick(jurusan));
        }
    }
}
