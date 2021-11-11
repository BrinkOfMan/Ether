package stolaf.pdc.ether

import android.content.Intent
<<<<<<< Updated upstream
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
=======
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.google.android.material.navigation.NavigationView
import stolaf.pdc.ether.fragments.add.AddFragmentTrans

class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener, MainFragment.OnFragmentItemSelectedListener {

    var drawer: DrawerLayout? = null
    var navigationView: NavigationView? = null
    var toggle: ActionBarDrawerToggle? = null
    var toolbar: Toolbar? = null
    var fManager: FragmentManager? = null
    var fTransaction: FragmentTransaction? = null
>>>>>>> Stashed changes

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
<<<<<<< Updated upstream
=======
        toolbar = findViewById(R.id.toolbar)
        setSupportActionBar(toolbar)
        supportActionBar?.setDisplayShowHomeEnabled(true);
        supportActionBar?.title = "Home"
        supportActionBar!!.setBackgroundDrawable(ColorDrawable(Color.rgb(33,150,243)))
        navigationView = findViewById(R.id.nested)
        navigationView!!.setNavigationItemSelectedListener(this)

        drawer = findViewById(R.id.drawer)
        toggle = ActionBarDrawerToggle(this, drawer, toolbar, R.string.open, R.string.close)
        drawer!!.addDrawerListener(toggle!!)
        toggle!!.isDrawerIndicatorEnabled = true
        toggle!!.syncState()


        // Load default fragment

        var mainFragment = MainFragment()
        fManager = supportFragmentManager
        fTransaction = fManager!!.beginTransaction()
        fTransaction!!.add(R.id.container_fragment, mainFragment);
        fTransaction!!.commit()

    }

    override fun onNavigationItemSelected(menuItem: MenuItem): Boolean {
        closeDrawer()
        if (menuItem.itemId == R.id.home) {
            loadFragment(MainFragment())
            supportActionBar?.title = "Home"
        }

        if (menuItem.itemId == R.id.cash) {
            loadFragment(Cash())
            supportActionBar?.title = "Cash"
        }

        if (menuItem.itemId == R.id.expenses) {
            loadFragment(Expenses())
            supportActionBar?.title = "Expenses"
        }

        if (menuItem.itemId == R.id.credit_cash_sales) {
            loadFragment(Credit_Cash_Sales())
            supportActionBar?.title = "Credit/Cash Sales"
        }

        if (menuItem.itemId == R.id.credit_cash_purchases) {
            loadFragment(Credit_Cash_Purchases())
            supportActionBar?.title = "Credit/Cash Purchases"
        }

        if (menuItem.itemId == R.id.inventory) {
            loadFragment(Inventory())
            supportActionBar?.title = "Inventory"
        }

        if (menuItem.itemId == R.id.sales_journal) {
            loadFragment(Sales_Journal())
            supportActionBar?.title = "Sales Journal"
        }

        if (menuItem.itemId == R.id.purchases_journal) {
            loadFragment(Purchases_Journal())
            supportActionBar?.title = "Purchases Journal"
        }

        if (menuItem.itemId == R.id.general_journal) {
            loadFragment(General_Journal())
            supportActionBar?.title = "General Journal"
        }

        if (menuItem.itemId == R.id.transactions) {
            val intent = Intent(this, AddActivity::class.java);
            loadFragment(AddFragmentTrans())
            supportActionBar?.title = "Add Transaction"
        }
        return true
    }

    private fun loadFragment(secondFragment: Fragment) {
        fManager = supportFragmentManager
        fTransaction = fManager!!.beginTransaction()
        fTransaction!!.replace(R.id.container_fragment, secondFragment)
        fTransaction!!.commit()
>>>>>>> Stashed changes
    }

    // Navigate to general accounts page
    fun toAccounts(view: View){
        val intent = Intent(this, Accounts::class.java);
        startActivity(intent)
    }

    // Navigate to Inventory page
    fun toInventory(view: View){
        val intent = Intent(this, Inventory::class.java);
        startActivity(intent)
    }
}