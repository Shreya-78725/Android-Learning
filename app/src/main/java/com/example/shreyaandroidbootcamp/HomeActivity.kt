package com.example.shreyaandroidbootcamp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.window.OnBackInvokedDispatcher
import com.example.shreyaandroidbootcamp.topics.activity.FirstPageActivity
import com.example.shreyaandroidbootcamp.topics.activity.SecondPageActivity
import com.example.shreyaandroidbootcamp.topics.autotext.AutoTextActivity
import com.example.shreyaandroidbootcamp.topics.checkbox.CheckboxActivity
import com.example.shreyaandroidbootcamp.topics.customToast.CustomToastActivity
import com.example.shreyaandroidbootcamp.topics.dateTime.DateTimeActivity
import com.example.shreyaandroidbootcamp.topics.fragment.FragmentActivity
import com.example.shreyaandroidbootcamp.topics.listview.ListActivity
import com.example.shreyaandroidbootcamp.topics.progressbar.ProgressBarActivity
import com.example.shreyaandroidbootcamp.topics.radiobutton.RadioButtonActivity
import com.example.shreyaandroidbootcamp.topics.recyclerview.RecyclerActivity
import com.example.shreyaandroidbootcamp.topics.scrollview.ScrollActivity
import com.example.shreyaandroidbootcamp.topics.tablayout.TabLayoutActivity
import com.example.shreyaandroidbootcamp.topics.toast.ToastActivity

class HomeActivity : AppCompatActivity() {
    lateinit var btnActivity: Button
    lateinit var btnFragment: Button
    lateinit var btnCheck: Button
    lateinit var btntoast: Button
    lateinit var btnradio: Button
    lateinit var btnlist:Button
    lateinit var btnrecycler:Button
    lateinit var btnhv:Button
    lateinit var btndate:Button
    lateinit var btnbar:Button
    lateinit var  btntab:Button
    lateinit var btncustom : Button
    lateinit var btnauto : Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        var action=supportActionBar
        action!!.title="Topics"

        btnActivity=findViewById(R.id.btnActivity)
        btnActivity.setOnClickListener {
            val intent= Intent(this, FirstPageActivity::class.java)
            startActivity(intent)
        }

        btnFragment=findViewById(R.id.btnFragment)
        btnFragment.setOnClickListener {
            val intent= Intent(this, FragmentActivity::class.java)
            startActivity(intent)
        }

        btnCheck=findViewById(R.id.btnCheckbox)
        btnCheck.setOnClickListener {
            val intent= Intent(this, CheckboxActivity::class.java)
            startActivity(intent)
        }

        btntoast=findViewById(R.id.btnToast)
        btntoast.setOnClickListener {
            val intent= Intent(this, ToastActivity::class.java)
            startActivity(intent)
        }

        btnradio=findViewById(R.id.btnRadio)
        btnradio.setOnClickListener {
            val intent= Intent(this, RadioButtonActivity::class.java)
            startActivity(intent)
        }

        btnlist=findViewById(R.id.btnList)
        btnlist.setOnClickListener {
            val intent= Intent(this, ListActivity::class.java)
            startActivity(intent)
        }

        btnrecycler=findViewById(R.id.btnRecycle)
        btnrecycler.setOnClickListener {
            val intent= Intent(this, RecyclerActivity::class.java)
            startActivity(intent)
        }

        btnhv=findViewById(R.id.hvbtn)
        btnhv.setOnClickListener {
            val intent= Intent(this, ScrollActivity::class.java)
            startActivity(intent)
        }

        btndate=findViewById(R.id.btnDate)
        btndate.setOnClickListener {
            val intent= Intent(this, DateTimeActivity::class.java)
            startActivity(intent)
        }


        btnbar=findViewById(R.id.btnProgress)
        btnbar.setOnClickListener {
            val intent= Intent(this, ProgressBarActivity::class.java)
            startActivity(intent)
        }

        btntab=findViewById(R.id.btnTab)
        btntab.setOnClickListener {
            val intent= Intent(this, TabLayoutActivity::class.java)
            startActivity(intent)
        }

        btncustom=findViewById(R.id.btncstm)
        btncustom.setOnClickListener {
            val intent= Intent(this, CustomToastActivity::class.java)
            startActivity(intent)
        }

        btnauto=findViewById(R.id.btnAuto)
        btnauto.setOnClickListener {
            val intent= Intent(this, AutoTextActivity::class.java)
            startActivity(intent)
        }

    }


    override fun onBackPressed() {
        super.onBackPressed()
        finishAffinity()
    }

}