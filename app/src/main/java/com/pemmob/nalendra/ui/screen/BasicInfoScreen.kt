package com.pemmob.nalendra.ui.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.layout
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.content.ContextCompat
import com.google.accompanist.drawablepainter.rememberDrawablePainter
import com.pemmob.nalendra.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BasicInfoScreen(onNavigateToContact:()-> Unit){
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("Tentang Jualan") },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primary,
                    titleContentColor = MaterialTheme.colorScheme.onPrimary,
                    navigationIconContentColor = MaterialTheme.colorScheme.onPrimary
                ),
                navigationIcon = {
                    Icon(
                        painter = painterResource(id = R.drawable.info_icon),
                        contentDescription = "Info Icon",
                        modifier = Modifier.padding(horizontal = 16.dp)
                    )
                }
            )
        }
    ) { paddingValues ->
        LayoutTentangJualan(
            modifier = Modifier.padding(paddingValues),
            onNavigateToContact = onNavigateToContact
        )
    }
}

@Composable
fun LayoutTentangJualan(modifier: Modifier = Modifier, onNavigateToContact: () -> Unit) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(all = 16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.mipmap.ic_launcher_foreground),
            contentDescription = "Logo Aplikasi",
            modifier = Modifier.size(120.dp)
        )

        Spacer(modifier = Modifier.height(24.dp))

        Text(
            text = "Tentang Jualan",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(16.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.primary,
                contentColor = MaterialTheme.colorScheme.onPrimary
            )
        ) {
            Text(
                text = "Aplikasi Jualan adalah platform yang mewadahi produk lokal UMKM di wilayah Kabupaten Purbalingga, Jawa Tengah.",
                fontSize = 16.sp,
                modifier = Modifier.padding(all = 16.dp)
            )
        }

        Spacer(modifier = Modifier.height(32.dp))

        Card(
            modifier = Modifier.fillMaxWidth(),
            elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.tertiary,
                contentColor = MaterialTheme.colorScheme.onTertiary
            )
        ) {
            Row(
                modifier = Modifier.padding(all = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = "Misi Kami:",
                    style = MaterialTheme.typography.titleLarge,
                    color = Color.White,
                    modifier = Modifier.weight(1f)
                )
                Text(
                    text = "Memajukan UMKM Lokal",
                    modifier = Modifier.weight(2f)
                )
                Spacer(modifier = Modifier.weight(1f))
            }
        }
        Spacer(modifier = Modifier.weight(1f))

        Button(
            onClick = onNavigateToContact,
            modifier = Modifier.fillMaxWidth().height(50.dp)
        ) {
            Text("Hubungi Kami", style = MaterialTheme.typography.labelLarge)
        }
        Spacer(modifier= Modifier.height(16.dp))
    }
}