package my.edu.tarc.hellolsx

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

//     class name       datatype
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Create UI     from this file
        setContentView(R.layout.activity_main)
        //R = resources class
    }
}