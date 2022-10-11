package com.example.chapter6top1

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
            viewModel.applyBlur(1)
        }
    }
}