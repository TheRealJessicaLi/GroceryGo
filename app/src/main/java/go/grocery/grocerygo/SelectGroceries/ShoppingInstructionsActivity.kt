package go.grocery.grocerygo.SelectGroceries

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import go.grocery.grocerygo.R

class ShoppingInstructionsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shopping_instructions)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        //userInfoFragment.setArguments(bundle)
        fragmentTransaction.replace(R.id.shopping_activity_content, ShoppingInstructionsFragment())
        fragmentTransaction.addToBackStack(null)
        fragmentTransaction.commit()
    }
}
