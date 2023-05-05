package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapCagayanBinding

class ActivityCagayan : AppCompatActivity() {
    private lateinit var binding: ActivityMapCagayanBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapCagayanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)
        val header1 = header?.substringBefore("Radar") + "Radar(CAGAYAN)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("calayan", true)){
                binding.imgCalayan.visibility = View.VISIBLE
                binding.imgCalayan2.visibility = View.VISIBLE
                binding.imgCalayan3.visibility = View.VISIBLE
                binding.imgCalayan4.visibility = View.VISIBLE
                binding.imgCalayan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("aparri", true)){
                binding.imgAparri.visibility = View.VISIBLE
                binding.imgAparri.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sta.praxedes", true)){
                binding.imgSantaPraxedes.visibility = View.VISIBLE
                binding.imgSantaPraxedes.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("claveria", true)){
                binding.imgClaveria.visibility = View.VISIBLE
                binding.imgClaveria.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanchezmira", true)){
                binding.imgSanchezMira.visibility = View.VISIBLE
                binding.imgSanchezMira.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("abulug", true)){
                binding.imgAbulug.visibility = View.VISIBLE
                binding.imgAbulug.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("pamplona", true)){
                binding.imgPamplona.visibility = View.VISIBLE
                binding.imgPamplona.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("ballesteros", true)){
                binding.imgBallesteros.visibility = View.VISIBLE
                binding.imgBallesteros.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("allacapan", true)){
                binding.imgAllacapan.visibility = View.VISIBLE
                binding.imgAllacapan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("lal-lo", true)){
                binding.imgLalLo.visibility = View.VISIBLE
                binding.imgLalLo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("lasam", true)){
                binding.imgLasam.visibility = View.VISIBLE
                binding.imgLasam.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("santonino", true)){
                binding.imgSantoNino.visibility = View.VISIBLE
                binding.imgSantoNino.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("alcala", true)){
                binding.imgAlcala.visibility = View.VISIBLE
                binding.imgAlcala.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("gattaran", true)){
                binding.imgGattaran.visibility = View.VISIBLE
                binding.imgGattaran.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("baggao", true)){
                binding.imgBaggao.visibility = View.VISIBLE
                binding.imgBaggao.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("penablanca", true)){
                binding.imgPenablanca.visibility = View.VISIBLE
                binding.imgPenablanca.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tuguegaraocity", true)){
                binding.imgTuguegaraoCity.visibility = View.VISIBLE
                binding.imgTuguegaraoCity.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("enrile", true)){
                binding.imgEnrile.visibility = View.VISIBLE
                binding.imgEnrile.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("amulung", true)){
                binding.imgAmulung.visibility = View.VISIBLE
                binding.imgAmulung.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("piat", true)){
                binding.imgPiat.visibility = View.VISIBLE
                binding.imgPiat.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("rizal", true)){
                binding.imgRizal1.visibility = View.VISIBLE
                binding.imgRizal1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tuao", true)){
                binding.imgTuao.visibility = View.VISIBLE
                binding.imgTuao.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("solana", true)){
                binding.imgSolana.visibility = View.VISIBLE
                binding.imgSolana.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("iguig", true)){
                binding.imgIguig.visibility = View.VISIBLE
                binding.imgIguig.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("camalaniugan", true)){
                binding.imgCamalaniugan.visibility = View.VISIBLE
                binding.imgCamalaniugan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("buguey", true)){
                binding.imgBuguey.visibility = View.VISIBLE
                binding.imgBuguey.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sta.teresita", true)){
                binding.imgSantaTeresita.visibility = View.VISIBLE
                binding.imgSantaTeresita.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("gonzaga", true)){
                binding.imgGonzaga.visibility = View.VISIBLE
                binding.imgGonzaga.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sta.ana", true)){
                binding.imgSantaAna.visibility = View.VISIBLE
                binding.imgSantaAna.setImageResource(R.drawable.rainlightning)
            }
        }

        if (modRainList != null){
            if (modRainList.contains("calayan", true)){
                binding.imgCalayan.visibility = View.VISIBLE
                binding.imgCalayan2.visibility = View.VISIBLE
                binding.imgCalayan3.visibility = View.VISIBLE
                binding.imgCalayan4.visibility = View.VISIBLE
                binding.imgCalayan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("aparri", true)){
                binding.imgAparri.visibility = View.VISIBLE
                binding.imgAparri.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sta.praxedes", true)){
                binding.imgSantaPraxedes.visibility = View.VISIBLE
                binding.imgSantaPraxedes.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("claveria", true)){
                binding.imgClaveria.visibility = View.VISIBLE
                binding.imgClaveria.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanchezmira", true)){
                binding.imgSanchezMira.visibility = View.VISIBLE
                binding.imgSanchezMira.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("abulug", true)){
                binding.imgAbulug.visibility = View.VISIBLE
                binding.imgAbulug.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("pamplona", true)){
                binding.imgPamplona.visibility = View.VISIBLE
                binding.imgPamplona.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("ballesteros", true)){
                binding.imgBallesteros.visibility = View.VISIBLE
                binding.imgBallesteros.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("allacapan", true)){
                binding.imgAllacapan.visibility = View.VISIBLE
                binding.imgAllacapan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("lal-lo", true)){
                binding.imgLalLo.visibility = View.VISIBLE
                binding.imgLalLo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("lasam", true)){
                binding.imgLasam.visibility = View.VISIBLE
                binding.imgLasam.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("santonino", true)){
                binding.imgSantoNino.visibility = View.VISIBLE
                binding.imgSantoNino.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("alcala", true)){
                binding.imgAlcala.visibility = View.VISIBLE
                binding.imgAlcala.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("gattaran", true)){
                binding.imgGattaran.visibility = View.VISIBLE
                binding.imgGattaran.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("baggao", true)){
                binding.imgBaggao.visibility = View.VISIBLE
                binding.imgBaggao.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("penablanca", true)){
                binding.imgPenablanca.visibility = View.VISIBLE
                binding.imgPenablanca.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tuguegaraocity", true)){
                binding.imgTuguegaraoCity.visibility = View.VISIBLE
                binding.imgTuguegaraoCity.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("enrile", true)){
                binding.imgEnrile.visibility = View.VISIBLE
                binding.imgEnrile.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("amulung", true)){
                binding.imgAmulung.visibility = View.VISIBLE
                binding.imgAmulung.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("piat", true)){
                binding.imgPiat.visibility = View.VISIBLE
                binding.imgPiat.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("rizal", true)){
                binding.imgRizal1.visibility = View.VISIBLE
                binding.imgRizal1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tuao", true)){
                binding.imgTuao.visibility = View.VISIBLE
                binding.imgTuao.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("solana", true)){
                binding.imgSolana.visibility = View.VISIBLE
                binding.imgSolana.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("iguig", true)){
                binding.imgIguig.visibility = View.VISIBLE
                binding.imgIguig.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("camalaniugan", true)){
                binding.imgCamalaniugan.visibility = View.VISIBLE
                binding.imgCamalaniugan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("buguey", true)){
                binding.imgBuguey.visibility = View.VISIBLE
                binding.imgBuguey.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sta.teresita", true)){
                binding.imgSantaTeresita.visibility = View.VISIBLE
                binding.imgSantaTeresita.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("gonzaga", true)){
                binding.imgGonzaga.visibility = View.VISIBLE
                binding.imgGonzaga.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sta.ana", true)){
                binding.imgSantaAna.visibility = View.VISIBLE
                binding.imgSantaAna.setImageResource(R.drawable.cloudrain)
            }
        }

        if (lgtRainList != null){
            if (lgtRainList.contains("calayan", true)){
                binding.imgCalayan.visibility = View.VISIBLE
                binding.imgCalayan2.visibility = View.VISIBLE
                binding.imgCalayan3.visibility = View.VISIBLE
                binding.imgCalayan4.visibility = View.VISIBLE
                binding.imgCalayan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("aparri", true)){
                binding.imgAparri.visibility = View.VISIBLE
                binding.imgAparri.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sta.praxedes", true)){
                binding.imgSantaPraxedes.visibility = View.VISIBLE
                binding.imgSantaPraxedes.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("claveria", true)){
                binding.imgClaveria.visibility = View.VISIBLE
                binding.imgClaveria.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanchezmira", true)){
                binding.imgSanchezMira.visibility = View.VISIBLE
                binding.imgSanchezMira.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("abulug", true)){
                binding.imgAbulug.visibility = View.VISIBLE
                binding.imgAbulug.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("pamplona", true)){
                binding.imgPamplona.visibility = View.VISIBLE
                binding.imgPamplona.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("ballesteros", true)){
                binding.imgBallesteros.visibility = View.VISIBLE
                binding.imgBallesteros.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("allacapan", true)){
                binding.imgAllacapan.visibility = View.VISIBLE
                binding.imgAllacapan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("lal-lo", true)){
                binding.imgLalLo.visibility = View.VISIBLE
                binding.imgLalLo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("lasam", true)){
                binding.imgLasam.visibility = View.VISIBLE
                binding.imgLasam.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("santonino", true)){
                binding.imgSantoNino.visibility = View.VISIBLE
                binding.imgSantoNino.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("alcala", true)){
                binding.imgAlcala.visibility = View.VISIBLE
                binding.imgAlcala.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("gattaran", true)){
                binding.imgGattaran.visibility = View.VISIBLE
                binding.imgGattaran.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("baggao", true)){
                binding.imgBaggao.visibility = View.VISIBLE
                binding.imgBaggao.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("penablanca", true)){
                binding.imgPenablanca.visibility = View.VISIBLE
                binding.imgPenablanca.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tuguegaraocity", true)){
                binding.imgTuguegaraoCity.visibility = View.VISIBLE
                binding.imgTuguegaraoCity.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("enrile", true)){
                binding.imgEnrile.visibility = View.VISIBLE
                binding.imgEnrile.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("amulung", true)){
                binding.imgAmulung.visibility = View.VISIBLE
                binding.imgAmulung.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("piat", true)){
                binding.imgPiat.visibility = View.VISIBLE
                binding.imgPiat.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("rizal", true)){
                binding.imgRizal1.visibility = View.VISIBLE
                binding.imgRizal1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tuao", true)){
                binding.imgTuao.visibility = View.VISIBLE
                binding.imgTuao.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("solana", true)){
                binding.imgSolana.visibility = View.VISIBLE
                binding.imgSolana.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("iguig", true)){
                binding.imgIguig.visibility = View.VISIBLE
                binding.imgIguig.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("camalaniugan", true)){
                binding.imgCamalaniugan.visibility = View.VISIBLE
                binding.imgCamalaniugan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("buguey", true)){
                binding.imgBuguey.visibility = View.VISIBLE
                binding.imgBuguey.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sta.teresita", true)){
                binding.imgSantaTeresita.visibility = View.VISIBLE
                binding.imgSantaTeresita.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("gonzaga", true)){
                binding.imgGonzaga.visibility = View.VISIBLE
                binding.imgGonzaga.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sta.ana", true)){
                binding.imgSantaAna.visibility = View.VISIBLE
                binding.imgSantaAna.setImageResource(R.drawable.sunrain)
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
                "calayan" -> {
                    if (isChecked){
                        binding.imgCalayan.visibility = View.VISIBLE
                        binding.imgCalayan2.visibility = View.VISIBLE
                        binding.imgCalayan3.visibility = View.VISIBLE
                        binding.imgCalayan4.visibility = View.VISIBLE
                        when (select) {
                            1 -> {
                                binding.imgCalayan.setImageResource(R.drawable.sunrain)
                                binding.imgCalayan2.setImageResource(R.drawable.sunrain)
                                binding.imgCalayan3.setImageResource(R.drawable.sunrain)
                                binding.imgCalayan4.setImageResource(R.drawable.sunrain)
                            }
                            2 -> {
                                binding.imgCalayan.setImageResource(R.drawable.cloudrain)
                                binding.imgCalayan2.setImageResource(R.drawable.cloudrain)
                                binding.imgCalayan3.setImageResource(R.drawable.cloudrain)
                                binding.imgCalayan4.setImageResource(R.drawable.cloudrain)
                            }
                            3 -> {
                                binding.imgCalayan.setImageResource(R.drawable.cloudlightning)
                                binding.imgCalayan2.setImageResource(R.drawable.cloudlightning)
                                binding.imgCalayan3.setImageResource(R.drawable.cloudlightning)
                                binding.imgCalayan4.setImageResource(R.drawable.cloudlightning)
                            }
                            4 -> {
                                binding.imgCalayan.setImageResource(R.drawable.rainlightning)
                                binding.imgCalayan2.setImageResource(R.drawable.rainlightning)
                                binding.imgCalayan3.setImageResource(R.drawable.rainlightning)
                                binding.imgCalayan4.setImageResource(R.drawable.rainlightning)
                            }
                            5 -> {
                                binding.imgCalayan.setImageResource(R.drawable.suncloud)
                                binding.imgCalayan2.setImageResource(R.drawable.suncloud)
                                binding.imgCalayan3.setImageResource(R.drawable.suncloud)
                                binding.imgCalayan4.setImageResource(R.drawable.suncloud)
                            }
                            6 -> {
                                binding.imgCalayan.setImageResource(R.drawable.cloudy)
                                binding.imgCalayan2.setImageResource(R.drawable.cloudy)
                                binding.imgCalayan3.setImageResource(R.drawable.cloudy)
                                binding.imgCalayan4.setImageResource(R.drawable.cloudy)
                            }
                        }
                    }
                    else{
                        binding.imgCalayan.visibility = View.INVISIBLE
                        binding.imgCalayan2.visibility = View.INVISIBLE
                        binding.imgCalayan3.visibility = View.INVISIBLE
                        binding.imgCalayan4.visibility = View.INVISIBLE
                    }
                }

                "aparri" -> {
                    if (isChecked){
                        binding.imgAparri.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAparri.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAparri.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAparri.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAparri.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAparri.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAparri.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAparri.visibility = View.INVISIBLE
                    }
                }

                "sta.praxedes" -> {
                    if (isChecked){
                        binding.imgSantaPraxedes.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantaPraxedes.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantaPraxedes.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantaPraxedes.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantaPraxedes.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantaPraxedes.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantaPraxedes.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantaPraxedes.visibility = View.INVISIBLE
                    }
                }

                "claveria" -> {
                    if (isChecked){
                        binding.imgClaveria.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgClaveria.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgClaveria.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgClaveria.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgClaveria.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgClaveria.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgClaveria.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgClaveria.visibility = View.INVISIBLE
                    }
                }

                "sanchezmira" -> {
                    if (isChecked){
                        binding.imgSanchezMira.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanchezMira.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanchezMira.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanchezMira.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanchezMira.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanchezMira.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanchezMira.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanchezMira.visibility = View.INVISIBLE
                    }
                }

                "abulug" -> {
                    if (isChecked){
                        binding.imgAbulug.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAbulug.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAbulug.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAbulug.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAbulug.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAbulug.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAbulug.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAbulug.visibility = View.INVISIBLE
                    }
                }

                "pamplona" -> {
                    if (isChecked){
                        binding.imgPamplona.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPamplona.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPamplona.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPamplona.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPamplona.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPamplona.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPamplona.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPamplona.visibility = View.INVISIBLE
                    }
                }

                "ballesteros" -> {
                    if (isChecked){
                        binding.imgBallesteros.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBallesteros.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBallesteros.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBallesteros.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBallesteros.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBallesteros.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBallesteros.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBallesteros.visibility = View.INVISIBLE
                    }
                }

                "allacapan" -> {
                    if (isChecked){
                        binding.imgAllacapan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAllacapan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAllacapan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAllacapan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAllacapan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAllacapan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAllacapan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAllacapan.visibility = View.INVISIBLE
                    }
                }

                "lal-lo" -> {
                    if (isChecked){
                        binding.imgLalLo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLalLo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLalLo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLalLo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLalLo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLalLo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLalLo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLalLo.visibility = View.INVISIBLE
                    }
                }

                "lasam" -> {
                    if (isChecked){
                        binding.imgLasam.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLasam.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLasam.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLasam.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLasam.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLasam.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLasam.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLasam.visibility = View.INVISIBLE
                    }
                }

                "santonino" -> {
                    if (isChecked){
                        binding.imgSantoNino.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantoNino.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantoNino.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantoNino.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantoNino.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantoNino.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantoNino.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantoNino.visibility = View.INVISIBLE
                    }
                }

                "alcala" -> {
                    if (isChecked){
                        binding.imgAlcala.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAlcala.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAlcala.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAlcala.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAlcala.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAlcala.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAlcala.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAlcala.visibility = View.INVISIBLE
                    }
                }



                "gattaran" -> {
                    if (isChecked){
                        binding.imgGattaran.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgGattaran.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgGattaran.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgGattaran.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgGattaran.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgGattaran.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgGattaran.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgGattaran.visibility = View.INVISIBLE
                    }
                }

                "baggao" -> {
                    if (isChecked){
                        binding.imgBaggao.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBaggao.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBaggao.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBaggao.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBaggao.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBaggao.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBaggao.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBaggao.visibility = View.INVISIBLE
                    }
                }

                "penablanca" -> {
                    if (isChecked){
                        binding.imgPenablanca.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPenablanca.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPenablanca.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPenablanca.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPenablanca.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPenablanca.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPenablanca.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPenablanca.visibility = View.INVISIBLE
                    }
                }

                "tuguegaraocity" -> {
                    if (isChecked){
                        binding.imgTuguegaraoCity.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTuguegaraoCity.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTuguegaraoCity.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTuguegaraoCity.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTuguegaraoCity.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTuguegaraoCity.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTuguegaraoCity.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTuguegaraoCity.visibility = View.INVISIBLE
                    }
                }

                "enrile" -> {
                    if (isChecked){
                        binding.imgEnrile.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgEnrile.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgEnrile.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgEnrile.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgEnrile.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgEnrile.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgEnrile.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgEnrile.visibility = View.INVISIBLE
                    }
                }

                "amulung" -> {
                    if (isChecked){
                        binding.imgAmulung.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAmulung.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAmulung.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAmulung.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAmulung.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAmulung.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAmulung.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAmulung.visibility = View.INVISIBLE
                    }
                }

                "piat" -> {
                    if (isChecked){
                        binding.imgPiat.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPiat.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPiat.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPiat.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPiat.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPiat.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPiat.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPiat.visibility = View.INVISIBLE
                    }
                }

                "rizal" -> {
                    if (isChecked){
                        binding.imgRizal1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgRizal1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgRizal1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgRizal1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgRizal1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgRizal1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgRizal1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgRizal1.visibility = View.INVISIBLE
                    }
                }

                "tuao" -> {
                    if (isChecked){
                        binding.imgTuao.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTuao.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTuao.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTuao.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTuao.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTuao.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTuao.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTuao.visibility = View.INVISIBLE
                    }
                }

                "solana" -> {
                    if (isChecked){
                        binding.imgSolana.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSolana.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSolana.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSolana.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSolana.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSolana.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSolana.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSolana.visibility = View.INVISIBLE
                    }
                }

                "iguig" -> {
                    if (isChecked){
                        binding.imgIguig.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgIguig.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgIguig.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgIguig.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgIguig.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgIguig.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgIguig.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgIguig.visibility = View.INVISIBLE
                    }
                }

                "camalaniugan" -> {
                    if (isChecked){
                        binding.imgCamalaniugan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCamalaniugan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCamalaniugan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCamalaniugan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCamalaniugan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCamalaniugan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCamalaniugan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCamalaniugan.visibility = View.INVISIBLE
                    }
                }


                "buguey" -> {
                    if (isChecked){
                        binding.imgBuguey.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBuguey.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBuguey.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBuguey.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBuguey.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBuguey.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBuguey.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBuguey.visibility = View.INVISIBLE
                    }
                }

                "sta.teresita" -> {
                    if (isChecked){
                        binding.imgSantaTeresita.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantaTeresita.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantaTeresita.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantaTeresita.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantaTeresita.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantaTeresita.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantaTeresita.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantaTeresita.visibility = View.INVISIBLE
                    }
                }


                "gonzaga" -> {
                    if (isChecked){
                        binding.imgGonzaga.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgGonzaga.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgGonzaga.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgGonzaga.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgGonzaga.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgGonzaga.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgGonzaga.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgGonzaga.visibility = View.INVISIBLE
                    }
                }

                "sta.ana" -> {
                    if (isChecked){
                        binding.imgSantaAna.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantaAna.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantaAna.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantaAna.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantaAna.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantaAna.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantaAna.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantaAna.visibility = View.INVISIBLE
                    }
                }



            }
        }

        binding.tgAbulug.setOnCheckedChangeListener(listener)
        binding.tgAlcala.setOnCheckedChangeListener(listener)
        binding.tgAllacapan.setOnCheckedChangeListener(listener)
        binding.tgAmulung.setOnCheckedChangeListener(listener)
        binding.tgAparri.setOnCheckedChangeListener(listener)
        binding.tgBaggao.setOnCheckedChangeListener(listener)
        binding.tgBallesteros.setOnCheckedChangeListener(listener)
        binding.tgBuguey.setOnCheckedChangeListener(listener)
        binding.tgCalayan.setOnCheckedChangeListener(listener)
        binding.tgCamalaniugan.setOnCheckedChangeListener(listener)
        binding.tgClaveria.setOnCheckedChangeListener(listener)
        binding.tgEnrile.setOnCheckedChangeListener(listener)
        binding.tgGattaran.setOnCheckedChangeListener(listener)
        binding.tgGonzaga.setOnCheckedChangeListener(listener)
        binding.tgIguig.setOnCheckedChangeListener(listener)
        binding.tgLalLo.setOnCheckedChangeListener(listener)
        binding.tgLasam.setOnCheckedChangeListener(listener)
        binding.tgPamplona.setOnCheckedChangeListener(listener)
        binding.tgPenablanca.setOnCheckedChangeListener(listener)
        binding.tgPiat.setOnCheckedChangeListener(listener)
        binding.tgRizal1.setOnCheckedChangeListener(listener)
        binding.tgSanchezMira.setOnCheckedChangeListener(listener)
        binding.tgSantaAna.setOnCheckedChangeListener(listener)
        binding.tgSantaPraxedes.setOnCheckedChangeListener(listener)
        binding.tgSantaTeresita.setOnCheckedChangeListener(listener)
        binding.tgSantoNino.setOnCheckedChangeListener(listener)
        binding.tgSolana.setOnCheckedChangeListener(listener)
        binding.tgTuao.setOnCheckedChangeListener(listener)
        binding.tgTuguegaraoCity.setOnCheckedChangeListener(listener)

        binding.btnSave5.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.cagayanLayout))
        }
    }
}