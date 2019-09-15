package go.grocery.grocerygo.Onboarding

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import go.grocery.grocerygo.R

class UserInfoActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_info)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        //userInfoFragment.setArguments(bundle)
        fragmentTransaction.replace(R.id.user_info_activity_content, UserInfoFragment())
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}
