package go.grocery.grocerygo.Results

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import go.grocery.grocerygo.R
import go.grocery.grocerygo.SelectGroceries.ShoppingInstructionsActivity
import go.grocery.grocerygo.SelectGroceries.SummaryListAdapter
import go.grocery.grocerygo.SelectGroceries.SummaryListItem
import kotlinx.android.synthetic.main.fragment_search_results.*

class SearchResultsFragment : Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_search_results, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val supermarketName = arguments!!.getString("supermarket_name")
        val totalPrice = arguments!!.getDouble("total_price")
        val items = arguments!!.getSerializable("grocery_items")

        store_name.text = supermarketName
        total_price.text = getString(R.string.dollar_price, String.format("%.2f", totalPrice))
        val customAdapter = SummaryListAdapter(this.requireContext(), items as ArrayList<SummaryListItem>)
        grocery_list.adapter = customAdapter

        new_list_button.setOnClickListener {
            val myIntent = Intent(activity, ShoppingInstructionsActivity::class.java)
            activity!!.startActivity(myIntent)
        }
    }
}
