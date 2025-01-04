package com.example.loginjc.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
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
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
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
import com.example.loginjc.ui.theme.GreenJC

@Composable
fun Carts() {
    CartDesign()
}

@Composable
fun CartDesign(modifier: Modifier = Modifier) {
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
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Cart Items", textAlign = TextAlign.Center,
                    fontSize = 26.sp,
                    color = Color.White,
                    modifier = Modifier.fillMaxWidth(),
                    fontWeight = FontWeight.SemiBold,
                    fontStyle = FontStyle.Italic
                )
            }

            Card(
                modifier = Modifier.fillMaxSize(),
                shape = RoundedCornerShape(topStart = 32.dp, topEnd = 32.dp),
                colors = CardDefaults.cardColors(BackgroundJC)
            ) {
                Column(
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                        .fillMaxSize()
                ) {
                    //Items List
                    Column(
                        modifier = Modifier.weight(1f)
                            .padding(top = 8.dp)
                            .verticalScroll(rememberScrollState())
                    ) {
                        Row(
                            modifier = Modifier
                                .padding(
                                    start = 16.dp,
                                    end = 16.dp,
                                    top = 4.dp,
                                    bottom = 4.dp
                                )
                                .background(Color.White, shape = RoundedCornerShape(12.dp))
                        )
                        {
                            Image(
                                painter = painterResource(id = R.drawable.img_1), // Replace with your plant drawable
                                contentDescription = "Plant Icon",
                                modifier = Modifier
                                    .size(80.dp)
                            )
                            Column(
                                modifier = Modifier.padding(
                                    start = 8.dp,
                                    end = 8.dp,
                                    top = 8.dp,
                                    bottom = 8.dp
                                )
                            ) {
                                Text(
                                    text = "Item 1",
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black
                                )
                                Text(
                                    text = "Rs. 180",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = GreenJC
                                )

                                Row {
                                    Text(
                                        text = "Quantity",
                                        fontSize = 16.sp,
                                        color = Color.Gray,
                                        modifier = Modifier
                                            .weight(1f),
                                    )
                                    IconButton(
                                        onClick = { /* Handle click */ },
                                        modifier = Modifier
                                            .background(GreenJC, shape = RoundedCornerShape(4.dp))
                                            .size(24.dp)
                                            .clip(RoundedCornerShape(4.dp)),
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.baseline_horizontal_rule_24),
                                            contentDescription = ""
                                        )
                                    }

                                    Text(
                                        text = "1",
                                        color = GreenJC,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier
                                            .weight(0.2f)
                                            .background(
                                                Color(0xFFB1FFD3),
                                                shape = RoundedCornerShape(4.dp)
                                            )
                                    )

                                    IconButton(
                                        onClick = { /* Handle click */ },
                                        modifier = Modifier
                                            .background(GreenJC, shape = RoundedCornerShape(4.dp))
                                            .size(24.dp)
                                            .clip(RoundedCornerShape(4.dp)),
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Add,
                                            contentDescription = "",
                                            tint = Color.White
                                        )
                                    }
                                }
                            }
                        }

                        Row(
                            modifier = Modifier
                                .padding(
                                    start = 16.dp,
                                    end = 16.dp,
                                    top = 4.dp,
                                    bottom = 4.dp
                                )
                                .background(Color.White, shape = RoundedCornerShape(12.dp))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_1), // Replace with your plant drawable
                                contentDescription = "Plant Icon",
                                modifier = Modifier
                                    .size(80.dp)
                            )
                            Column(
                                modifier = Modifier.padding(
                                    start = 8.dp,
                                    end = 8.dp,
                                    top = 8.dp,
                                    bottom = 8.dp
                                )
                            ) {
                                Text(
                                    text = "Item 2",
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black
                                )
                                Text(
                                    text = "Rs. 789",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = GreenJC
                                )

                                Row {
                                    Text(
                                        text = "Quantity",
                                        fontSize = 16.sp,
                                        color = Color.Gray,
                                        modifier = Modifier
                                            .weight(1f),
                                    )
                                    IconButton(
                                        onClick = { /* Handle click */ },
                                        modifier = Modifier
                                            .background(GreenJC, shape = RoundedCornerShape(4.dp))
                                            .size(24.dp)
                                            .clip(RoundedCornerShape(4.dp)),
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.baseline_horizontal_rule_24),
                                            contentDescription = ""
                                        )
                                    }

                                    Text(
                                        text = "1",
                                        color = GreenJC,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier
                                            .weight(0.2f)
                                            .background(
                                                Color(0xFFB1FFD3),
                                                shape = RoundedCornerShape(4.dp)
                                            )
                                    )

                                    IconButton(
                                        onClick = { /* Handle click */ },
                                        modifier = Modifier
                                            .background(GreenJC, shape = RoundedCornerShape(4.dp))
                                            .size(24.dp)
                                            .clip(RoundedCornerShape(4.dp)),
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Add,
                                            contentDescription = "",
                                            tint = Color.White
                                        )
                                    }
                                }
                            }
                        }

                        Row(
                            modifier = Modifier
                                .padding(
                                    start = 16.dp,
                                    end = 16.dp,
                                    top = 4.dp,
                                    bottom = 4.dp
                                )
                                .background(Color.White, shape = RoundedCornerShape(12.dp))
                        ) {
                            Image(
                                painter = painterResource(id = R.drawable.img_1), // Replace with your plant drawable
                                contentDescription = "Plant Icon",
                                modifier = Modifier
                                    .size(80.dp)
                            )
                            Column(
                                modifier = Modifier.padding(
                                    start = 8.dp,
                                    end = 8.dp,
                                    top = 8.dp,
                                    bottom = 8.dp
                                )
                            ) {
                                Text(
                                    text = "Plant 1",
                                    fontSize = 22.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = Color.Black
                                )
                                Text(
                                    text = "Rs. 100",
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    color = GreenJC
                                )

                                Row {
                                    Text(
                                        text = "Quantity",
                                        fontSize = 16.sp,
                                        color = Color.Gray,
                                        modifier = Modifier
                                            .weight(1f),
                                    )
                                    IconButton(
                                        onClick = { /* Handle click */ },
                                        modifier = Modifier
                                            .background(GreenJC, shape = RoundedCornerShape(4.dp))
                                            .size(24.dp)
                                            .clip(RoundedCornerShape(4.dp)),
                                    ) {
                                        Image(
                                            painter = painterResource(R.drawable.baseline_horizontal_rule_24),
                                            contentDescription = ""
                                        )
                                    }

                                    Text(
                                        text = "1",
                                        color = GreenJC,
                                        fontSize = 20.sp,
                                        fontWeight = FontWeight.Bold,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier
                                            .weight(0.2f)
                                            .background(
                                                Color(0xFFB1FFD3),
                                                shape = RoundedCornerShape(4.dp)
                                            )
                                    )

                                    IconButton(
                                        onClick = { /* Handle click */ },
                                        modifier = Modifier
                                            .background(GreenJC, shape = RoundedCornerShape(4.dp))
                                            .size(24.dp)
                                            .clip(RoundedCornerShape(4.dp)),
                                    ) {
                                        Icon(
                                            imageVector = Icons.Default.Add,
                                            contentDescription = "",
                                            tint = Color.White
                                        )
                                    }
                                }
                            }
                        }
                    }

                    //Amount
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 12.dp, end = 12.dp, top = 4.dp)
                    ) {
                        /*  IconButton(
                              onClick = {

                              },
                              modifier = Modifier
                                  .align(Alignment.CenterHorizontally)
                                  .background(
                                      GreenJC,
                                      shape = RoundedCornerShape(topStart = 4.dp, topEnd = 4.dp)
                                  )
                                  .width(50.dp)
                                  .height(24.dp)
                          ) {
                              Icon(
                                  imageVector = Icons.Default.KeyboardArrowUp,
                                  contentDescription = "",
                                  tint = Color.White
                              )
                          }*/
                        Text(
                            text = "Apply Coupon",
                            color = Color.Black,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Spacer(modifier = Modifier.height(8.dp))

                        Row(
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            OutlinedTextField(
                                value = "",
                                onValueChange = {},
                                placeholder = { Text(text = "Enter Code") },
                                modifier = Modifier
                                    .weight(1f),
                                singleLine = true,
                                colors = OutlinedTextFieldDefaults.colors(
                                    focusedTextColor = Color.Black,
                                    unfocusedTextColor = Color.Black,
                                    unfocusedBorderColor = Color(0xFFF8F8F8),
                                    focusedBorderColor = Color(0xFFF8F8F8),
                                    focusedLabelColor = Color(0xFFFFFFFF),
                                    unfocusedLabelColor = Color(0xFFB6B6B6),
                                    focusedLeadingIconColor = GreenJC,
                                    unfocusedLeadingIconColor = GreenJC,
                                    focusedTrailingIconColor = Color(0xFFFFFFFF),
                                    unfocusedTrailingIconColor = Color(0xFFFFFFFF),
                                    unfocusedContainerColor = Color(0xFFFFFFFF),
                                    focusedContainerColor = Color(0xFFFFFFFF),
                                ),
                                shape = RoundedCornerShape(12.dp)
                            )

                            Button(
                                onClick = {/**/ },
                                colors = ButtonDefaults.buttonColors(GreenJC),
                                shape = RoundedCornerShape(12.dp),
                                modifier = Modifier
                                    .padding(4.dp, 0.dp, 0.dp, 0.dp)
                            ) {
                                Text(
                                    text = "Apply",
                                    color = Color.White,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier.padding(8.dp),
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(4.dp))

                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 12.dp, end = 12.dp)
                            .background(Color.White, shape = RoundedCornerShape(12.dp))
                    ) {
                        Text(
                            text = "Price Details",
                            color = Color.Black,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier
                                .padding(12.dp, 12.dp, 8.dp, 8.dp)
                        )

                        Column(
                            modifier = Modifier
                                .padding(start = 12.dp, end = 12.dp)
                                .fillMaxWidth()
                                .size(60.dp)
                                .verticalScroll(rememberScrollState())
                        ) {
                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "Item 1",
                                    color = Color.Gray,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Text(
                                    text = "Rs. 180",
                                    color = Color.Gray,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "Item 2",
                                    color = Color.Gray,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Text(
                                    text = "Rs. 789",
                                    color = Color.Gray,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            ) {
                                Text(
                                    text = "Plant 1",
                                    color = Color.Gray,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium,
                                    modifier = Modifier
                                        .weight(1f)
                                )
                                Text(
                                    text = "Rs. 100",
                                    color = Color.Gray,
                                    fontSize = 14.sp,
                                    fontWeight = FontWeight.Medium
                                )
                            }

                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Delivery Charges",
                                color = Color.Gray,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier
                                    .padding(start = 12.dp, end = 12.dp)
                                    .weight(1f)
                            )
                            Text(
                                text = "Rs. 100",
                                color = Color.Gray,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding(end = 12.dp)
                            )
                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Coupon Discount",
                                color = Color.Gray,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier
                                    .padding(start = 12.dp, end = 12.dp)
                                    .weight(1f)
                            )
                            Text(
                                text = "Rs. 90",
                                color = Color.Gray,
                                fontSize = 14.sp,
                                fontWeight = FontWeight.Medium,
                                modifier = Modifier.padding(end = 12.dp)
                            )
                        }
                        Divider(
                            modifier = Modifier.padding(
                                start = 12.dp,
                                end = 12.dp,
                                bottom = 8.dp
                            )
                        )
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        ) {
                            Text(
                                text = "Total Amount Payable",
                                color = Color.Black,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier
                                    .padding(start = 12.dp, end = 12.dp)
                                    .weight(1f)
                            )
                            Text(
                                text = "Rs. 1259",
                                color = GreenJC,
                                fontSize = 16.sp,
                                fontWeight = FontWeight.Bold,
                                modifier = Modifier.padding(end = 12.dp)
                            )
                        }
                        Spacer(modifier = Modifier.height(12.dp))
                    }

                    Spacer(modifier = Modifier.height(12.dp))

                    Button(
                        onClick = {/**/ },
                        colors = ButtonDefaults.buttonColors(GreenJC),
                        shape = RoundedCornerShape(12.dp),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(30.dp, 0.dp)
                    ) {
                        Text(
                            text = "Checkout",
                            color = Color.White,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold,
                            modifier = Modifier.padding(8.dp),
                        )
                        Icon(
                            imageVector = Icons.Default.ArrowForward, contentDescription = "",
                            tint = Color.White
                        )
                    }
                }

            }

        }
    }
}