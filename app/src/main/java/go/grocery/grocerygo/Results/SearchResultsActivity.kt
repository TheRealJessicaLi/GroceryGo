package go.grocery.grocerygo.Results

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import go.grocery.grocerygo.R
import com.google.firebase.firestore.FirebaseFirestore

class SearchResultsActivity : AppCompatActivity() {

    data class Supermarket(val name : String, val totalPrice : Double, val items : HashMap<String, Double>)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setSupportActionBar(findViewById(R.id.my_toolbar))
        setContentView(R.layout.activity_search_results)
    }

    fun getItems(names : Collection<String>) : Supermarket {
        val db = FirebaseFirestore.getInstance()

        val walmartItems = HashMap<String, Double>()
        val zehrsItems = HashMap<String, Double>()
        val nofrillsItems = HashMap<String, Double>()

        db.collection("walmart")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    if (names.contains(document.id) ) {
                        walmartItems[document.getString("name") as String] = document.getDouble("price") as Double
                    }
                }
            }

        db.collection("zehrs")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    if (names.contains(document.id) ) {
                        zehrsItems[document.getString("name") as String] = document.getDouble("price") as Double
                    }
                }
            }

        db.collection("nofrills")
            .get()
            .addOnSuccessListener { result ->
                for (document in result) {
                    if (names.contains(document.id) ) {
                        nofrillsItems[document.getString("name") as String] = document.get("price") as Double
                    }
                }
            }

        var walmart = 0.0
        var zehrs = 0.0
        var nofrills = 0.0

        for ((k, v) in walmartItems)
            walmart += v
        for ((k, v) in zehrsItems)
            zehrs += v
        for ((k, v) in nofrillsItems)
            nofrills += v

        if (walmart <= zehrs && walmart <= nofrills) return Supermarket("Walmart", walmart, walmartItems)
        if (zehrs <= walmart && zehrs <= nofrills) return Supermarket("Zehrs", zehrs, zehrsItems)
        return Supermarket("No Frills", nofrills, nofrillsItems)

    }
}
