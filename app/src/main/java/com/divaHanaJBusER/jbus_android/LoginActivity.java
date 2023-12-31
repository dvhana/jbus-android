package com.divaHanaJBusER.jbus_android;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    private TextView registerNow = null;
    private Button loginButton = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        getSupportActionBar().hide();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        registerNow = findViewById(R.id.register_now);
        loginButton = findViewById(R.id.login_button);


    }

    private void moveActivity(Context ctx, Class<?> cls) {
        Intent intent = new Intent(ctx, cls);
        startActivity(intent);
    }

    private void startActivity(Intent intent) {
    }

    registernow.setOnClickListener(v -> {
        moveActivity(this, RegisterActivity.class);
    });

    private void viewToast(Context ctx, String message) {
        Toast.makeText(ctx, message, Toast.LENGTH_SHORT).show();
    }
}