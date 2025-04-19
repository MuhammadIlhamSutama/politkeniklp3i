    package com.example.uts;


    import android.os.Bundle;
    import android.view.View;
    import android.content.Intent;

    import androidx.activity.EdgeToEdge;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.core.graphics.Insets;
    import androidx.core.view.ViewCompat;
    import androidx.core.view.WindowInsetsCompat;


    public class WibiMain extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            EdgeToEdge.enable(this);
            setContentView(R.layout.wibi_main);
            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
                Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
                return insets;
            });
        }

        public void pindah1(View view) {
            Intent intent = new Intent(WibiMain.this, Layout2.class);
            startActivity(intent);
        }

        public void pindah5(View view) {
            Intent intent = new Intent(WibiMain.this,Layout2.class);
            startActivity(intent);
        }

        public void pindah2(View view) {
            Intent intent = new Intent(WibiMain.this,layout3.class);
            startActivity(intent);
        }

        public void pindah6(View view) {
            Intent intent = new Intent(WibiMain.this,layout3.class);
            startActivity(intent);
        }

        public void pindah10(View view) {
            Intent intent = new Intent(WibiMain.this,layout4.class);
            startActivity(intent);
        }

        public void pindah7(View view) {
            Intent intent = new Intent(WibiMain.this,layout4.class);
            startActivity(intent);
        }

        public void pindah8(View view) {
            Intent intent = new Intent(WibiMain.this,layout5.class);
            startActivity(intent);
        }

        public void pindah11(View view) {
            Intent intent = new Intent(WibiMain.this,layout5.class);
            startActivity(intent);
        }

        public void pindah3(View view) {
            Intent intent = new Intent(WibiMain.this,layout6.class);
            startActivity(intent);
        }

        public void pindah14(View view) {
            Intent intent = new Intent(WibiMain.this,layout6.class);
            startActivity(intent);
        }

        public void pindah4(View view) {
            Intent intent = new Intent(WibiMain.this,Layout7.class);
            startActivity(intent);
        }

        public void pindah25(View view) {
            Intent intent = new Intent(WibiMain.this,Layout7.class);
            startActivity(intent);
        }

        public void pindah26(View view) {
            Intent intent = new Intent(WibiMain.this,layout8.class);
            startActivity(intent);
        }

        public void pindah20(View view) {
            Intent intent = new Intent(WibiMain.this,layout8.class);
            startActivity(intent);
        }

        public void pindah30(View view) {
            Intent intent = new Intent(WibiMain.this,layout9.class);
            startActivity(intent);
        }

        public void pindah31(View view) {
            Intent intent = new Intent(WibiMain.this,layout9.class);
            startActivity(intent);
        }

        public void pindah32(View view) {
            Intent intent = new Intent(WibiMain.this,layout10.class);
            startActivity(intent);
        }

        public void pindah33(View view) {
            Intent intent = new Intent(WibiMain.this,layout10.class);
            startActivity(intent);
        }

        public void pindah34(View view) {
            Intent intent = new Intent(WibiMain.this,layout11.class);
            startActivity(intent);
        }
    }