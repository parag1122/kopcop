package com.example.afinal;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
//import com.google.firebase.firestore.FirebaseFirestore;

public class SignUpActicity extends AppCompatActivity {
    /*public EditText fullname,phone,email,address,username,password,confirmPassword;
     Button btnSignUp;
     String userID;
     FirebaseAuth firebaseAuth;
     FirebaseFirestore firestore;

 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //      firebaseAuth = FirebaseAuth.getInstance();
        //    firestore=FirebaseFirestore.getInstance();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_acticity);
    }
}
/*
        fullname=findViewById(R.id.name);
        phone=findViewById(R.id.phone);
        email = findViewById(R.id.email);
        address=findViewById(R.id.address);
        username=findViewById(R.id.username);
        password = findViewById(R.id.password);
        confirmPassword=findViewById(R.id.confirmpassword);
        btnSignUp = findViewById(R.id.registerbtn);

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String emailID = email.getText().toString();
                String paswd = password.getText().toString();
                if (emailID.isEmpty()) {
                    email.setError("Provide your Email first!");
                    email.requestFocus();
                } else if (paswd.isEmpty()) {
                    password.setError("Set your password");
                    password.requestFocus();
                } else if (emailID.isEmpty() && paswd.isEmpty()) {
                    Toast.makeText(SignUpActicity.this, "Fields Empty!", Toast.LENGTH_SHORT).show();
                } else if (!(emailID.isEmpty() && paswd.isEmpty())) {
                    firebaseAuth.createUserWithEmailAndPassword(emailID, paswd).addOnCompleteListener(SignUpActicity.this, new OnCompleteListener() {
                        @Override
                        public void onComplete(@NonNull Task task) {

                            if (!task.isSuccessful()) {

                                Toast.makeText(SignUpActicity.this,
                                        "SignUp unsuccessful: " + task.getException().getMessage(),
                                        Toast.LENGTH_SHORT).show();




                            }
                            else {
                                startActivity(new Intent(SignUpActicity.this, LoginActivity.class));
                            /*   userID=firebaseAuth.getCurrentUser().getUid();



                                Map<String,Object> user=new HashMap<>();
                                user.put("name",fullname);
                                user.put("phone",phone);
                                user.put("email",email);
                                user.put("address",address);
                                user.put("password",password);
                                DocumentReference documentReference=firestore.collection("Users").document(userID);
                                documentReference.set(user).addOnSuccessListener(new OnSuccessListener<Void>() {
                                    @Override
                                    public void onSuccess(Void aVoid) {
                                        Log.d("TAG","User Profile is created for "+userID);
                                    }
                                });
                                */

                   /*         }

                        }
                    });
                }
                else {
                    Toast.makeText(SignUpActicity.this, "Error", Toast.LENGTH_SHORT).show();
                }




                ///

            }
        });
      /*  btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent I = new Intent(SignUpActicity.this, LoginActivity.class);
                startActivity(I);
            }
        });*/
    //}

  //  }