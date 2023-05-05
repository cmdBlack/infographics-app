package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapAuroraBinding

class ActivityAurora : AppCompatActivity() {
    private lateinit var binding: ActivityMapAuroraBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapAuroraBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)

        val header1 = header?.substringBefore("Radar") + "Radar(AURORA)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("dilasag", true)){
                binding.imgDilasag.visibility = View.VISIBLE
                binding.imgDilasag.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("casiguran", true)){
                binding.imgCasiguran.visibility = View.VISIBLE
                binding.imgCasiguran.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("dinalungan", true)){
                binding.imgDinalungan.visibility = View.VISIBLE
                binding.imgDinalungan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("dipaculao", true)){
                binding.imgDipaculao.visibility = View.VISIBLE
                binding.imgDipaculao.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("mariaaurora", true)){
                binding.imgMariaAurora.visibility = View.VISIBLE
                binding.imgMariaAurora.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("baler", true)){
                binding.imgBaler.visibility = View.VISIBLE
                binding.imgBaler.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanluis", true)){
                binding.imgSanLuis.visibility = View.VISIBLE
                binding.imgSanLuis.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("dingalan", true)){
                binding.imgDingalan.visibility = View.VISIBLE
                binding.imgDingalan.setImageResource(R.drawable.rainlightning)
            }
        }

        if (modRainList != null){
            if (modRainList.contains("dilasag", true)){
                binding.imgDilasag.visibility = View.VISIBLE
                binding.imgDilasag.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("casiguran", true)){
                binding.imgCasiguran.visibility = View.VISIBLE
                binding.imgCasiguran.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("dinalungan", true)){
                binding.imgDinalungan.visibility = View.VISIBLE
                binding.imgDinalungan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("dipaculao", true)){
                binding.imgDipaculao.visibility = View.VISIBLE
                binding.imgDipaculao.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("mariaaurora", true)){
                binding.imgMariaAurora.visibility = View.VISIBLE
                binding.imgMariaAurora.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("baler", true)){
                binding.imgBaler.visibility = View.VISIBLE
                binding.imgBaler.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanluis", true)){
                binding.imgSanLuis.visibility = View.VISIBLE
                binding.imgSanLuis.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("dingalan", true)){
                binding.imgDingalan.visibility = View.VISIBLE
                binding.imgDingalan.setImageResource(R.drawable.cloudrain)
            }

        }

        if (lgtRainList != null){
            if (lgtRainList.contains("dilasag", true)){
                binding.imgDilasag.visibility = View.VISIBLE
                binding.imgDilasag.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("casiguran", true)){
                binding.imgCasiguran.visibility = View.VISIBLE
                binding.imgCasiguran.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("dinalungan", true)){
                binding.imgDinalungan.visibility = View.VISIBLE
                binding.imgDinalungan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("dipaculao", true)){
                binding.imgDipaculao.visibility = View.VISIBLE
                binding.imgDipaculao.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("mariaaurora", true)){
                binding.imgMariaAurora.visibility = View.VISIBLE
                binding.imgMariaAurora.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("baler", true)){
                binding.imgBaler.visibility = View.VISIBLE
                binding.imgBaler.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanluis", true)){
                binding.imgSanLuis.visibility = View.VISIBLE
                binding.imgSanLuis.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("dingalan", true)){
                binding.imgDingalan.visibility = View.VISIBLE
                binding.imgDingalan.setImageResource(R.drawable.sunrain)
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
                "dilasag" -> {
                    if (isChecked){
                        binding.imgDilasag.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDilasag.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDilasag.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDilasag.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDilasag.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDilasag.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDilasag.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDilasag.visibility = View.INVISIBLE
                    }
                }

                "casiguran" -> {
                    if (isChecked){
                        binding.imgCasiguran.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCasiguran.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCasiguran.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCasiguran.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCasiguran.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCasiguran.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCasiguran.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCasiguran.visibility = View.INVISIBLE
                    }
                }

                "dinalungan" -> {
                    if (isChecked){
                        binding.imgDinalungan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDinalungan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDinalungan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDinalungan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDinalungan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDinalungan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDinalungan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDinalungan.visibility = View.INVISIBLE
                    }
                }

                "dipaculao" -> {
                    if (isChecked){
                        binding.imgDipaculao.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDipaculao.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDipaculao.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDipaculao.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDipaculao.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDipaculao.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDipaculao.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDipaculao.visibility = View.INVISIBLE
                    }
                }

                "mariaaurora" -> {
                    if (isChecked){
                        binding.imgMariaAurora.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMariaAurora.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMariaAurora.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMariaAurora.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMariaAurora.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMariaAurora.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMariaAurora.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMariaAurora.visibility = View.INVISIBLE
                    }
                }

                "baler" -> {
                    if (isChecked){
                        binding.imgBaler.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBaler.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBaler.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBaler.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBaler.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBaler.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBaler.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBaler.visibility = View.INVISIBLE
                    }
                }

                "sanluis" -> {
                    if (isChecked){
                        binding.imgSanLuis.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanLuis.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanLuis.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanLuis.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanLuis.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanLuis.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanLuis.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanLuis.visibility = View.INVISIBLE
                    }
                }

                "dingalan" -> {
                    if (isChecked){
                        binding.imgDingalan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDingalan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDingalan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDingalan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDingalan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDingalan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDingalan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDingalan.visibility = View.INVISIBLE
                    }
                }
            }
        }

        binding.tgBaler.setOnCheckedChangeListener(listener)
        binding.tgCasiguran.setOnCheckedChangeListener(listener)
        binding.tgDilasag.setOnCheckedChangeListener(listener)
        binding.tgDinalungan.setOnCheckedChangeListener(listener)
        binding.tgDingalan.setOnCheckedChangeListener(listener)
        binding.tgDipaculao.setOnCheckedChangeListener(listener)
        binding.tgMariaAurora.setOnCheckedChangeListener(listener)
        binding.tgSanLuis.setOnCheckedChangeListener(listener)

        binding.btnSave3.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.auroraLayout))
        }
    }
}