package com.example.parking

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var car1 = Car()
    private var car2 = Car()
    private var car3 = Car()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val licensePlateEditText = findViewById<EditText>(R.id.license_plate_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameDriverEditText = findViewById<EditText>(R.id.name_driver_edit)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        licensePlateEditText.visibility = View.GONE
        brandEditText.visibility = View.GONE
        nameDriverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE

        findViewById<TextView>(R.id.parking1_text).setOnClickListener {
            showEditText(it)
        }

        findViewById<TextView>(R.id.parking2_text).setOnClickListener {
            showEditText2(it)
        }

        findViewById<TextView>(R.id.parking3_text).setOnClickListener {
            showEditText3(it)
        }
    }

    private fun showEditText(view: View) {
        val licensePlateEditText = findViewById<EditText>(R.id.license_plate_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameDriverEditText = findViewById<EditText>(R.id.name_driver_edit)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        licensePlateEditText.visibility = View.VISIBLE
        brandEditText.visibility = View.VISIBLE
        nameDriverEditText.visibility = View.VISIBLE
        updateButton.visibility = View.VISIBLE
        cancelButton.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(licensePlateEditText, 0)

        findViewById<Button>(R.id.update_button).setOnClickListener {
            addCar(it)
        }
    }

    private fun showEditText2(view: View) {
        val licensePlateEditText = findViewById<EditText>(R.id.license_plate_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameDriverEditText = findViewById<EditText>(R.id.name_driver_edit)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        licensePlateEditText.visibility = View.VISIBLE
        brandEditText.visibility = View.VISIBLE
        nameDriverEditText.visibility = View.VISIBLE
        updateButton.visibility = View.VISIBLE
        cancelButton.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(licensePlateEditText, 0)

        findViewById<Button>(R.id.update_button).setOnClickListener {
            addCar2(it)
        }
    }

    private fun showEditText3(view: View) {
        val licensePlateEditText = findViewById<EditText>(R.id.license_plate_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameDriverEditText = findViewById<EditText>(R.id.name_driver_edit)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        licensePlateEditText.visibility = View.VISIBLE
        brandEditText.visibility = View.VISIBLE
        nameDriverEditText.visibility = View.VISIBLE
        updateButton.visibility = View.VISIBLE
        cancelButton.visibility = View.VISIBLE

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(licensePlateEditText, 0)

        findViewById<Button>(R.id.update_button).setOnClickListener {
            addCar3(it)
        }
    }

    private fun addCar(view: View) {
        val licensePlateEditText = findViewById<EditText>(R.id.license_plate_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameDriverEditText = findViewById<EditText>(R.id.name_driver_edit)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        val parking1TextView = findViewById<TextView>(R.id.parking1_text)

        parking1TextView.text = licensePlateEditText.text

        car1?.license_plate = licensePlateEditText.text.toString()
        car1?.brand = brandEditText.text.toString()
        car1?.name_driver = nameDriverEditText.text.toString()

        licensePlateEditText.visibility = View.GONE
        brandEditText.visibility = View.GONE
        nameDriverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun addCar2(view: View) {
        val licensePlateEditText = findViewById<EditText>(R.id.license_plate_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameDriverEditText = findViewById<EditText>(R.id.name_driver_edit)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        val parking2TextView = findViewById<TextView>(R.id.parking2_text)

        parking2TextView.text = licensePlateEditText.text

        licensePlateEditText.visibility = View.GONE
        brandEditText.visibility = View.GONE
        nameDriverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

    private fun addCar3(view: View) {
        val licensePlateEditText = findViewById<EditText>(R.id.license_plate_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameDriverEditText = findViewById<EditText>(R.id.name_driver_edit)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        val parking3TextView = findViewById<TextView>(R.id.parking3_text)

        parking3TextView.text = licensePlateEditText.text

        licensePlateEditText.visibility = View.GONE
        brandEditText.visibility = View.GONE
        nameDriverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }


}