package com.example.loginjc.screens

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.loginjc.R
import com.example.loginjc.ui.theme.BackgroundJC
import com.example.loginjc.ui.theme.GreenJC

@Composable
fun Home(navigationController: NavController) {
//    HomeScreenDesign()
    HomeScreenDesign(navigationController = navigationController)
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun HomeScreenDesign(modifier: Modifier = Modifier, navigationController: NavController) {

    // Remember the scroll state to manage horizontal scrolling
    val scrollState = rememberScrollState()
    Box(
        modifier = modifier
            .fillMaxSize()
    )
    {
        Column {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(12.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Spacer(modifier = Modifier.size(28.dp))
                Text(
                    text = "Flora GoGo", textAlign = TextAlign.Center,
                    fontSize = 26.sp,
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(0.85f),
                    fontWeight = FontWeight.SemiBold,
                    fontStyle = FontStyle.Italic
                )

                Icon(
                    imageVector = Icons.Default.Notifications, contentDescription = "Notification",
                    modifier = Modifier
                        .size(28.dp)
                        .clickable(onClick = {
                            // Navigate to Notification screen
                            navigationController.navigate(Screens.Notification.screens) {
                                popUpTo(Screens.Profile.screens) { inclusive = true }
                            }
                        }),
                    tint = Color.White,
                )
            }

            Card(
                modifier = Modifier
                    .fillMaxSize(),
                shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
                colors = CardDefaults.cardColors(BackgroundJC)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(12.dp, 12.dp, 12.dp, 0.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    Image(
                        painter = painterResource(R.drawable.img_3),
                        contentDescription = "slider",
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(150.dp)
                            .clip(RoundedCornerShape(12.dp)), // Rounded corners
                        contentScale = ContentScale.FillWidth
                    )

                    Spacer(modifier = Modifier.padding(12.dp))

                    Row(
                        modifier = Modifier
                            .horizontalScroll(scrollState) // Enable horizontal scrolling
                            .fillMaxWidth() // Fill the width of the screen (optional)
                    ) {
                        Image(
                            painter = painterResource(id = R.drawable.img_1), // Replace with your plant drawable
                            contentDescription = "Plant Icon",
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape) // Circular shape
                                .background(Color(0xFFF1F1F1)),
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Image(
                            painter = painterResource(id = R.drawable.img_2), // Replace with your plant drawable
                            contentDescription = "Plant Icon",
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape) // Circular shape
                                .background(Color(0xFFF1F1F1)),
                            contentScale = ContentScale.FillBounds
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Image(
                            painter = painterResource(id = R.drawable.img_3), // Replace with your plant drawable
                            contentDescription = "Plant Icon",
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape) // Circular shape
                                .background(Color(0xFFF1F1F1)),
                            contentScale = ContentScale.FillBounds
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Image(
                            painter = painterResource(id = R.drawable.img_1), // Replace with your plant drawable
                            contentDescription = "Plant Icon",
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape) // Circular shape
                                .background(Color(0xFFF1F1F1)),
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Image(
                            painter = painterResource(id = R.drawable.img_1), // Replace with your plant drawable
                            contentDescription = "Plant Icon",
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape) // Circular shape
                                .background(Color(0xFFF1F1F1)),
                        )
                        Spacer(modifier = Modifier.padding(4.dp))
                        Image(
                            painter = painterResource(id = R.drawable.img_1), // Replace with your plant drawable
                            contentDescription = "Plant Icon",
                            modifier = Modifier
                                .size(64.dp)
                                .clip(CircleShape) // Circular shape
                                .background(Color(0xFFF1F1F1)),
                        )
                    }

                    Spacer(modifier = Modifier.padding(12.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Text(
                            text = "Popular Items",
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp,
                            color = Color.Black
                        )
                        Text(
                            text = "View all",
                            color = GreenJC,
                            fontWeight = FontWeight.SemiBold,
                        )
                    }

                    Spacer(modifier = Modifier.padding(12.dp))

                    Row {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .padding(8.dp)
                                .clip(
                                    RoundedCornerShape(12.dp)
                                )
                                .background(Color(0xFFF1F1F1))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_1), // Replace with your plant drawable
                                contentDescription = "Plant Icon",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text(
                                        text = "Angle", fontWeight = FontWeight.SemiBold,
                                        fontSize = 24.sp, color = Color.Black,
                                        modifier = Modifier
                                    )
                                    Text(
                                        text = "$ 357.0", fontWeight = FontWeight.SemiBold,
                                        fontSize = 20.sp, color = GreenJC,
                                        modifier = Modifier
                                    )
                                }
                                Image(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "add to cart",
                                    modifier = Modifier
                                        .background(GreenJC)
                                        .align(Alignment.CenterVertically)
                                        .size(40.dp)
                                        .clip(RoundedCornerShape(24.dp))
                                )
                            }
                        }

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp)
                                .clip(
                                    RoundedCornerShape(12.dp)
                                )
                                .background(Color(0xFFF1F1F1))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_1), // Replace with your plant drawable
                                contentDescription = "Plant Icon",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text(
                                        text = "Angle", fontWeight = FontWeight.SemiBold,
                                        fontSize = 24.sp, color = Color.Black,
                                        modifier = Modifier.fillMaxWidth(0.7f)
                                    )
                                    Text(
                                        text = "$ 357.0", fontWeight = FontWeight.SemiBold,
                                        fontSize = 20.sp, color = GreenJC,
                                        modifier = Modifier
                                    )
                                }
                                Image(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "add to cart",
                                    modifier = Modifier
                                        .background(GreenJC)
                                        .align(Alignment.CenterVertically)
                                        .size(40.dp)
                                        .clip(RoundedCornerShape(24.dp))
                                )
                            }
                        }
                    }


                    Row {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .padding(8.dp)
                                .clip(
                                    RoundedCornerShape(12.dp)
                                )
                                .background(Color(0xFFF1F1F1))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_1), // Replace with your plant drawable
                                contentDescription = "Plant Icon",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text(
                                        text = "Angle", fontWeight = FontWeight.SemiBold,
                                        fontSize = 24.sp, color = Color.Black,
                                        modifier = Modifier.fillMaxWidth(0.7f)
                                    )
                                    Text(
                                        text = "$ 357.0", fontWeight = FontWeight.SemiBold,
                                        fontSize = 20.sp, color = GreenJC,
                                        modifier = Modifier
                                    )
                                }
                                Image(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "add to cart",
                                    modifier = Modifier
                                        .background(GreenJC)
                                        .align(Alignment.CenterVertically)
                                        .size(40.dp)
                                        .clip(RoundedCornerShape(24.dp))
                                )
                            }
                        }

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp)
                                .clip(
                                    RoundedCornerShape(12.dp)
                                )
                                .background(Color(0xFFF1F1F1))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_4), // Replace with your plant drawable
                                contentDescription = "Plant Icon",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text(
                                        text = "Angle", fontWeight = FontWeight.SemiBold,
                                        fontSize = 24.sp, color = Color.Black,
                                        modifier = Modifier.fillMaxWidth(0.7f)
                                    )
                                    Text(
                                        text = "$ 357.0", fontWeight = FontWeight.SemiBold,
                                        fontSize = 20.sp, color = GreenJC,
                                        modifier = Modifier
                                    )
                                }
                                Image(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "add to cart",
                                    modifier = Modifier
                                        .background(GreenJC)
                                        .align(Alignment.CenterVertically)
                                        .size(40.dp)
                                        .clip(RoundedCornerShape(24.dp))
                                )
                            }
                        }
                    }

                    Row {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth(0.5f)
                                .padding(8.dp)
                                .clip(
                                    RoundedCornerShape(12.dp)
                                )
                                .background(Color(0xFFF1F1F1))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_5), // Replace with your plant drawable
                                contentDescription = "Plant Icon",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text(
                                        text = "Angle", fontWeight = FontWeight.SemiBold,
                                        fontSize = 24.sp, color = Color.Black,
                                        modifier = Modifier.fillMaxWidth(0.7f)
                                    )
                                    Text(
                                        text = "$ 357.0", fontWeight = FontWeight.SemiBold,
                                        fontSize = 20.sp, color = GreenJC,
                                        modifier = Modifier
                                    )
                                }
                                Image(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "add to cart",
                                    modifier = Modifier
                                        .background(GreenJC)
                                        .align(Alignment.CenterVertically)
                                        .size(40.dp)
                                        .clip(RoundedCornerShape(24.dp))
                                )
                            }
                        }

                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(8.dp)
                                .clip(
                                    RoundedCornerShape(12.dp)
                                )
                                .background(Color(0xFFF1F1F1))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_6), // Replace with your plant drawable
                                contentDescription = "Plant Icon",
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .height(180.dp)
                            )
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(8.dp),
                                verticalAlignment = Alignment.CenterVertically,
                                horizontalArrangement = Arrangement.SpaceBetween
                            ) {
                                Column {
                                    Text(
                                        text = "Jasmine", fontWeight = FontWeight.SemiBold,
                                        fontSize = 24.sp, color = Color.Black,
                                        modifier = Modifier.fillMaxWidth(0.7f)
                                    )
                                    Text(
                                        text = "$ 357.0", fontWeight = FontWeight.SemiBold,
                                        fontSize = 20.sp, color = GreenJC,
                                        modifier = Modifier
                                    )
                                }
                                Image(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "add to cart",
                                    modifier = Modifier
                                        .background(GreenJC)
                                        .align(Alignment.CenterVertically)
                                        .size(40.dp)
                                        .clip(RoundedCornerShape(24.dp))
                                )
                            }
                        }
                    }

                }
            }

        }
    }
}

