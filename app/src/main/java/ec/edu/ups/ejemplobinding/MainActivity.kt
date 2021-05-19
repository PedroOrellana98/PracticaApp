package ec.edu.ups.ejemplobinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.databinding.DataBindingUtil
import androidx.drawerlayout.widget.DrawerLayout
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.NavigationUI
import ec.edu.ups.ejemplobinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding:ActivityMainBinding
    private lateinit var drawerlayout: DrawerLayout
    private lateinit var appBarConfiguration: AppBarConfiguration

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       // setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)

        drawerlayout = binding.drawerLayout
        var navcontroller = this.findNavController(R.id.navigation_fragment)
        NavigationUI.setupActionBarWithNavController(this, navcontroller, drawerlayout)
        appBarConfiguration = AppBarConfiguration(navcontroller.graph, drawerlayout)
        NavigationUI.setupWithNavController(binding.navView, navcontroller)

       // binding.textName.setText("Cuenca")
        /*binding.labelTitle.setText("Ingrese nombre:")
        binding.title = "UPS Ecuador"
        binding.age="17";
        binding.dni="0102363058"

        binding.buttonHello.setOnClickListener {
            binding.title = "HOLA"+binding.dni
        }*/
        //var name: EditText = findViewById(R.id.text_name)
    }

    override fun onSupportNavigateUp(): Boolean {
        var navcontroller = this.findNavController(R.id.navigation_fragment)
        return NavigationUI.navigateUp(navcontroller, appBarConfiguration)
    }
}