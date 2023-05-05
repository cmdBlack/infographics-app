package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapNvizcayaBinding

class ActivityNVizcaya : AppCompatActivity() {
    private lateinit var binding: ActivityMapNvizcayaBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapNvizcayaBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)
        val header1 = header?.substringBefore("Radar") + "Radar(NUEVA VIZCAYA)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("diadi", true)){
                binding.imgDiadi.visibility = View.VISIBLE
                binding.imgDiadi.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bagabag", true)){
                binding.imgBagabag.visibility = View.VISIBLE
                binding.imgBagabag.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("solano", true)){
                binding.imgSolano.visibility = View.VISIBLE
                binding.imgSolano.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("villaverde", true)){
                binding.imgVillaverde.visibility = View.VISIBLE
                binding.imgVillaverde.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("quezon", true)){
                binding.imgQuezon.visibility = View.VISIBLE
                binding.imgQuezon.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("kasibu", true)){
                binding.imgKasibu.visibility = View.VISIBLE
                binding.imgKasibu.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("ambaguio", true)){
                binding.imgAmbaguio.visibility = View.VISIBLE
                binding.imgAmbaguio.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bayombong", true)){
                binding.imgBayombong.visibility = View.VISIBLE
                binding.imgBayombong.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bambang", true)){
                binding.imgBambang.visibility = View.VISIBLE
                binding.imgBambang.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("kayapa", true)){
                binding.imgKayapa.visibility = View.VISIBLE
                binding.imgKayapa.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("aritao", true)){
                binding.imgAritao.visibility = View.VISIBLE
                binding.imgAritao.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("dupaxdelnorte", true)){
                binding.imgDDelNorte.visibility = View.VISIBLE
                binding.imgDDelNorte.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("dupaxdelsur", true)){
                binding.imgDDelSur.visibility = View.VISIBLE
                binding.imgDDelSur.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sta.fe", true)){
                binding.imgSantaFe.visibility = View.VISIBLE
                binding.imgSantaFe.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("alfonsocastaneda", true)){
                binding.imgAlfonsoCastenada.visibility = View.VISIBLE
                binding.imgAlfonsoCastenada.setImageResource(R.drawable.rainlightning)
            }


        }

        if (modRainList != null){
            if (modRainList.contains("diadi", true)){
                binding.imgDiadi.visibility = View.VISIBLE
                binding.imgDiadi.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bagabag", true)){
                binding.imgBagabag.visibility = View.VISIBLE
                binding.imgBagabag.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("solano", true)){
                binding.imgSolano.visibility = View.VISIBLE
                binding.imgSolano.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("villaverde", true)){
                binding.imgVillaverde.visibility = View.VISIBLE
                binding.imgVillaverde.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("quezon", true)){
                binding.imgQuezon.visibility = View.VISIBLE
                binding.imgQuezon.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("kasibu", true)){
                binding.imgKasibu.visibility = View.VISIBLE
                binding.imgKasibu.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("ambaguio", true)){
                binding.imgAmbaguio.visibility = View.VISIBLE
                binding.imgAmbaguio.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bayombong", true)){
                binding.imgBayombong.visibility = View.VISIBLE
                binding.imgBayombong.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bambang", true)){
                binding.imgBambang.visibility = View.VISIBLE
                binding.imgBambang.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("kayapa", true)){
                binding.imgKayapa.visibility = View.VISIBLE
                binding.imgKayapa.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("aritao", true)){
                binding.imgAritao.visibility = View.VISIBLE
                binding.imgAritao.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("dupaxdelnorte", true)){
                binding.imgDDelNorte.visibility = View.VISIBLE
                binding.imgDDelNorte.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("dupaxdelsur", true)){
                binding.imgDDelSur.visibility = View.VISIBLE
                binding.imgDDelSur.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sta.fe", true)){
                binding.imgSantaFe.visibility = View.VISIBLE
                binding.imgSantaFe.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("alfonsocastaneda", true)){
                binding.imgAlfonsoCastenada.visibility = View.VISIBLE
                binding.imgAlfonsoCastenada.setImageResource(R.drawable.cloudrain)
            }


        }

        if (lgtRainList != null){
            if (lgtRainList.contains("diadi", true)){
                binding.imgDiadi.visibility = View.VISIBLE
                binding.imgDiadi.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bagabag", true)){
                binding.imgBagabag.visibility = View.VISIBLE
                binding.imgBagabag.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("solano", true)){
                binding.imgSolano.visibility = View.VISIBLE
                binding.imgSolano.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("villaverde", true)){
                binding.imgVillaverde.visibility = View.VISIBLE
                binding.imgVillaverde.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("quezon", true)){
                binding.imgQuezon.visibility = View.VISIBLE
                binding.imgQuezon.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("kasibu", true)){
                binding.imgKasibu.visibility = View.VISIBLE
                binding.imgKasibu.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("ambaguio", true)){
                binding.imgAmbaguio.visibility = View.VISIBLE
                binding.imgAmbaguio.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bayombong", true)){
                binding.imgBayombong.visibility = View.VISIBLE
                binding.imgBayombong.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bambang", true)){
                binding.imgBambang.visibility = View.VISIBLE
                binding.imgBambang.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("kayapa", true)){
                binding.imgKayapa.visibility = View.VISIBLE
                binding.imgKayapa.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("aritao", true)){
                binding.imgAritao.visibility = View.VISIBLE
                binding.imgAritao.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("dupaxdelnorte", true)){
                binding.imgDDelNorte.visibility = View.VISIBLE
                binding.imgDDelNorte.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("dupaxdelsur", true)){
                binding.imgDDelSur.visibility = View.VISIBLE
                binding.imgDDelSur.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sta.fe", true)){
                binding.imgSantaFe.visibility = View.VISIBLE
                binding.imgSantaFe.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("alfonsocastaneda", true)){
                binding.imgAlfonsoCastenada.visibility = View.VISIBLE
                binding.imgAlfonsoCastenada.setImageResource(R.drawable.sunrain)
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
                "diadi" -> {
                    if (isChecked){
                        binding.imgDiadi.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDiadi.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDiadi.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDiadi.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDiadi.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDiadi.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDiadi.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDiadi.visibility = View.INVISIBLE
                    }
                }

                "solano" -> {
                    if (isChecked){
                        binding.imgSolano.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSolano.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSolano.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSolano.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSolano.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSolano.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSolano.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSolano.visibility = View.INVISIBLE
                    }
                }

                "bagabag" -> {
                    if (isChecked){
                        binding.imgBagabag.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBagabag.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBagabag.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBagabag.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBagabag.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBagabag.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBagabag.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBagabag.visibility = View.INVISIBLE
                    }
                }

                "villaverde" -> {
                    if (isChecked){
                        binding.imgVillaverde.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgVillaverde.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgVillaverde.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgVillaverde.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgVillaverde.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgVillaverde.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgVillaverde.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgVillaverde.visibility = View.INVISIBLE
                    }
                }

                "quezon" -> {
                    if (isChecked){
                        binding.imgQuezon.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgQuezon.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgQuezon.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgQuezon.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgQuezon.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgQuezon.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgQuezon.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgQuezon.visibility = View.INVISIBLE
                    }
                }

                "kasibu" -> {
                    if (isChecked){
                        binding.imgKasibu.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgKasibu.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgKasibu.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgKasibu.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgKasibu.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgKasibu.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgKasibu.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgKasibu.visibility = View.INVISIBLE
                    }
                }

                "ambaguio" -> {
                    if (isChecked){
                        binding.imgAmbaguio.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAmbaguio.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAmbaguio.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAmbaguio.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAmbaguio.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAmbaguio.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAmbaguio.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAmbaguio.visibility = View.INVISIBLE
                    }
                }

                "bayombong" -> {
                    if (isChecked){
                        binding.imgBayombong.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBayombong.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBayombong.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBayombong.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBayombong.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBayombong.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBayombong.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBayombong.visibility = View.INVISIBLE
                    }
                }


                "bambang" -> {
                    if (isChecked){
                        binding.imgBambang.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBambang.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBambang.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBambang.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBambang.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBambang.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBambang.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBambang.visibility = View.INVISIBLE
                    }
                }

                "kayapa" -> {
                    if (isChecked){
                        binding.imgKayapa.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgKayapa.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgKayapa.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgKayapa.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgKayapa.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgKayapa.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgKayapa.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgKayapa.visibility = View.INVISIBLE
                    }
                }

                "aritao" -> {
                    if (isChecked){
                        binding.imgAritao.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAritao.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAritao.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAritao.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAritao.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAritao.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAritao.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAritao.visibility = View.INVISIBLE
                    }
                }

                "sta.fe" -> {
                    if (isChecked){
                        binding.imgSantaFe.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantaFe.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantaFe.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantaFe.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantaFe.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantaFe.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantaFe.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantaFe.visibility = View.INVISIBLE
                    }
                }

                "dupaxdelnorte" -> {
                    if (isChecked){
                        binding.imgDDelNorte.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDDelNorte.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDDelNorte.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDDelNorte.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDDelNorte.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDDelNorte.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDDelNorte.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDDelNorte.visibility = View.INVISIBLE
                    }
                }

                "dupaxdelsur" -> {
                    if (isChecked){
                        binding.imgDDelSur.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDDelSur.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDDelSur.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDDelSur.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDDelSur.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDDelSur.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDDelSur.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDDelSur.visibility = View.INVISIBLE
                    }
                }

                "alfonsocastaneda" -> {
                    if (isChecked){
                        binding.imgAlfonsoCastenada.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAlfonsoCastenada.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAlfonsoCastenada.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAlfonsoCastenada.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAlfonsoCastenada.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAlfonsoCastenada.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAlfonsoCastenada.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAlfonsoCastenada.visibility = View.INVISIBLE
                    }
                }
            }
        }

        binding.tgSolano.setOnCheckedChangeListener(listener)
        binding.tgSantaFe.setOnCheckedChangeListener(listener)
        binding.tgAlfonsoCastaneda.setOnCheckedChangeListener(listener)
        binding.tgAmbaguio.setOnCheckedChangeListener(listener)
        binding.tgAritao.setOnCheckedChangeListener(listener)
        binding.tgBagabag.setOnCheckedChangeListener(listener)
        binding.tgBambang.setOnCheckedChangeListener(listener)
        binding.tgBayombong.setOnCheckedChangeListener(listener)
        binding.tgDDelNorte.setOnCheckedChangeListener(listener)
        binding.tgDDelSur.setOnCheckedChangeListener(listener)
        binding.tgDiadi.setOnCheckedChangeListener(listener)
        binding.tgKasibu.setOnCheckedChangeListener(listener)
        binding.tgKayapa.setOnCheckedChangeListener(listener)
        binding.tgQuezon.setOnCheckedChangeListener(listener)
        binding.tgVillaverde.setOnCheckedChangeListener(listener)

        binding.btnSave11.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.nvizcayaLayout))
        }
    }
}