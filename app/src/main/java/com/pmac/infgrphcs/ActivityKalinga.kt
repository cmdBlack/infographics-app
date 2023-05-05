package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapKalingaBinding

class ActivityKalinga : AppCompatActivity() {
    private lateinit var binding: ActivityMapKalingaBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapKalingaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)
        val header1 = header?.substringBefore("Radar") + "Radar(KALINGA)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("pinukpuk", true)){
                binding.imgPinukpuk.visibility = View.VISIBLE
                binding.imgPinukpuk.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("rizal", true)){
                binding.imgRizal.visibility = View.VISIBLE
                binding.imgRizal.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tabukcity", true)){
                binding.imgTabukCity.visibility = View.VISIBLE
                binding.imgTabukCity.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("balbalan", true)){
                binding.imgBalbalan.visibility = View.VISIBLE
                binding.imgBalbalan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("pasil", true)){
                binding.imgPasil.visibility = View.VISIBLE
                binding.imgPasil.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("lubuagan", true)){
                binding.imgLubuagan.visibility = View.VISIBLE
                binding.imgLubuagan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tinglayan", true)){
                binding.imgTinglayan.visibility = View.VISIBLE
                binding.imgTinglayan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tanudan", true)){
                binding.imgTanudan.visibility = View.VISIBLE
                binding.imgTanudan.setImageResource(R.drawable.rainlightning)
            }

        }

        if (modRainList != null){
            if (modRainList.contains("pinukpuk", true)){
                binding.imgPinukpuk.visibility = View.VISIBLE
                binding.imgPinukpuk.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("rizal", true)){
                binding.imgRizal.visibility = View.VISIBLE
                binding.imgRizal.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tabukcity", true)){
                binding.imgTabukCity.visibility = View.VISIBLE
                binding.imgTabukCity.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("balbalan", true)){
                binding.imgBalbalan.visibility = View.VISIBLE
                binding.imgBalbalan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("pasil", true)){
                binding.imgPasil.visibility = View.VISIBLE
                binding.imgPasil.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("lubuagan", true)){
                binding.imgLubuagan.visibility = View.VISIBLE
                binding.imgLubuagan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tinglayan", true)){
                binding.imgTinglayan.visibility = View.VISIBLE
                binding.imgTinglayan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tanudan", true)){
                binding.imgTanudan.visibility = View.VISIBLE
                binding.imgTanudan.setImageResource(R.drawable.cloudrain)
            }

        }

        if (lgtRainList != null){
            if (lgtRainList.contains("pinukpuk", true)){
                binding.imgPinukpuk.visibility = View.VISIBLE
                binding.imgPinukpuk.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("rizal", true)){
                binding.imgRizal.visibility = View.VISIBLE
                binding.imgRizal.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tabukcity", true)){
                binding.imgTabukCity.visibility = View.VISIBLE
                binding.imgTabukCity.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("balbalan", true)){
                binding.imgBalbalan.visibility = View.VISIBLE
                binding.imgBalbalan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("pasil", true)){
                binding.imgPasil.visibility = View.VISIBLE
                binding.imgPasil.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("lubuagan", true)){
                binding.imgLubuagan.visibility = View.VISIBLE
                binding.imgLubuagan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tinglayan", true)){
                binding.imgTinglayan.visibility = View.VISIBLE
                binding.imgTinglayan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tanudan", true)){
                binding.imgTanudan.visibility = View.VISIBLE
                binding.imgTanudan.setImageResource(R.drawable.sunrain)
            }

        }

        binding.tVHeader.text = header1

        val listener1 = CompoundButton.OnCheckedChangeListener { v, isChecked ->
            val a = v as ToggleButton
            when(a.textOn){
                "sunrain" -> {
                    if (isChecked){
                        binding.imgSunRain.scaleX = 1.25f
                        binding.imgSunRain.scaleY = 1.25f
                        binding.tgCloudLightning.isChecked = false
                        binding.tgCloud.isChecked = false
                        binding.tgCloudRain.isChecked = false
                        binding.tgRainLightning.isChecked = false
                        binding.tgSunCloud.isChecked = false
                        select = 1
                    }
                    else{
                        binding.imgSunRain.scaleX = 1f
                        binding.imgSunRain.scaleY = 1f
                    }
                }
                "cloudrain" -> {
                    if (isChecked){
                        binding.imgCloudRain.scaleX = 1.25f
                        binding.imgCloudRain.scaleY = 1.25f
                        binding.tgCloudLightning.isChecked = false
                        binding.tgSunRain.isChecked = false
                        binding.tgCloud.isChecked = false
                        binding.tgRainLightning.isChecked = false
                        binding.tgSunCloud.isChecked = false
                        select = 2
                    }
                    else{
                        binding.imgCloudRain.scaleX = 1f
                        binding.imgCloudRain.scaleY = 1f
                    }

                }
                "cloudlightning" -> {
                    if (isChecked){
                        binding.imgCloudLightning.scaleX = 1.25f
                        binding.imgCloudLightning.scaleY = 1.25f
                        binding.tgCloud.isChecked = false
                        binding.tgSunRain.isChecked = false
                        binding.tgCloudRain.isChecked = false
                        binding.tgRainLightning.isChecked = false
                        binding.tgSunCloud.isChecked = false
                        select = 3
                    }
                    else{
                        binding.imgCloudLightning.scaleX = 1f
                        binding.imgCloudLightning.scaleY = 1f
                    }

                }
                "rainlightning" -> {
                    if (isChecked){
                        binding.imgRainLightning.scaleX = 1.25f
                        binding.imgRainLightning.scaleY = 1.25f
                        binding.tgCloudLightning.isChecked = false
                        binding.tgSunRain.isChecked = false
                        binding.tgCloudRain.isChecked = false
                        binding.tgCloud.isChecked = false
                        binding.tgSunCloud.isChecked = false
                        select = 4
                    }
                    else{
                        binding.imgRainLightning.scaleX = 1f
                        binding.imgRainLightning.scaleY = 1f
                    }

                }

                "suncloud" -> {
                    if (isChecked){
                        binding.imgSunCloud.scaleX = 1.25f
                        binding.imgSunCloud.scaleY = 1.25f
                        binding.tgCloudLightning.isChecked = false
                        binding.tgSunRain.isChecked = false
                        binding.tgCloudRain.isChecked = false
                        binding.tgRainLightning.isChecked = false
                        binding.tgCloud.isChecked = false
                        select = 5
                    }
                    else{
                        binding.imgSunCloud.scaleX = 1f
                        binding.imgSunCloud.scaleY = 1f
                    }

                }

                "cloud" -> {
                    if (isChecked){
                        binding.imgCloud.scaleX = 1.25f
                        binding.imgCloud.scaleY = 1.25f
                        binding.tgCloudLightning.isChecked = false
                        binding.tgSunRain.isChecked = false
                        binding.tgCloudRain.isChecked = false
                        binding.tgRainLightning.isChecked = false
                        binding.tgSunCloud.isChecked = false
                        select = 6
                    }
                    else{
                        binding.imgCloud.scaleX = 1f
                        binding.imgCloud.scaleY = 1f
                    }

                }
            }
        }

        binding.tgSunRain.setOnCheckedChangeListener(listener1)
        binding.tgCloudRain.setOnCheckedChangeListener(listener1)
        binding.tgCloudLightning.setOnCheckedChangeListener(listener1)
        binding.tgRainLightning.setOnCheckedChangeListener(listener1)
        binding.tgSunCloud.setOnCheckedChangeListener(listener1)
        binding.tgCloud.setOnCheckedChangeListener(listener1)

        val listener = CompoundButton.OnCheckedChangeListener { v, isChecked ->
            val b = v as ToggleButton
            when(b.textOn){
                "pinukpuk" -> {
                    if (isChecked){
                        binding.imgPinukpuk.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPinukpuk.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPinukpuk.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPinukpuk.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPinukpuk.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPinukpuk.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPinukpuk.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPinukpuk.visibility = View.INVISIBLE
                    }
                }

                "rizal" -> {
                    if (isChecked){
                        binding.imgRizal.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgRizal.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgRizal.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgRizal.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgRizal.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgRizal.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgRizal.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgRizal.visibility = View.INVISIBLE
                    }
                }

                "tabukcity" -> {
                    if (isChecked){
                        binding.imgTabukCity.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTabukCity.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTabukCity.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTabukCity.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTabukCity.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTabukCity.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTabukCity.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTabukCity.visibility = View.INVISIBLE
                    }
                }

                "balbalan" -> {
                    if (isChecked){
                        binding.imgBalbalan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBalbalan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBalbalan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBalbalan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBalbalan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBalbalan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBalbalan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBalbalan.visibility = View.INVISIBLE
                    }
                }

                "pasil" -> {
                    if (isChecked){
                        binding.imgPasil.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPasil.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPasil.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPasil.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPasil.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPasil.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPasil.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPasil.visibility = View.INVISIBLE
                    }
                }

                "lubuagan" -> {
                    if (isChecked){
                        binding.imgLubuagan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLubuagan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLubuagan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLubuagan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLubuagan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLubuagan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLubuagan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLubuagan.visibility = View.INVISIBLE
                    }
                }

                "tinglayan" -> {
                    if (isChecked){
                        binding.imgTinglayan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTinglayan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTinglayan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTinglayan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTinglayan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTinglayan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTinglayan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTinglayan.visibility = View.INVISIBLE
                    }
                }

                "tanudan" -> {
                    if (isChecked){
                        binding.imgTanudan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTanudan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTanudan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTanudan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTanudan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTanudan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTanudan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTanudan.visibility = View.INVISIBLE
                    }
                }
            }
        }

        binding.tgBalbalan.setOnCheckedChangeListener(listener)
        binding.tgLubuagan.setOnCheckedChangeListener(listener)
        binding.tgPasil.setOnCheckedChangeListener(listener)
        binding.tgPinukpuk.setOnCheckedChangeListener(listener)
        binding.tgRizal.setOnCheckedChangeListener(listener)
        binding.tgTabukCity.setOnCheckedChangeListener(listener)
        binding.tgTanudan.setOnCheckedChangeListener(listener)
        binding.tgTinglayan.setOnCheckedChangeListener(listener)

        binding.btnSave8.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.kalingaLayout))
        }
    }
}