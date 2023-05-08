package com.example.moviles;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AlertDialog;
import androidx.core.app.ActivityCompat;
import androidx.fragment.app.FragmentActivity;

import com.example.moviles.databinding.ActivityMapsBinding;
import com.example.moviles.models.Usuario;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.firestore.DocumentSnapshot;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.firestore.Query;
import com.google.firebase.firestore.QuerySnapshot;

import org.w3c.dom.Text;

import java.util.HashMap;
import java.util.Map;

public class MapsActivity extends FragmentActivity implements OnMapReadyCallback {

    private GoogleMap mMap;
    Dialog dialog;

    private Marker mMarker;
    private Usuario usuario;
    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FloatingActionButton fabPanico = findViewById(R.id.fabPanico);
        com.example.moviles.databinding.ActivityMapsBinding binding = ActivityMapsBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        SupportMapFragment mapFragment = (SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
    }

    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;


        // Add a marker in Sydney and move the camera
        //LatLng sydney = new LatLng(-34, 151);
        //mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        //Comentar el mover camara para probar
        //mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

        if (ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(this, android.Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
            return;
        }
        mMap.setMyLocationEnabled(true);
        mMap.getUiSettings().setMyLocationButtonEnabled(false);
        mMap.getUiSettings().setAllGesturesEnabled(false);

        LocationManager locationManager = (LocationManager) MapsActivity.this.getSystemService(Context.LOCATION_SERVICE);
        LocationListener locationListener = new LocationListener() {

            @Override
            public void onLocationChanged(Location location) {
                mMap.getUiSettings().setRotateGesturesEnabled(true);
                LatLng miUbicacion = new LatLng(location.getLatitude(), location.getLongitude());
                db.collection("Usuarios").get()
                        .addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                            @Override
                            public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                                for (DocumentSnapshot documentSnapshot : queryDocumentSnapshots) {
                                    Map<String, Object> data = documentSnapshot.getData();
                                    if (data.containsKey("ubicacion")) {
                                        Map<String, Double> ubicacion = (Map<String, Double>) data.get("ubicacion");
                                        double latitud = ubicacion.get("lat");
                                        double longitud = ubicacion.get("lon");
                                        LatLng latLng = new LatLng(latitud, longitud);
                                        if (mMarker == null) {
                                            mMarker = mMap.addMarker(new MarkerOptions().position(latLng));
                                        } else {
                                            mMarker.setPosition(latLng);
                                        }
                                    }
                                }
                            }
                        });
                mMap.moveCamera(CameraUpdateFactory.newLatLng(miUbicacion));
                CameraPosition cameraPosition = new CameraPosition.Builder()
                        .target(miUbicacion)
                        .zoom(18)
                        .bearing(90)
                        .tilt(60)
                        .build();
                mMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));
                Map<String, Object> ubicacion = new HashMap<>();
                ubicacion.put("lat", location.getLatitude());
                ubicacion.put("lon", location.getLongitude());
                Map<String, Object> ubicacionEmergencia = new HashMap<>();
                usuario = new Usuario("JJF", "correo@gmail.com","contrasena", ubicacion, ubicacionEmergencia );
                Query query = db.collection("Usuarios").whereEqualTo("correoUsuario", usuario.getCorreoUsuario());
                query.get().addOnSuccessListener(new OnSuccessListener<QuerySnapshot>() {
                    @Override
                    public void onSuccess(QuerySnapshot queryDocumentSnapshots) {
                        if (!queryDocumentSnapshots.isEmpty()) {
                            DocumentSnapshot documentSnapshot = queryDocumentSnapshots.getDocuments().get(0);
                            Map<String, Object> updates = new HashMap<>();
                            Map<String, Object> ubicacion = new HashMap<>();
                            ubicacion.put("lat", location.getLatitude());
                            ubicacion.put("lon", location.getLongitude());
                            updates.put("ubicacion", ubicacion);
                            documentSnapshot.getReference().update(updates);
                        }
                    }
                });
            }
        };
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 0, 0, locationListener);

    }






    public void editarPersona(View view) {

        Intent intent = new Intent(this, editarInformacionPersonal.class);
        startActivity(intent);
    }

    public void onClickShowAlert(View view) {
        dialog = new Dialog(MapsActivity.this);
        dialog.setContentView(R.layout.custom_dialog_panico);
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP){
            dialog.getWindow().setBackgroundDrawable(getDrawable(R.drawable.background));
        }
        dialog.getWindow().setLayout(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        dialog.setCancelable(true);
        dialog.getWindow().getAttributes().windowAnimations = R.style.animation;

        Button okPanico = dialog.findViewById(R.id.btn_okey);
        Button cancelarPanico = dialog.findViewById(R.id.btn_cancel);

        okPanico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Manda a guardar a la base de datos
                dialog.dismiss();
            }
        });

        cancelarPanico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog.dismiss();
            }
        });

        dialog.show();
    }
}