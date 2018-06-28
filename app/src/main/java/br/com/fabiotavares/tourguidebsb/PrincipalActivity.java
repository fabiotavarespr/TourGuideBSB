package br.com.fabiotavares.tourguidebsb;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.fabiotavares.tourguidebsb.domino.PontoTuristico;

public class PrincipalActivity extends AppCompatActivity {

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
                Intent principalIntent = new Intent(PrincipalActivity.this, PrincipalActivity.class);
                startActivity(principalIntent);
            }
        });

        ImageView monumento = (ImageView) findViewById(R.id.menu_monumentos);
        monumento.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent monumentoIntent = new Intent(PrincipalActivity.this, MonumentoActivity.class);
                startActivity(monumentoIntent);
            }
        });

        ImageView natureza = (ImageView) findViewById(R.id.menu_natureza);
        natureza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent naturezaIntent = new Intent(PrincipalActivity.this, NaturezaActivity.class);
                startActivity(naturezaIntent);
            }
        });

        ImageView restaurante = (ImageView) findViewById(R.id.menu_restaurantes);
        restaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restauranteIntent = new Intent(PrincipalActivity.this, RestauranteActivity.class);
                startActivity(restauranteIntent);
            }
        });

        /**
         * Preenchendo a lista com os pontos turisticos de Brasilia
         */
        ArrayList<PontoTuristico> pontosTuristicos = new ArrayList<PontoTuristico>();

        pontosTuristicos.add(new PontoTuristico(R.string.titulo_principal_brasilia, R.string.descricao_principal_brasilia, R.drawable.tracos));

        PontoTuristicoAdapter adapter = new PontoTuristicoAdapter(this, pontosTuristicos);
        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(adapter);
    }
}
