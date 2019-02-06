package edu.itsur.ciclovida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {
    private static final String DEPURAR_CV = "CICLO DE VIDA";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Se ejecuta cuando el sistema crea una nueva
        // instancia en memoria de la activity

        Log.d(DEPURAR_CV, "Inicio onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        // Se ejecuta luego de onCreate(), justo cuando se va
        // a mostar al usuario la activity.
        Log.d(DEPURAR_CV, "Inicio onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Se ejecuta antes de que la activity se ponga en marcha
        // antes de que se muestre al usuario
        Log.d(DEPURAR_CV, "Inico onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Se ejecuta antes del onStop cuando esta a punto de de colocar la
        // activity en segundo plano(background)
        Log.d(DEPURAR_CV, "Inicio onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Se ejecuta cuando la activity no es visible por un largo periodo.
        Log.d(DEPURAR_CV, "Inicio onStop");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        // Se ejecuta solo cuando la activity se ha puesto en estado de detenida,
        // se ejecuta antes de onStart y luego de onStop.
        Log.d(DEPURAR_CV, "Inicio onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Se ejecuta antes de que la activity sea destruida.
        Log.d(DEPURAR_CV, "Inicio onDestroy");
    }










}
