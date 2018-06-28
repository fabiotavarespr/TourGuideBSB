package br.com.fabiotavares.tourguidebsb;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.ListView;

import java.util.ArrayList;

import br.com.fabiotavares.tourguidebsb.domino.PontoTuristico;

public class NaturezaActivity extends AppCompatActivity {

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
                Intent principalIntent = new Intent(NaturezaActivity.this, PrincipalActivity.class);
                startActivity(principalIntent);
            }
        });

        ImageView monumento = (ImageView) findViewById(R.id.menu_monumentos);
        monumento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monumentoIntent = new Intent(NaturezaActivity.this, MonumentoActivity.class);
                startActivity(monumentoIntent);
            }
        });

        ImageView natureza = (ImageView) findViewById(R.id.menu_natureza);
        natureza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent naturezaIntent = new Intent(NaturezaActivity.this, NaturezaActivity.class);
                startActivity(naturezaIntent);
            }
        });

        ImageView restaurante = (ImageView) findViewById(R.id.menu_restaurantes);
        restaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restauranteIntent = new Intent(NaturezaActivity.this, RestauranteActivity.class);
                startActivity(restauranteIntent);
            }
        });

        /**
         * Preenchendo a lista com os pontos turisticos de Brasilia
         */
        ArrayList<PontoTuristico> pontosTuristicos = new ArrayList<PontoTuristico>();

        pontosTuristicos.add(new PontoTuristico(R.string.titulo_natureza_lago_paranoa, R.string.descricao_natureza_lago_paranoa, R.drawable.lago_paranoa));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_natureza_parque_cidade, R.string.descricao_natureza_parque_cidade, R.drawable.parque_cidade));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_natureza_estadio_nacional, R.string.descricao_natureza_estadio_nacional, R.drawable.estadio_nacional));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_natureza_ermida_dom_bosco, R.string.descricao_natureza_ermida_dom_bosco, R.drawable.ermida_dom_bosco));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_natureza_jardim_botanico, R.string.descricao_natureza_jardim_botanico, R.drawable.parque_cidade));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_natureza_agua_mineral, R.string.descricao_natureza_agua_mineral, R.drawable.parque_agua_mineral));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_natureza_ponte_jk, R.string.descricao_natureza_ponte_jk, R.drawable.ponte_jk));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_natureza_torre_televisao, R.string.descricao_natureza_torre_televisao, R.drawable.torre_televisao));
        pontosTuristicos.add(new PontoTuristico(R.string.titulo_natureza_torre_tv_digital, R.string.descricao_natureza_torre_tv_digital, R.drawable.torre_digital));

        PontoTuristicoAdapter adapter = new PontoTuristicoAdapter(this, pontosTuristicos);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
