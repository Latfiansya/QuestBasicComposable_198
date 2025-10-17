package com.example.p2

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.graphics.Brush
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.draw.clip
import androidx.compose.foundation.border

@Composable
fun TataletakColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(top = 20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakRow(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}

@Composable
fun TataletakBox(modifier: Modifier) {
    Box(
        modifier = modifier
            .fillMaxHeight()
            .fillMaxWidth(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = "Box 1")
        Text(text = "Column 1")
        Text(text = "Row 1")
        Text(text = "Row 2")
    }
}

@Composable
fun TataletakColumnRow(modifier: Modifier) {
    Column {
        //Baris1
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris1")
            Text(text = "Komponen2Baris1")
            Text(text = "Komponen3Baris1")
        }
        //Baris2
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceEvenly
        ) {
            Text(text = "Komponen1Baris2")
            Text(text = "Komponen2Baris2")
            Text(text = "Komponen3Baris2")
        }
    }
}

@Composable
fun TataletakRowColumn(modifier: Modifier) {
    Row(
        modifier = modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceEvenly
    ) {
        Column {
            Text(text = "Komponen1Kolom1")
            Text(text = "Komponen2Kolom1")
            Text(text = "Komponen3Kolom1")
        }
        Column {
            Text(text = "Komponen1Kolom2")
            Text(text = "Komponen2Kolom2")
            Text(text = "Komponen3Kolom2")
        }
    }
}

@Composable
fun TataletakBoxColumnRow(modifier: Modifier) {
    val gambar = painterResource(id = R.drawable.roblox) // asumsi nama drawable

    Column(
        modifier = modifier
            .fillMaxWidth()
            .background(Color(0xFFF4F4F4))
    ) {
        Box(
            modifier = modifier
                .height(120.dp)
                .fillMaxWidth()
                .background(
                    brush = Brush.horizontalGradient( // gradasi halus abu ke biru tua
                        colors = listOf(Color(0xFF333333), Color(0xFF555555))
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Column {
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "Home",
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "Games",
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold
                    )
                    Text(
                        text = "Avatar",
                        color = Color.White,
                        fontWeight = FontWeight.SemiBold
                    )
                }
                Row(
                    modifier = modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceEvenly
                ) {
                    Text(
                        text = "Friends",
                        color = Color.LightGray,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = "Inventory",
                        color = Color.LightGray,
                        fontWeight = FontWeight.Medium
                    )
                    Text(
                        text = "Messages",
                        color = Color.LightGray,
                        fontWeight = FontWeight.Medium
                    )
                }
            }
        }

        Spacer(modifier = Modifier.height(height = 3.dp))

        Box(
            modifier = modifier
                .height(500.dp)
                .fillMaxWidth()
                .background(
                    brush = Brush.verticalGradient( // gradasi dari abu terang ke abu gelap
                        colors = listOf(Color(0xFFE0E0E0), Color(0xFFB0B0B0))
                    )
                ),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = gambar,
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(1f) // ukuran proporsional (tidak terlalu besar)
                    .padding(10.dp)
                    .clip(RoundedCornerShape(7.dp)) // sudut melengkung
                    .border(2.dp, Color.White, RoundedCornerShape(7.dp)), // bingkai putih tipis
                contentScale = ContentScale.Crop
            )
            Text(
                text = "Roblox",
                fontSize = 32.sp,
                color = Color.White,
                fontWeight = FontWeight.ExtraBold,
                fontFamily = FontFamily.Monospace,
                modifier = Modifier
                    .align(Alignment.Center)
                    .background(
                        color = Color(0x88000000), // transparan hitam di belakang teks
                        shape = RoundedCornerShape(12.dp)
                    )
                    .padding(horizontal = 12.dp, vertical = 7.dp)
            )
        }
    }
}