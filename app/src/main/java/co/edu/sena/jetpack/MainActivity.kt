package co.edu.sena.jetpack

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

import co.edu.sena.jetpack.ui.theme.JetPackTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetPackTheme {
                // A surface container using the 'background' color from the theme
                MyApp()
            }
        }
    }
}



@Composable
fun MyApp(
    names: List<String> = listOf("Wold", "Compose")
){
    Column (modifier = Modifier.padding(vertical = 4.dp)) {
        for (name in names){
            Greeting(name = name)
        }
    }
}



@Composable
fun Greeting(name: String) {
    remember { mutableSetOf(false) }

    Surface(
        color=MaterialTheme.colorScheme.primary,
        modifier = Modifier.padding(vertical = 4.dp, horizontal = 8.dp ))
    {
        Row (modifier = Modifier.padding(24.dp)){
            Column (modifier = Modifier.weight(1f)){
                Text (text = "Hello, ")
                Text (text = name)
            }
            ElevatedButton(onClick = { /*TODO*/ }) {
                Text("Show more")
            }
        }
    }
}



@Preview(showBackground = true, widthDp = 320)
@Composable
fun DefaultPreview() {
    JetPackTheme {
        MyApp()
    }
}



