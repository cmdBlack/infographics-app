package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapIfugaoBinding

class ActivityIfugao : AppCompatActivity() {
    private lateinit var binding: ActivityMapIfugaoBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapIfugaoBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)
        val header1 = header?.substringBefore("Radar") + "Radar(IFUGAO)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("banaue", true)){
                binding.imgBanaue.visibility = View.VISIBLE
                binding.imgBanaue.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("hungduan", true)){
                binding.imgHungduan.visibility = View.VISIBLE
                binding.imgHungduan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("hingyon", true)){
                binding.imgHingyon.visibility = View.VISIBLE
                binding.imgHingyon.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("kiangan", true)){
                binding.imgKiangan.visibility = View.VISIBLE
                binding.imgKiangan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("lagawe", true)){
                binding.imgLagawe.visibility = View.VISIBLE
                binding.imgLagawe.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("lamut", true)){
                binding.imgLamut.visibility = View.VISIBLE
                binding.imgLamut.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("asipulo", true)){
                binding.imgAsipulo.visibility = View.VISIBLE
                binding.imgAsipulo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tinoc", true)){
                binding.imgTinoc.visibility = View.VISIBLE
                binding.imgTinoc.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("mayoyao", true)){
                binding.imgMayoyao.visibility = View.VISIBLE
                binding.imgMayoyao.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("aguinaldo", true)){
                binding.imgAguinaldo.visibility = View.VISIBLE
                binding.imgAguinaldo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("alfonsolista", true)){
                binding.imgAlfonsoLista.visibility = View.VISIBLE
                binding.imgAlfonsoLista.setImageResource(R.drawable.rainlightning)
            }

        }

        if (modRainList != null){
            if (modRainList.contains("banaue", true)){
                binding.imgBanaue.visibility = View.VISIBLE
                binding.imgBanaue.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("hungduan", true)){
                binding.imgHungduan.visibility = View.VISIBLE
                binding.imgHungduan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("hingyon", true)){
                binding.imgHingyon.visibility = View.VISIBLE
                binding.imgHingyon.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("kiangan", true)){
                binding.imgKiangan.visibility = View.VISIBLE
                binding.imgKiangan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("lagawe", true)){
                binding.imgLagawe.visibility = View.VISIBLE
                binding.imgLagawe.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("lamut", true)){
                binding.imgLamut.visibility = View.VISIBLE
                binding.imgLamut.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("asipulo", true)){
                binding.imgAsipulo.visibility = View.VISIBLE
                binding.imgAsipulo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tinoc", true)){
                binding.imgTinoc.visibility = View.VISIBLE
                binding.imgTinoc.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("mayoyao", true)){
                binding.imgMayoyao.visibility = View.VISIBLE
                binding.imgMayoyao.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("aguinaldo", true)){
                binding.imgAguinaldo.visibility = View.VISIBLE
                binding.imgAguinaldo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("alfonsolista", true)){
                binding.imgAlfonsoLista.visibility = View.VISIBLE
                binding.imgAlfonsoLista.setImageResource(R.drawable.cloudrain)
            }
        }

        if (lgtRainList != null){
            if (lgtRainList.contains("banaue", true)){
                binding.imgBanaue.visibility = View.VISIBLE
                binding.imgBanaue.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("hungduan", true)){
                binding.imgHungduan.visibility = View.VISIBLE
                binding.imgHungduan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("hingyon", true)){
                binding.imgHingyon.visibility = View.VISIBLE
                binding.imgHingyon.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("kiangan", true)){
                binding.imgKiangan.visibility = View.VISIBLE
                binding.imgKiangan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("lagawe", true)){
                binding.imgLagawe.visibility = View.VISIBLE
                binding.imgLagawe.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("lamut", true)){
                binding.imgLamut.visibility = View.VISIBLE
                binding.imgLamut.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("asipulo", true)){
                binding.imgAsipulo.visibility = View.VISIBLE
                binding.imgAsipulo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tinoc", true)){
                binding.imgTinoc.visibility = View.VISIBLE
                binding.imgTinoc.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("mayoyao", true)){
                binding.imgMayoyao.visibility = View.VISIBLE
                binding.imgMayoyao.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("aguinaldo", true)){
                binding.imgAguinaldo.visibility = View.VISIBLE
                binding.imgAguinaldo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("alfonsolista", true)){
                binding.imgAlfonsoLista.visibility = View.VISIBLE
                binding.imgAlfonsoLista.setImageResource(R.drawable.sunrain)
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
                "banaue" -> {
                    if (isChecked){
                        binding.imgBanaue.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBanaue.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBanaue.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBanaue.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBanaue.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBanaue.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBanaue.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBanaue.visibility = View.INVISIBLE
                    }
                }

                "hungduan" -> {
                    if (isChecked){
                        binding.imgHungduan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgHungduan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgHungduan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgHungduan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgHungduan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgHungduan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgHungduan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgHungduan.visibility = View.INVISIBLE
                    }
                }

                "hingyon" -> {
                    if (isChecked){
                        binding.imgHingyon.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgHingyon.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgHingyon.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgHingyon.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgHingyon.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgHingyon.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgHingyon.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgHingyon.visibility = View.INVISIBLE
                    }
                }

                "kiangan" -> {
                    if (isChecked){
                        binding.imgKiangan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgKiangan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgKiangan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgKiangan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgKiangan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgKiangan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgKiangan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgKiangan.visibility = View.INVISIBLE
                    }
                }

                "lagawe" -> {
                    if (isChecked){
                        binding.imgLagawe.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLagawe.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLagawe.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLagawe.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLagawe.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLagawe.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLagawe.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLagawe.visibility = View.INVISIBLE
                    }
                }

                "lamut" -> {
                    if (isChecked){
                        binding.imgLamut.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLamut.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLamut.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLamut.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLamut.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLamut.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLamut.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLamut.visibility = View.INVISIBLE
                    }
                }

                "asipulo" -> {
                    if (isChecked){
                        binding.imgAsipulo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAsipulo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAsipulo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAsipulo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAsipulo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAsipulo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAsipulo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAsipulo.visibility = View.INVISIBLE
                    }
                }

                "tinoc" -> {
                    if (isChecked){
                        binding.imgTinoc.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTinoc.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTinoc.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTinoc.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTinoc.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTinoc.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTinoc.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTinoc.visibility = View.INVISIBLE
                    }
                }

                "mayoyao" -> {
                    if (isChecked){
                        binding.imgMayoyao.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMayoyao.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMayoyao.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMayoyao.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMayoyao.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMayoyao.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMayoyao.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMayoyao.visibility = View.INVISIBLE
                    }
                }

                "aguinaldo" -> {
                    if (isChecked){
                        binding.imgAguinaldo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAguinaldo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAguinaldo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAguinaldo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAguinaldo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAguinaldo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAguinaldo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAguinaldo.visibility = View.INVISIBLE
                    }
                }

                "alfonsolista" -> {
                    if (isChecked){
                        binding.imgAlfonsoLista.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAlfonsoLista.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAlfonsoLista.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAlfonsoLista.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAlfonsoLista.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAlfonsoLista.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAlfonsoLista.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAlfonsoLista.visibility = View.INVISIBLE
                    }
                }
            }
        }

        binding.tgAguinaldo.setOnCheckedChangeListener(listener)
        binding.tgAlfonsoLista.setOnCheckedChangeListener(listener)
        binding.tgAsipulo.setOnCheckedChangeListener(listener)
        binding.tgBanaue.setOnCheckedChangeListener(listener)
        binding.tgHingyon.setOnCheckedChangeListener(listener)
        binding.tgHungduan.setOnCheckedChangeListener(listener)
        binding.tgKiangan.setOnCheckedChangeListener(listener)
        binding.tgLagawe.setOnCheckedChangeListener(listener)
        binding.tgLamut.setOnCheckedChangeListener(listener)
        binding.tgMayoyao.setOnCheckedChangeListener(listener)
        binding.tgTinoc.setOnCheckedChangeListener(listener)

        binding.btnSave6.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.ifugaoLayout))
        }
    }
}