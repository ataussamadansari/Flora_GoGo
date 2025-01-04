package com.example.loginjc.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.loginjc.R
import com.example.loginjc.ui.theme.BackgroundJC
import com.example.loginjc.ui.theme.GreenJC

@Composable
fun Search() {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.Top
    ) {
        val query = remember { mutableStateOf("") }

        // Input Field for Search
        OutlinedTextField(
            value = query.value,
            onValueChange = { query.value = it },
//            label = { Text("Search") }, // Placeholder
            placeholder = { Text(text = "Search Here...") },
            modifier = Modifier
                .fillMaxWidth() // Make it span full width
                .padding(top = 4.dp, start = 12.dp, end = 12.dp, bottom = 0.dp), // Add top spacing
            singleLine = true,
            colors = OutlinedTextFieldDefaults.colors(
                focusedTextColor = Color.Black,
                unfocusedTextColor = Color.Black,
                unfocusedBorderColor = Color(0xFFFFFFFF),
                focusedBorderColor = Color(0xFFFFFFFF),
                focusedLabelColor = Color(0xFFFFFFFF),
                unfocusedLabelColor = Color(0xFFB6B6B6),
                focusedLeadingIconColor = GreenJC,
                unfocusedLeadingIconColor = GreenJC,
                focusedTrailingIconColor = Color(0xFFFFFFFF),
                unfocusedTrailingIconColor = Color(0xFFFFFFFF),
                unfocusedContainerColor = Color(0xFFFFFFFF),
                focusedContainerColor = Color(0xFFFFFFFF),
            ),
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null
                )
            },
            shape = RoundedCornerShape(32.dp)
        )

        Spacer(modifier = Modifier.height(8.dp)) // Space between components

        Card(
            modifier = Modifier
                .fillMaxSize(),
            shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
            colors = CardDefaults.cardColors(BackgroundJC)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(12.dp, 8.dp, 12.dp, 0.dp)
                    .verticalScroll(rememberScrollState())
            ) {
                // Display the current search query
                Text(
                    text = "Search Query: ${query.value}",
                    style = MaterialTheme.typography.bodyMedium,
                    color = GreenJC
                )

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
                            painter = painterResource(id =R.drawable.img_1), // Replace with your plant drawable
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
                            painter = painterResource(id = com.example.loginjc.R.drawable.img_1), // Replace with your plant drawable
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
                            painter = painterResource(id = com.example.loginjc.R.drawable.img_1), // Replace with your plant drawable
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
                            painter = painterResource(id = com.example.loginjc.R.drawable.img_4), // Replace with your plant drawable
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
                            painter = painterResource(id = com.example.loginjc.R.drawable.img_5), // Replace with your plant drawable
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
