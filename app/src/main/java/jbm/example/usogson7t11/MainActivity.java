package jbm.example.usogson7t11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {

    EditText txtnombre, txtedad, txtcorreo, txtCURD;
    TextView lbljson;

    @Override
    protected void onCreate ( Bundle savedInstanceState ) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );
        txtnombre = findViewById ( R.id.txtnombre );
        txtcorreo = findViewById ( R.id.txtcorreo );
        txtedad = findViewById ( R.id.txtedad );
        txtCURD = findViewById ( R.id.txtcurd );

        lbljson = findViewById ( R.id.lbljson );
    }
    public void btncargamos( View view ){
        Datos datosbj = new Datos (txtnombre.getText().toString (), Integer.parseInt (txtedad.getText ().toString ()),txtcorreo.getText ().toString (),txtCURD.getText ().toString ());
        Gson gson = new Gson ();
        String cJson = gson.toJson ( datosbj );
        Datos datosobj1 = gson.fromJson(cJson,Datos.class);
        Log.i("Informacion Json -->","nombre"+ datosobj1.getNombre()+", Edad "+datosobj1.getEdad()+", Correo "+datosobj1.getCorreo()+", Curp "+datosobj1.getCurp());

    }
}
