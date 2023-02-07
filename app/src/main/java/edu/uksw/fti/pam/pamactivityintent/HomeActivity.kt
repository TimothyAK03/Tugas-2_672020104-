package edu.uksw.fti.pam.pamactivityintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.print.PrintAttributes
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import edu.uksw.fti.pam.pamactivityintent.ui.theme.PAMActivityIntentTheme

class HomeActivity : AppCompatActivity() {

    private lateinit var img1View: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        img1View = findViewById(R.id.img1)

        setContent {
            PAMActivityIntentTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                ) {
                        HomeField()
                    }
                }
            }
        }
    }

@Composable
fun HomeField() {
    val img2 = painterResource(R.drawable.img2)
    val img1 = painterResource(R.drawable.img1)
    val img3 = painterResource(R.drawable.img3)
    val dolar = painterResource(R.drawable.dolar)
    val mata = painterResource(R.drawable.mata)
    val btc = painterResource(R.drawable.btc)
    val eth = painterResource(R.drawable.eth)
    val msg = painterResource(R.drawable.msg)
    val depo = painterResource(R.drawable.depo)
    val tarik = painterResource(R.drawable.tarik)
    val earn = painterResource(R.drawable.earn)
    val academy = painterResource(R.drawable.academy)
    val nabung = painterResource(R.drawable.nabung)
    val price = painterResource(R.drawable.price)
    val ref = painterResource(R.drawable.ref)
    val kom = painterResource(R.drawable.kom)
    val riwayat = painterResource(R.drawable.riwayat)
    val lain = painterResource(R.drawable.lain)
    val beranda = painterResource(R.drawable.beranda)
    val jelajah = painterResource(R.drawable.jelajah)
    val market = painterResource(R.drawable.market)
    val wallet = painterResource(R.drawable.wallet)
    val akun = painterResource(R.drawable.akun)

    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Image(
            painter = img2,
            contentDescription = null,
            modifier = Modifier
                .size(80.dp)
                .padding(0.dp)

        )
        Image(
            painter = img1,
            contentDescription = null,
            modifier = Modifier
                .size(80.dp)
                .padding(top = 0.dp, start = 55.dp)

        )
        Image(
            painter = img3,
            contentDescription = null,
            modifier = Modifier
                .size(80.dp)
                .padding(start = 50.dp, top = 0.dp)

        )
        Text(
            text = "Stake PTU",
            modifier = Modifier
                .padding(top = 28.dp, start = 0.dp)
        )
    }
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(150.dp)
            .offset(y = 100.dp),
        backgroundColor = Color.White,
    ) {
        Row(
            modifier = Modifier
                .padding(start = 20.dp, top = 10.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Total Nilai Aset",
                modifier = Modifier
                    .padding(top = 0.dp)
            )
            Text(
                text = "Saldo Rupiah",
                modifier = Modifier
                    .padding(top = 0.dp, start = 110.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(start = 0.dp, top = 0.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = dolar,
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
                    .padding(top = 46.dp)
            )
            Text(
                text = "Rp 300.000",
                modifier = Modifier
                    .padding(top = 44.dp)
            )
            Image(
                painter = mata,
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
                    .padding(top = 44.dp)
            )
            Text(
                text = "Rp 50.000",
                modifier = Modifier
                    .padding(top = 44.dp, start = 0.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(start = 0.dp, top = 32.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = btc,
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
                    .padding(top = 50.dp)
            )
            Text(
                text = "Rp 150.000",
                modifier = Modifier
                    .padding(top = 48.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(start = 0.dp, top = 80.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = eth,
                contentDescription = null,
                modifier = Modifier
                    .size(70.dp)
                    .padding(top = 24.dp)
            )
            Text(
                text = "Rp 100.000",
                modifier = Modifier
                    .padding(top = 33.dp)
            )
            Image(
                painter = msg,
                contentDescription = null,
                modifier = Modifier
                    .size(110.dp)
                    .padding(top = 12.dp, start = 78.dp)
            )
        }
    }
    Row(
        modifier = Modifier
            .padding(start = 50.dp, top = 255.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Button(onClick = {
            //No
        }) {
            Image(
                painter = depo,
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp)
                    .padding(top = 0.dp, start = 0.dp)
            )
            Text(
                text = "Deposit",
                modifier = Modifier
                    .padding(start = 10.dp)
            )

        }
        Text(
            text = "",
            modifier = Modifier
                .padding(start = 60.dp)
        )
        Button(onClick = {
            //No
        }, colors = ButtonDefaults.buttonColors(backgroundColor = Color.White)) {
            Image(
                painter = tarik,
                contentDescription = null,
                modifier = Modifier
                    .size(20.dp)
                    .padding(top = 0.dp, start = 0.dp)
            )
            Text(
                text = "Tarik",
                modifier = Modifier
                    .padding(start = 10.dp)
            )
        }
    }
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
            .offset(y = 310.dp),
        backgroundColor = Color.White,
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = earn,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 5.dp, top = 2.dp)
            )
            Image(
                painter = academy,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 33.dp, top = 0.dp)
            )
            Image(
                painter = nabung,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 60.dp, top = 2.dp)
            )
            Image(
                painter = price,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 57.dp, top = 2.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Earn",
                modifier = Modifier
                    .padding(top = 40.dp, start = 10.dp)
            )
            Text(
                text = "Academy",
                modifier = Modifier
                    .padding(top = 40.dp, start = 23.dp)
            )
            Text(
                text = "Nabung Rutin",
                modifier = Modifier
                    .padding(top = 40.dp, start = 16.dp)
            )
            Text(
                text = "Price Alert",
                modifier = Modifier
                    .padding(top = 40.dp, start = 10.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = ref,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 5.dp, top = 90.dp)
            )
            Image(
                painter = kom,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 33.dp, top = 90.dp)
            )
            Image(
                painter = riwayat,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 62.dp, top = 88.dp)
            )
            Image(
                painter = lain,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 58.dp, top = 85.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(20.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Referral",
                modifier = Modifier
                    .padding(top = 130.dp, start = 0.dp)
            )
            Text(
                text = "Komunitas",
                modifier = Modifier
                    .padding(top = 130.dp, start = 5.dp)
            )
            Text(
                text = "Riwayat",
                modifier = Modifier
                    .padding(top = 130.dp, start = 30.dp)
            )
            Text(
                text = "Lainnya",
                modifier = Modifier
                    .padding(top = 130.dp, start = 37.dp)
            )
        }
    }
    Row(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        Text(
            text = "Terakhir Dikunjungi",
            modifier = Modifier
                .padding(top = 505.dp, start = 0.dp)
        )
    }
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(210.dp)
            .offset(y = 560.dp),
        backgroundColor = Color.White,
    ) {
        Row(
            modifier = Modifier
                .padding(start = 0.dp, top = 0.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = btc,
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(top = 0.dp)
            )
            Text(
                text = "Bitcoin",
                modifier = Modifier
                    .padding(top = 20.dp)
            )
            Text(
                text = "Rp 355.000.000", color = Color.Green,
                modifier = Modifier
                    .padding(top = 20.dp, start = 90.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(start = 50.dp, top = 0.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "BTC",
                modifier = Modifier
                    .padding(top = 53.dp, start = 58.dp)
            )
            Text(
                text = "3.00 %", color = Color.Green,
                modifier = Modifier
                    .padding(top = 53.dp, start = 178.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 85.dp)
        ) {
            Divider(color = Color.Black, thickness = 1.dp)
        }
        Row(
            modifier = Modifier
                .padding(start = 0.dp, top = 40.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = eth,
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(top = 48.dp)
            )
            Text(
                text = "Etherium",
                modifier = Modifier
                    .padding(top = 50.dp)
            )
            Text(
                text = "Rp 24.000.000", color = Color.Red,
                modifier = Modifier
                    .padding(top = 50.dp, start = 85.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(start = 50.dp, top = 60.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "ETH",
                modifier = Modifier
                    .padding(top = 58.dp, start = 57.dp)
            )
            Text(
                text = "1.00 %", color = Color.Red,
                modifier = Modifier
                    .padding(top = 58.dp, start = 178.dp)
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 143.dp)
        ) {
            Divider(color = Color.Black, thickness = 1.dp)
        }
        Row(
            modifier = Modifier
                .padding(start = 0.dp, top = 100.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = img3,
                contentDescription = null,
                modifier = Modifier
                    .size(100.dp)
                    .padding(top = 48.dp)
            )
            Text(
                text = "Pintu Token",
                modifier = Modifier
                    .padding(top = 50.dp)
            )
            Text(
                text = "Rp 7.000", color = Color.Green,
                modifier = Modifier
                    .padding(top = 50.dp, start = 105.dp)
            )
        }
        Row(
            modifier = Modifier
                .padding(start = 50.dp, top = 120.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "PTU",
                modifier = Modifier
                    .padding(top = 58.dp, start = 57.dp)
            )
            Text(
                text = "0.35 %", color = Color.Green,
                modifier = Modifier
                    .padding(top = 58.dp, start = 178.dp)
            )
        }
    }
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(70.dp)
            .offset(y = 780.dp),
        backgroundColor = Color.White,
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp, bottom = 20.dp, top=0.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = beranda,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 15.dp, top = 5.dp)
            )
            Image(
                painter = jelajah,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 35.dp, top = 5.dp)
            )
            Image(
                painter = market,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 37.dp, top = 5.dp)
            )
            Image(
                painter = wallet,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 37.dp, top = 5.dp)
            )
            Image(
                painter = akun,
                contentDescription = null,
                modifier = Modifier
                    .padding(start = 40.dp, top = 5.dp)
            )
        }
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(start = 20.dp, end = 20.dp, bottom = 20.dp, top=0.dp),
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Beranda",
                modifier = Modifier
                    .padding(top = 30.dp, start = 0.dp)
            )
            Text(
                text = "Jelajah",
                modifier = Modifier
                    .padding(top = 30.dp, start = 10.dp)
            )
            Text(
                text = "Market",
                modifier = Modifier
                    .padding(top = 30.dp, start = 20.dp)
            )
            Text(
                text = "Wallet",
                modifier = Modifier
                    .padding(top = 30.dp, start = 21.dp)
            )
            Text(
                text = "Akun",
                modifier = Modifier
                    .padding(top = 30.dp, start = 28.dp)
            )
        }
    }
}
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    PAMActivityIntentTheme {
          HomeField()
    }
}


