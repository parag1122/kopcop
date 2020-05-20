package com.example.afinal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.here.sdk.core.GeoCoordinates;
import com.here.sdk.mapview.MapError;
import com.here.sdk.mapview.MapScene;
import com.here.sdk.mapview.MapScheme;
import com.here.sdk.mapview.MapView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private MapView mapView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            // Get a MapView instance from the layout.
            mapView = findViewById(R.id.map_view);
            mapView.onCreate(savedInstanceState);

            loadMapScene();


    }

    private void loadMapScene() {
        // Load a scene from the HERE SDK to render the map with a map scheme.
        mapView.getMapScene().loadScene(MapScheme.NORMAL_DAY, new MapScene.LoadSceneCallback() {
            @Override
            public void onLoadScene(@Nullable MapError mapError) {
                if (mapError == null) {
                    double distanceInMeters = 1000 * 10;
                    mapView.getCamera().lookAt(
                            new GeoCoordinates(17.2777, 74.1844), distanceInMeters);
                } else {
                   // Log.d(TAG, "Loading map failed: mapError: " + mapError.name());
                }
            }
        });
    }
    @Override
    protected void onPause() {
        super.onPause();
        mapView.onPause();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mapView.onResume();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mapView.onDestroy();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater=getMenuInflater();
        inflater.inflate(R.menu.eg_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
           // case R.id.qrscan:
               // Toast.makeText(this,"qr selected",Toast.LENGTH_SHORT);
               // Intent intent=new Intent(getApplicationContext(), Splash_Screen.class);
             //   startActivity(intent);
            case R.id.qrscan:
                Intent intent3=new Intent(getApplicationContext(), QRScanner.class);
                startActivity(intent3);
                break;
                //Toast.makeText(this,"Feedback selected",Toast.LENGTH_SHORT);

            case R.id.contact:
                Intent intent=new Intent(getApplicationContext(), ContactUs.class);
                startActivity(intent);
                break;
            case R.id.fedback:
                Intent intent1=new Intent(getApplicationContext(), feedbackStore.class);
                startActivity(intent1);
                break;
            case R.id.logout:
               Toast.makeText(this,"User Logged out",Toast.LENGTH_SHORT);
                Intent intent2=new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(intent2);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
