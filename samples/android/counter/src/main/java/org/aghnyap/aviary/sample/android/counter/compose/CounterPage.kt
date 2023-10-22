package org.aghnyap.aviary.sample.android.counter.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import org.aghnyap.aviary.sample.android.counter.viewmodel.CounterViewModel

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CounterPage(title: String, viewModel: CounterViewModel = hiltViewModel()) {
    val count by viewModel.count.collectAsState()

    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text(text = title) },
                colors = TopAppBarDefaults.smallTopAppBarColors(
                    containerColor = MaterialTheme.colorScheme.inversePrimary
                )
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { viewModel.increment() }) {
                Icon(Icons.Default.Add, contentDescription = "Increment")
            }
        },
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(it),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = "You have pushed the button this many times:",
                    style = MaterialTheme.typography.bodyLarge
                )

                Spacer(modifier = Modifier.height(8.dp))

                Text(
                    text = "$count",
                    style = MaterialTheme.typography.headlineMedium,
                    color = Color.Black
                )
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun CounterPagePreview() {
    CounterPage("Flutter Demo Home Page")
}