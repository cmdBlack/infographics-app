package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapSurBinding

class ActivitySur : AppCompatActivity() {
    private lateinit var binding: ActivityMapSurBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapSurBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)
        val header1 = header?.substringBefore("Radar") + "Radar(ILOCOS SUR)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("sinait", true)){
                binding.imgSinait.visibility = View.VISIBLE
                binding.imgSinait.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("cabugao", true)){
                binding.imgCabugao.visibility = View.VISIBLE
                binding.imgCabugao.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanjuan", true)){
                binding.imgSanJuan2.visibility = View.VISIBLE
                binding.imgSanJuan2.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("magsingal", true)){
                binding.imgMagsingal.visibility = View.VISIBLE
                binding.imgMagsingal.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sto.domingo", true)){
                binding.imgSantoDomingo.visibility = View.VISIBLE
                binding.imgSantoDomingo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanvicente", true)){
                binding.imgSanVicente.visibility = View.VISIBLE
                binding.imgSanVicente.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sta.catalina", true)){
                binding.imgSantaCatalina.visibility = View.VISIBLE
                binding.imgSantaCatalina.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanildefonso", true)){
                binding.imgSanIldefonso.visibility = View.VISIBLE
                binding.imgSanIldefonso.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("santa", true)){
                binding.imgSanta.visibility = View.VISIBLE
                binding.imgSanta.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("narvacan", true)){
                binding.imgNarvacan.visibility = View.VISIBLE
                binding.imgNarvacan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("nagbukel", true)){
                binding.imgNagbukel.visibility = View.VISIBLE
                binding.imgNagbukel.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sta.maria", true)){
                binding.imgSantaMaria1.visibility = View.VISIBLE
                binding.imgSantaMaria1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanesteban", true)){
                binding.imgSanEsteban.visibility = View.VISIBLE
                binding.imgSanEsteban.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("burgos", true)){
                binding.imgBurgos3.visibility = View.VISIBLE
                binding.imgBurgos3.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanemilio", true)){
                binding.imgSanEmilio.visibility = View.VISIBLE
                binding.imgSanEmilio.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("gregoriodelpilar", true)){
                binding.imgGregorioDelPilar.visibility = View.VISIBLE
                binding.imgGregorioDelPilar.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("quirino", true)){
                binding.imgQuirino2.visibility = View.VISIBLE
                binding.imgQuirino2.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("cervantes", true)){
                binding.imgCervantes.visibility = View.VISIBLE
                binding.imgCervantes.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sigay", true)){
                binding.imgSigay.visibility = View.VISIBLE
                binding.imgSigay.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("suyo", true)){
                binding.imgSuyo.visibility = View.VISIBLE
                binding.imgSuyo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sta.cruz", true)){
                binding.imgSantaCruz.visibility = View.VISIBLE
                binding.imgSantaCruz.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sta.lucia", true)){
                binding.imgSantaLucia.visibility = View.VISIBLE
                binding.imgSantaLucia.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("salcedo", true)){
                binding.imgSalcedo.visibility = View.VISIBLE
                binding.imgSalcedo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("alilem", true)){
                binding.imgAlilem.visibility = View.VISIBLE
                binding.imgAlilem.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tagudin", true)){
                binding.imgTagudin.visibility = View.VISIBLE
                binding.imgTagudin.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sugpon", true)){
                binding.imgSugpon.visibility = View.VISIBLE
                binding.imgSugpon.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("banayoyo", true)) {
                binding.imgBanayoyo.visibility = View.VISIBLE
                binding.imgBanayoyo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("candoncity", true)){
                binding.imgCandonCity.visibility = View.VISIBLE
                binding.imgCandonCity.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("galimuyod", true)){
                binding.imgGalimuyod.visibility = View.VISIBLE
                binding.imgGalimuyod.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("lidlidda", true)){
                binding.imgLidlidda.visibility = View.VISIBLE
                binding.imgLidlidda.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("santiago", true)){
                binding.imgSantiago.visibility = View.VISIBLE
                binding.imgSantiago.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bantay", true)){
                binding.imgBantay.visibility = View.VISIBLE
                binding.imgBantay.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("vigancity", true)){
                binding.imgViganCity.visibility = View.VISIBLE
                binding.imgViganCity.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("caoayan", true)){
                binding.imgCaoayan.visibility = View.VISIBLE
                binding.imgCaoayan.setImageResource(R.drawable.rainlightning)
            }

        }

        if (modRainList != null){
            if (modRainList.contains("sinait", true)){
                binding.imgSinait.visibility = View.VISIBLE
                binding.imgSinait.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("cabugao", true)){
                binding.imgCabugao.visibility = View.VISIBLE
                binding.imgCabugao.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanjuan", true)){
                binding.imgSanJuan2.visibility = View.VISIBLE
                binding.imgSanJuan2.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("magsingal", true)){
                binding.imgMagsingal.visibility = View.VISIBLE
                binding.imgMagsingal.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sto.domingo", true)){
                binding.imgSantoDomingo.visibility = View.VISIBLE
                binding.imgSantoDomingo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanvicente", true)){
                binding.imgSanVicente.visibility = View.VISIBLE
                binding.imgSanVicente.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sta.catalina", true)){
                binding.imgSantaCatalina.visibility = View.VISIBLE
                binding.imgSantaCatalina.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanildefonso", true)){
                binding.imgSanIldefonso.visibility = View.VISIBLE
                binding.imgSanIldefonso.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("santa", true)){
                binding.imgSanta.visibility = View.VISIBLE
                binding.imgSanta.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("narvacan", true)){
                binding.imgNarvacan.visibility = View.VISIBLE
                binding.imgNarvacan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("nagbukel", true)){
                binding.imgNagbukel.visibility = View.VISIBLE
                binding.imgNagbukel.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sta.maria", true)){
                binding.imgSantaMaria1.visibility = View.VISIBLE
                binding.imgSantaMaria1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanesteban", true)){
                binding.imgSanEsteban.visibility = View.VISIBLE
                binding.imgSanEsteban.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("burgos", true)){
                binding.imgBurgos3.visibility = View.VISIBLE
                binding.imgBurgos3.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanemilio", true)){
                binding.imgSanEmilio.visibility = View.VISIBLE
                binding.imgSanEmilio.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("gregoriodelpilar", true)){
                binding.imgGregorioDelPilar.visibility = View.VISIBLE
                binding.imgGregorioDelPilar.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("quirino", true)){
                binding.imgQuirino2.visibility = View.VISIBLE
                binding.imgQuirino2.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("cervantes", true)){
                binding.imgCervantes.visibility = View.VISIBLE
                binding.imgCervantes.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sigay", true)){
                binding.imgSigay.visibility = View.VISIBLE
                binding.imgSigay.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("suyo", true)){
                binding.imgSuyo.visibility = View.VISIBLE
                binding.imgSuyo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sta.cruz", true)){
                binding.imgSantaCruz.visibility = View.VISIBLE
                binding.imgSantaCruz.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sta.lucia", true)){
                binding.imgSantaLucia.visibility = View.VISIBLE
                binding.imgSantaLucia.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("salcedo", true)){
                binding.imgSalcedo.visibility = View.VISIBLE
                binding.imgSalcedo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("alilem", true)){
                binding.imgAlilem.visibility = View.VISIBLE
                binding.imgAlilem.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tagudin", true)){
                binding.imgTagudin.visibility = View.VISIBLE
                binding.imgTagudin.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sugpon", true)){
                binding.imgSugpon.visibility = View.VISIBLE
                binding.imgSugpon.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("banayoyo", true)) {
                binding.imgBanayoyo.visibility = View.VISIBLE
                binding.imgBanayoyo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("candoncity", true)){
                binding.imgCandonCity.visibility = View.VISIBLE
                binding.imgCandonCity.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("galimuyod", true)){
                binding.imgGalimuyod.visibility = View.VISIBLE
                binding.imgGalimuyod.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("lidlidda", true)){
                binding.imgLidlidda.visibility = View.VISIBLE
                binding.imgLidlidda.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("santiago", true)){
                binding.imgSantiago.visibility = View.VISIBLE
                binding.imgSantiago.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bantay", true)){
                binding.imgBantay.visibility = View.VISIBLE
                binding.imgBantay.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("vigancity", true)){
                binding.imgViganCity.visibility = View.VISIBLE
                binding.imgViganCity.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("caoayan", true)){
                binding.imgCaoayan.visibility = View.VISIBLE
                binding.imgCaoayan.setImageResource(R.drawable.cloudrain)
            }

        }

        if (lgtRainList != null){
            if (lgtRainList.contains("sinait", true)){
                binding.imgSinait.visibility = View.VISIBLE
                binding.imgSinait.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("cabugao", true)){
                binding.imgCabugao.visibility = View.VISIBLE
                binding.imgCabugao.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanjuan", true)){
                binding.imgSanJuan2.visibility = View.VISIBLE
                binding.imgSanJuan2.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("magsingal", true)){
                binding.imgMagsingal.visibility = View.VISIBLE
                binding.imgMagsingal.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sto.domingo", true)){
                binding.imgSantoDomingo.visibility = View.VISIBLE
                binding.imgSantoDomingo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanvicente", true)){
                binding.imgSanVicente.visibility = View.VISIBLE
                binding.imgSanVicente.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sta.catalina", true)){
                binding.imgSantaCatalina.visibility = View.VISIBLE
                binding.imgSantaCatalina.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanildefonso", true)){
                binding.imgSanIldefonso.visibility = View.VISIBLE
                binding.imgSanIldefonso.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("santa", true)){
                binding.imgSanta.visibility = View.VISIBLE
                binding.imgSanta.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("narvacan", true)){
                binding.imgNarvacan.visibility = View.VISIBLE
                binding.imgNarvacan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("nagbukel", true)){
                binding.imgNagbukel.visibility = View.VISIBLE
                binding.imgNagbukel.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sta.maria", true)){
                binding.imgSantaMaria1.visibility = View.VISIBLE
                binding.imgSantaMaria1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanesteban", true)){
                binding.imgSanEsteban.visibility = View.VISIBLE
                binding.imgSanEsteban.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("burgos", true)){
                binding.imgBurgos3.visibility = View.VISIBLE
                binding.imgBurgos3.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanemilio", true)){
                binding.imgSanEmilio.visibility = View.VISIBLE
                binding.imgSanEmilio.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("gregoriodelpilar", true)){
                binding.imgGregorioDelPilar.visibility = View.VISIBLE
                binding.imgGregorioDelPilar.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("quirino", true)){
                binding.imgQuirino2.visibility = View.VISIBLE
                binding.imgQuirino2.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("cervantes", true)){
                binding.imgCervantes.visibility = View.VISIBLE
                binding.imgCervantes.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sigay", true)){
                binding.imgSigay.visibility = View.VISIBLE
                binding.imgSigay.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("suyo", true)){
                binding.imgSuyo.visibility = View.VISIBLE
                binding.imgSuyo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sta.cruz", true)){
                binding.imgSantaCruz.visibility = View.VISIBLE
                binding.imgSantaCruz.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sta.lucia", true)){
                binding.imgSantaLucia.visibility = View.VISIBLE
                binding.imgSantaLucia.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("salcedo", true)){
                binding.imgSalcedo.visibility = View.VISIBLE
                binding.imgSalcedo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("alilem", true)){
                binding.imgAlilem.visibility = View.VISIBLE
                binding.imgAlilem.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tagudin", true)){
                binding.imgTagudin.visibility = View.VISIBLE
                binding.imgTagudin.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sugpon", true)){
                binding.imgSugpon.visibility = View.VISIBLE
                binding.imgSugpon.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("banayoyo", true)) {
                binding.imgBanayoyo.visibility = View.VISIBLE
                binding.imgBanayoyo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("candoncity", true)){
                binding.imgCandonCity.visibility = View.VISIBLE
                binding.imgCandonCity.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("galimuyod", true)){
                binding.imgGalimuyod.visibility = View.VISIBLE
                binding.imgGalimuyod.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("lidlidda", true)){
                binding.imgLidlidda.visibility = View.VISIBLE
                binding.imgLidlidda.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("santiago", true)){
                binding.imgSantiago.visibility = View.VISIBLE
                binding.imgSantiago.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bantay", true)){
                binding.imgBantay.visibility = View.VISIBLE
                binding.imgBantay.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("vigancity", true)){
                binding.imgViganCity.visibility = View.VISIBLE
                binding.imgViganCity.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("caoayan", true)){
                binding.imgCaoayan.visibility = View.VISIBLE
                binding.imgCaoayan.setImageResource(R.drawable.sunrain)
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
                "sinait" -> {
                    if (isChecked){
                        binding.imgSinait.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSinait.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSinait.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSinait.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSinait.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSinait.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSinait.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSinait.visibility = View.INVISIBLE
                    }
                }

                "cabugao" -> {
                    if (isChecked){
                        binding.imgCabugao.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCabugao.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCabugao.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCabugao.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCabugao.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCabugao.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCabugao.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCabugao.visibility = View.INVISIBLE
                    }
                }

                "sanjuan" -> {
                    if (isChecked){
                        binding.imgSanJuan2.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanJuan2.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanJuan2.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanJuan2.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanJuan2.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanJuan2.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanJuan2.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanJuan2.visibility = View.INVISIBLE
                    }
                }

                "magsingal" -> {
                    if (isChecked){
                        binding.imgMagsingal.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMagsingal.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMagsingal.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMagsingal.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMagsingal.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMagsingal.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMagsingal.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMagsingal.visibility = View.INVISIBLE
                    }
                }

                "sto.domingo" -> {
                    if (isChecked){
                        binding.imgSantoDomingo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantoDomingo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantoDomingo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantoDomingo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantoDomingo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantoDomingo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantoDomingo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantoDomingo.visibility = View.INVISIBLE
                    }
                }

                "sanvicente" -> {
                    if (isChecked){
                        binding.imgSanVicente.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanVicente.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanVicente.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanVicente.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanVicente.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanVicente.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanVicente.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanVicente.visibility = View.INVISIBLE
                    }
                }

                "sta.catalina" -> {
                    if (isChecked){
                        binding.imgSantaCatalina.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantaCatalina.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantaCatalina.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantaCatalina.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantaCatalina.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantaCatalina.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantaCatalina.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantaCatalina.visibility = View.INVISIBLE
                    }
                }

                "sanildefonso" -> {
                    if (isChecked){
                        binding.imgSanIldefonso.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanIldefonso.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanIldefonso.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanIldefonso.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanIldefonso.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanIldefonso.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanIldefonso.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanIldefonso.visibility = View.INVISIBLE
                    }
                }

                "santa" -> {
                    if (isChecked){
                        binding.imgSanta.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanta.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanta.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanta.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanta.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanta.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanta.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanta.visibility = View.INVISIBLE
                    }
                }

                "narvacan" -> {
                    if (isChecked){
                        binding.imgNarvacan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgNarvacan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgNarvacan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgNarvacan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgNarvacan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgNarvacan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgNarvacan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgNarvacan.visibility = View.INVISIBLE
                    }
                }

                "nagbukel" -> {
                    if (isChecked){
                        binding.imgNagbukel.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgNagbukel.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgNagbukel.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgNagbukel.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgNagbukel.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgNagbukel.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgNagbukel.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgNagbukel.visibility = View.INVISIBLE
                    }
                }

                "sta.maria" -> {
                    if (isChecked){
                        binding.imgSantaMaria1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantaMaria1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantaMaria1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantaMaria1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantaMaria1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantaMaria1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantaMaria1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantaMaria1.visibility = View.INVISIBLE
                    }
                }

                "sanesteban" -> {
                    if (isChecked){
                        binding.imgSanEsteban.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanEsteban.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanEsteban.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanEsteban.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanEsteban.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanEsteban.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanEsteban.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanEsteban.visibility = View.INVISIBLE
                    }
                }



                "burgos" -> {
                    if (isChecked){
                        binding.imgBurgos3.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBurgos3.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBurgos3.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBurgos3.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBurgos3.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBurgos3.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBurgos3.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBurgos3.visibility = View.INVISIBLE
                    }
                }

                "sanemilio" -> {
                    if (isChecked){
                        binding.imgSanEmilio.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanEmilio.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanEmilio.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanEmilio.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanEmilio.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanEmilio.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanEmilio.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanEmilio.visibility = View.INVISIBLE
                    }
                }

                "gregoriodelpilar" -> {
                    if (isChecked){
                        binding.imgGregorioDelPilar.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgGregorioDelPilar.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgGregorioDelPilar.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgGregorioDelPilar.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgGregorioDelPilar.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgGregorioDelPilar.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgGregorioDelPilar.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgGregorioDelPilar.visibility = View.INVISIBLE
                    }
                }

                "quirino" -> {
                    if (isChecked){
                        binding.imgQuirino2.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgQuirino2.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgQuirino2.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgQuirino2.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgQuirino2.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgQuirino2.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgQuirino2.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgQuirino2.visibility = View.INVISIBLE
                    }
                }

                "cervantes" -> {
                    if (isChecked){
                        binding.imgCervantes.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCervantes.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCervantes.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCervantes.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCervantes.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCervantes.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCervantes.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCervantes.visibility = View.INVISIBLE
                    }
                }

                "sigay" -> {
                    if (isChecked){
                        binding.imgSigay.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSigay.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSigay.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSigay.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSigay.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSigay.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSigay.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSigay.visibility = View.INVISIBLE
                    }
                }

                "suyo" -> {
                    if (isChecked){
                        binding.imgSuyo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSuyo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSuyo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSuyo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSuyo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSuyo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSuyo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSuyo.visibility = View.INVISIBLE
                    }
                }

                "sta.cruz" -> {
                    if (isChecked){
                        binding.imgSantaCruz.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantaCruz.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantaCruz.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantaCruz.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantaCruz.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantaCruz.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantaCruz.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantaCruz.visibility = View.INVISIBLE
                    }
                }

                "sta.lucia" -> {
                    if (isChecked){
                        binding.imgSantaLucia.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantaLucia.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantaLucia.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantaLucia.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantaLucia.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantaLucia.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantaLucia.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantaLucia.visibility = View.INVISIBLE
                    }
                }

                "salcedo" -> {
                    if (isChecked){
                        binding.imgSalcedo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSalcedo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSalcedo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSalcedo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSalcedo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSalcedo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSalcedo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSalcedo.visibility = View.INVISIBLE
                    }
                }

                "alilem" -> {
                    if (isChecked){
                        binding.imgAlilem.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAlilem.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAlilem.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAlilem.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAlilem.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAlilem.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAlilem.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAlilem.visibility = View.INVISIBLE
                    }
                }

                "tagudin" -> {
                    if (isChecked){
                        binding.imgTagudin.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTagudin.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTagudin.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTagudin.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTagudin.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTagudin.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTagudin.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTagudin.visibility = View.INVISIBLE
                    }
                }


                "sugpon" -> {
                    if (isChecked){
                        binding.imgSugpon.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSugpon.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSugpon.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSugpon.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSugpon.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSugpon.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSugpon.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSugpon.visibility = View.INVISIBLE
                    }
                }

                "banayoyo" -> {
                    if (isChecked){
                        binding.imgBanayoyo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBanayoyo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBanayoyo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBanayoyo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBanayoyo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBanayoyo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBanayoyo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBanayoyo.visibility = View.INVISIBLE
                    }
                }



                "candoncity" -> {
                    if (isChecked){
                        binding.imgCandonCity.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCandonCity.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCandonCity.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCandonCity.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCandonCity.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCandonCity.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCandonCity.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCandonCity.visibility = View.INVISIBLE
                    }
                }

                "galimuyod" -> {
                    if (isChecked){
                        binding.imgGalimuyod.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgGalimuyod.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgGalimuyod.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgGalimuyod.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgGalimuyod.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgGalimuyod.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgGalimuyod.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgGalimuyod.visibility = View.INVISIBLE
                    }
                }

                "lidlidda" -> {
                    if (isChecked){
                        binding.imgLidlidda.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLidlidda.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLidlidda.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLidlidda.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLidlidda.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLidlidda.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLidlidda.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLidlidda.visibility = View.INVISIBLE
                    }
                }


                "santiago" -> {
                    if (isChecked){
                        binding.imgSantiago.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantiago.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantiago.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantiago.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantiago.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantiago.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantiago.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantiago.visibility = View.INVISIBLE
                    }
                }

                "bantay" -> {
                    if (isChecked){
                        binding.imgBantay.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBantay.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBantay.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBantay.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBantay.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBantay.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBantay.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBantay.visibility = View.INVISIBLE
                    }
                }

                "vigancity" -> {
                    if (isChecked){
                        binding.imgViganCity.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgViganCity.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgViganCity.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgViganCity.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgViganCity.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgViganCity.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgViganCity.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgViganCity.visibility = View.INVISIBLE
                    }
                }

                "caoayan" -> {
                    if (isChecked){
                        binding.imgCaoayan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCaoayan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCaoayan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCaoayan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCaoayan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCaoayan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCaoayan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCaoayan.visibility = View.INVISIBLE
                    }
                }

            }
        }

        binding.tgAlilem.setOnCheckedChangeListener(listener)
        binding.tgBanayoyo.setOnCheckedChangeListener(listener)
        binding.tgBantay.setOnCheckedChangeListener(listener)
        binding.tgBurgos3.setOnCheckedChangeListener(listener)
        binding.tgCabugao.setOnCheckedChangeListener(listener)
        binding.tgCandonCity.setOnCheckedChangeListener(listener)
        binding.tgCaoayan.setOnCheckedChangeListener(listener)
        binding.tgCervantes.setOnCheckedChangeListener(listener)
        binding.tgGalimuyod.setOnCheckedChangeListener(listener)
        binding.tgGregorioDelPilar.setOnCheckedChangeListener(listener)
        binding.tgLidlidda.setOnCheckedChangeListener(listener)
        binding.tgMagsingal.setOnCheckedChangeListener(listener)
        binding.tgNagbukel.setOnCheckedChangeListener(listener)
        binding.tgNarvacan.setOnCheckedChangeListener(listener)
        binding.tgQuirino2.setOnCheckedChangeListener(listener)
        binding.tgSalcedo.setOnCheckedChangeListener(listener)
        binding.tgSanEmilio.setOnCheckedChangeListener(listener)
        binding.tgSanEsteban.setOnCheckedChangeListener(listener)
        binding.tgSanIldefonso.setOnCheckedChangeListener(listener)
        binding.tgSanJuan2.setOnCheckedChangeListener(listener)
        binding.tgSanVicente.setOnCheckedChangeListener(listener)
        binding.tgSanta.setOnCheckedChangeListener(listener)
        binding.tgSantaCatalina.setOnCheckedChangeListener(listener)
        binding.tgSantaCruz.setOnCheckedChangeListener(listener)
        binding.tgSantaLucia.setOnCheckedChangeListener(listener)
        binding.tgSantaMaria1.setOnCheckedChangeListener(listener)
        binding.tgSantiago.setOnCheckedChangeListener(listener)
        binding.tgSantoDomingo.setOnCheckedChangeListener(listener)
        binding.tgSigay.setOnCheckedChangeListener(listener)
        binding.tgSinait.setOnCheckedChangeListener(listener)
        binding.tgSugpon.setOnCheckedChangeListener(listener)
        binding.tgSuyo.setOnCheckedChangeListener(listener)
        binding.tgTagudin.setOnCheckedChangeListener(listener)
        binding.tgViganCity.setOnCheckedChangeListener(listener)

        binding.btnSave14.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.surLayout))
        }
    }
}