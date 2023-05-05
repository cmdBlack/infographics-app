package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.pmac.infgrphcs.databinding.ActivityDeveloperBinding

class ActivityDeveloper : AppCompatActivity() {
    private lateinit var binding: ActivityDeveloperBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDeveloperBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.imageViewWelcomeDev.postDelayed( {
            binding.imageViewWelcomeDev.visibility = View.GONE
            binding.textView2.visibility = View.VISIBLE
        }, 2000)
    }
}