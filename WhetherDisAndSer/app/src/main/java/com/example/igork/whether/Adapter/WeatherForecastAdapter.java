package com.example.igork.whether.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.igork.whether.Common.Common;
import com.example.igork.whether.Model.WeatherForecastResult;
import com.example.igork.whether.R;
import com.squareup.picasso.Picasso;

public class WeatherForecastAdapter extends RecyclerView.Adapter<WeatherForecastAdapter.MyViewHold> {

    Context context;
    WeatherForecastResult weatherForecastResult;

    public WeatherForecastAdapter(Context context, WeatherForecastResult weatherForecastResult){
        this.context = context;
        this.weatherForecastResult = weatherForecastResult;

    }


    @NonNull
    @Override
    public MyViewHold onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(context).inflate(R.layout.item_forecast,parent, false);
        return new MyViewHold(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHold holder, int position) {
        //загрузка иконок

        Picasso.get().load(new StringBuilder("https://openweathermap.org/img/w/")
                .append(weatherForecastResult.list.get(position).weather.get(0).getIcon())
                .append(".png").toString()).into(holder.img_weather);

        holder.txt_date_time.setText(new StringBuilder(Common.convertUnixToDate(weatherForecastResult
        .list.get(position).dt)));

        holder.txt_description.setText(new StringBuilder(weatherForecastResult.list.get(position)
        .weather.get(0).getDescription()));

        double output = (weatherForecastResult.list.get(position)
                .main.getTemp());
        output = Math.round(output * 100.0) / 100.0;
        holder.txt_temperature.setText(new StringBuilder(
                String.valueOf(output)).append("°C").toString());

       // holder.txt_temperature.setText(new StringBuilder(
       //         String.valueOf(weatherForecastResult.list.get(position)
       //         .main.getTemp())).append("°C"));

    }

    @Override
    public int getItemCount() {
        return weatherForecastResult.list.size();
    }

    public class MyViewHold extends RecyclerView.ViewHolder{
        TextView txt_date_time,txt_description,txt_temperature;
        ImageView img_weather;
        public MyViewHold(View itemView) {
            super(itemView);

            img_weather = (ImageView)itemView.findViewById(R.id.img_weather);
            txt_date_time = (TextView)itemView.findViewById(R.id.txt_date);
            txt_description = (TextView)itemView.findViewById(R.id.txt_description);
            txt_temperature = (TextView)itemView.findViewById(R.id.txt_temperature);

        }
    }
}
