package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapLaunionBinding

class ActivityLaunion : AppCompatActivity() {
    private lateinit var binding: ActivityMapLaunionBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapLaunionBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)
        val header1 = header?.substringBefore("Radar") + "Radar(LA UNION)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("bangar", true)){
                binding.imgBangar.visibility = View.VISIBLE
                binding.imgBangar.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sudipen", true)){
                binding.imgSudipen.visibility = View.VISIBLE
                binding.imgSudipen.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("luna", true)){
                binding.imgLuna1.visibility = View.VISIBLE
                binding.imgLuna1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("balaoan", true)){
                binding.imgBalaoan.visibility = View.VISIBLE
                binding.imgBalaoan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("santol", true)){
                binding.imgSantol.visibility = View.VISIBLE
                binding.imgSantol.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bacnotan", true)){
                binding.imgBacnotan.visibility = View.VISIBLE
                binding.imgBacnotan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanjuan", true)){
                binding.imgSanJuan1.visibility = View.VISIBLE
                binding.imgSanJuan1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sangabriel", true)){
                binding.imgSanGabriel.visibility = View.VISIBLE
                binding.imgSanGabriel.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanfernando", true)){
                binding.imgSanFernando.visibility = View.VISIBLE
                binding.imgSanFernando.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bagulin", true)){
                binding.imgBagulin.visibility = View.VISIBLE
                binding.imgBagulin.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("burgos", true)){
                binding.imgBurgos1.visibility = View.VISIBLE
                binding.imgBurgos1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("naguilian", true)){
                binding.imgNaguilian.visibility = View.VISIBLE
                binding.imgNaguilian.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bauang", true)){
                binding.imgBauang.visibility = View.VISIBLE
                binding.imgBauang.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("caba", true)){
                binding.imgCaba.visibility = View.VISIBLE
                binding.imgCaba.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("aringay", true)){
                binding.imgAringay.visibility = View.VISIBLE
                binding.imgAringay.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tubao", true)){
                binding.imgTubao.visibility = View.VISIBLE
                binding.imgTubao.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("pugo", true)){
                binding.imgPugo.visibility = View.VISIBLE
                binding.imgPugo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("agoo", true)){
                binding.imgAgoo.visibility = View.VISIBLE
                binding.imgAgoo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sto.tomas", true)){
                binding.imgSantoTomas.visibility = View.VISIBLE
                binding.imgSantoTomas.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("rosario", true)){
                binding.imgRosario.visibility = View.VISIBLE
                binding.imgRosario.setImageResource(R.drawable.rainlightning)
            }
        }

        if (modRainList != null){
            if (modRainList.contains("bangar", true)){
                binding.imgBangar.visibility = View.VISIBLE
                binding.imgBangar.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sudipen", true)){
                binding.imgSudipen.visibility = View.VISIBLE
                binding.imgSudipen.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("luna", true)){
                binding.imgLuna1.visibility = View.VISIBLE
                binding.imgLuna1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("balaoan", true)){
                binding.imgBalaoan.visibility = View.VISIBLE
                binding.imgBalaoan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("santol", true)){
                binding.imgSantol.visibility = View.VISIBLE
                binding.imgSantol.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bacnotan", true)){
                binding.imgBacnotan.visibility = View.VISIBLE
                binding.imgBacnotan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanjuan", true)){
                binding.imgSanJuan1.visibility = View.VISIBLE
                binding.imgSanJuan1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sangabriel", true)){
                binding.imgSanGabriel.visibility = View.VISIBLE
                binding.imgSanGabriel.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanfernando", true)){
                binding.imgSanFernando.visibility = View.VISIBLE
                binding.imgSanFernando.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bagulin", true)){
                binding.imgBagulin.visibility = View.VISIBLE
                binding.imgBagulin.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("burgos", true)){
                binding.imgBurgos1.visibility = View.VISIBLE
                binding.imgBurgos1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("naguilian", true)){
                binding.imgNaguilian.visibility = View.VISIBLE
                binding.imgNaguilian.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bauang", true)){
                binding.imgBauang.visibility = View.VISIBLE
                binding.imgBauang.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("caba", true)){
                binding.imgCaba.visibility = View.VISIBLE
                binding.imgCaba.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("aringay", true)){
                binding.imgAringay.visibility = View.VISIBLE
                binding.imgAringay.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tubao", true)){
                binding.imgTubao.visibility = View.VISIBLE
                binding.imgTubao.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("pugo", true)){
                binding.imgPugo.visibility = View.VISIBLE
                binding.imgPugo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("agoo", true)){
                binding.imgAgoo.visibility = View.VISIBLE
                binding.imgAgoo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sto.tomas", true)){
                binding.imgSantoTomas.visibility = View.VISIBLE
                binding.imgSantoTomas.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("rosario", true)){
                binding.imgRosario.visibility = View.VISIBLE
                binding.imgRosario.setImageResource(R.drawable.cloudrain)
            }
        }

        if (lgtRainList != null){
            if (lgtRainList.contains("bangar", true)){
                binding.imgBangar.visibility = View.VISIBLE
                binding.imgBangar.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sudipen", true)){
                binding.imgSudipen.visibility = View.VISIBLE
                binding.imgSudipen.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("luna", true)){
                binding.imgLuna1.visibility = View.VISIBLE
                binding.imgLuna1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("balaoan", true)){
                binding.imgBalaoan.visibility = View.VISIBLE
                binding.imgBalaoan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("santol", true)){
                binding.imgSantol.visibility = View.VISIBLE
                binding.imgSantol.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bacnotan", true)){
                binding.imgBacnotan.visibility = View.VISIBLE
                binding.imgBacnotan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanjuan", true)){
                binding.imgSanJuan1.visibility = View.VISIBLE
                binding.imgSanJuan1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sangabriel", true)){
                binding.imgSanGabriel.visibility = View.VISIBLE
                binding.imgSanGabriel.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanfernando", true)){
                binding.imgSanFernando.visibility = View.VISIBLE
                binding.imgSanFernando.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bagulin", true)){
                binding.imgBagulin.visibility = View.VISIBLE
                binding.imgBagulin.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("burgos", true)){
                binding.imgBurgos1.visibility = View.VISIBLE
                binding.imgBurgos1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("naguilian", true)){
                binding.imgNaguilian.visibility = View.VISIBLE
                binding.imgNaguilian.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bauang", true)){
                binding.imgBauang.visibility = View.VISIBLE
                binding.imgBauang.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("caba", true)){
                binding.imgCaba.visibility = View.VISIBLE
                binding.imgCaba.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("aringay", true)){
                binding.imgAringay.visibility = View.VISIBLE
                binding.imgAringay.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tubao", true)){
                binding.imgTubao.visibility = View.VISIBLE
                binding.imgTubao.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("pugo", true)){
                binding.imgPugo.visibility = View.VISIBLE
                binding.imgPugo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("agoo", true)){
                binding.imgAgoo.visibility = View.VISIBLE
                binding.imgAgoo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sto.tomas", true)){
                binding.imgSantoTomas.visibility = View.VISIBLE
                binding.imgSantoTomas.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("rosario", true)){
                binding.imgRosario.visibility = View.VISIBLE
                binding.imgRosario.setImageResource(R.drawable.sunrain)
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
                "bangar" -> {
                    if (isChecked){
                        binding.imgBangar.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBangar.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBangar.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBangar.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBangar.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBangar.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBangar.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBangar.visibility = View.INVISIBLE
                    }
                }

                "sudipen" -> {
                    if (isChecked){
                        binding.imgSudipen.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSudipen.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSudipen.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSudipen.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSudipen.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSudipen.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSudipen.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSudipen.visibility = View.INVISIBLE
                    }
                }

                "luna" -> {
                    if (isChecked){
                        binding.imgLuna1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLuna1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLuna1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLuna1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLuna1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLuna1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLuna1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLuna1.visibility = View.INVISIBLE
                    }
                }

                "balaoan" -> {
                    if (isChecked){
                        binding.imgBalaoan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBalaoan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBalaoan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBalaoan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBalaoan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBalaoan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBalaoan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBalaoan.visibility = View.INVISIBLE
                    }
                }

                "santol" -> {
                    if (isChecked){
                        binding.imgSantol.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantol.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantol.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantol.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantol.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantol.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantol.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantol.visibility = View.INVISIBLE
                    }
                }

                "bacnotan" -> {
                    if (isChecked){
                        binding.imgBacnotan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBacnotan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBacnotan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBacnotan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBacnotan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBacnotan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBacnotan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBacnotan.visibility = View.INVISIBLE
                    }
                }

                "sanjuan" -> {
                    if (isChecked){
                        binding.imgSanJuan1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanJuan1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanJuan1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanJuan1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanJuan1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanJuan1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanJuan1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanJuan1.visibility = View.INVISIBLE
                    }
                }

                "sangabriel" -> {
                    if (isChecked){
                        binding.imgSanGabriel.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanGabriel.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanGabriel.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanGabriel.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanGabriel.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanGabriel.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanGabriel.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanGabriel.visibility = View.INVISIBLE
                    }
                }


                "sanfernando" -> {
                    if (isChecked){
                        binding.imgSanFernando.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanFernando.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanFernando.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanFernando.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanFernando.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanFernando.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanFernando.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanFernando.visibility = View.INVISIBLE
                    }
                }

                "bagulin" -> {
                    if (isChecked){
                        binding.imgBagulin.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBagulin.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBagulin.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBagulin.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBagulin.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBagulin.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBagulin.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBagulin.visibility = View.INVISIBLE
                    }
                }

                "burgos" -> {
                    if (isChecked){
                        binding.imgBurgos1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBurgos1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBurgos1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBurgos1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBurgos1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBurgos1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBurgos1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBurgos1.visibility = View.INVISIBLE
                    }
                }

                "naguilian" -> {
                    if (isChecked){
                        binding.imgNaguilian.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgNaguilian.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgNaguilian.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgNaguilian.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgNaguilian.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgNaguilian.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgNaguilian.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgNaguilian.visibility = View.INVISIBLE
                    }
                }

                "bauang" -> {
                    if (isChecked){
                        binding.imgBauang.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBauang.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBauang.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBauang.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBauang.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBauang.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBauang.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBauang.visibility = View.INVISIBLE
                    }
                }

                "caba" -> {
                    if (isChecked){
                        binding.imgCaba.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCaba.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCaba.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCaba.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCaba.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCaba.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCaba.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCaba.visibility = View.INVISIBLE
                    }
                }

                "aringay" -> {
                    if (isChecked){
                        binding.imgAringay.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAringay.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAringay.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAringay.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAringay.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAringay.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAringay.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAringay.visibility = View.INVISIBLE
                    }
                }

                "tubao" -> {
                    if (isChecked){
                        binding.imgTubao.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTubao.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTubao.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTubao.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTubao.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTubao.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTubao.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTubao.visibility = View.INVISIBLE
                    }
                }

                "pugo" -> {
                    if (isChecked){
                        binding.imgPugo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPugo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPugo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPugo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPugo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPugo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPugo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPugo.visibility = View.INVISIBLE
                    }
                }

                "agoo" -> {
                    if (isChecked){
                        binding.imgAgoo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAgoo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAgoo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAgoo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAgoo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAgoo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAgoo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAgoo.visibility = View.INVISIBLE
                    }
                }

                "sto.tomas" -> {
                    if (isChecked){
                        binding.imgSantoTomas.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantoTomas.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantoTomas.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantoTomas.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantoTomas.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantoTomas.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantoTomas.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantoTomas.visibility = View.INVISIBLE
                    }
                }

                "rosario" -> {
                    if (isChecked){
                        binding.imgRosario.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgRosario.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgRosario.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgRosario.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgRosario.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgRosario.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgRosario.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgRosario.visibility = View.INVISIBLE
                    }
                }
            }
        }

        binding.tgAgoo.setOnCheckedChangeListener(listener)
        binding.tgAringay.setOnCheckedChangeListener(listener)
        binding.tgBacnotan.setOnCheckedChangeListener(listener)
        binding.tgBagulin.setOnCheckedChangeListener(listener)
        binding.tgBalaoan.setOnCheckedChangeListener(listener)
        binding.tgBangar.setOnCheckedChangeListener(listener)
        binding.tgBauang.setOnCheckedChangeListener(listener)
        binding.tgBurgos1.setOnCheckedChangeListener(listener)
        binding.tgCaba.setOnCheckedChangeListener(listener)
        binding.tgLuna1.setOnCheckedChangeListener(listener)
        binding.tgNaguilian.setOnCheckedChangeListener(listener)
        binding.tgPugo.setOnCheckedChangeListener(listener)
        binding.tgRosario.setOnCheckedChangeListener(listener)
        binding.tgSanFernando.setOnCheckedChangeListener(listener)
        binding.tgSanGabriel.setOnCheckedChangeListener(listener)
        binding.tgSanJuan1.setOnCheckedChangeListener(listener)
        binding.tgSantoTomas.setOnCheckedChangeListener(listener)
        binding.tgSantol.setOnCheckedChangeListener(listener)
        binding.tgSudipen.setOnCheckedChangeListener(listener)
        binding.tgTubao.setOnCheckedChangeListener(listener)

        binding.btnSave9.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.launionLayout))
        }
    }
}