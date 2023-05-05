package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapApayaoBinding

class ActivityApayao : AppCompatActivity() {
    private lateinit var binding: ActivityMapApayaoBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapApayaoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)

        val header1 = header?.substringBefore("Radar") + "Radar(APAYAO)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("luna", true)){
                binding.imgLuna.visibility = View.VISIBLE
                binding.imgLuna.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sta.marcela", true)){
                binding.imgSMarcela.visibility = View.VISIBLE
                binding.imgSMarcela.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("pudtol", true)){
                binding.imgPudtol.visibility = View.VISIBLE
                binding.imgPudtol.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("flora", true)){
                binding.imgFlora.visibility = View.VISIBLE
                binding.imgFlora.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("calanasan", true)){
                binding.imgCalanasan.visibility = View.VISIBLE
                binding.imgCalanasan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("kabugao", true)){
                binding.imgKabugao.visibility = View.VISIBLE
                binding.imgKabugao.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("conner", true)){
                binding.imgConner.visibility = View.VISIBLE
                binding.imgConner.setImageResource(R.drawable.rainlightning)
            }

        }

        if (modRainList != null){
            if (modRainList.contains("luna", true)){
                binding.imgLuna.visibility = View.VISIBLE
                binding.imgLuna.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sta.marcela", true)){
                binding.imgSMarcela.visibility = View.VISIBLE
                binding.imgSMarcela.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("pudtol", true)){
                binding.imgPudtol.visibility = View.VISIBLE
                binding.imgPudtol.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("flora", true)){
                binding.imgFlora.visibility = View.VISIBLE
                binding.imgFlora.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("calanasan", true)){
                binding.imgCalanasan.visibility = View.VISIBLE
                binding.imgCalanasan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("kabugao", true)){
                binding.imgKabugao.visibility = View.VISIBLE
                binding.imgKabugao.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("conner", true)){
                binding.imgConner.visibility = View.VISIBLE
                binding.imgConner.setImageResource(R.drawable.cloudrain)
            }
        }

        if (lgtRainList != null){
            if (lgtRainList.contains("luna", true)){
                binding.imgLuna.visibility = View.VISIBLE
                binding.imgLuna.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sta.marcela", true)){
                binding.imgSMarcela.visibility = View.VISIBLE
                binding.imgSMarcela.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("pudtol", true)){
                binding.imgPudtol.visibility = View.VISIBLE
                binding.imgPudtol.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("flora", true)){
                binding.imgFlora.visibility = View.VISIBLE
                binding.imgFlora.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("calanasan", true)){
                binding.imgCalanasan.visibility = View.VISIBLE
                binding.imgCalanasan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("kabugao", true)){
                binding.imgKabugao.visibility = View.VISIBLE
                binding.imgKabugao.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("conner", true)){
                binding.imgConner.visibility = View.VISIBLE
                binding.imgConner.setImageResource(R.drawable.sunrain)
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
                "luna" -> {
                    if (isChecked){
                        binding.imgLuna.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLuna.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLuna.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLuna.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLuna.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLuna.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLuna.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLuna.visibility = View.INVISIBLE
                    }
                }

                "sta.marcela" -> {
                    if (isChecked){
                        binding.imgSMarcela.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSMarcela.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSMarcela.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSMarcela.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSMarcela.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSMarcela.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSMarcela.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSMarcela.visibility = View.INVISIBLE
                    }
                }

                "flora" -> {
                    if (isChecked){
                        binding.imgFlora.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgFlora.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgFlora.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgFlora.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgFlora.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgFlora.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgFlora.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgFlora.visibility = View.INVISIBLE
                    }
                }

                "pudtol" -> {
                    if (isChecked){
                        binding.imgPudtol.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPudtol.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPudtol.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPudtol.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPudtol.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPudtol.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPudtol.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPudtol.visibility = View.INVISIBLE
                    }
                }

                "calanasan" -> {
                    if (isChecked){
                        binding.imgCalanasan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCalanasan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCalanasan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCalanasan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCalanasan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCalanasan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCalanasan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCalanasan.visibility = View.INVISIBLE
                    }
                }

                "kabugao" -> {
                    if (isChecked){
                        binding.imgKabugao.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgKabugao.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgKabugao.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgKabugao.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgKabugao.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgKabugao.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgKabugao.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgKabugao.visibility = View.INVISIBLE
                    }
                }

                "conner" -> {
                    if (isChecked){
                        binding.imgConner.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgConner.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgConner.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgConner.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgConner.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgConner.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgConner.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgConner.visibility = View.INVISIBLE
                    }
                }
            }
        }

        binding.tgCalanasan.setOnCheckedChangeListener(listener)
        binding.tgConner.setOnCheckedChangeListener(listener)
        binding.tgFlora.setOnCheckedChangeListener(listener)
        binding.tgKabugao.setOnCheckedChangeListener(listener)
        binding.tgLuna.setOnCheckedChangeListener(listener)
        binding.tgPudtol.setOnCheckedChangeListener(listener)
        binding.tgSMarcela.setOnCheckedChangeListener(listener)

        binding.btnSave2.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.apayaoLayout))
        }
    }
}