package com.example.loginjc.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.loginjc.ui.theme.GreenJC

@Composable
fun HomeScreen() {
    MyBottomNavBar()
}

@OptIn(ExperimentalMaterial3Api::class)
@Preview(showSystemUi = true)
@Composable
fun MyBottomNavBar() {
    val navigationController = rememberNavController()
    val currentDestination =
        navigationController.currentBackStackEntryAsState().value?.destination?.route
    val context = LocalContext.current.applicationContext

    Scaffold(
        containerColor = GreenJC,
        bottomBar = {
            BottomAppBar(containerColor = Color(0xFFF1F1F1)) {
                /*IconButton(onClick = {
                    navigationController.navigate(Screens.Home.screens) {
                        popUpTo(Screens.Home.screens) { inclusive = true }
                    }
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.Home,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (currentDestination == Screens.Home.screens) GreenJC else Color.DarkGray
                    )
                }



                IconButton(onClick = {
                    navigationController.navigate(Screens.Search.screens) {
                        popUpTo(Screens.Search.screens) { inclusive = true }
                    }
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.Search,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (currentDestination == Screens.Search.screens) GreenJC else Color.DarkGray
                    )
                }

                IconButton(onClick = {
                    navigationController.navigate(Screens.Carts.screens) {
                        popUpTo(Screens.Carts.screens) { inclusive = true }
                    }
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.ShoppingCart,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (currentDestination == Screens.Carts.screens) GreenJC else Color.DarkGray
                    )
                }

                IconButton(onClick = {
                    navigationController.navigate(Screens.Profile.screens) {
                        popUpTo(Screens.Profile.screens) { inclusive = true }
                    }
                }, modifier = Modifier.weight(1f)) {
                    Icon(
                        Icons.Default.Person,
                        contentDescription = null,
                        modifier = Modifier.size(26.dp),
                        tint = if (currentDestination == Screens.Profile.screens) GreenJC else Color.DarkGray
                    )
                } */

                IconButton(
                    onClick = {
                        navigationController.navigate(Screens.Home.screens) {
                            popUpTo(Screens.Home.screens) { inclusive = true }
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            Icons.Default.Home,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (currentDestination == Screens.Home.screens) GreenJC else Color.DarkGray
                        )
                        Text(
                            text = "Home",
                            style = MaterialTheme.typography.bodySmall, // Choose appropriate style
                            color = if (currentDestination == Screens.Home.screens) GreenJC else Color.DarkGray,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                IconButton(
                    onClick = {
                        navigationController.navigate(Screens.Search.screens) {
                            popUpTo(Screens.Search.screens) { inclusive = true }
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            Icons.Default.Search,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (currentDestination == Screens.Search.screens) GreenJC else Color.DarkGray
                        )
                        Text(
                            text = "Search",
                            style = MaterialTheme.typography.bodySmall, // Choose appropriate style
                            color = if (currentDestination == Screens.Search.screens) GreenJC else Color.DarkGray,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                IconButton(
                    onClick = {
                        navigationController.navigate(Screens.Carts.screens) {
                            popUpTo(Screens.Carts.screens) { inclusive = true }
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            Icons.Default.ShoppingCart,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (currentDestination == Screens.Carts.screens) GreenJC else Color.DarkGray
                        )
                        Text(
                            text = "Carts",
                            style = MaterialTheme.typography.bodySmall, // Choose appropriate style
                            color = if (currentDestination == Screens.Carts.screens) GreenJC else Color.DarkGray,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

                IconButton(
                    onClick = {
                        navigationController.navigate(Screens.Profile.screens) {
                            popUpTo(Screens.Profile.screens) { inclusive = true }
                        }
                    },
                    modifier = Modifier.weight(1f)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Icon(
                            Icons.Default.Person,
                            contentDescription = null,
                            modifier = Modifier.size(26.dp),
                            tint = if (currentDestination == Screens.Profile.screens) GreenJC else Color.DarkGray
                        )
                        Text(
                            text = "Profile",
                            style = MaterialTheme.typography.bodySmall, // Choose appropriate style
                            color = if (currentDestination == Screens.Profile.screens) GreenJC else Color.DarkGray,
                            maxLines = 1,
                            overflow = TextOverflow.Ellipsis
                        )
                    }
                }

            }
        }
    ) { paddingValues ->
        NavHost(
            navController = navigationController,
            startDestination = Screens.Home.screens,
            modifier = Modifier
                .padding(paddingValues)
        ) {
            composable(Screens.Home.screens) { Home(navigationController) }
            composable(Screens.Search.screens) { Search() }
            composable(Screens.Carts.screens) { Carts() }
            composable(Screens.Notification.screens) { Notification() }
            composable(Screens.Profile.screens) { Profile() }
        }
    }
}