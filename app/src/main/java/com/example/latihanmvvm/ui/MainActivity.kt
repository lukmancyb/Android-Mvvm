package com.example.latihanmvvm.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.latihanmvvm.databinding.ActivityMainBinding
import com.example.latihanmvvm.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var mainViewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mainViewModel = ViewModelProvider(this)[MainViewModel::class.java]

        // Observe changes in number LiveData
        mainViewModel.number.observe(this) { number ->
            binding.txtHasil.text = number.toString()
        }

        binding.btnDecrement.setOnClickListener {
            mainViewModel.decrement()
        }
        binding.btnInceremnt.setOnClickListener {
            mainViewModel.increment()
        }



    }


}