package br.com.etecia.foodfast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //inserindo barra de app
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);

    }
    //Criando um método para aplicar itens de menu


    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mFav:
                Toast.makeText(getApplicationContext(),
                        "Clique no favorito", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mBuscar:
                Toast.makeText(getApplicationContext(),
                        "Clique no buscar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mConfig:
                Toast.makeText(getApplicationContext(),
                        "Clique no configurações", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mHist:
                Toast.makeText(getApplicationContext(),
                        "Clique no histórico", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mSobre:
                Toast.makeText(getApplicationContext(),
                        "Clique no sobre", Toast.LENGTH_SHORT).show();
                break;
            case R.id.mShare:
                Toast.makeText(getApplicationContext(),
                        "Clique no Share", Toast.LENGTH_SHORT).show();
                break;

        }
        return super.onOptionsItemSelected(item);
    }

}