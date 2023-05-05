package com.pmac.infgrphcs

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapAbraBinding

class ActivityAbra : AppCompatActivity() {
    private lateinit var binding: ActivityMapAbraBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapAbraBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var tapTineg = 0
        var tapLacub = 0
        var tapMalibcong = 0
        var tapLagayan = 0
        var tapDanglas = 0
        var tapSanJuan = 0
        var tapSanIsidro = 0
        var tapVillaviciosa = 0
        var tapPilar = 0
        var tapManabo = 0
        var tapLuba = 0
        var tapTubo = 0
        var tapLicuanBaay = 0
        var tapLagangilang = 0
        var tapDolores = 0
        var tapLapaz = 0
        var tapTayum = 0
        var tapDaguioman = 0
        var tapBucloc = 0
        var tapSallapadan = 0
        var tapBucay = 0
        var tapPennarubia = 0
        var tapBangued = 0
        var tapLangiden = 0
        var tapPidigan = 0
        var tapSanQuintin = 0
        var tapBoliney = 0
        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)

        val header1 = header?.substringBefore("Radar") + "Radar(ABRA)" + header?.substringAfter("Radar")



        if (lightningList != null){
            if (lightningList.contains("tineg", true)){
                binding.imgTineg.visibility = View.VISIBLE
                binding.imgTineg.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("lacub", true)){
                binding.imgLacub.visibility = View.VISIBLE
                binding.imgLacub.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("lagayan", true)){
                binding.imgLagayan.visibility = View.VISIBLE
                binding.imgLagayan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("danglas", true)){
                binding.imgDanglas.visibility = View.VISIBLE
                binding.imgDanglas.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanjuan", true)){
                binding.imgSanJuan.visibility = View.VISIBLE
                binding.imgSanJuan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("lapaz", true)){
                binding.imgLaPaz.visibility = View.VISIBLE
                binding.imgLaPaz.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("dolores", true)){
                binding.imgDolores.visibility = View.VISIBLE
                binding.imgDolores.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tayum", true)){
                binding.imgTayum.visibility = View.VISIBLE
                binding.imgTayum.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("lagangilang", true)){
                binding.imgLagangilang.visibility = View.VISIBLE
                binding.imgLagangilang.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("licuan-baay", true)){
                binding.imgLicuanBaay.visibility = View.VISIBLE
                binding.imgLicuanBaay.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("malibcong", true)){
                binding.imgMalibcong.visibility = View.VISIBLE
                binding.imgMalibcong.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bangued", true)){
                binding.imgBangued.visibility = View.VISIBLE
                binding.imgBangued.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("langiden", true)){
                binding.imgLangiden.visibility = View.VISIBLE
                binding.imgLangiden.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("pidigan", true)){
                binding.imgPidigan.visibility = View.VISIBLE
                binding.imgPidigan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanquintin", true)){
                binding.imgSanQuintin.visibility = View.VISIBLE
                binding.imgSanQuintin.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("penarrubia", true)){
                binding.imgPennarubia.visibility = View.VISIBLE
                binding.imgPennarubia.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bucay", true)){
                binding.imgBucay.visibility = View.VISIBLE
                binding.imgBucay.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sallapadan", true)){
                binding.imgSallapadan.visibility = View.VISIBLE
                binding.imgSallapadan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bucloc", true)){
                binding.imgBucloc.visibility = View.VISIBLE
                binding.imgBucloc.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("daguioman", true)){
                binding.imgDaguioman.visibility = View.VISIBLE
                binding.imgDaguioman.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("boliney", true)){
                binding.imgBoliney.visibility = View.VISIBLE
                binding.imgBoliney.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanisidro", true)){
                binding.imgSanIsidro.visibility = View.VISIBLE
                binding.imgSanIsidro.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("villaviciosa", true)){
                binding.imgVillaviciosa.visibility = View.VISIBLE
                binding.imgVillaviciosa.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("manabo", true)){
                binding.imgManabo.visibility = View.VISIBLE
                binding.imgManabo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("luba", true)){
                binding.imgLuba.visibility = View.VISIBLE
                binding.imgLuba.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tubo", true)){
                binding.imgTubo.visibility = View.VISIBLE
                binding.imgTubo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("pilar", true)){
                binding.imgPilar.visibility = View.VISIBLE
                binding.imgPilar.setImageResource(R.drawable.rainlightning)
            }

        }

        if (modRainList != null){
            if (modRainList.contains("tineg", true)){
                binding.imgTineg.visibility = View.VISIBLE
                binding.imgTineg.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("lacub", true)){
                binding.imgLacub.visibility = View.VISIBLE
                binding.imgLacub.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("lagayan", true)){
                binding.imgLagayan.visibility = View.VISIBLE
                binding.imgLagayan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("danglas", true)){
                binding.imgDanglas.visibility = View.VISIBLE
                binding.imgDanglas.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanjuan", true)){
                binding.imgSanJuan.visibility = View.VISIBLE
                binding.imgSanJuan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("lapaz", true)){
                binding.imgLaPaz.visibility = View.VISIBLE
                binding.imgLaPaz.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("dolores", true)){
                binding.imgDolores.visibility = View.VISIBLE
                binding.imgDolores.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tayum", true)){
                binding.imgTayum.visibility = View.VISIBLE
                binding.imgTayum.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("lagangilang", true)){
                binding.imgLagangilang.visibility = View.VISIBLE
                binding.imgLagangilang.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("licuan-baay", true)){
                binding.imgLicuanBaay.visibility = View.VISIBLE
                binding.imgLicuanBaay.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("malibcong", true)){
                binding.imgMalibcong.visibility = View.VISIBLE
                binding.imgMalibcong.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bangued", true)){
                binding.imgBangued.visibility = View.VISIBLE
                binding.imgBangued.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("langiden", true)){
                binding.imgLangiden.visibility = View.VISIBLE
                binding.imgLangiden.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("pidigan", true)){
                binding.imgPidigan.visibility = View.VISIBLE
                binding.imgPidigan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanquintin", true)){
                binding.imgSanQuintin.visibility = View.VISIBLE
                binding.imgSanQuintin.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("penarrubia", true)){
                binding.imgPennarubia.visibility = View.VISIBLE
                binding.imgPennarubia.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bucay", true)){
                binding.imgBucay.visibility = View.VISIBLE
                binding.imgBucay.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sallapadan", true)){
                binding.imgSallapadan.visibility = View.VISIBLE
                binding.imgSallapadan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bucloc", true)){
                binding.imgBucloc.visibility = View.VISIBLE
                binding.imgBucloc.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("daguioman", true)){
                binding.imgDaguioman.visibility = View.VISIBLE
                binding.imgDaguioman.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("boliney", true)){
                binding.imgBoliney.visibility = View.VISIBLE
                binding.imgBoliney.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanisidro", true)){
                binding.imgSanIsidro.visibility = View.VISIBLE
                binding.imgSanIsidro.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("villaviciosa", true)){
                binding.imgVillaviciosa.visibility = View.VISIBLE
                binding.imgVillaviciosa.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("manabo", true)){
                binding.imgManabo.visibility = View.VISIBLE
                binding.imgManabo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("luba", true)){
                binding.imgLuba.visibility = View.VISIBLE
                binding.imgLuba.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tubo", true)){
                binding.imgTubo.visibility = View.VISIBLE
                binding.imgTubo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("pilar", true)){
                binding.imgPilar.visibility = View.VISIBLE
                binding.imgPilar.setImageResource(R.drawable.cloudrain)
            }
        }

        if (lgtRainList != null){
            if (lgtRainList.contains("tineg", true)){
                binding.imgTineg.visibility = View.VISIBLE
                binding.imgTineg.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("lacub", true)){
                binding.imgLacub.visibility = View.VISIBLE
                binding.imgLacub.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("lagayan", true)){
                binding.imgLagayan.visibility = View.VISIBLE
                binding.imgLagayan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("danglas", true)){
                binding.imgDanglas.visibility = View.VISIBLE
                binding.imgDanglas.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanjuan", true)){
                binding.imgSanJuan.visibility = View.VISIBLE
                binding.imgSanJuan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("lapaz", true)){
                binding.imgLaPaz.visibility = View.VISIBLE
                binding.imgLaPaz.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("dolores", true)){
                binding.imgDolores.visibility = View.VISIBLE
                binding.imgDolores.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tayum", true)){
                binding.imgTayum.visibility = View.VISIBLE
                binding.imgTayum.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("lagangilang", true)){
                binding.imgLagangilang.visibility = View.VISIBLE
                binding.imgLagangilang.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("licuan-baay", true)){
                binding.imgLicuanBaay.visibility = View.VISIBLE
                binding.imgLicuanBaay.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("malibcong", true)){
                binding.imgMalibcong.visibility = View.VISIBLE
                binding.imgMalibcong.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bangued", true)){
                binding.imgBangued.visibility = View.VISIBLE
                binding.imgBangued.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("langiden", true)){
                binding.imgLangiden.visibility = View.VISIBLE
                binding.imgLangiden.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("pidigan", true)){
                binding.imgPidigan.visibility = View.VISIBLE
                binding.imgPidigan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanquintin", true)){
                binding.imgSanQuintin.visibility = View.VISIBLE
                binding.imgSanQuintin.setImageResource(R.drawable.sunrain)
            }

            if (lgtRainList.contains("penarrubia", true)){
                binding.imgPennarubia.visibility = View.VISIBLE
                binding.imgPennarubia.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bucay", true)){
                binding.imgBucay.visibility = View.VISIBLE
                binding.imgBucay.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sallapadan", true)){
                binding.imgSallapadan.visibility = View.VISIBLE
                binding.imgSallapadan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bucloc", true)){
                binding.imgBucloc.visibility = View.VISIBLE
                binding.imgBucloc.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("daguioman", true)){
                binding.imgDaguioman.visibility = View.VISIBLE
                binding.imgDaguioman.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("boliney", true)){
                binding.imgBoliney.visibility = View.VISIBLE
                binding.imgBoliney.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanisidro", true)){
                binding.imgSanIsidro.visibility = View.VISIBLE
                binding.imgSanIsidro.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("villaviciosa", true)){
                binding.imgVillaviciosa.visibility = View.VISIBLE
                binding.imgVillaviciosa.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("manabo", true)){
                binding.imgManabo.visibility = View.VISIBLE
                binding.imgManabo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("luba", true)){
                binding.imgLuba.visibility = View.VISIBLE
                binding.imgLuba.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tubo", true)){
                binding.imgTubo.visibility = View.VISIBLE
                binding.imgTubo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("pilar", true)){
                binding.imgPilar.visibility = View.VISIBLE
                binding.imgPilar.setImageResource(R.drawable.sunrain)
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
                "tineg" -> {
                    if (isChecked){
                        binding.imgTineg.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTineg.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTineg.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTineg.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTineg.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTineg.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTineg.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTineg.visibility = View.INVISIBLE
                    }
                }

                "lacub" -> {
                    if (isChecked){
                        binding.imgLacub.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLacub.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLacub.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLacub.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLacub.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLacub.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLacub.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLacub.visibility = View.INVISIBLE
                    }
                }

                "malibcong" -> {
                    if (isChecked){
                        binding.imgMalibcong.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMalibcong.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMalibcong.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMalibcong.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMalibcong.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMalibcong.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMalibcong.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMalibcong.visibility = View.INVISIBLE
                    }
                }

                "lagayan" -> {
                    if (isChecked){
                        binding.imgLagayan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLagayan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLagayan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLagayan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLagayan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLagayan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLagayan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLagayan.visibility = View.INVISIBLE
                    }
                }

                "sanjuan" -> {
                    if (isChecked){
                        binding.imgSanJuan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanJuan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanJuan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanJuan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanJuan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanJuan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanJuan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanJuan.visibility = View.INVISIBLE
                    }
                }

                "danglas" -> {
                    if (isChecked){
                        binding.imgDanglas.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDanglas.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDanglas.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDanglas.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDanglas.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDanglas.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDanglas.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDanglas.visibility = View.INVISIBLE
                    }
                }

                "lapaz" -> {
                    if (isChecked){
                        binding.imgLaPaz.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLaPaz.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLaPaz.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLaPaz.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLaPaz.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLaPaz.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLaPaz.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLaPaz.visibility = View.INVISIBLE
                    }
                }

                "dolores" -> {
                    if (isChecked){
                        binding.imgDolores.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDolores.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDolores.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDolores.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDolores.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDolores.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDolores.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDolores.visibility = View.INVISIBLE
                    }
                }

                "lagangilang" -> {
                    if (isChecked){
                        binding.imgLagangilang.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLagangilang.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLagangilang.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLagangilang.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLagangilang.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLagangilang.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLagangilang.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLagangilang.visibility = View.INVISIBLE
                    }
                }

                "licuanbaay" -> {
                    if (isChecked){
                        binding.imgLicuanBaay.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLicuanBaay.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLicuanBaay.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLicuanBaay.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLicuanBaay.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLicuanBaay.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLicuanBaay.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLicuanBaay.visibility = View.INVISIBLE
                    }
                }

                "tayum" -> {
                    if (isChecked){
                        binding.imgTayum.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTayum.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTayum.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTayum.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTayum.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTayum.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTayum.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTayum.visibility = View.INVISIBLE
                    }
                }

                "langiden" -> {
                    if (isChecked){
                        binding.imgLangiden.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLangiden.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLangiden.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLangiden.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLangiden.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLangiden.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLangiden.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLangiden.visibility = View.INVISIBLE
                    }
                }

                "bangued" -> {
                    if (isChecked){
                        binding.imgBangued.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBangued.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBangued.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBangued.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBangued.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBangued.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBangued.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBangued.visibility = View.INVISIBLE
                    }
                }



                "sanquintin" -> {
                    if (isChecked){
                        binding.imgSanQuintin.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanQuintin.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanQuintin.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanQuintin.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanQuintin.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanQuintin.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanQuintin.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanQuintin.visibility = View.INVISIBLE
                    }
                }

                "pidigan" -> {
                    if (isChecked){
                        binding.imgPidigan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPidigan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPidigan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPidigan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPidigan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPidigan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPidigan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPidigan.visibility = View.INVISIBLE
                    }
                }

                "pennarubia" -> {
                    if (isChecked){
                        binding.imgPennarubia.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPennarubia.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPennarubia.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPennarubia.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPennarubia.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPennarubia.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPennarubia.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPennarubia.visibility = View.INVISIBLE
                    }
                }

                "bucay" -> {
                    if (isChecked){
                        binding.imgBucay.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBucay.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBucay.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBucay.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBucay.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBucay.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBucay.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBucay.visibility = View.INVISIBLE
                    }
                }

                "sallapadan" -> {
                    if (isChecked){
                        binding.imgSallapadan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSallapadan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSallapadan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSallapadan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSallapadan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSallapadan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSallapadan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSallapadan.visibility = View.INVISIBLE
                    }
                }

                "bucloc" -> {
                    if (isChecked){
                        binding.imgBucloc.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBucloc.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBucloc.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBucloc.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBucloc.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBucloc.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBucloc.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBucloc.visibility = View.INVISIBLE
                    }
                }

                "daguioman" -> {
                    if (isChecked){
                        binding.imgDaguioman.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDaguioman.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDaguioman.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDaguioman.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDaguioman.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDaguioman.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDaguioman.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDaguioman.visibility = View.INVISIBLE
                    }
                }

                "sanisidro" -> {
                    if (isChecked){
                        binding.imgSanIsidro.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanIsidro.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanIsidro.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanIsidro.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanIsidro.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanIsidro.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanIsidro.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanIsidro.visibility = View.INVISIBLE
                    }
                }

                "villaviciosa" -> {
                    if (isChecked){
                        binding.imgVillaviciosa.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgVillaviciosa.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgVillaviciosa.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgVillaviciosa.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgVillaviciosa.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgVillaviciosa.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgVillaviciosa.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgVillaviciosa.visibility = View.INVISIBLE
                    }
                }

                "manabo" -> {
                    if (isChecked){
                        binding.imgManabo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgManabo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgManabo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgManabo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgManabo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgManabo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgManabo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgManabo.visibility = View.INVISIBLE
                    }
                }

                "boliney" -> {
                    if (isChecked){
                        binding.imgBoliney.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBoliney.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBoliney.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBoliney.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBoliney.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBoliney.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBoliney.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBoliney.visibility = View.INVISIBLE
                    }
                }

                "luba" -> {
                    if (isChecked){
                        binding.imgLuba.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLuba.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLuba.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLuba.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLuba.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLuba.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLuba.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLuba.visibility = View.INVISIBLE
                    }
                }


                "tubo" -> {
                    if (isChecked){
                        binding.imgTubo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTubo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTubo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTubo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTubo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTubo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTubo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTubo.visibility = View.INVISIBLE
                    }
                }

                "pilar" -> {
                    if (isChecked){
                        binding.imgPilar.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPilar.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPilar.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPilar.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPilar.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPilar.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPilar.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPilar.visibility = View.INVISIBLE
                    }
                }

            }
        }

        binding.tgTineg.setOnCheckedChangeListener(listener)
        binding.tgLacub.setOnCheckedChangeListener(listener)
        binding.tgMalibcong.setOnCheckedChangeListener(listener)
        binding.tgLagayan.setOnCheckedChangeListener(listener)
        binding.tgSanJuan.setOnCheckedChangeListener(listener)
        binding.tgDanglas.setOnCheckedChangeListener(listener)
        binding.tgLaPaz.setOnCheckedChangeListener(listener)
        binding.tgDolores.setOnCheckedChangeListener(listener)
        binding.tgLagangilang.setOnCheckedChangeListener(listener)
        binding.tgLicuanBaay.setOnCheckedChangeListener(listener)
        binding.tgTayum.setOnCheckedChangeListener(listener)
        binding.tgLangiden.setOnCheckedChangeListener(listener)
        binding.tgBangued.setOnCheckedChangeListener(listener)
        binding.tgSanQuintin.setOnCheckedChangeListener(listener)
        binding.tgPidigan.setOnCheckedChangeListener(listener)
        binding.tgPennarubia.setOnCheckedChangeListener(listener)
        binding.tgBucay.setOnCheckedChangeListener(listener)
        binding.tgSallapadan.setOnCheckedChangeListener(listener)
        binding.tgBucloc.setOnCheckedChangeListener(listener)
        binding.tgDaguioman.setOnCheckedChangeListener(listener)
        binding.tgSanIsidro.setOnCheckedChangeListener(listener)
        binding.tgVillaviciosa.setOnCheckedChangeListener(listener)
        binding.tgManabo.setOnCheckedChangeListener(listener)
        binding.tgBoliney.setOnCheckedChangeListener(listener)
        binding.tgLuba.setOnCheckedChangeListener(listener)
        binding.tgTubo.setOnCheckedChangeListener(listener)
        binding.tgPilar.setOnCheckedChangeListener(listener)

        binding.btnSave1.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.abraLayout))
        }

        binding.imgTineg.setOnClickListener {
            tapTineg += 1
            binding.ryoTineg.visibility = View.VISIBLE
            when (tapTineg) {
                4 -> { tapTineg = 0
                       binding.ryoTineg.visibility = View.INVISIBLE
                     }
                3 -> binding.ryoTineg.setColorFilter(Color.RED)
                2 -> binding.ryoTineg.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoTineg.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgLacub.setOnClickListener {
            tapLacub += 1
            binding.ryoLacub.visibility = View.VISIBLE
            when (tapLacub) {
                4 -> { tapLacub = 0
                    binding.ryoLacub.visibility = View.INVISIBLE
                }
                3 -> binding.ryoLacub.setColorFilter(Color.RED)
                2 -> binding.ryoLacub.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoLacub.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgMalibcong.setOnClickListener {
            tapMalibcong += 1
            binding.ryoMalibcong.visibility = View.VISIBLE
            when (tapMalibcong) {
                4 -> { tapMalibcong = 0
                    binding.ryoMalibcong.visibility = View.INVISIBLE
                }
                3 -> binding.ryoMalibcong.setColorFilter(Color.RED)
                2 -> binding.ryoMalibcong.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoMalibcong.setColorFilter(Color.YELLOW)
            }

        }


        binding.imgLagayan.setOnClickListener {
            tapLagayan += 1
            binding.ryoLagayan.visibility = View.VISIBLE
            when (tapLagayan) {
                4 -> { tapLagayan = 0
                    binding.ryoLagayan.visibility = View.INVISIBLE
                }
                3 -> binding.ryoLagayan.setColorFilter(Color.RED)
                2 -> binding.ryoLagayan.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoLagayan.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgDanglas.setOnClickListener {
            tapDanglas += 1
            binding.ryoDanglas.visibility = View.VISIBLE
            when (tapDanglas) {
                4 -> { tapDanglas = 0
                    binding.ryoDanglas.visibility = View.INVISIBLE
                }
                3 -> binding.ryoDanglas.setColorFilter(Color.RED)
                2 -> binding.ryoDanglas.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoDanglas.setColorFilter(Color.YELLOW)
            }

        }


        binding.imgSanJuan.setOnClickListener {
            tapSanJuan += 1
            binding.ryoSanJuan.visibility = View.VISIBLE
            when (tapSanJuan) {
                4 -> { tapSanJuan = 0
                    binding.ryoSanJuan.visibility = View.INVISIBLE
                }
                3 -> binding.ryoSanJuan.setColorFilter(Color.RED)
                2 -> binding.ryoSanJuan.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoSanJuan.setColorFilter(Color.YELLOW)
            }

        }


        binding.imgSanIsidro.setOnClickListener {
            tapSanIsidro += 1
            binding.ryoSanIsidro.visibility = View.VISIBLE
            when (tapSanIsidro) {
                4 -> { tapSanIsidro = 0
                    binding.ryoSanIsidro.visibility = View.INVISIBLE
                }
                3 -> binding.ryoSanIsidro.setColorFilter(Color.RED)
                2 -> binding.ryoSanIsidro.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoSanIsidro.setColorFilter(Color.YELLOW)
            }

        }


        binding.imgVillaviciosa.setOnClickListener {
            tapVillaviciosa += 1
            binding.ryoVillaviciosa.visibility = View.VISIBLE
            when (tapVillaviciosa) {
                4 -> { tapVillaviciosa = 0
                    binding.ryoVillaviciosa.visibility = View.INVISIBLE
                }
                3 -> binding.ryoVillaviciosa.setColorFilter(Color.RED)
                2 -> binding.ryoVillaviciosa.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoVillaviciosa.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgPilar.setOnClickListener {
            tapPilar += 1
            binding.ryoPilar.visibility = View.VISIBLE
            when (tapPilar) {
                4 -> { tapPilar = 0
                    binding.ryoPilar.visibility = View.INVISIBLE
                }
                3 -> binding.ryoPilar.setColorFilter(Color.RED)
                2 -> binding.ryoPilar.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoPilar.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgManabo.setOnClickListener {
            tapManabo += 1
            binding.ryoManabo.visibility = View.VISIBLE
            when (tapManabo) {
                4 -> { tapManabo = 0
                    binding.ryoManabo.visibility = View.INVISIBLE
                }
                3 -> binding.ryoManabo.setColorFilter(Color.RED)
                2 -> binding.ryoManabo.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoManabo.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgLuba.setOnClickListener {
            tapLuba += 1
            binding.ryoLuba.visibility = View.VISIBLE
            when (tapLuba) {
                4 -> { tapLuba = 0
                    binding.ryoLuba.visibility = View.INVISIBLE
                }
                3 -> binding.ryoLuba.setColorFilter(Color.RED)
                2 -> binding.ryoLuba.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoLuba.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgTubo.setOnClickListener {
            tapTubo += 1
            binding.ryoTubo.visibility = View.VISIBLE
            when (tapTubo) {
                4 -> { tapTubo = 0
                    binding.ryoTubo.visibility = View.INVISIBLE
                }
                3 -> binding.ryoTubo.setColorFilter(Color.RED)
                2 -> binding.ryoTubo.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoTubo.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgLicuanBaay.setOnClickListener {
            tapLicuanBaay += 1
            binding.ryoLicuanBaay.visibility = View.VISIBLE
            when (tapLicuanBaay) {
                4 -> { tapLicuanBaay = 0
                    binding.ryoLicuanBaay.visibility = View.INVISIBLE
                }
                3 -> binding.ryoLicuanBaay.setColorFilter(Color.RED)
                2 -> binding.ryoLicuanBaay.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoLicuanBaay.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgLagangilang.setOnClickListener {
            tapLagangilang += 1
            binding.ryoLagangilang.visibility = View.VISIBLE
            when (tapLagangilang) {
                4 -> { tapLagangilang = 0
                    binding.ryoLagangilang.visibility = View.INVISIBLE
                }
                3 -> binding.ryoLagangilang.setColorFilter(Color.RED)
                2 -> binding.ryoLagangilang.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoLagangilang.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgDolores.setOnClickListener {
            tapDolores += 1
            binding.ryoDolores.visibility = View.VISIBLE
            when (tapDolores) {
                4 -> { tapDolores = 0
                    binding.ryoDolores.visibility = View.INVISIBLE
                }
                3 -> binding.ryoDolores.setColorFilter(Color.RED)
                2 -> binding.ryoDolores.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoDolores.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgLaPaz.setOnClickListener {
            tapLapaz += 1
            binding.ryoLapaz.visibility = View.VISIBLE
            when (tapLapaz) {
                4 -> { tapLapaz = 0
                    binding.ryoLapaz.visibility = View.INVISIBLE
                }
                3 -> binding.ryoLapaz.setColorFilter(Color.RED)
                2 -> binding.ryoLapaz.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoLapaz.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgTayum.setOnClickListener {
            tapTayum += 1
            binding.ryoTayum.visibility = View.VISIBLE
            when (tapTayum) {
                4 -> { tapTayum = 0
                    binding.ryoTayum.visibility = View.INVISIBLE
                }
                3 -> binding.ryoTayum.setColorFilter(Color.RED)
                2 -> binding.ryoTayum.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoTayum.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgDaguioman.setOnClickListener {
            tapDaguioman += 1
            binding.ryoDaguioman.visibility = View.VISIBLE
            when (tapDaguioman) {
                4 -> { tapDaguioman = 0
                    binding.ryoDaguioman.visibility = View.INVISIBLE
                }
                3 -> binding.ryoDaguioman.setColorFilter(Color.RED)
                2 -> binding.ryoDaguioman.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoDaguioman.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgBucloc.setOnClickListener {
            tapBucloc += 1
            binding.ryoBucloc.visibility = View.VISIBLE
            when (tapBucloc) {
                4 -> { tapBucloc = 0
                    binding.ryoBucloc.visibility = View.INVISIBLE
                }
                3 -> binding.ryoBucloc.setColorFilter(Color.RED)
                2 -> binding.ryoBucloc.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoBucloc.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgSallapadan.setOnClickListener {
            tapSallapadan += 1
            binding.ryoSallapadan.visibility = View.VISIBLE
            when (tapSallapadan) {
                4 -> { tapSallapadan = 0
                    binding.ryoSallapadan.visibility = View.INVISIBLE
                }
                3 -> binding.ryoSallapadan.setColorFilter(Color.RED)
                2 -> binding.ryoSallapadan.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoSallapadan.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgBucay.setOnClickListener {
            tapBucay += 1
            binding.ryoBucay.visibility = View.VISIBLE
            when (tapBucay) {
                4 -> { tapBucay = 0
                    binding.ryoBucay.visibility = View.INVISIBLE
                }
                3 -> binding.ryoBucay.setColorFilter(Color.RED)
                2 -> binding.ryoBucay.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoBucay.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgPennarubia.setOnClickListener {
            tapPennarubia += 1
            binding.ryoPennarubia.visibility = View.VISIBLE
            when (tapPennarubia) {
                4 -> { tapPennarubia = 0
                    binding.ryoPennarubia.visibility = View.INVISIBLE
                }
                3 -> binding.ryoPennarubia.setColorFilter(Color.RED)
                2 -> binding.ryoPennarubia.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoPennarubia.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgBangued.setOnClickListener {
            tapBangued += 1
            binding.ryoBangued.visibility = View.VISIBLE
            when (tapBangued) {
                4 -> { tapBangued = 0
                    binding.ryoBangued.visibility = View.INVISIBLE
                }
                3 -> binding.ryoBangued.setColorFilter(Color.RED)
                2 -> binding.ryoBangued.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoBangued.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgLangiden.setOnClickListener {
            tapLangiden += 1
            binding.ryoLangiden.visibility = View.VISIBLE
            when (tapLangiden) {
                4 -> { tapLangiden = 0
                    binding.ryoLangiden.visibility = View.INVISIBLE
                }
                3 -> binding.ryoLangiden.setColorFilter(Color.RED)
                2 -> binding.ryoLangiden.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoLangiden.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgPidigan.setOnClickListener {
            tapPidigan += 1
            binding.ryoPidigan.visibility = View.VISIBLE
            when (tapPidigan) {
                4 -> { tapPidigan = 0
                    binding.ryoPidigan.visibility = View.INVISIBLE
                }
                3 -> binding.ryoPidigan.setColorFilter(Color.RED)
                2 -> binding.ryoPidigan.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoPidigan.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgSanQuintin.setOnClickListener {
            tapSanQuintin += 1
            binding.ryoSanQuintin.visibility = View.VISIBLE
            when (tapSanQuintin) {
                4 -> { tapSanQuintin = 0
                    binding.ryoSanQuintin.visibility = View.INVISIBLE
                }
                3 -> binding.ryoSanQuintin.setColorFilter(Color.RED)
                2 -> binding.ryoSanQuintin.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoSanQuintin.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgBoliney.setOnClickListener {
            tapBoliney += 1
            binding.ryoBoliney.visibility = View.VISIBLE
            when (tapBoliney) {
                4 -> { tapBoliney = 0
                    binding.ryoBoliney.visibility = View.INVISIBLE
                }
                3 -> binding.ryoBoliney.setColorFilter(Color.RED)
                2 -> binding.ryoBoliney.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoBoliney.setColorFilter(Color.YELLOW)
            }

        }

    }
}

