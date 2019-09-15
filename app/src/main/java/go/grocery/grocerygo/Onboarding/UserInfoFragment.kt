package go.grocery.grocerygo.Onboarding

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import go.grocery.grocerygo.R
import kotlinx.android.synthetic.main.fragment_user_info.*
import android.content.Intent
import go.grocery.grocerygo.ApplicationVariables
import go.grocery.grocerygo.SelectGroceries.ShoppingInstructionsActivity




class UserInfoFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_user_info, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        next_button.setOnClickListener {
            (activity!!.application as ApplicationVariables).username = user_firstname.text.toString()

            val myIntent = Intent(activity, ShoppingInstructionsActivity::class.java)
            activity!!.startActivity(myIntent)
        }
    }
}
