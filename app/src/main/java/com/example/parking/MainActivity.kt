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

//    private var car1 = Car(false,"", "","")
//    private var car2 = Car(false,"", "","")
//    private var car3 = Car(false,"", "","")

    var checkEdit: Boolean = false

    var carIn = Array(3) { i -> Car(false, "", "", "") }

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
            showEditText(it, 0)
        }

        findViewById<TextView>(R.id.parking2_text).setOnClickListener {
            showEditText(it, 1)
        }

        findViewById<TextView>(R.id.parking3_text).setOnClickListener {
            showEditText(it, 2)
        }
    }

    private fun showEditText(view: View, index: Int) {
        val licensePlateEditText = findViewById<EditText>(R.id.license_plate_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameDriverEditText = findViewById<EditText>(R.id.name_driver_edit)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        if (carIn[index].checkUp == true) {
            licensePlateEditText.setText(carIn[index].license_plate)
            brandEditText.setText(carIn[index].brand)
            nameDriverEditText.setText(carIn[index].name_driver)
        } else if (checkEdit == true) {
            licensePlateEditText.text.clear()
            brandEditText.text.clear()
            nameDriverEditText.text.clear()
        }

        licensePlateEditText.visibility = View.VISIBLE
        brandEditText.visibility = View.VISIBLE
        nameDriverEditText.visibility = View.VISIBLE
        updateButton.visibility = View.VISIBLE
        cancelButton.visibility = View.VISIBLE

        view.invalidate()

        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        imm.showSoftInput(licensePlateEditText, 0)

        findViewById<Button>(R.id.update_button).setOnClickListener {
            addCar(it, index)
        }

        findViewById<Button>(R.id.cancel_button).setOnClickListener {
            cancelCar(it)
        }
    }

    private fun addCar(view: View, index: Int) {
        val licensePlateEditText = findViewById<EditText>(R.id.license_plate_edit)
        val brandEditText = findViewById<EditText>(R.id.brand_edit)
        val nameDriverEditText = findViewById<EditText>(R.id.name_driver_edit)

        val updateButton = findViewById<Button>(R.id.update_button)
        val cancelButton = findViewById<Button>(R.id.cancel_button)

        if (index == 0) {
            val parking1TextView = findViewById<TextView>(R.id.parking1_text)
            parking1TextView.text = licensePlateEditText.text
        } else if (index == 1) {
            val parking2TextView = findViewById<TextView>(R.id.parking2_text)
            parking2TextView.text = licensePlateEditText.text
        } else {
            val parking3TextView = findViewById<TextView>(R.id.parking3_text)
            parking3TextView.text = licensePlateEditText.text
        }

        carIn[index].checkUp = true
        carIn[index].license_plate = licensePlateEditText.text.toString()
        carIn[index].brand = brandEditText.text.toString()
        carIn[index].name_driver = nameDriverEditText.text.toString()

//        car1.checkUp = true
//        car1.license_plate = licensePlateEditText.text.toString()
//        car1.brand = brandEditText.text.toString()
//        car1.name_driver = nameDriverEditText.text.toString()

        checkEdit = true

        licensePlateEditText.visibility = View.GONE
        brandEditText.visibility = View.GONE
        nameDriverEditText.visibility = View.GONE
        updateButton.visibility = View.GONE
        cancelButton.visibility = View.GONE

        view.invalidate()

        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
    }

//    private fun showEditText2(view: View) {
//        val licensePlateEditText = findViewById<EditText>(R.id.license_plate_edit)
//        val brandEditText = findViewById<EditText>(R.id.brand_edit)
//        val nameDriverEditText = findViewById<EditText>(R.id.name_driver_edit)
//
//        val updateButton = findViewById<Button>(R.id.update_button)
//        val cancelButton = findViewById<Button>(R.id.cancel_button)
//
//        if (car2.checkUp == true) {
//            licensePlateEditText.setText(car2.license_plate)
//            brandEditText.setText(car2.brand)
//            nameDriverEditText.setText(car2.name_driver)
//        } else if (checkEdit == true) {
//            licensePlateEditText.text.clear()
//            brandEditText.text.clear()
//            nameDriverEditText.text.clear()
//        }
//
//        licensePlateEditText.visibility = View.VISIBLE
//        brandEditText.visibility = View.VISIBLE
//        nameDriverEditText.visibility = View.VISIBLE
//        updateButton.visibility = View.VISIBLE
//        cancelButton.visibility = View.VISIBLE
//
//        view.invalidate()
//
//        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        imm.showSoftInput(licensePlateEditText, 0)
//
//        findViewById<Button>(R.id.update_button).setOnClickListener {
//            addCar2(it)
//        }
//
//        findViewById<Button>(R.id.cancel_button).setOnClickListener {
//            cancelCar(it)
//        }
//    }
//
//    private fun addCar2(view: View) {
//        val licensePlateEditText = findViewById<EditText>(R.id.license_plate_edit)
//        val brandEditText = findViewById<EditText>(R.id.brand_edit)
//        val nameDriverEditText = findViewById<EditText>(R.id.name_driver_edit)
//
//        val updateButton = findViewById<Button>(R.id.update_button)
//        val cancelButton = findViewById<Button>(R.id.cancel_button)
//
//        val parking2TextView = findViewById<TextView>(R.id.parking2_text)
//
//        parking2TextView.text = licensePlateEditText.text
//
//        car2.checkUp = true
//        car2.license_plate = licensePlateEditText.text.toString()
//        car2.brand = brandEditText.text.toString()
//        car2.name_driver = nameDriverEditText.text.toString()
//
//        checkEdit = true
//
//        licensePlateEditText.visibility = View.GONE
//        brandEditText.visibility = View.GONE
//        nameDriverEditText.visibility = View.GONE
//        updateButton.visibility = View.GONE
//        cancelButton.visibility = View.GONE
//
//        view.invalidate()
//
//        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
//    }
//
//    private fun showEditText3(view: View) {
//        val licensePlateEditText = findViewById<EditText>(R.id.license_plate_edit)
//        val brandEditText = findViewById<EditText>(R.id.brand_edit)
//        val nameDriverEditText = findViewById<EditText>(R.id.name_driver_edit)
//
//        val updateButton = findViewById<Button>(R.id.update_button)
//        val cancelButton = findViewById<Button>(R.id.cancel_button)
//
//        if (car3.checkUp == true) {
//            licensePlateEditText.setText(car3.license_plate)
//            brandEditText.setText(car3.brand)
//            nameDriverEditText.setText(car3.name_driver)
//        } else if (checkEdit == true) {
//            licensePlateEditText.text.clear()
//            brandEditText.text.clear()
//            nameDriverEditText.text.clear()
//        }
//        licensePlateEditText.visibility = View.VISIBLE
//        brandEditText.visibility = View.VISIBLE
//        nameDriverEditText.visibility = View.VISIBLE
//        updateButton.visibility = View.VISIBLE
//        cancelButton.visibility = View.VISIBLE
//
//        view.invalidate()
//
//        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        imm.showSoftInput(licensePlateEditText, 0)
//
//        findViewById<Button>(R.id.update_button).setOnClickListener {
//            addCar3(it)
//        }
//        findViewById<Button>(R.id.cancel_button).setOnClickListener {
//            cancelCar(it)
//        }
//    }
//
//    private fun addCar3(view: View) {
//        val licensePlateEditText = findViewById<EditText>(R.id.license_plate_edit)
//        val brandEditText = findViewById<EditText>(R.id.brand_edit)
//        val nameDriverEditText = findViewById<EditText>(R.id.name_driver_edit)
//
//        val updateButton = findViewById<Button>(R.id.update_button)
//        val cancelButton = findViewById<Button>(R.id.cancel_button)
//
//        val parking3TextView = findViewById<TextView>(R.id.parking3_text)
//
//        parking3TextView.text = licensePlateEditText.text
//
//        car3.checkUp = true
//        car3.license_plate = licensePlateEditText.text.toString()
//        car3.brand = brandEditText.text.toString()
//        car3.name_driver = nameDriverEditText.text.toString()
//
//        checkEdit = true
//
//        licensePlateEditText.visibility = View.GONE
//        brandEditText.visibility = View.GONE
//        nameDriverEditText.visibility = View.GONE
//        updateButton.visibility = View.GONE
//        cancelButton.visibility = View.GONE
//
//        view.invalidate()
//
//        val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
//        inputMethodManager.hideSoftInputFromWindow(view.windowToken, 0)
//    }

    private fun cancelCar(view: View) {



        view.invalidate()
    }

}
