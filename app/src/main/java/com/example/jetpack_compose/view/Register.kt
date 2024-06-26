package com.example.jetpack_compose.view

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
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Black
import androidx.compose.ui.graphics.Color.Companion.Gray
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
import com.example.jetpack_compose.ui.theme.Purple800
import com.example.jetpack_compose.ui.theme.PurpleGrey80

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun RegisterPage(navController: NavController) {

    val context = LocalContext.current
    val scaffoldState = rememberScaffoldState()
    val nameVal = remember { mutableStateOf("") }
    val emailVal = remember { mutableStateOf("") }
    val phoneVal = remember { mutableStateOf("") }
    val passwordVal = remember { mutableStateOf("") }
    val confirmPasswordVal = remember { mutableStateOf("") }
    val passwordVisibility = remember { mutableStateOf(false) }
    val confirmPasswordVisibility = remember { mutableStateOf(false) }

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
                modifier = Modifier
                    .background(White)
                    .padding(45.dp),
                contentAlignment = Alignment.TopCenter,
            ) {
                Image(
                    modifier = Modifier
                        .width(250.dp)
                        .height(200.dp),
                    painter = painterResource(R.drawable.register),
                    contentDescription = "Gif Image",
                    contentScale = ContentScale.Fit
                )
            }

            Spacer(modifier = Modifier.padding(0.dp))

            Scaffold(modifier = Modifier.fillMaxSize(), scaffoldState = scaffoldState) {
                Column(
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .background(
                            White
                        )
                        .padding(1.dp)
                ) {
                    Text(
                        text = "Create an Account !",
                        fontSize = 30.sp,
                        fontWeight = FontWeight.Bold,
                        color = Black
                    )
                    Spacer(modifier = Modifier.padding(5.dp))

                    Text(
                        text = "Join our community and enjoy exclusive features",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.W500,
                        color = Black,
                    )

                    Spacer(modifier = Modifier.padding(20.dp))

                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        // Name Field
                        OutlinedTextField(
                            value = nameVal.value,
                            onValueChange = { nameVal.value = it },
                            label = { Text(text = "Name") },
                            placeholder = { Text(text = "Enter Name") },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth(0.8f)
                                .padding(5.dp),
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                unfocusedBorderColor = Gray,
                                textColor = Black
                            )
                        )
                        // Email Field
                        OutlinedTextField(
                            value = emailVal.value,
                            onValueChange = { emailVal.value = it },
                            label = { Text(text = "Email") },
                            placeholder = { Text(text = "Enter Email") },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth(0.8f)
                                .padding(5.dp),
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                unfocusedBorderColor = Gray,
                                textColor = Black
                            )
                        )
                        // PhoneNumber Field
                        OutlinedTextField(
                            value = phoneVal.value,
                            onValueChange = { phoneVal.value = it },
                            label = { Text(text = "Number") },
                            placeholder = { Text(text = "Enter Number") },
                            singleLine = true,
                            modifier = Modifier
                                .fillMaxWidth(0.8f)
                                .padding(5.dp),
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                unfocusedBorderColor = Gray,
                                textColor = Black
                            )
                        )
                        // Password Field
                        OutlinedTextField(
                            value = passwordVal.value,
                            onValueChange = { passwordVal.value = it },
                            label = { Text(text = "Password") },
                            placeholder = { Text(text = "Enter Password") },
                            singleLine = true,
                            trailingIcon = {
                                IconButton(onClick = {
                                    passwordVisibility.value = !passwordVisibility.value
                                }) {
                                    Icon(
                                        painter = painterResource(R.drawable.baseline_key_24),
                                        contentDescription = "Password Visibility",
                                        tint = if (passwordVisibility.value) Purple800 else Gray
                                    )
                                }
                            },
                            modifier = Modifier
                                .fillMaxWidth(0.8f)
                                .padding(5.dp),
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                unfocusedBorderColor = Gray,
                                textColor = Black,
                            ),
                            visualTransformation = if (passwordVisibility.value) VisualTransformation.None else PasswordVisualTransformation()
                        )
                        // Password Confirmation Field
                        OutlinedTextField(
                            value = confirmPasswordVal.value,
                            onValueChange = { confirmPasswordVal.value = it },
                            label = { Text(text = "Confirm Password") },
                            placeholder = { Text(text = "Enter Password Confirmation") },
                            singleLine = true,
                            trailingIcon = {
                                IconButton(onClick = {
                                    confirmPasswordVisibility.value =
                                        !confirmPasswordVisibility.value
                                }) {
                                    Icon(
                                        painter = painterResource(R.drawable.baseline_key_24),
                                        contentDescription = "Password Visibility",
                                        tint = if (confirmPasswordVisibility.value) Purple800 else Gray
                                    )
                                }
                            },
                            modifier = Modifier
                                .fillMaxWidth(0.8f)
                                .padding(5.dp),
                            colors = TextFieldDefaults.outlinedTextFieldColors(
                                unfocusedBorderColor = Gray,
                                textColor = Black,
                            ),
                            visualTransformation = if (confirmPasswordVisibility.value) VisualTransformation.None else PasswordVisualTransformation()
                        )

                        Spacer(modifier = Modifier.padding(20.dp))

                        Button(
                            onClick = {
                                if (nameVal.value.isEmpty()) {
                                    Toast.makeText(
                                        context,
                                        "Please enter the name !",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                } else if (emailVal.value.isEmpty()) {
                                    Toast.makeText(
                                        context,
                                        "Please enter the email !",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                } else if (phoneVal.value.isEmpty()) {
                                    Toast.makeText(
                                        context,
                                        "Please enter the phone number !",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                } else if (passwordVal.value.isEmpty()) {
                                    Toast.makeText(
                                        context,
                                        "Please enter password !",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                } else if (confirmPasswordVal.value.isEmpty()) {
                                    Toast.makeText(
                                        context,
                                        "Please enter confirm password !",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                } else {
                                    Toast.makeText(
                                        context,
                                        "Successfully Registered!",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                            },
                            colors = ButtonDefaults.buttonColors(backgroundColor = PurpleGrey80),
                            modifier = Modifier
                                .fillMaxWidth(0.8f)
                                .height(55.dp)
                        ) {
                            Text(
                                text = "Submit",
                                fontSize = 20.sp,
                                color = Black,
                                fontWeight = FontWeight.W500
                            )
                        }

                        Spacer(modifier = Modifier.padding(20.dp))

                        Text(
                            text = "Already have an account? Login here.",
                            color = Black,
                            modifier = Modifier.clickable { navController.navigate("login_page") })

                        Spacer(modifier = Modifier.padding(20.dp))

                    }

                }
            }
        }
    }

}