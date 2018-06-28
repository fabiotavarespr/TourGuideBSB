package br.com.fabiotavares.tourguidebsb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.fabiotavares.tourguidebsb.domino.PontoTuristico;

public class RestauranteActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        ImageView principal = (ImageView) findViewById(R.id.menu_brasilia);
        principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent principalIntent = new Intent(RestauranteActivity.this, PrincipalActivity.class);
                startActivity(principalIntent);
            }
        });

        ImageView monumento = (ImageView) findViewById(R.id.menu_monumentos);
        monumento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monumentoIntent = new Intent(RestauranteActivity.this, MonumentoActivity.class);
                startActivity(monumentoIntent);
            }
        });

        ImageView natureza = (ImageView) findViewById(R.id.menu_natureza);
        natureza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent naturezaIntent = new Intent(RestauranteActivity.this, NaturezaActivity.class);
                startActivity(naturezaIntent);
            }
        });

        ImageView restaurante = (ImageView) findViewById(R.id.menu_restaurantes);
        restaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restauranteIntent = new Intent(RestauranteActivity.this, RestauranteActivity.class);
                startActivity(restauranteIntent);
            }
        });

        ArrayList<PontoTuristico> pontosTuristicos = new ArrayList<PontoTuristico>();

        pontosTuristicos.add(new PontoTuristico(R.string.titulo_restaurante_dom_bosco, R.string.descricao_restaurante_dom_bosco, R.drawable.resturante_dom_bosco));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_restaurante_beirute, R.string.descricao_restaurante_beirute, R.drawable.resturante_beirute));

        PontoTuristicoAdapter adapter = new PontoTuristicoAdapter(this, pontosTuristicos);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
