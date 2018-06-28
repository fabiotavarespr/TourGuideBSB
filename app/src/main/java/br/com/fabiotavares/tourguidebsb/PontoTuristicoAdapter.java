package br.com.fabiotavares.tourguidebsb;

import android.content.Context;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.fabiotavares.tourguidebsb.domino.PontoTuristico;

public class PontoTuristicoAdapter extends ArrayAdapter<PontoTuristico> {

    /**
     * Create a new {@link PontoTuristicoAdapter} object.
     *
     * @param context is the current context (i.e. Activity) that the adapter is being created in.
     * @param pontos is the list of {@link PontoTuristico}s to be displayed.
     */
    public PontoTuristicoAdapter(Context context, ArrayList<PontoTuristico> pontos) {
        super(context, 0, pontos);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if an existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Word} object located at this position in the list
        PontoTuristico pontoTuristico = getItem(position);

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView tituloView = (TextView) listItemView.findViewById(R.id.titulo);
        tituloView.setText(pontoTuristico.getNomePontoTuristicoId());


        // Find the ImageView in the list_item.xml layout with the ID image.
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(pontoTuristico.getImagemPontoTuristicoId());

        // Find the TextView in the list_item.xml layout with the ID miwok_text_view.
        TextView descricaoView = (TextView) listItemView.findViewById(R.id.descricao);
        descricaoView.setText(pontoTuristico.getDescricaoPontoTuristicoId());


        return listItemView;
    }
}
