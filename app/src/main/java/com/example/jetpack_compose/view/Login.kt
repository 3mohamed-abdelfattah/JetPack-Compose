package com.example.jetpack_compose.view

//noinspection UsingMaterialAndMaterial3Libraries
import android.annotation.SuppressLint
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.jetpack_compose.R
import com.example.jetpack_compose.ui.theme.Purple80
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.rememberScaffoldState

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun LoginPage(navController: NavController) {

    val context = LocalContext.current
    val scaffoldState = rememberScaffoldState()
    val emailVal = remember { mutableStateOf("") }
    val passwordVal = remember { mutableStateOf("") }
    val passwordVisibility = remember { mutableStateOf(false) }

    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = White), contentAlignment = Alignment.Center
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Box(
                modifier = Modifier.background(White),
                contentAlignment = Alignment.TopCenter,
            ) {
                Image(
                    modifier = Modifier
                        .width(400.dp)
                        .height(350.dp),
                    painter = painterResource(R.drawable.login2),
                    contentDescription = "Login Image",
                    contentScale = ContentScale.Fit
                )
            }

            Spacer(modifier = Modifier.padding(20.dp))

            Scaffold(modifier = Modifier.fillMaxSize(), scaffoldState = scaffoldState) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            White
                        )
                        .padding(10.dp)
                ) {
                    Text(
                        text = "Login",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Black
                    )

                    Spacer(modifier = Modifier.padding(20.dp))

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        OutlinedTextField(
                            value = emailVal.value,
                            onValueChange = { emailVal.value = it },
                            label = { Text(text = "Email") },
                            placeholder = { Text(text = "Enter your email") },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth(0.8f)
                                .padding(16.dp),
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                unfocusedBorderColor = Black,
                                textColor = Black
                            )
                        )

                        OutlinedTextField(
                            value = passwordVal.value,
                            onValueChange = { passwordVal.value = it },
                            label = { Text(text = "Password") },
                            placeholder = { Text(text = "Enter your Password") },
                            singleLine = true,
                            trailingIcon = {
                                IconButton(onClick = {
                                    passwordVisibility.value = !passwordVisibility.value
                                }) {
                                    Icon(
                                        painter = painterResource(R.drawable.baseline_key_24),
                                        contentDescription = "Password Visibility",
                                        tint = if (passwordVisibility.value) Purple80 else Color.Gray
                                    )
                                }
                            },
                            modifier = Modifier
                                .fillMaxWidth(0.8f)
                                .padding(16.dp),
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                unfocusedBorderColor = Black,
                                textColor = Black,
                            ),
                            visualTransformation = if (passwordVisibility.value) VisualTransformation.None else PasswordVisualTransformation()
                        )

                        Spacer(modifier = Modifier.padding(20.dp))

                        Button(
                            onClick = {
                                when {
                                    emailVal.value.isEmpty() -> {
                                        Toast.makeText(
                                            context,
                                            "Please enter your Email!!",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }

                                    passwordVal.value.isEmpty() -> {
                                        Toast.makeText(
                                            context,
                                            "Please enter your Password!!",
                                            Toast.LENGTH_SHORT
                                        ).show()
                                    }

                                    else -> {
                                        Toast.makeText(
                                            context,
                                            "Login Successful",
                                            Toast.LENGTH_SHORT
                                        )
                                            .show()
                                    }
                                }
                            },
                            colors = ButtonDefaults.buttonColors(backgroundColor = White),
                            modifier = Modifier
                                .fillMaxWidth(0.8f)
                                .height(50.dp)
                        ) {
                            Text(text = "Submit", fontSize = 20.sp, color = Black)
                        }

                        Spacer(modifier = Modifier.padding(20.dp))

                        Text(
                            text = "Don't have an account? Sign Up",
                            color = Black,
                            modifier = Modifier.clickable { navController.navigate("register_page") })

                        Spacer(modifier = Modifier.padding(20.dp))

                    }


                }
            }
        }
    }

}