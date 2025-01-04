package com.example.loginjc

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.draw.scale
import androidx.compose.ui.focus.FocusDirection
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginjc.screens.HomeScreen
import com.example.loginjc.ui.theme.GreenJC
import com.example.loginjc.ui.theme.LoginJCTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginJCTheme {
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                    val navController = rememberNavController()
                    NavGraph(navController)
                }
            }

        }
    }
}


@Composable
fun LoginScreen(onSuccessLogin: () -> Unit) {
//fun LoginScreen() {
    var username = remember { mutableStateOf("") }
    var password = remember { mutableStateOf("") }
    val passwordVisible = remember { mutableStateOf(false) }
    val context = LocalContext.current.applicationContext
    val focusManager = LocalFocusManager.current

    Box(modifier = Modifier.background(GreenJC)) {
        Image(
            painter = painterResource(R.drawable.img_2), contentDescription = "background_image",
            modifier = Modifier
                .rotate(-270f)
                .size(200.dp)
                .scale(1.2f)
        )
        Image(
            painter = painterResource(R.drawable.img_1), contentDescription = "background_image",
            modifier = Modifier
                .align(Alignment.TopEnd)
                .scale(1.2f)
        )

        /*Text(
            text = "App Name",
            modifier = modifier.align(Alignment.TopCenter)
                .padding(vertical = 300.dp),
            color = Color.White,
            fontSize = 36.sp,
        )*/
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(vertical = 100.dp, horizontal = 12.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.Bottom
        ) {

            WoodenBoardTitleBox(
                title = "Welcome to Nature",
                subtitle = "Experience the beauty of plants"
            )

            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                colors = CardDefaults.cardColors(Color.White)
            ) {
                Text(
                    text = "Login",
                    modifier = Modifier
                        .padding(12.dp)
                        .fillMaxWidth(),
                    color = GreenJC,
                    fontSize = 32.sp,
                    fontWeight = FontWeight.SemiBold,
                    textAlign = TextAlign.Center
                )

                OutlinedTextField(
                    value = username.value,
                    onValueChange = { username.value = it },
                    label = { Text(text = "Email") },
                    placeholder = { Text(text = "example@gmail.com") },

                    modifier = Modifier
                        .padding(vertical = 8.dp, horizontal = 12.dp)
                        .fillMaxWidth(),
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        unfocusedBorderColor = Color(0xFF34A57B),
                        focusedBorderColor = Color(0xFF34A57B),
                        focusedLabelColor = Color(0xFF34A57B),
                        unfocusedLabelColor = Color(0xFF34A57B),
                        focusedLeadingIconColor = GreenJC,
                        unfocusedLeadingIconColor = GreenJC,
                    ),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Email,
                            contentDescription = null
                        )
                    },
                    keyboardActions = KeyboardActions(
                        onNext = {
                            focusManager.moveFocus(FocusDirection.Down) // Move to the next input field
                        }
                    ),
                    shape = RoundedCornerShape(12.dp),
//                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email,
                        imeAction = ImeAction.Next // Specify the IME action
                    ),
                )

                OutlinedTextField(
                    value = password.value,
                    onValueChange = { password.value = it },
                    label = { Text(text = "Password") },
                    placeholder = { Text(text = "********") },
                    modifier = Modifier
                        .padding(vertical = 1.dp, horizontal = 12.dp)
                        .fillMaxWidth(),
                    singleLine = true,
                    colors = OutlinedTextFieldDefaults.colors(
                        focusedTextColor = Color.Black,
                        unfocusedTextColor = Color.Black,
                        unfocusedBorderColor = Color(0xFF34A57B),
                        focusedBorderColor = Color(0xFF34A57B),
                        focusedLabelColor = Color(0xFF34A57B),
                        unfocusedLabelColor = Color(0xFF34A57B),
                        focusedLeadingIconColor = GreenJC,
                        unfocusedLeadingIconColor = GreenJC,
                        focusedTrailingIconColor = GreenJC,
                        unfocusedTrailingIconColor = GreenJC
                    ),
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Default.Lock,
                            contentDescription = null
                        )
                    },
                    trailingIcon = {
                        IconButton(onClick = { passwordVisible.value = !passwordVisible.value }) {
                            Icon(
                                painter = if (passwordVisible.value) {
                                    painterResource(R.drawable.eye) // Visible eye icon
                                } else {
                                    painterResource(R.drawable.eye_crossed) // Hidden eye icon (replace with your drawable)
                                },
                                contentDescription = if (passwordVisible.value) "Hide Password" else "Show Password"
                            )
                        }
                    },
                    shape = RoundedCornerShape(12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = if (passwordVisible.value) KeyboardType.Text else KeyboardType.Password,
                        imeAction = ImeAction.Done
                    ),
                    keyboardActions = KeyboardActions(
                        onDone = {
                            focusManager.clearFocus()
                        }
                    ),
                    visualTransformation = if (passwordVisible.value) VisualTransformation.None
                    else PasswordVisualTransformation()
                )


                Button(
                    onClick = {
                        Toast.makeText(context, "Forgot Password?..", Toast.LENGTH_SHORT).show()
                    },
                    modifier = Modifier
                        .align(Alignment.End),
                    colors = ButtonDefaults.buttonColors(Color.Transparent)
                ) {
                    Text(text = "Forgot Password?")
                }

                ElevatedButton(
                    onClick = {
                        onSuccessLogin()
                        /*if (authenticate(username.value, password.value)) {
                            onSuccessLogin()
                            Toast.makeText(context, "Login Successful", Toast.LENGTH_SHORT).show()
                        } else {
                            Toast.makeText(context, "Invalid credentials", Toast.LENGTH_SHORT)
                                .show()
                        }*/
                    },
                    modifier = Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(12.dp)
                        .fillMaxWidth(0.5f),
                    colors = ButtonDefaults.buttonColors(GreenJC),
                    elevation = ButtonDefaults.elevatedButtonElevation(4.dp),
                    shape = RoundedCornerShape(12.dp),
                ) {
                    Text(
                        text = "Login",
                        modifier = Modifier.padding(4.dp),
                        fontSize = 20.sp,
                        color = Color.White
                    )
                }
            }
        }

        Image(
            painter = painterResource(R.drawable.img_2), contentDescription = "background_image",
            modifier = Modifier
                .rotate(-90f)
                .size(150.dp)
                .align(Alignment.BottomEnd)
                .scale(1.2f),

            )
    }

}

