package go.grocery.grocerygo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import go.grocery.grocerygo.Onboarding.UserInfoActivity


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        next_button.setOnClickListener {
            val myIntent = Intent(this@MainActivity, UserInfoActivity::class.java)
            this@MainActivity.startActivity(myIntent)
        }
    }
}
