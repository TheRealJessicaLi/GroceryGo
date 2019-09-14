package go.grocery.grocerygo.SelectGroceries

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import go.grocery.grocerygo.R
import kotlinx.android.synthetic.main.fragment_user_info.*

class ShoppingInstructionsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_shopping_instructions, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        next_button.setOnClickListener {
            val myIntent = Intent(activity, SelectGroceriesActivity::class.java)
            activity!!.startActivity(myIntent)
        }
    }
}
