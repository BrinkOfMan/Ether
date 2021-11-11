package stolaf.pdc.ether

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Accounts : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_accounts)
    }

    // Navigate to Inventory page
    fun toInventory(view: View){
        val intent = Intent(this, Inventory::class.java);
        startActivity(intent)
    }
}