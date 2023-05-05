package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapBenguetBinding

class ActivityBenguet : AppCompatActivity() {
    private lateinit var binding: ActivityMapBenguetBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapBenguetBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)
        val header1 = header?.substringBefore("Radar") + "Radar(BENGUET)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("mankayan", true)){
                binding.imgMankayan.visibility = View.VISIBLE
                binding.imgMankayan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bakun", true)){
                binding.imgBakun.visibility = View.VISIBLE
                binding.imgBakun.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("buguias", true)){
                binding.imgBuguias.visibility = View.VISIBLE
                binding.imgBuguias.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("kibungan", true)){
                binding.imgKibungan.visibility = View.VISIBLE
                binding.imgKibungan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("kabayan", true)){
                binding.imgKabayan.visibility = View.VISIBLE
                binding.imgKabayan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("atok", true)){
                binding.imgAtok.visibility = View.VISIBLE
                binding.imgAtok.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("kapangan", true)){
                binding.imgKapangan.visibility = View.VISIBLE
                binding.imgKapangan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bokod", true)){
                binding.imgBokod.visibility = View.VISIBLE
                binding.imgBokod.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tublay", true)){
                binding.imgTublay.visibility = View.VISIBLE
                binding.imgTublay.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("latrinidad", true)){
                binding.imgLaTrinidad.visibility = View.VISIBLE
                binding.imgLaTrinidad.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sablan", true)){
                binding.imgSablan.visibility = View.VISIBLE
                binding.imgSablan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("baguio", true)){
                binding.imgBaguio.visibility = View.VISIBLE
                binding.imgBaguio.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("itogon", true)){
                binding.imgItogon.visibility = View.VISIBLE
                binding.imgItogon.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tuba", true)){
                binding.imgTuba.visibility = View.VISIBLE
                binding.imgTuba.setImageResource(R.drawable.rainlightning)
            }
        }

        if (modRainList != null){
            if (modRainList.contains("mankayan", true)){
                binding.imgMankayan.visibility = View.VISIBLE
                binding.imgMankayan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bakun", true)){
                binding.imgBakun.visibility = View.VISIBLE
                binding.imgBakun.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("buguias", true)){
                binding.imgBuguias.visibility = View.VISIBLE
                binding.imgBuguias.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("kibungan", true)){
                binding.imgKibungan.visibility = View.VISIBLE
                binding.imgKibungan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("kabayan", true)){
                binding.imgKabayan.visibility = View.VISIBLE
                binding.imgKabayan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("atok", true)){
                binding.imgAtok.visibility = View.VISIBLE
                binding.imgAtok.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("kapangan", true)){
                binding.imgKapangan.visibility = View.VISIBLE
                binding.imgKapangan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bokod", true)){
                binding.imgBokod.visibility = View.VISIBLE
                binding.imgBokod.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tublay", true)){
                binding.imgTublay.visibility = View.VISIBLE
                binding.imgTublay.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("latrinidad", true)){
                binding.imgLaTrinidad.visibility = View.VISIBLE
                binding.imgLaTrinidad.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sablan", true)){
                binding.imgSablan.visibility = View.VISIBLE
                binding.imgSablan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("baguio", true)){
                binding.imgBaguio.visibility = View.VISIBLE
                binding.imgBaguio.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("itogon", true)){
                binding.imgItogon.visibility = View.VISIBLE
                binding.imgItogon.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tuba", true)){
                binding.imgTuba.visibility = View.VISIBLE
                binding.imgTuba.setImageResource(R.drawable.cloudrain)
            }
        }

        if (lgtRainList != null){
            if (lgtRainList.contains("mankayan", true)){
                binding.imgMankayan.visibility = View.VISIBLE
                binding.imgMankayan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bakun", true)){
                binding.imgBakun.visibility = View.VISIBLE
                binding.imgBakun.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("buguias", true)){
                binding.imgBuguias.visibility = View.VISIBLE
                binding.imgBuguias.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("kibungan", true)){
                binding.imgKibungan.visibility = View.VISIBLE
                binding.imgKibungan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("kabayan", true)){
                binding.imgKabayan.visibility = View.VISIBLE
                binding.imgKabayan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("atok", true)){
                binding.imgAtok.visibility = View.VISIBLE
                binding.imgAtok.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("kapangan", true)){
                binding.imgKapangan.visibility = View.VISIBLE
                binding.imgKapangan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bokod", true)){
                binding.imgBokod.visibility = View.VISIBLE
                binding.imgBokod.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tublay", true)){
                binding.imgTublay.visibility = View.VISIBLE
                binding.imgTublay.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("latrinidad", true)){
                binding.imgLaTrinidad.visibility = View.VISIBLE
                binding.imgLaTrinidad.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sablan", true)){
                binding.imgSablan.visibility = View.VISIBLE
                binding.imgSablan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("baguio", true)){
                binding.imgBaguio.visibility = View.VISIBLE
                binding.imgBaguio.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("itogon", true)){
                binding.imgItogon.visibility = View.VISIBLE
                binding.imgItogon.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tuba", true)){
                binding.imgTuba.visibility = View.VISIBLE
                binding.imgTuba.setImageResource(R.drawable.sunrain)
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
                "mankayan" -> {
                    if (isChecked){
                        binding.imgMankayan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMankayan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMankayan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMankayan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMankayan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMankayan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMankayan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMankayan.visibility = View.INVISIBLE
                    }
                }

                "bakun" -> {
                    if (isChecked){
                        binding.imgBakun.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBakun.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBakun.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBakun.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBakun.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBakun.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBakun.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBakun.visibility = View.INVISIBLE
                    }
                }

                "buguias" -> {
                    if (isChecked){
                        binding.imgBuguias.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBuguias.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBuguias.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBuguias.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBuguias.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBuguias.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBuguias.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBuguias.visibility = View.INVISIBLE
                    }
                }

                "kibungan" -> {
                    if (isChecked){
                        binding.imgKibungan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgKibungan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgKibungan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgKibungan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgKibungan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgKibungan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgKibungan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgKibungan.visibility = View.INVISIBLE
                    }
                }

                "kabayan" -> {
                    if (isChecked){
                        binding.imgKabayan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgKabayan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgKabayan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgKabayan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgKabayan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgKabayan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgKabayan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgKabayan.visibility = View.INVISIBLE
                    }
                }

                "atok" -> {
                    if (isChecked){
                        binding.imgAtok.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAtok.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAtok.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAtok.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAtok.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAtok.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAtok.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAtok.visibility = View.INVISIBLE
                    }
                }

                "kapangan" -> {
                    if (isChecked){
                        binding.imgKapangan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgKapangan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgKapangan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgKapangan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgKapangan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgKapangan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgKapangan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgKapangan.visibility = View.INVISIBLE
                    }
                }

                "bokod" -> {
                    if (isChecked){
                        binding.imgBokod.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBokod.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBokod.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBokod.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBokod.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBokod.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBokod.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBokod.visibility = View.INVISIBLE
                    }
                }


                "tublay" -> {
                    if (isChecked){
                        binding.imgTublay.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTublay.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTublay.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTublay.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTublay.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTublay.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTublay.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTublay.visibility = View.INVISIBLE
                    }
                }

                "latrinidad" -> {
                    if (isChecked){
                        binding.imgLaTrinidad.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLaTrinidad.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLaTrinidad.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLaTrinidad.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLaTrinidad.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLaTrinidad.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLaTrinidad.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLaTrinidad.visibility = View.INVISIBLE
                    }
                }

                "sablan" -> {
                    if (isChecked){
                        binding.imgSablan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSablan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSablan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSablan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSablan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSablan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSablan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSablan.visibility = View.INVISIBLE
                    }
                }

                "baguio" -> {
                    if (isChecked){
                        binding.imgBaguio.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBaguio.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBaguio.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBaguio.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBaguio.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBaguio.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBaguio.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBaguio.visibility = View.INVISIBLE
                    }
                }

                "itogon" -> {
                    if (isChecked){
                        binding.imgItogon.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgItogon.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgItogon.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgItogon.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgItogon.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgItogon.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgItogon.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgItogon.visibility = View.INVISIBLE
                    }
                }

                "tuba" -> {
                    if (isChecked){
                        binding.imgTuba.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTuba.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTuba.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTuba.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTuba.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTuba.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTuba.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTuba.visibility = View.INVISIBLE
                    }
                }
            }
        }

        binding.tgAtok.setOnCheckedChangeListener(listener)
        binding.tgBaguio.setOnCheckedChangeListener(listener)
        binding.tgBakun.setOnCheckedChangeListener(listener)
        binding.tgBokod.setOnCheckedChangeListener(listener)
        binding.tgBuguias.setOnCheckedChangeListener(listener)
        binding.tgItogon.setOnCheckedChangeListener(listener)
        binding.tgKabayan.setOnCheckedChangeListener(listener)
        binding.tgKapangan.setOnCheckedChangeListener(listener)
        binding.tgKibungan.setOnCheckedChangeListener(listener)
        binding.tgLaTrinidad.setOnCheckedChangeListener(listener)
        binding.tgMankayan.setOnCheckedChangeListener(listener)
        binding.tgSablan.setOnCheckedChangeListener(listener)
        binding.tgTuba.setOnCheckedChangeListener(listener)
        binding.tgTublay.setOnCheckedChangeListener(listener)

        binding.btnSave4.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.benguetLayout))
        }
    }
}