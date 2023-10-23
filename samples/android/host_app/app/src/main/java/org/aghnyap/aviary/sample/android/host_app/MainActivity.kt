package org.aghnyap.aviary.sample.android.host_app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import dagger.hilt.android.AndroidEntryPoint
import io.flutter.embedding.android.FlutterActivity
import org.aghnyap.aviary.sample.android.counter.compose.CounterPage
import org.aghnyap.aviary.sample.android.host_app.ui.theme.HostAppTheme

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HostAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CounterPage(
                        title = "Flutter Demo Home Page",
                        onPageClick = {
                            startActivity(
                                FlutterActivity
                                    .withCachedEngine("my_engine_id")
                                    .build(this)
                            )
                        }
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun ContentPreview() {
    CounterPage(title = "Flutter Demo Home Page")
}
