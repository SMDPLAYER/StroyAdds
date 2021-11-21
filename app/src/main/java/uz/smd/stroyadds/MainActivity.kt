package uz.smd.stroyadds

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.activity.viewModels
import kotlinx.android.synthetic.main.activity_main.*
import uz.smd.stroyadds.utils.openFragment

class MainActivity : AppCompatActivity() {
    private val viewModel: MainViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction()
            .replace(R.id.mainContainer,ListFragment()).commit()

        viewModel.lastFragment.observe(this,{
                openFragment(it.first)
        })

        val text="998999775678"
        btnCall.setOnClickListener{
            val number = Uri.parse("tel:+$text");
            val callIntent =  Intent(Intent.ACTION_DIAL, number);
            startActivity(callIntent)
        }
    }
}