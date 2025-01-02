package com.example.braidsolitaireandroid.views

import android.content.pm.ActivityInfo
import android.content.res.Configuration
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MenuView(){
    Column(
        modifier = Modifier
            .padding()
            .fillMaxSize()
            .background(color = Color.Cyan),
        horizontalAlignment = Alignment.End,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "something",
            color = Color.Blue,
            modifier = Modifier
                .background(Color.Red)
                .padding(16.dp)
                .background(Color.Green)
        )
        Row(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Yellow)
                .padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.End
        ) {
            Text(
                text = "so",
                color = Color.Blue,
                modifier = Modifier
                    .background(Color.Red)
                    .padding(16.dp)
                    .background(Color.Green)
            )
        }
        Box(
            modifier = Modifier
                .size(400.dp)
        ) {
            Text(
                text = "jeden",
                modifier = Modifier.align(Alignment.BottomEnd)
            )
            Text(
                text = "dwa",
                fontSize = 30.sp
            )
        }




    }
    //whatever is called the latest is on top
    //to every single composable you can add modifier
    //icon is basically like picture but vector only

}
@Composable
fun OrientationExample() {
    val configuration = LocalConfiguration.current
    val orientation = configuration.orientation
    Column {
        Text(
            text = if (orientation == Configuration.ORIENTATION_PORTRAIT)
                "Portrait" else "Landscape",
            textAlign = TextAlign.Center
        )
    }
}
@Composable
@Preview()
private fun MainScreenPreview() {
          MenuView()
        //  ExpandableCard()



}