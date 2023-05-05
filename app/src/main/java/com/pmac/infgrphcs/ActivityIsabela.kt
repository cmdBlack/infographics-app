package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapIsabelaBinding

class ActivityIsabela : AppCompatActivity() {
    private lateinit var binding: ActivityMapIsabelaBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapIsabelaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)
        val header1 = header?.substringBefore("Radar") + "Radar(ISABELA)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("sta.maria", true)){
                binding.imgSantaMaria.visibility = View.VISIBLE
                binding.imgSantaMaria.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanpablo", true)){
                binding.imgSanPablo.visibility = View.VISIBLE
                binding.imgSanPablo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sto.tomas", true)){
                binding.imgSantoTomas1.visibility = View.VISIBLE
                binding.imgSantoTomas1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("cabagan", true)){
                binding.imgCabagan.visibility = View.VISIBLE
                binding.imgCabagan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("maconacon", true)){
                binding.imgMaconacon.visibility = View.VISIBLE
                binding.imgMaconacon.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("divilacan", true)){
                binding.imgDivilacan.visibility = View.VISIBLE
                binding.imgDivilacan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tumauini", true)){
                binding.imgTumauini.visibility = View.VISIBLE
                binding.imgTumauini.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("ilagan", true)){
                binding.imgIlagan.visibility = View.VISIBLE
                binding.imgIlagan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("quezon", true)){
                binding.imgQuezon1.visibility = View.VISIBLE
                binding.imgQuezon1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("delfinalbano", true)){
                binding.imgDelfinAlbano.visibility = View.VISIBLE
                binding.imgDelfinAlbano.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("mallig", true)){
                binding.imgMallig.visibility = View.VISIBLE
                binding.imgMallig.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("quirino", true)){
                binding.imgQuirino1.visibility = View.VISIBLE
                binding.imgQuirino1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("roxas", true)){
                binding.imgRoxas.visibility = View.VISIBLE
                binding.imgRoxas.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("gamu", true)){
                binding.imgGamu.visibility = View.VISIBLE
                binding.imgGamu.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("burgos", true)){
                binding.imgBurgos2.visibility = View.VISIBLE
                binding.imgBurgos2.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanmanuel", true)){
                binding.imgSanManuel.visibility = View.VISIBLE
                binding.imgSanManuel.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("aurora", true)){
                binding.imgAurora.visibility = View.VISIBLE
                binding.imgAurora.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("luna", true)){
                binding.imgLuna2.visibility = View.VISIBLE
                binding.imgLuna2.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("naguilian", true)){
                binding.imgNaguilian1.visibility = View.VISIBLE
                binding.imgNaguilian1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("benitosoliven", true)){
                binding.imgBenitoSoliven.visibility = View.VISIBLE
                binding.imgBenitoSoliven.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("cauayancity", true)){
                binding.imgCauayanCity.visibility = View.VISIBLE
                binding.imgCauayanCity.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("cabatuan", true)){
                binding.imgCabatuan.visibility = View.VISIBLE
                binding.imgCabatuan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanmateo", true)){
                binding.imgSanMateo.visibility = View.VISIBLE
                binding.imgSanMateo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("alicia", true)){
                binding.imgAlicia.visibility = View.VISIBLE
                binding.imgAlicia.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("angadanan", true)){
                binding.imgAngadanan.visibility = View.VISIBLE
                binding.imgAngadanan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("ramon", true)){
                binding.imgRamon.visibility = View.VISIBLE
                binding.imgRamon.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("santiagocity", true)){
                binding.imgSantiagoCity.visibility = View.VISIBLE
                binding.imgSantiagoCity.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("cordon", true)){
                binding.imgCordon.visibility = View.VISIBLE
                binding.imgCordon.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanisidro", true)){
                binding.imgSanIsidro1.visibility = View.VISIBLE
                binding.imgSanIsidro1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("jones", true)){
                binding.imgJones.visibility = View.VISIBLE
                binding.imgJones.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("echague", true)){
                binding.imgEchague.visibility = View.VISIBLE
                binding.imgEchague.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanguillermo", true)){
                binding.imgSanGuillermo.visibility = View.VISIBLE
                binding.imgSanGuillermo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanagustin", true)){
                binding.imgSanAgustin.visibility = View.VISIBLE
                binding.imgSanAgustin.setImageResource(R.drawable.rainlightning)
            }

            if (lightningList.contains("dinapigue", true)){
                binding.imgDinapigue.visibility = View.VISIBLE
                binding.imgDinapigue.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("palanan", true)){
                binding.imgPalanan.visibility = View.VISIBLE
                binding.imgPalanan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanmariano", true)){
                binding.imgSanMariano.visibility = View.VISIBLE
                binding.imgSanMariano.setImageResource(R.drawable.rainlightning)
            }
        }

        if (modRainList != null){
            if (modRainList.contains("sta.maria", true)){
                binding.imgSantaMaria.visibility = View.VISIBLE
                binding.imgSantaMaria.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanpablo", true)){
                binding.imgSanPablo.visibility = View.VISIBLE
                binding.imgSanPablo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sto.tomas", true)){
                binding.imgSantoTomas1.visibility = View.VISIBLE
                binding.imgSantoTomas1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("cabagan", true)){
                binding.imgCabagan.visibility = View.VISIBLE
                binding.imgCabagan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("maconacon", true)){
                binding.imgMaconacon.visibility = View.VISIBLE
                binding.imgMaconacon.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("divilacan", true)){
                binding.imgDivilacan.visibility = View.VISIBLE
                binding.imgDivilacan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tumauini", true)){
                binding.imgTumauini.visibility = View.VISIBLE
                binding.imgTumauini.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("ilagan", true)){
                binding.imgIlagan.visibility = View.VISIBLE
                binding.imgIlagan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("quezon", true)){
                binding.imgQuezon1.visibility = View.VISIBLE
                binding.imgQuezon1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("delfinalbano", true)){
                binding.imgDelfinAlbano.visibility = View.VISIBLE
                binding.imgDelfinAlbano.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("mallig", true)){
                binding.imgMallig.visibility = View.VISIBLE
                binding.imgMallig.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("quirino", true)){
                binding.imgQuirino1.visibility = View.VISIBLE
                binding.imgQuirino1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("roxas", true)){
                binding.imgRoxas.visibility = View.VISIBLE
                binding.imgRoxas.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("gamu", true)){
                binding.imgGamu.visibility = View.VISIBLE
                binding.imgGamu.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("burgos", true)){
                binding.imgBurgos2.visibility = View.VISIBLE
                binding.imgBurgos2.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanmanuel", true)){
                binding.imgSanManuel.visibility = View.VISIBLE
                binding.imgSanManuel.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("aurora", true)){
                binding.imgAurora.visibility = View.VISIBLE
                binding.imgAurora.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("luna", true)){
                binding.imgLuna2.visibility = View.VISIBLE
                binding.imgLuna2.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("naguilian", true)){
                binding.imgNaguilian1.visibility = View.VISIBLE
                binding.imgNaguilian1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("benitosoliven", true)){
                binding.imgBenitoSoliven.visibility = View.VISIBLE
                binding.imgBenitoSoliven.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("cauayancity", true)){
                binding.imgCauayanCity.visibility = View.VISIBLE
                binding.imgCauayanCity.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("cabatuan", true)){
                binding.imgCabatuan.visibility = View.VISIBLE
                binding.imgCabatuan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanmateo", true)){
                binding.imgSanMateo.visibility = View.VISIBLE
                binding.imgSanMateo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("alicia", true)){
                binding.imgAlicia.visibility = View.VISIBLE
                binding.imgAlicia.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("angadanan", true)){
                binding.imgAngadanan.visibility = View.VISIBLE
                binding.imgAngadanan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("ramon", true)){
                binding.imgRamon.visibility = View.VISIBLE
                binding.imgRamon.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("santiagocity", true)){
                binding.imgSantiagoCity.visibility = View.VISIBLE
                binding.imgSantiagoCity.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("cordon", true)){
                binding.imgCordon.visibility = View.VISIBLE
                binding.imgCordon.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanisidro", true)){
                binding.imgSanIsidro1.visibility = View.VISIBLE
                binding.imgSanIsidro1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("jones", true)){
                binding.imgJones.visibility = View.VISIBLE
                binding.imgJones.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("echague", true)){
                binding.imgEchague.visibility = View.VISIBLE
                binding.imgEchague.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanguillermo", true)){
                binding.imgSanGuillermo.visibility = View.VISIBLE
                binding.imgSanGuillermo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanagustin", true)){
                binding.imgSanAgustin.visibility = View.VISIBLE
                binding.imgSanAgustin.setImageResource(R.drawable.cloudrain)
            }

            if (modRainList.contains("dinapigue", true)){
                binding.imgDinapigue.visibility = View.VISIBLE
                binding.imgDinapigue.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("palanan", true)){
                binding.imgPalanan.visibility = View.VISIBLE
                binding.imgPalanan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanmariano", true)){
                binding.imgSanMariano.visibility = View.VISIBLE
                binding.imgSanMariano.setImageResource(R.drawable.cloudrain)
            }

        }

        if (lgtRainList != null){
            if (lgtRainList.contains("sta.maria", true)){
                binding.imgSantaMaria.visibility = View.VISIBLE
                binding.imgSantaMaria.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanpablo", true)){
                binding.imgSanPablo.visibility = View.VISIBLE
                binding.imgSanPablo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sto.tomas", true)){
                binding.imgSantoTomas1.visibility = View.VISIBLE
                binding.imgSantoTomas1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("cabagan", true)){
                binding.imgCabagan.visibility = View.VISIBLE
                binding.imgCabagan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("maconacon", true)){
                binding.imgMaconacon.visibility = View.VISIBLE
                binding.imgMaconacon.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("divilacan", true)){
                binding.imgDivilacan.visibility = View.VISIBLE
                binding.imgDivilacan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tumauini", true)){
                binding.imgTumauini.visibility = View.VISIBLE
                binding.imgTumauini.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("ilagan", true)){
                binding.imgIlagan.visibility = View.VISIBLE
                binding.imgIlagan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("quezon", true)){
                binding.imgQuezon1.visibility = View.VISIBLE
                binding.imgQuezon1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("delfinalbano", true)){
                binding.imgDelfinAlbano.visibility = View.VISIBLE
                binding.imgDelfinAlbano.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("mallig", true)){
                binding.imgMallig.visibility = View.VISIBLE
                binding.imgMallig.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("quirino", true)){
                binding.imgQuirino1.visibility = View.VISIBLE
                binding.imgQuirino1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("roxas", true)){
                binding.imgRoxas.visibility = View.VISIBLE
                binding.imgRoxas.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("gamu", true)){
                binding.imgGamu.visibility = View.VISIBLE
                binding.imgGamu.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("burgos", true)){
                binding.imgBurgos2.visibility = View.VISIBLE
                binding.imgBurgos2.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanmanuel", true)){
                binding.imgSanManuel.visibility = View.VISIBLE
                binding.imgSanManuel.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("aurora", true)){
                binding.imgAurora.visibility = View.VISIBLE
                binding.imgAurora.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("luna", true)){
                binding.imgLuna2.visibility = View.VISIBLE
                binding.imgLuna2.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("naguilian", true)){
                binding.imgNaguilian1.visibility = View.VISIBLE
                binding.imgNaguilian1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("benitosoliven", true)){
                binding.imgBenitoSoliven.visibility = View.VISIBLE
                binding.imgBenitoSoliven.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("cauayancity", true)){
                binding.imgCauayanCity.visibility = View.VISIBLE
                binding.imgCauayanCity.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("cabatuan", true)){
                binding.imgCabatuan.visibility = View.VISIBLE
                binding.imgCabatuan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanmateo", true)){
                binding.imgSanMateo.visibility = View.VISIBLE
                binding.imgSanMateo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("alicia", true)){
                binding.imgAlicia.visibility = View.VISIBLE
                binding.imgAlicia.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("angadanan", true)){
                binding.imgAngadanan.visibility = View.VISIBLE
                binding.imgAngadanan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("ramon", true)){
                binding.imgRamon.visibility = View.VISIBLE
                binding.imgRamon.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("santiagocity", true)){
                binding.imgSantiagoCity.visibility = View.VISIBLE
                binding.imgSantiagoCity.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("cordon", true)){
                binding.imgCordon.visibility = View.VISIBLE
                binding.imgCordon.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanisidro", true)){
                binding.imgSanIsidro1.visibility = View.VISIBLE
                binding.imgSanIsidro1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("jones", true)){
                binding.imgJones.visibility = View.VISIBLE
                binding.imgJones.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("echague", true)){
                binding.imgEchague.visibility = View.VISIBLE
                binding.imgEchague.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanguillermo", true)){
                binding.imgSanGuillermo.visibility = View.VISIBLE
                binding.imgSanGuillermo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanagustin", true)){
                binding.imgSanAgustin.visibility = View.VISIBLE
                binding.imgSanAgustin.setImageResource(R.drawable.sunrain)
            }

            if (lgtRainList.contains("dinapigue", true)){
                binding.imgDinapigue.visibility = View.VISIBLE
                binding.imgDinapigue.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("palanan", true)){
                binding.imgPalanan.visibility = View.VISIBLE
                binding.imgPalanan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanmariano", true)){
                binding.imgSanMariano.visibility = View.VISIBLE
                binding.imgSanMariano.setImageResource(R.drawable.sunrain)
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
                "sta.maria" -> {
                    if (isChecked){
                        binding.imgSantaMaria.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantaMaria.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantaMaria.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantaMaria.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantaMaria.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantaMaria.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantaMaria.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantaMaria.visibility = View.INVISIBLE
                    }
                }

                "sanpablo" -> {
                    if (isChecked){
                        binding.imgSanPablo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanPablo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanPablo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanPablo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanPablo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanPablo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanPablo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanPablo.visibility = View.INVISIBLE
                    }
                }

                "sto.tomas" -> {
                    if (isChecked){
                        binding.imgSantoTomas1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantoTomas1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantoTomas1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantoTomas1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantoTomas1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantoTomas1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantoTomas1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantoTomas1.visibility = View.INVISIBLE
                    }
                }

                "cabagan" -> {
                    if (isChecked){
                        binding.imgCabagan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCabagan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCabagan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCabagan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCabagan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCabagan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCabagan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCabagan.visibility = View.INVISIBLE
                    }
                }

                "maconacon" -> {
                    if (isChecked){
                        binding.imgMaconacon.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMaconacon.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMaconacon.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMaconacon.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMaconacon.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMaconacon.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMaconacon.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMaconacon.visibility = View.INVISIBLE
                    }
                }

                "divilacan" -> {
                    if (isChecked){
                        binding.imgDivilacan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDivilacan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDivilacan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDivilacan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDivilacan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDivilacan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDivilacan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDivilacan.visibility = View.INVISIBLE
                    }
                }

                "tumauini" -> {
                    if (isChecked){
                        binding.imgTumauini.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTumauini.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTumauini.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTumauini.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTumauini.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTumauini.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTumauini.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTumauini.visibility = View.INVISIBLE
                    }
                }

                "ilagan" -> {
                    if (isChecked){
                        binding.imgIlagan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgIlagan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgIlagan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgIlagan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgIlagan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgIlagan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgIlagan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgIlagan.visibility = View.INVISIBLE
                    }
                }

                "quezon" -> {
                    if (isChecked){
                        binding.imgQuezon1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgQuezon1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgQuezon1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgQuezon1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgQuezon1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgQuezon1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgQuezon1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgQuezon1.visibility = View.INVISIBLE
                    }
                }

                "delfinalbano" -> {
                    if (isChecked){
                        binding.imgDelfinAlbano.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDelfinAlbano.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDelfinAlbano.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDelfinAlbano.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDelfinAlbano.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDelfinAlbano.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDelfinAlbano.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDelfinAlbano.visibility = View.INVISIBLE
                    }
                }

                "mallig" -> {
                    if (isChecked){
                        binding.imgMallig.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMallig.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMallig.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMallig.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMallig.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMallig.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMallig.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMallig.visibility = View.INVISIBLE
                    }
                }

                "quirino" -> {
                    if (isChecked){
                        binding.imgQuirino1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgQuirino1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgQuirino1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgQuirino1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgQuirino1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgQuirino1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgQuirino1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgQuirino1.visibility = View.INVISIBLE
                    }
                }

                "roxas" -> {
                    if (isChecked){
                        binding.imgRoxas.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgRoxas.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgRoxas.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgRoxas.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgRoxas.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgRoxas.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgRoxas.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgRoxas.visibility = View.INVISIBLE
                    }
                }

                "gamu" -> {
                    if (isChecked){
                        binding.imgGamu.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgGamu.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgGamu.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgGamu.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgGamu.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgGamu.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgGamu.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgGamu.visibility = View.INVISIBLE
                    }
                }

                "burgos" -> {
                    if (isChecked){
                        binding.imgBurgos2.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBurgos2.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBurgos2.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBurgos2.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBurgos2.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBurgos2.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBurgos2.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBurgos2.visibility = View.INVISIBLE
                    }
                }

                "sanmanuel" -> {
                    if (isChecked){
                        binding.imgSanManuel.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanManuel.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanManuel.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanManuel.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanManuel.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanManuel.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanManuel.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanManuel.visibility = View.INVISIBLE
                    }
                }

                "aurora" -> {
                    if (isChecked){
                        binding.imgAurora.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAurora.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAurora.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAurora.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAurora.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAurora.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAurora.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAurora.visibility = View.INVISIBLE
                    }
                }

                "luna" -> {
                    if (isChecked){
                        binding.imgLuna2.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLuna2.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLuna2.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLuna2.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLuna2.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLuna2.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLuna2.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLuna2.visibility = View.INVISIBLE
                    }
                }

                "naguilian" -> {
                    if (isChecked){
                        binding.imgNaguilian1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgNaguilian1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgNaguilian1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgNaguilian1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgNaguilian1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgNaguilian1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgNaguilian1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgNaguilian1.visibility = View.INVISIBLE
                    }
                }

                "benitosoliven" -> {
                    if (isChecked){
                        binding.imgBenitoSoliven.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBenitoSoliven.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBenitoSoliven.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBenitoSoliven.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBenitoSoliven.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBenitoSoliven.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBenitoSoliven.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBenitoSoliven.visibility = View.INVISIBLE
                    }
                }

                "cauayancity" -> {
                    if (isChecked){
                        binding.imgCauayanCity.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCauayanCity.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCauayanCity.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCauayanCity.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCauayanCity.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCauayanCity.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCauayanCity.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCauayanCity.visibility = View.INVISIBLE
                    }
                }

                "cabatuan" -> {
                    if (isChecked){
                        binding.imgCabatuan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCabatuan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCabatuan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCabatuan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCabatuan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCabatuan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCabatuan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCabatuan.visibility = View.INVISIBLE
                    }
                }

                "sanmateo" -> {
                    if (isChecked){
                        binding.imgSanMateo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanMateo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanMateo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanMateo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanMateo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanMateo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanMateo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanMateo.visibility = View.INVISIBLE
                    }
                }

                "alicia" -> {
                    if (isChecked){
                        binding.imgAlicia.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAlicia.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAlicia.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAlicia.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAlicia.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAlicia.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAlicia.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAlicia.visibility = View.INVISIBLE
                    }
                }

                "angadanan" -> {
                    if (isChecked){
                        binding.imgAngadanan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAngadanan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAngadanan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAngadanan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAngadanan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAngadanan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAngadanan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAngadanan.visibility = View.INVISIBLE
                    }
                }

                "ramon" -> {
                    if (isChecked){
                        binding.imgRamon.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgRamon.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgRamon.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgRamon.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgRamon.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgRamon.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgRamon.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgRamon.visibility = View.INVISIBLE
                    }
                }

                "santiagocity" -> {
                    if (isChecked){
                        binding.imgSantiagoCity.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantiagoCity.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantiagoCity.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantiagoCity.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantiagoCity.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantiagoCity.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantiagoCity.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantiagoCity.visibility = View.INVISIBLE
                    }
                }

                "cordon" -> {
                    if (isChecked){
                        binding.imgCordon.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCordon.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCordon.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCordon.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCordon.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCordon.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCordon.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCordon.visibility = View.INVISIBLE
                    }
                }

                "sanisidro" -> {
                    if (isChecked){
                        binding.imgSanIsidro1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanIsidro1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanIsidro1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanIsidro1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanIsidro1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanIsidro1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanIsidro1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanIsidro1.visibility = View.INVISIBLE
                    }
                }

                "jones" -> {
                    if (isChecked){
                        binding.imgJones.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgJones.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgJones.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgJones.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgJones.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgJones.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgJones.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgJones.visibility = View.INVISIBLE
                    }
                }

                "echague" -> {
                    if (isChecked){
                        binding.imgEchague.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgEchague.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgEchague.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgEchague.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgEchague.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgEchague.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgEchague.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgEchague.visibility = View.INVISIBLE
                    }
                }

                "sanguillermo" -> {
                    if (isChecked){
                        binding.imgSanGuillermo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanGuillermo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanGuillermo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanGuillermo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanGuillermo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanGuillermo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanGuillermo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanGuillermo.visibility = View.INVISIBLE
                    }
                }

                "sanagustin" -> {
                    if (isChecked){
                        binding.imgSanAgustin.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanAgustin.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanAgustin.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanAgustin.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanAgustin.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanAgustin.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanAgustin.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanAgustin.visibility = View.INVISIBLE
                    }
                }

                "dinapigue" -> {
                    if (isChecked){
                        binding.imgDinapigue.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDinapigue.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDinapigue.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDinapigue.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDinapigue.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDinapigue.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDinapigue.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDinapigue.visibility = View.INVISIBLE
                    }
                }

                "palanan" -> {
                    if (isChecked){
                        binding.imgPalanan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPalanan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPalanan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPalanan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPalanan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPalanan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPalanan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPalanan.visibility = View.INVISIBLE
                    }
                }

                "sanmariano" -> {
                    if (isChecked){
                        binding.imgSanMariano.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanMariano.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanMariano.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanMariano.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanMariano.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanMariano.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanMariano.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanMariano.visibility = View.INVISIBLE
                    }
                }
            }
        }

        binding.tgAlicia.setOnCheckedChangeListener(listener)
        binding.tgAngadanan.setOnCheckedChangeListener(listener)
        binding.tgAurora.setOnCheckedChangeListener(listener)
        binding.tgBenitoSoliven.setOnCheckedChangeListener(listener)
        binding.tgBurgos2.setOnCheckedChangeListener(listener)
        binding.tgCabagan.setOnCheckedChangeListener(listener)
        binding.tgCabatuan.setOnCheckedChangeListener(listener)
        binding.tgCauayanCity.setOnCheckedChangeListener(listener)
        binding.tgCordon.setOnCheckedChangeListener(listener)
        binding.tgDelfinAlbano.setOnCheckedChangeListener(listener)
        binding.tgDinapigue.setOnCheckedChangeListener(listener)
        binding.tgDivilacan.setOnCheckedChangeListener(listener)
        binding.tgEchague.setOnCheckedChangeListener(listener)
        binding.tgGamu.setOnCheckedChangeListener(listener)
        binding.tgIlagan.setOnCheckedChangeListener(listener)
        binding.tgJones.setOnCheckedChangeListener(listener)
        binding.tgLuna2.setOnCheckedChangeListener(listener)
        binding.tgMaconacon.setOnCheckedChangeListener(listener)
        binding.tgMallig.setOnCheckedChangeListener(listener)
        binding.tgNaguilian1.setOnCheckedChangeListener(listener)
        binding.tgPalanan.setOnCheckedChangeListener(listener)
        binding.tgQuezon1.setOnCheckedChangeListener(listener)
        binding.tgQuirino1.setOnCheckedChangeListener(listener)
        binding.tgRamon.setOnCheckedChangeListener(listener)
        binding.tgRoxas.setOnCheckedChangeListener(listener)
        binding.tgSanAgustin.setOnCheckedChangeListener(listener)
        binding.tgSanGuillermo.setOnCheckedChangeListener(listener)
        binding.tgSanIsidro1.setOnCheckedChangeListener(listener)
        binding.tgSanManuel.setOnCheckedChangeListener(listener)
        binding.tgSanMariano.setOnCheckedChangeListener(listener)
        binding.tgSanMateo.setOnCheckedChangeListener(listener)
        binding.tgSanPablo.setOnCheckedChangeListener(listener)
        binding.tgSantaMaria.setOnCheckedChangeListener(listener)
        binding.tgSantiagoCity.setOnCheckedChangeListener(listener)
        binding.tgSantoTomas1.setOnCheckedChangeListener(listener)
        binding.tgTumauini.setOnCheckedChangeListener(listener)

        binding.btnSave7.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.isabelaLayout))
        }
    }
}