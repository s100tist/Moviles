package com.example.moviles;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class editarInformacionPersonal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_editar_informacion_personal);
        String message = "Heriberto";
        TextView textView = findViewById(R.id.editarTextoNombre);
        textView.setText(message);
    }



    public void actualizarInformacionPersonal(View view) {
        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(editarInformacionPersonal.this);

        myAlertBuilder.setTitle("Actualizar Información");
        myAlertBuilder.setMessage("Presiona 'ACEPTAR' para actualizar la información:");

        myAlertBuilder.setPositiveButton("Aceptar", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked the OK button.
                        Toast.makeText(getApplicationContext(), "Actualizacion realizada",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        myAlertBuilder.setNegativeButton("Cancelar", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User cancelled the dialog.
                        Toast.makeText(getApplicationContext(), "Canceló la actualización.",
                                Toast.LENGTH_SHORT).show();
                    }
                });

        myAlertBuilder.show();

    }

    public void eliminarCuenta(View view) {

        AlertDialog.Builder myAlertBuilder = new
                AlertDialog.Builder(editarInformacionPersonal.this);

        myAlertBuilder.setTitle("Eliminar Cuenta");
        myAlertBuilder.setMessage("Presiona 'SI' para eliminar la cuenta:");

        myAlertBuilder.setPositiveButton("No", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked the OK button.
                        Toast.makeText(getApplicationContext(), "Canceló la eliminación.",
                                Toast.LENGTH_SHORT).show();
                    }
                });
        myAlertBuilder.setNegativeButton("Si", new
                DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User cancelled the dialog.
                        Toast.makeText(getApplicationContext(), "La cuenta fue eliminada.",
                                Toast.LENGTH_SHORT).show();
                    }
                });

        myAlertBuilder.show();
    }
}