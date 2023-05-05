package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapMprovinceBinding

class ActivityMProvince : AppCompatActivity() {
    private lateinit var binding: ActivityMapMprovinceBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapMprovinceBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)
        val header1 = header?.substringBefore("Radar") + "Radar(MOUNTAIN PROVINCE)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("besao", true)){
                binding.imgBesao.visibility = View.VISIBLE
                binding.imgBesao.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sagada", true)){
                binding.imgSagada.visibility = View.VISIBLE
                binding.imgSagada.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tadian", true)){
                binding.imgTadian.visibility = View.VISIBLE
                binding.imgTadian.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sabangan", true)){
                binding.imgSabangan.visibility = View.VISIBLE
                binding.imgSabangan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bauko", true)){
                binding.imgBauko.visibility = View.VISIBLE
                binding.imgBauko.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bontoc", true)){
                binding.imgBontoc.visibility = View.VISIBLE
                binding.imgBontoc.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sadanga", true)){
                binding.imgSadanga.visibility = View.VISIBLE
                binding.imgSadanga.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("barlig", true)){
                binding.imgBarlig.visibility = View.VISIBLE
                binding.imgBarlig.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("natonin", true)){
                binding.imgNatonin.visibility = View.VISIBLE
                binding.imgNatonin.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("paracelis", true)){
                binding.imgParacelis.visibility = View.VISIBLE
                binding.imgParacelis.setImageResource(R.drawable.rainlightning)
            }

        }

        if (modRainList != null){
            if (modRainList.contains("besao", true)){
                binding.imgBesao.visibility = View.VISIBLE
                binding.imgBesao.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sagada", true)){
                binding.imgSagada.visibility = View.VISIBLE
                binding.imgSagada.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tadian", true)){
                binding.imgTadian.visibility = View.VISIBLE
                binding.imgTadian.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sabangan", true)){
                binding.imgSabangan.visibility = View.VISIBLE
                binding.imgSabangan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bauko", true)){
                binding.imgBauko.visibility = View.VISIBLE
                binding.imgBauko.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bontoc", true)){
                binding.imgBontoc.visibility = View.VISIBLE
                binding.imgBontoc.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sadanga", true)){
                binding.imgSadanga.visibility = View.VISIBLE
                binding.imgSadanga.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("barlig", true)){
                binding.imgBarlig.visibility = View.VISIBLE
                binding.imgBarlig.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("natonin", true)){
                binding.imgNatonin.visibility = View.VISIBLE
                binding.imgNatonin.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("paracelis", true)){
                binding.imgParacelis.visibility = View.VISIBLE
                binding.imgParacelis.setImageResource(R.drawable.cloudrain)
            }
        }

        if (lgtRainList != null){
            if (lgtRainList.contains("besao", true)){
                binding.imgBesao.visibility = View.VISIBLE
                binding.imgBesao.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sagada", true)){
                binding.imgSagada.visibility = View.VISIBLE
                binding.imgSagada.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tadian", true)){
                binding.imgTadian.visibility = View.VISIBLE
                binding.imgTadian.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sabangan", true)){
                binding.imgSabangan.visibility = View.VISIBLE
                binding.imgSabangan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bauko", true)){
                binding.imgBauko.visibility = View.VISIBLE
                binding.imgBauko.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bontoc", true)){
                binding.imgBontoc.visibility = View.VISIBLE
                binding.imgBontoc.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sadanga", true)){
                binding.imgSadanga.visibility = View.VISIBLE
                binding.imgSadanga.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("barlig", true)){
                binding.imgBarlig.visibility = View.VISIBLE
                binding.imgBarlig.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("natonin", true)){
                binding.imgNatonin.visibility = View.VISIBLE
                binding.imgNatonin.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("paracelis", true)){
                binding.imgParacelis.visibility = View.VISIBLE
                binding.imgParacelis.setImageResource(R.drawable.sunrain)
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
                "besao" -> {
                    if (isChecked){
                        binding.imgBesao.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBesao.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBesao.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBesao.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBesao.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBesao.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBesao.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBesao.visibility = View.INVISIBLE
                    }
                }

                "sagada" -> {
                    if (isChecked){
                        binding.imgSagada.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSagada.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSagada.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSagada.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSagada.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSagada.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSagada.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSagada.visibility = View.INVISIBLE
                    }
                }

                "tadian" -> {
                    if (isChecked){
                        binding.imgTadian.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTadian.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTadian.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTadian.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTadian.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTadian.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTadian.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTadian.visibility = View.INVISIBLE
                    }
                }

                "sabangan" -> {
                    if (isChecked){
                        binding.imgSabangan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSabangan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSabangan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSabangan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSabangan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSabangan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSabangan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSabangan.visibility = View.INVISIBLE
                    }
                }

                "bauko" -> {
                    if (isChecked){
                        binding.imgBauko.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBauko.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBauko.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBauko.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBauko.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBauko.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBauko.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBauko.visibility = View.INVISIBLE
                    }
                }

                "bontoc" -> {
                    if (isChecked){
                        binding.imgBontoc.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBontoc.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBontoc.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBontoc.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBontoc.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBontoc.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBontoc.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBontoc.visibility = View.INVISIBLE
                    }
                }

                "sadanga" -> {
                    if (isChecked){
                        binding.imgSadanga.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSadanga.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSadanga.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSadanga.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSadanga.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSadanga.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSadanga.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSadanga.visibility = View.INVISIBLE
                    }
                }

                "barlig" -> {
                    if (isChecked){
                        binding.imgBarlig.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBarlig.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBarlig.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBarlig.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBarlig.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBarlig.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBarlig.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBarlig.visibility = View.INVISIBLE
                    }
                }


                "natonin" -> {
                    if (isChecked){
                        binding.imgNatonin.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgNatonin.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgNatonin.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgNatonin.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgNatonin.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgNatonin.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgNatonin.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgNatonin.visibility = View.INVISIBLE
                    }
                }

                "paracelis" -> {
                    if (isChecked){
                        binding.imgParacelis.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgParacelis.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgParacelis.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgParacelis.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgParacelis.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgParacelis.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgParacelis.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgParacelis.visibility = View.INVISIBLE
                    }
                }
            }
        }

        binding.tgBarlig.setOnCheckedChangeListener(listener)
        binding.tgBauko.setOnCheckedChangeListener(listener)
        binding.tgBesao.setOnCheckedChangeListener(listener)
        binding.tgBontoc.setOnCheckedChangeListener(listener)
        binding.tgNatonin.setOnCheckedChangeListener(listener)
        binding.tgParacelis.setOnCheckedChangeListener(listener)
        binding.tgSabangan.setOnCheckedChangeListener(listener)
        binding.tgSadanga.setOnCheckedChangeListener(listener)
        binding.tgSagada.setOnCheckedChangeListener(listener)
        binding.tgTadian.setOnCheckedChangeListener(listener)

        binding.btnSave10.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.mprovinceLayout))
        }
    }
}