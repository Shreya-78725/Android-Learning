package com.example.shreyaandroidbootcamp.topics.dateTime

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.DatePicker
import android.widget.TextView
import com.example.shreyaandroidbootcamp.R
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Locale

class DateTimeActivity : AppCompatActivity() {
    private  lateinit var tvDatePicker: TextView
    private lateinit var btndate: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date_time)

        tvDatePicker=findViewById(R.id.txtdate)
        btndate=findViewById(R.id.btndatepicker)

        val calender=Calendar.getInstance()
        val datepicker=DatePickerDialog.OnDateSetListener{view, year, month, dayOfMonth ->

          calender.set(Calendar.YEAR,year)
            calender.set(Calendar.MONTH,month)
            calender.set(Calendar.DAY_OF_MONTH,dayOfMonth)
            updateLable(calender)

        }
        btndate.setOnClickListener{
            DatePickerDialog(this,datepicker,calender.get(Calendar.YEAR),calender.get(Calendar.MONTH),
                calender.get(Calendar.DAY_OF_MONTH)).show()
        }
    }

    private fun updateLable(calendar: Calendar){
        val myFormat="dd_mm_yy"
        val sdf=SimpleDateFormat(myFormat, Locale.UK)
        tvDatePicker.setText(sdf.format(calendar.time))
    }

}