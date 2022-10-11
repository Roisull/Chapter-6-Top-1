package com.example.chapter6top1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.chapter6top1.databinding.ActivityMainBinding
import com.example.chapter6top1.viewModel.ViewModelBlur
import com.example.chapter6top1.viewModel.ViewModelBlurFactory

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private val viewModel: ViewModelBlur by viewModels { ViewModelBlurFactory(application) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnGo.setOnClickListener {
            viewModel.applyBlur(blurLevel)
        }

        binding.btnGoToLatihan.setOnClickListener {
            startActivity(Intent(this, LatihanActivity::class.java))
        }
    }

    private val blurLevel: Int
    get() =
        when(binding.rgBlured.checkedRadioButtonId){
            R.id.rbLittleBlured -> 1
            R.id.rbMoreBlured -> 2
            R.id.rbMostBlured -> 3
            else -> 1
        }
}