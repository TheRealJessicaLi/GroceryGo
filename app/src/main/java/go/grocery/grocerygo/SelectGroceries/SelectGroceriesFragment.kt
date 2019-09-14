package go.grocery.grocerygo.SelectGroceries

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox

import go.grocery.grocerygo.R
import go.grocery.grocerygo.Results.SearchResultsActivity
import kotlinx.android.synthetic.main.fragment_user_info.*

private var shoppingList = ArrayList<String>()

class SelectGroceriesFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_select_groceries, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)



        next_button.setOnClickListener {
            val myIntent = Intent(activity, SearchResultsActivity::class.java)
            myIntent.putExtra("shopping_list", shoppingList)
            activity!!.startActivity(myIntent)
        }
    }

    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.checkbox_apples -> {
                    if (checked) {
                        shoppingList.add("apples")
                    }
                }
                R.id.checkbox_bananas -> {
                    if (checked) {
                        shoppingList.add("bananas")
                    }
                }
                R.id.checkbox_beans -> {
                    if (checked) {
                        shoppingList.add("beans")
                    }
                }
                R.id.checkbox_bellpeppers -> {
                    if (checked) {
                        shoppingList.add("bell peppers")
                    }
                }
                R.id.checkbox_bread -> {
                    if (checked) {
                        shoppingList.add("bread")
                    }
                }
                R.id.checkbox_brusselsprouts -> {
                    if (checked) {
                        shoppingList.add("brussel sprouts")
                    }
                }
                R.id.checkbox_butter -> {
                    if (checked) {
                        shoppingList.add("butter")
                    }
                }
                R.id.checkbox_carrots -> {
                    if (checked) {
                        shoppingList.add("carrots")
                    }
                }
                R.id.checkbox_cereal -> {
                    if (checked) {
                        shoppingList.add("cereal")
                    }
                }
                R.id.checkbox_cookies -> {
                    if (checked) {
                        shoppingList.add("cookies")
                    }
                }
                R.id.checkbox_corn -> {
                    if (checked) {
                        shoppingList.add("corn")
                    }
                }
                R.id.checkbox_cucumbers -> {
                    if (checked) {
                        shoppingList.add("cucumbers")
                    }
                }
                R.id.checkbox_greenonions -> {
                    if (checked) {
                        shoppingList.add("green onions")
                    }
                }
                R.id.checkbox_lettuce -> {
                    if (checked) {
                        shoppingList.add("lettuce")
                    }
                }
                R.id.checkbox_milk -> {
                    if (checked) {
                        shoppingList.add("milk")
                    }
                }
                R.id.checkbox_oliveoil -> {
                    if (checked) {
                        shoppingList.add("olive oil")
                    }
                }
                R.id.checkbox_pasta -> {
                    if (checked) {
                        shoppingList.add("pasta")
                    }
                }
                R.id.checkbox_potatoes -> {
                    if (checked) {
                        shoppingList.add("potatoes")
                    }
                }
                R.id.checkbox_salami -> {
                    if (checked) {
                        shoppingList.add("salami")
                    }
                }
                R.id.checkbox_tomatoes -> {
                    if (checked) {
                        shoppingList.add("tomatoes")
                    }
                }
            }
        }
    }
}
