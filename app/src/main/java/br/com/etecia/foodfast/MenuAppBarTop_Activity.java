package br.com.etecia.foodfast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.appbar.MaterialToolbar;

public class MenuAppBarTop_Activity extends AppCompatActivity {
//declarando a variavel global do onjetos da ToolBar

    MaterialToolbar idToolBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_app_bar_top_layout);

        idToolBar = findViewById(R.id.idToolbar);

        idToolBar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Cliquei UAUUU",
                        Toast.LENGTH_SHORT).show();
            }
        });
        idToolBar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {


                switch (item.getItemId()) {
                    case R.id.mFavorite:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no favorito",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mSearch:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no buscar",
                                Toast.LENGTH_SHORT).show();
                        break;
                    case R.id.mMore:
                        Toast.makeText(getApplicationContext(),
                                "Cliquei no mais",
                                Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;

            }
        });
    }
}