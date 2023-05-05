package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapQuirinoBinding

class ActivityQuirino : AppCompatActivity() {
    private lateinit var binding: ActivityMapQuirinoBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapQuirinoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)
        val header1 = header?.substringBefore("Radar") + "Radar(QUIRINO)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("saguday", true)){
                binding.imgSaguday.visibility = View.VISIBLE
                binding.imgSaguday.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("diffun", true)){
                binding.imgDiffun.visibility = View.VISIBLE
                binding.imgDiffun.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("cabarroguis", true)){
                binding.imgCabarroguis.visibility = View.VISIBLE
                binding.imgCabarroguis.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("aglipay", true)){
                binding.imgAglipay.visibility = View.VISIBLE
                binding.imgAglipay.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("maddela", true)){
                binding.imgMaddela.visibility = View.VISIBLE
                binding.imgMaddela.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("nagtipunan", true)){
                binding.imgNagtipunan.visibility = View.VISIBLE
                binding.imgNagtipunan.setImageResource(R.drawable.rainlightning)
            }

        }

        if (modRainList != null){
            if (modRainList.contains("saguday", true)){
                binding.imgSaguday.visibility = View.VISIBLE
                binding.imgSaguday.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("diffun", true)){
                binding.imgDiffun.visibility = View.VISIBLE
                binding.imgDiffun.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("cabarroguis", true)){
                binding.imgCabarroguis.visibility = View.VISIBLE
                binding.imgCabarroguis.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("aglipay", true)){
                binding.imgAglipay.visibility = View.VISIBLE
                binding.imgAglipay.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("maddela", true)){
                binding.imgMaddela.visibility = View.VISIBLE
                binding.imgMaddela.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("nagtipunan", true)){
                binding.imgNagtipunan.visibility = View.VISIBLE
                binding.imgNagtipunan.setImageResource(R.drawable.cloudrain)
            }

        }

        if (lgtRainList != null){
            if (lgtRainList.contains("saguday", true)){
                binding.imgSaguday.visibility = View.VISIBLE
                binding.imgSaguday.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("diffun", true)){
                binding.imgDiffun.visibility = View.VISIBLE
                binding.imgDiffun.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("cabarroguis", true)){
                binding.imgCabarroguis.visibility = View.VISIBLE
                binding.imgCabarroguis.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("aglipay", true)){
                binding.imgAglipay.visibility = View.VISIBLE
                binding.imgAglipay.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("maddela", true)){
                binding.imgMaddela.visibility = View.VISIBLE
                binding.imgMaddela.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("nagtipunan", true)){
                binding.imgNagtipunan.visibility = View.VISIBLE
                binding.imgNagtipunan.setImageResource(R.drawable.sunrain)
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
                "saguday" -> {
                    if (isChecked){
                        binding.imgSaguday.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSaguday.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSaguday.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSaguday.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSaguday.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSaguday.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSaguday.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSaguday.visibility = View.INVISIBLE
                    }
                }

                "diffun" -> {
                    if (isChecked){
                        binding.imgDiffun.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDiffun.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDiffun.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDiffun.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDiffun.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDiffun.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDiffun.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDiffun.visibility = View.INVISIBLE
                    }
                }

                "cabarroguis" -> {
                    if (isChecked){
                        binding.imgCabarroguis.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCabarroguis.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCabarroguis.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCabarroguis.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCabarroguis.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCabarroguis.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCabarroguis.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCabarroguis.visibility = View.INVISIBLE
                    }
                }

                "aglipay" -> {
                    if (isChecked){
                        binding.imgAglipay.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAglipay.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAglipay.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAglipay.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAglipay.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAglipay.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAglipay.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAglipay.visibility = View.INVISIBLE
                    }
                }

                "maddela" -> {
                    if (isChecked){
                        binding.imgMaddela.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMaddela.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMaddela.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMaddela.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMaddela.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMaddela.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMaddela.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMaddela.visibility = View.INVISIBLE
                    }
                }

                "nagtipunan" -> {
                    if (isChecked){
                        binding.imgNagtipunan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgNagtipunan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgNagtipunan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgNagtipunan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgNagtipunan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgNagtipunan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgNagtipunan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgNagtipunan.visibility = View.INVISIBLE
                    }
                }
            }
        }

        binding.tgAglipay.setOnCheckedChangeListener(listener)
        binding.tgCabarroguis.setOnCheckedChangeListener(listener)
        binding.tgDiffun.setOnCheckedChangeListener(listener)
        binding.tgMaddela.setOnCheckedChangeListener(listener)
        binding.tgNagtipunan.setOnCheckedChangeListener(listener)
        binding.tgSaguday.setOnCheckedChangeListener(listener)

        binding.btnSave13.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.quirinoLayout))
        }
    }
}