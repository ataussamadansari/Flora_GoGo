package com.example.loginjc.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginjc.R
import com.example.loginjc.ui.theme.BackgroundJC

@Composable
fun Profile() {
    Box(
        modifier = Modifier
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
                    text = "Profile", textAlign = TextAlign.Center,
                    fontSize = 26.sp,
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(0.85f),
                    fontWeight = FontWeight.SemiBold,
                    fontStyle = FontStyle.Italic
                )
                Icon(
                    painter = painterResource(R.drawable.ic_edit),
                    contentDescription = "Notification",
                    modifier = Modifier
                        .size(28.dp)
                        .clickable(onClick = {
                            // Navigate to Notification screen
                        }),
                    tint = Color.White,
                )
            }

            Column(
                modifier = Modifier
                    .height(180.dp)
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(R.drawable.a), contentDescription = "",
                    modifier = Modifier
                        .size(100.dp)
                        .clip(RoundedCornerShape(360.dp))
                )

                Text(
                    text = "Samad Ansari",
                    textAlign = TextAlign.Center,
                    fontSize = 26.sp,
                    color = Color.White,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier.fillMaxWidth()
                )

                Text(
                    text = "+91 9876543210",
                    textAlign = TextAlign.Center,
                    fontSize = 18.sp,
                    color = Color(0xFFFFF9F9),
                    fontWeight = FontWeight.W500,
                    modifier = Modifier.fillMaxWidth()
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
                        .padding(20.dp, 12.dp, 20.dp, 12.dp)
                        .verticalScroll(rememberScrollState())
                ) {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, shape = RoundedCornerShape(12.dp))
                            .padding(8.dp),
                    ) {
                        Icon(
                            imageVector = Icons.Default.Person, contentDescription = "",
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0x737FC7FF))
                                .padding(8.dp)
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),
                            tint = Color(0x90008FFF)
                        )

                        Text(
                            text = "My Profile",
                            fontSize = 18.sp,
                            color = Color(0xFF4B5057),
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .fillMaxHeight()
                                .weight(1f)
                                .align(Alignment.CenterVertically)
                                .padding(12.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .clip(RoundedCornerShape(16.dp)),
                            tint = Color(0xFF4B5057)
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, shape = RoundedCornerShape(12.dp))
                            .padding(8.dp),
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_orders_box), contentDescription = "",
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0x7386FF89))
                                .padding(8.dp)
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),
                            tint = Color(0xFF19FF1F)
                        )

                        Text(
                            text = "My Orders",
                            fontSize = 18.sp,
                            color = Color(0xFF4B5057),
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .fillMaxHeight()
                                .weight(1f)
                                .align(Alignment.CenterVertically)
                                .padding(12.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .clip(RoundedCornerShape(16.dp)),
                            tint = Color(0xFF4B5057)
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, shape = RoundedCornerShape(12.dp))
                            .padding(8.dp),
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_refund), contentDescription = "",
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0x7393A3FF))
                                .padding(8.dp)
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),
                            tint = Color(0x680028FF)
                        )

                        Text(
                            text = "Returns & Refunds",
                            fontSize = 18.sp,
                            color = Color(0xFF4B5057),
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .fillMaxHeight()
                                .weight(1f)
                                .align(Alignment.CenterVertically)
                                .padding(12.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .clip(RoundedCornerShape(16.dp)),
                            tint = Color(0xFF4B5057)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, shape = RoundedCornerShape(12.dp))
                            .padding(8.dp),
                    ) {
                        Icon(
                            imageVector = Icons.Default.LocationOn, contentDescription = "",
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0x738FFFF5))
                                .padding(8.dp)
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),
                            tint = Color(0xC91AD9C5)
                        )

                        Text(
                            text = "Manage Addresses",
                            fontSize = 18.sp,
                            color = Color(0xFF4B5057),
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .fillMaxHeight()
                                .weight(1f)
                                .align(Alignment.CenterVertically)
                                .padding(12.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .clip(RoundedCornerShape(16.dp)),
                            tint = Color(0xFF4B5057)
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, shape = RoundedCornerShape(12.dp))
                            .padding(8.dp),
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_card), contentDescription = "",
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0x73FFDC74))
                                .padding(8.dp)
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),
                            tint = Color(0xFFFFC107)
                        )

                        Text(
                            text = "Payment Methods",
                            fontSize = 18.sp,
                            color = Color(0xFF4B5057),
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .fillMaxHeight()
                                .weight(1f)
                                .align(Alignment.CenterVertically)
                                .padding(12.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .clip(RoundedCornerShape(16.dp)),
                            tint = Color(0xFF4B5057)
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, shape = RoundedCornerShape(12.dp))
                            .padding(8.dp),
                    ) {
                        Icon(
                            imageVector = Icons.Default.Lock, contentDescription = "",
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0x73FFAE99))
                                .padding(8.dp)
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),
                            tint = Color(0xFFFF734D)
                        )

                        Text(
                            text = "Change Password",
                            fontSize = 18.sp,
                            color = Color(0xFF4B5057),
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .fillMaxHeight()
                                .weight(1f)
                                .align(Alignment.CenterVertically)
                                .padding(12.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .clip(RoundedCornerShape(16.dp)),
                            tint = Color(0xFF4B5057)
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, shape = RoundedCornerShape(12.dp))
                            .padding(8.dp),
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_lang), contentDescription = "",
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0x73FF81F7))
                                .padding(8.dp)
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),
                            tint = Color(0xFFFF37F2)
                        )

                        Text(
                            text = "Change Language",
                            fontSize = 18.sp,
                            color = Color(0xFF4B5057),
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .fillMaxHeight()
                                .weight(1f)
                                .align(Alignment.CenterVertically)
                                .padding(12.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .clip(RoundedCornerShape(16.dp)),
                            tint = Color(0xFF4B5057)
                        )
                    }

                    Spacer(modifier = Modifier.height(8.dp))

                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .background(Color.White, shape = RoundedCornerShape(12.dp))
                            .padding(8.dp),
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.ic_help_supp), contentDescription = "",
                            modifier = Modifier
                                .clip(RoundedCornerShape(16.dp))
                                .background(Color(0x73FF6FA1))
                                .padding(8.dp)
                                .fillMaxHeight()
                                .align(Alignment.CenterVertically),
                            tint = Color(0xFFFF6FA1)
                        )

                        Text(
                            text = "Help & Support",
                            fontSize = 18.sp,
                            color = Color(0xFF4B5057),
                            fontWeight = FontWeight.SemiBold,
                            modifier = Modifier
                                .fillMaxHeight()
                                .weight(1f)
                                .align(Alignment.CenterVertically)
                                .padding(12.dp)
                        )
                        Icon(
                            imageVector = Icons.Default.KeyboardArrowRight, contentDescription = "",
                            modifier = Modifier
                                .align(Alignment.CenterVertically)
                                .clip(RoundedCornerShape(16.dp)),
                            tint = Color(0xFF4B5057)
                        )
                    }
                }
            }
        }
    }
}