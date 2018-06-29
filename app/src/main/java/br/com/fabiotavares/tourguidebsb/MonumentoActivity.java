package br.com.fabiotavares.tourguidebsb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.fabiotavares.tourguidebsb.domino.PontoTuristico;

public class MonumentoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        /**
         * Menu de Navegação
         */
        ImageView principal = (ImageView) findViewById(R.id.menu_brasilia);
        principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent principalIntent = new Intent(MonumentoActivity.this, PrincipalActivity.class);
                startActivity(principalIntent);
            }
        });

        ImageView monumento = (ImageView) findViewById(R.id.menu_monumentos);
        monumento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monumentoIntent = new Intent(MonumentoActivity.this, MonumentoActivity.class);
                startActivity(monumentoIntent);
            }
        });

        ImageView natureza = (ImageView) findViewById(R.id.menu_natureza);
        natureza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent naturezaIntent = new Intent(MonumentoActivity.this, NaturezaActivity.class);
                startActivity(naturezaIntent);
            }
        });

        ImageView restaurante = (ImageView) findViewById(R.id.menu_restaurantes);
        restaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restauranteIntent = new Intent(MonumentoActivity.this, RestauranteActivity.class);
                startActivity(restauranteIntent);
            }
        });

        /**
         * Preenchendo a lista com os pontos turisticos de Brasilia
         */
        ArrayList<PontoTuristico> pontosTuristicos = new ArrayList<PontoTuristico>();

        pontosTuristicos.add(new PontoTuristico(R.string.titulo_monumento_cadetral, R.string.descricao_monumento_cadetral, R.drawable.cadetral));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_monumento_congresso, R.string.descricao_monumento_congresso, R.drawable.congresso_nacional));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_monumento_memorialJK, R.string.descricao_monumento_memorialJK, R.drawable.memorial_jk));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_monumento_museu_nacional, R.string.descricao_monumento_museu_nacional, R.drawable.museu_nacional));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_monumento_palacio_alvorada, R.string.descricao_monumento_palacio_alvorada, R.drawable.palacio_alvorada));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_monumento_palacio_planalto, R.string.descricao_monumento_palacio_planalto, R.drawable.palacio_planalto));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_monumento_palacio_itamaraty, R.string.descricao_monumento_palacio_itamaraty, R.drawable.palacio_itamaraty));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_monumento_stf, R.string.descricao_monumento_stf, R.drawable.stf));

        PontoTuristicoAdapter adapter = new PontoTuristicoAdapter(this, pontosTuristicos);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