private fun authenticate(username: String, password: String): Boolean {
    val validUsername = "admin"
    val validPassword = "admin123"

    return username == validUsername && password == validPassword
}

@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(navController = navController, startDestination = "login") {
        composable("login") {
            LoginScreen(onSuccessLogin = {
                navController.navigate("home") {
                    popUpTo(0)
                }
            })
        }
        composable("home") {
            HomeScreen()
        }
    }
}


@Composable
fun WoodenBoardTitleBox(title: String, subtitle: String) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(12.dp)
//            .clip(RoundedCornerShape(16.dp))
        /*.background( brush = Brush.linearGradient(
            colors = listOf(GreenJC, Color.Transparent), // Pink40 to GreenJC
            start = Offset(0f, 70f), // Start point (top-left)
            end = Offset(0f, 500f) // End point (diagonal)
        ))*/
        /*.border(1.dp, Color(0xFF5D4037), RoundedCornerShape(16.dp))*/
    ) {
        // Title and Subtitle
        Column(
            modifier = Modifier
                .padding(4.dp)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo), // Replace with your plant drawable
                contentDescription = "Plant Icon",
                modifier = Modifier
                    .size(64.dp)
                    .clip(CircleShape) // Circular shape
                    .background(Color.White)
            )
            Text(
                text = title,
                style = TextStyle(
                    color = Color.White,
                    fontSize = 30.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Text(
                text = subtitle,
                style = TextStyle(
                    color = Color.White.copy(alpha = 0.8f),
                    fontSize = 14.sp
                ),
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewWoodenBoardTitleBox() {
    WoodenBoardTitleBox(
        title = "Welcome to Nature",
        subtitle = "Experience the beauty of plants"
    )
}
