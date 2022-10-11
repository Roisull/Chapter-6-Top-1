package com.example.chapter6top1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.chapter6top1.databinding.ActivityLatihanBinding
import com.example.chapter6top1.viewModel.ViewModelBlur
import com.example.chapter6top1.viewModel.ViewModelBlurFactory
import com.example.chapter6top1.viewModel.ViewModelBlurLatihan
import com.example.chapter6top1.viewModel.ViewModelBlurLatihanFactory

class LatihanActivity : AppCompatActivity() {
    lateinit var binding: ActivityLatihanBinding
    private val viewModel: ViewModelBlurLatihan by viewModels { ViewModelBlurLatihanFactory(application) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLatihanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnBlur.setOnClickListener {
            viewModel.applyBlur(1)
        }
    }
}