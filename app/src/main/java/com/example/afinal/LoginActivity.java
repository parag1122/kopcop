package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LoginActivity extends AppCompatActivity {
    Button btnLogIn,btnSignUp;
    /*   public EditText loginEmailId, logInpasswd;
       Button btnLogIn,btnSignUp;

       FirebaseAuth firebaseAuth;
       private FirebaseAuth.AuthStateListener authStateListener;
   */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        btnSignUp=findViewById(R.id.singupbtn);
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(LoginActivity.this, SignUpActicity.class);
                startActivity(I);
            }
        });
        btnLogIn=findViewById(R.id.loginbtn);
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(I);
            }
        });
    }
}
     /*   firebaseAuth = FirebaseAuth.getInstance();
        loginEmailId = findViewById(R.id.uname);
        logInpasswd = findViewById(R.id.upass);
        btnLogIn = findViewById(R.id.loginbtn);
        btnSignUp=findViewById(R.id.singupbtn);

        authStateListener = new FirebaseAuth.AuthStateListener() {
            @Override
            public void onAuthStateChanged(@NonNull FirebaseAuth firebaseAuth) {
                FirebaseUser user = firebaseAuth.getCurrentUser();
                if (user != null) {
                    Toast.makeText(LoginActivity.this, "User logged in ", Toast.LENGTH_SHORT).show();
                    Intent I = new Intent(LoginActivity.this, MainActivity.class);
                    startActivity(I);
                } else {
                    Toast.makeText(LoginActivity.this, "ContactUs to continue", Toast.LENGTH_SHORT).show();
                }
            }
        };
        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(I);
            }
        });
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String userEmail = loginEmailId.getText().toString();
                String userPaswd = logInpasswd.getText().toString();
                if (userEmail.isEmpty()) {
                    loginEmailId.setError("Provide your Email first!");
                    loginEmailId.requestFocus();
                } else if (userPaswd.isEmpty()) {
                    logInpasswd.setError("Enter Password!");
                    logInpasswd.requestFocus();
                } else if (userEmail.isEmpty() && userPaswd.isEmpty()) {
                    Toast.makeText(LoginActivity.this, "Fields Empty!", Toast.LENGTH_SHORT).show();
                } else if (!(userEmail.isEmpty() && userPaswd.isEmpty())) {
                    firebaseAuth.signInWithEmailAndPassword(userEmail, userPaswd).addOnCompleteListener(LoginActivity.this, new OnCompleteListener() {
                        @Override
                        public void onComplete(@NonNull Task task) {
                            if (!task.isSuccessful()) {
                                Toast.makeText(LoginActivity.this, "Not sucessfull", Toast.LENGTH_SHORT).show();
                            } else {
                                startActivity(new Intent(LoginActivity.this, MainActivity.class));
                            }
                        }
                    });
                } else {
                    Toast.makeText(LoginActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        firebaseAuth.addAuthStateListener(authStateListener);










    }

    public void signupact(View view) {
        Intent signupIntent=new Intent(this,MainActivity.class);
        startActivity(signupIntent);

    }
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {}
        return false;

    }

    public void loginact(View view) {
        Intent LoginIntent=new Intent(this,MainActivity.class);
        startActivity(LoginIntent);

    }
}
*/