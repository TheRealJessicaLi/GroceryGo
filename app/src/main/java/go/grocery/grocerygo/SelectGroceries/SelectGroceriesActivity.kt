package go.grocery.grocerygo.SelectGroceries

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import go.grocery.grocerygo.R

class SelectGroceriesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_select_groceries)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        //userInfoFragment.setArguments(bundle)
        fragmentTransaction.replace(R.id.select_activity_content, SelectGroceriesFragment())
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }

    fun onCheckboxClicked(view: View){
        SelectGroceriesFragment().onCheckboxClicked(view)
    }
}
