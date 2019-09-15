package go.grocery.grocerygo.SelectGroceries

import android.content.Context
import android.content.res.Resources
import android.provider.Settings.Global.getString
import android.support.design.widget.CoordinatorLayout.Behavior.setTag
import android.widget.TextView
import android.view.ViewGroup
import android.view.LayoutInflater
import android.view.View
import android.widget.BaseAdapter
import go.grocery.grocerygo.R


class SummaryListAdapter(context: Context, private val objects: ArrayList<SummaryListItem>) : BaseAdapter() {

    private val inflater: LayoutInflater

    private inner class ViewHolder {
        internal var textView1: TextView? = null
        internal var textView2: TextView? = null
    }

    init {
        inflater = LayoutInflater.from(context)
    }

    override fun getCount(): Int {
        return objects.size
    }

    override fun getItem(position: Int): SummaryListItem {
        return objects[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var convertView = convertView
        var holder: ViewHolder? = null
        if (convertView == null) {
            holder = ViewHolder()
            convertView = inflater.inflate(R.layout.summary_list_row, null)
            holder.textView1 = convertView!!.findViewById(R.id.item_name)
            holder.textView2 = convertView!!.findViewById(R.id.item_price)
            convertView!!.setTag(holder)
        } else {
            holder = convertView!!.tag as ViewHolder?
        }
        holder!!.textView1!!.text = objects[position].getstr1()
        holder!!.textView2!!.text = "$"+objects[position].getstr2()
        return convertView
    }
}