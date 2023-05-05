package com.pmac.infgrphcs


import android.graphics.Color
import android.os.*
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapNorteBinding

class ActivityNorte : AppCompatActivity() {
    private lateinit var binding: ActivityMapNorteBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapNorteBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        var tapPagudpud = 0
        var tapDumalneg = 0
        var tapAdams = 0
        var tapBangui = 0
        var tapBurgos = 0
        var tapPasuquin = 0
        var tapBacarra = 0
        var tapLaoag = 0
        var tapSanNicolas = 0
        var tapSarrat = 0
        var tapDingras = 0
        var tapMarcos = 0
        var tapNuevaEra = 0
        var tapBanna = 0
        var tapBatac = 0
        var tapCurrimao = 0
        var tapPinili = 0
        var tapBadoc = 0
        var tapPaoay = 0
        var tapVintar = 0
        var tapCarasi = 0
        var tapPiddig = 0
        var tapSolsona = 0

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)
        val header1 = header?.substringBefore("Radar") + "Radar(ILOCOS NORTE)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("pagudpud", true)){
                binding.imgPagudpud.visibility = View.VISIBLE
                binding.imgPagudpud.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("dumalneg", true)){
                binding.imgDumalneg.visibility = View.VISIBLE
                binding.imgDumalneg.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("adams", true)){
                binding.imgAdams.visibility = View.VISIBLE
                binding.imgAdams.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bangui", true)){
                binding.imgBangui.visibility = View.VISIBLE
                binding.imgBangui.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("burgos", true)){
                binding.imgBurgos.visibility = View.VISIBLE
                binding.imgBurgos.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("vintar", true)){
                binding.imgVintar.visibility = View.VISIBLE
                binding.imgVintar.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("pasuquin", true)){
                binding.imgPasuquin.visibility = View.VISIBLE
                binding.imgPasuquin.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("carasi", true)){
                binding.imgCarasi.visibility = View.VISIBLE
                binding.imgCarasi.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bacarra", true)){
                binding.imgBacarra.visibility = View.VISIBLE
                binding.imgBacarra.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("piddig", true)){
                binding.imgPiddig.visibility = View.VISIBLE
                binding.imgPiddig.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("solsona", true)){
                binding.imgSolsona.visibility = View.VISIBLE
                binding.imgSolsona.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("laoagcity", true)){
                binding.imgLaoag.visibility = View.VISIBLE
                binding.imgLaoag.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sannicolas", true)){
                binding.imgSanNicolas.visibility = View.VISIBLE
                binding.imgSanNicolas.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sarrat", true)){
                binding.imgSarrat.visibility = View.VISIBLE
                binding.imgSarrat.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("dingras", true)){
                binding.imgDingras.visibility = View.VISIBLE
                binding.imgDingras.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("marcos", true)){
                binding.imgMarcos.visibility = View.VISIBLE
                binding.imgMarcos.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("nuevaera", true)){
                binding.imgNuevaEra.visibility = View.VISIBLE
                binding.imgNuevaEra.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("banna", true)){
                binding.imgBanna.visibility = View.VISIBLE
                binding.imgBanna.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bataccity", true)){
                binding.imgBatac.visibility = View.VISIBLE
                binding.imgBatac.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("paoay", true)){
                binding.imgPaoay.visibility = View.VISIBLE
                binding.imgPaoay.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("currimao", true)){
                binding.imgCurrimao.visibility = View.VISIBLE
                binding.imgCurrimao.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("pinili", true)){
                binding.imgPinili.visibility = View.VISIBLE
                binding.imgPinili.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("badoc", true)){
                binding.imgBadoc.visibility = View.VISIBLE
                binding.imgBadoc.setImageResource(R.drawable.rainlightning)
            }
        }

        if (modRainList != null){
            if (modRainList.contains("pagudpud", true)){
                binding.imgPagudpud.visibility = View.VISIBLE
                binding.imgPagudpud.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("dumalneg", true)){
                binding.imgDumalneg.visibility = View.VISIBLE
                binding.imgDumalneg.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("adams", true)){
                binding.imgAdams.visibility = View.VISIBLE
                binding.imgAdams.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bangui", true)){
                binding.imgBangui.visibility = View.VISIBLE
                binding.imgBangui.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("burgos", true)){
                binding.imgBurgos.visibility = View.VISIBLE
                binding.imgBurgos.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("vintar", true)){
                binding.imgVintar.visibility = View.VISIBLE
                binding.imgVintar.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("pasuquin", true)){
                binding.imgPasuquin.visibility = View.VISIBLE
                binding.imgPasuquin.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("carasi", true)){
                binding.imgCarasi.visibility = View.VISIBLE
                binding.imgCarasi.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bacarra", true)){
                binding.imgBacarra.visibility = View.VISIBLE
                binding.imgBacarra.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("piddig", true)){
                binding.imgPiddig.visibility = View.VISIBLE
                binding.imgPiddig.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("solsona", true)){
                binding.imgSolsona.visibility = View.VISIBLE
                binding.imgSolsona.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("laoagcity", true)){
                binding.imgLaoag.visibility = View.VISIBLE
                binding.imgLaoag.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sannicolas", true)){
                binding.imgSanNicolas.visibility = View.VISIBLE
                binding.imgSanNicolas.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sarrat", true)){
                binding.imgSarrat.visibility = View.VISIBLE
                binding.imgSarrat.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("dingras", true)){
                binding.imgDingras.visibility = View.VISIBLE
                binding.imgDingras.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("marcos", true)){
                binding.imgMarcos.visibility = View.VISIBLE
                binding.imgMarcos.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("nuevaera", true)){
                binding.imgNuevaEra.visibility = View.VISIBLE
                binding.imgNuevaEra.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("banna", true)){
                binding.imgBanna.visibility = View.VISIBLE
                binding.imgBanna.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bataccity", true)){
                binding.imgBatac.visibility = View.VISIBLE
                binding.imgBatac.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("paoay", true)){
                binding.imgPaoay.visibility = View.VISIBLE
                binding.imgPaoay.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("currimao", true)){
                binding.imgCurrimao.visibility = View.VISIBLE
                binding.imgCurrimao.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("pinili", true)){
                binding.imgPinili.visibility = View.VISIBLE
                binding.imgPinili.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("badoc", true)){
                binding.imgBadoc.visibility = View.VISIBLE
                binding.imgBadoc.setImageResource(R.drawable.cloudrain)
            }
        }

        if (lgtRainList != null){
            if (lgtRainList.contains("pagudpud", true)){
                binding.imgPagudpud.visibility = View.VISIBLE
                binding.imgPagudpud.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("dumalneg", true)){
                binding.imgDumalneg.visibility = View.VISIBLE
                binding.imgDumalneg.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("adams", true)){
                binding.imgAdams.visibility = View.VISIBLE
                binding.imgAdams.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bangui", true)){
                binding.imgBangui.visibility = View.VISIBLE
                binding.imgBangui.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("burgos", true)){
                binding.imgBurgos.visibility = View.VISIBLE
                binding.imgBurgos.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("vintar", true)){
                binding.imgVintar.visibility = View.VISIBLE
                binding.imgVintar.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("pasuquin", true)){
                binding.imgPasuquin.visibility = View.VISIBLE
                binding.imgPasuquin.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("carasi", true)){
                binding.imgCarasi.visibility = View.VISIBLE
                binding.imgCarasi.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bacarra", true)){
                binding.imgBacarra.visibility = View.VISIBLE
                binding.imgBacarra.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("piddig", true)){
                binding.imgPiddig.visibility = View.VISIBLE
                binding.imgPiddig.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("solsona", true)){
                binding.imgSolsona.visibility = View.VISIBLE
                binding.imgSolsona.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("laoagcity", true)){
                binding.imgLaoag.visibility = View.VISIBLE
                binding.imgLaoag.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sannicolas", true)){
                binding.imgSanNicolas.visibility = View.VISIBLE
                binding.imgSanNicolas.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sarrat", true)){
                binding.imgSarrat.visibility = View.VISIBLE
                binding.imgSarrat.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("dingras", true)){
                binding.imgDingras.visibility = View.VISIBLE
                binding.imgDingras.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("marcos", true)){
                binding.imgMarcos.visibility = View.VISIBLE
                binding.imgMarcos.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("nuevaera", true)){
                binding.imgNuevaEra.visibility = View.VISIBLE
                binding.imgNuevaEra.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("banna", true)){
                binding.imgBanna.visibility = View.VISIBLE
                binding.imgBanna.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bataccity", true)){
                binding.imgBatac.visibility = View.VISIBLE
                binding.imgBatac.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("paoay", true)){
                binding.imgPaoay.visibility = View.VISIBLE
                binding.imgPaoay.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("currimao", true)){
                binding.imgCurrimao.visibility = View.VISIBLE
                binding.imgCurrimao.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("pinili", true)){
                binding.imgPinili.visibility = View.VISIBLE
                binding.imgPinili.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("badoc", true)){
                binding.imgBadoc.visibility = View.VISIBLE
                binding.imgBadoc.setImageResource(R.drawable.sunrain)
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
                "pagudpud" -> {
                    if (isChecked){
                        binding.imgPagudpud.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPagudpud.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPagudpud.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPagudpud.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPagudpud.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPagudpud.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPagudpud.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPagudpud.visibility = View.INVISIBLE
                    }
                }

                "dumalneg" -> {
                    if (isChecked){
                        binding.imgDumalneg.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDumalneg.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDumalneg.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDumalneg.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDumalneg.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDumalneg.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDumalneg.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDumalneg.visibility = View.INVISIBLE
                    }
                }

                "adams" -> {
                    if (isChecked){
                        binding.imgAdams.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAdams.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAdams.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAdams.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAdams.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAdams.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAdams.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAdams.visibility = View.INVISIBLE
                    }
                }

                "bangui" -> {
                    if (isChecked){
                        binding.imgBangui.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBangui.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBangui.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBangui.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBangui.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBangui.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBangui.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBangui.visibility = View.INVISIBLE
                    }
                }

                "burgos" -> {
                    if (isChecked){
                        binding.imgBurgos.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBurgos.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBurgos.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBurgos.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBurgos.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBurgos.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBurgos.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBurgos.visibility = View.INVISIBLE
                    }
                }

                "pasuquin" -> {
                    if (isChecked){
                        binding.imgPasuquin.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPasuquin.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPasuquin.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPasuquin.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPasuquin.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPasuquin.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPasuquin.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPasuquin.visibility = View.INVISIBLE
                    }
                }

                "vintar" -> {
                    if (isChecked){
                        binding.imgVintar.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgVintar.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgVintar.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgVintar.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgVintar.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgVintar.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgVintar.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgVintar.visibility = View.INVISIBLE
                    }
                }

                "bacarra" -> {
                    if (isChecked){
                        binding.imgBacarra.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBacarra.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBacarra.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBacarra.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBacarra.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBacarra.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBacarra.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBacarra.visibility = View.INVISIBLE
                    }
                }

                "carasi" -> {
                    if (isChecked){
                        binding.imgCarasi.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCarasi.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCarasi.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCarasi.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCarasi.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCarasi.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCarasi.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCarasi.visibility = View.INVISIBLE
                    }
                }

                "piddig" -> {
                    if (isChecked){
                        binding.imgPiddig.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPiddig.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPiddig.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPiddig.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPiddig.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPiddig.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPiddig.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPiddig.visibility = View.INVISIBLE
                    }
                }

                "sannicolas" -> {
                    if (isChecked){
                        binding.imgSanNicolas.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanNicolas.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanNicolas.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanNicolas.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanNicolas.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanNicolas.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanNicolas.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanNicolas.visibility = View.INVISIBLE
                    }
                }

                "sarrat" -> {
                    if (isChecked){
                        binding.imgSarrat.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSarrat.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSarrat.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSarrat.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSarrat.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSarrat.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSarrat.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSarrat.visibility = View.INVISIBLE
                    }
                }

                "dingras" -> {
                    if (isChecked){
                        binding.imgDingras.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDingras.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDingras.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDingras.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDingras.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDingras.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDingras.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDingras.visibility = View.INVISIBLE
                    }
                }

                "solsona" -> {
                    if (isChecked){
                        binding.imgSolsona.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSolsona.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSolsona.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSolsona.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSolsona.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSolsona.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSolsona.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSolsona.visibility = View.INVISIBLE
                    }
                }

                "marcos" -> {
                    if (isChecked){
                        binding.imgMarcos.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMarcos.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMarcos.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMarcos.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMarcos.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMarcos.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMarcos.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMarcos.visibility = View.INVISIBLE
                    }
                }

                "banna" -> {
                    if (isChecked){
                        binding.imgBanna.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBanna.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBanna.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBanna.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBanna.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBanna.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBanna.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBanna.visibility = View.INVISIBLE
                    }
                }

                "nuevaera" -> {
                    if (isChecked){
                        binding.imgNuevaEra.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgNuevaEra.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgNuevaEra.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgNuevaEra.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgNuevaEra.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgNuevaEra.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgNuevaEra.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgNuevaEra.visibility = View.INVISIBLE
                    }
                }

                "batac" -> {
                    if (isChecked){
                        binding.imgBatac.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBatac.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBatac.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBatac.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBatac.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBatac.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBatac.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBatac.visibility = View.INVISIBLE
                    }
                }

                "paoay" -> {
                    if (isChecked){
                        binding.imgPaoay.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPaoay.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPaoay.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPaoay.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPaoay.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPaoay.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPaoay.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPaoay.visibility = View.INVISIBLE
                    }
                }

                "currimao" -> {
                    if (isChecked){
                        binding.imgCurrimao.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCurrimao.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCurrimao.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCurrimao.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCurrimao.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCurrimao.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCurrimao.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCurrimao.visibility = View.INVISIBLE
                    }
                }

                "pinili" -> {
                    if (isChecked){
                        binding.imgPinili.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPinili.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPinili.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPinili.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPinili.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPinili.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPinili.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPinili.visibility = View.INVISIBLE
                    }
                }

                "badoc" -> {
                    if (isChecked){
                        binding.imgBadoc.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBadoc.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBadoc.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBadoc.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBadoc.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBadoc.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBadoc.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBadoc.visibility = View.INVISIBLE
                    }
                }


                "laoag" -> {
                    if (isChecked){
                        binding.imgLaoag.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLaoag.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLaoag.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLaoag.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLaoag.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLaoag.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLaoag.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLaoag.visibility = View.INVISIBLE
                    }
                }
            }
        }

        binding.tgPagudpud.setOnCheckedChangeListener(listener)
        binding.tgDumalneg.setOnCheckedChangeListener(listener)
        binding.tgAdams.setOnCheckedChangeListener(listener)
        binding.tgBangui.setOnCheckedChangeListener(listener)
        binding.tgBurgos.setOnCheckedChangeListener(listener)
        binding.tgPasuquin.setOnCheckedChangeListener(listener)
        binding.tgVintar.setOnCheckedChangeListener(listener)
        binding.tgBacarra.setOnCheckedChangeListener(listener)
        binding.tgCarasi.setOnCheckedChangeListener(listener)
        binding.tgPiddig.setOnCheckedChangeListener(listener)
        binding.tgLaoag.setOnCheckedChangeListener(listener)
        binding.tgSanNicolas.setOnCheckedChangeListener(listener)
        binding.tgSarrat.setOnCheckedChangeListener(listener)
        binding.tgDingras.setOnCheckedChangeListener(listener)
        binding.tgSolsona.setOnCheckedChangeListener(listener)
        binding.tgMarcos.setOnCheckedChangeListener(listener)
        binding.tgBanna.setOnCheckedChangeListener(listener)
        binding.tgNuevaEra.setOnCheckedChangeListener(listener)
        binding.tgBatac.setOnCheckedChangeListener(listener)
        binding.tgPaoay.setOnCheckedChangeListener(listener)
        binding.tgCurrimao.setOnCheckedChangeListener(listener)
        binding.tgPinili.setOnCheckedChangeListener(listener)
        binding.tgBadoc.setOnCheckedChangeListener(listener)

        binding.btnSave.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.norteLayout))
        }

        binding.imgPagudpud.setOnClickListener {
            tapPagudpud += 1
            binding.ryoPagudpud.visibility = View.VISIBLE
            when (tapPagudpud) {
                4 -> { tapPagudpud = 0
                    binding.ryoPagudpud.visibility = View.INVISIBLE
                }
                3 -> binding.ryoPagudpud.setColorFilter(Color.RED)
                2 -> binding.ryoPagudpud.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoPagudpud.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgDumalneg.setOnClickListener {
            tapDumalneg += 1
            binding.ryoDumalneg.visibility = View.VISIBLE
            when (tapDumalneg) {
                4 -> { tapDumalneg = 0
                    binding.ryoDumalneg.visibility = View.INVISIBLE
                }
                3 -> binding.ryoDumalneg.setColorFilter(Color.RED)
                2 -> binding.ryoDumalneg.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoDumalneg.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgAdams.setOnClickListener {
            tapAdams += 1
            binding.ryoAdams.visibility = View.VISIBLE
            when (tapAdams) {
                4 -> { tapAdams = 0
                    binding.ryoAdams.visibility = View.INVISIBLE
                }
                3 -> binding.ryoAdams.setColorFilter(Color.RED)
                2 -> binding.ryoAdams.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoAdams.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgBangui.setOnClickListener {
            tapBangui += 1
            binding.ryoBangui.visibility = View.VISIBLE
            when (tapBangui) {
                4 -> { tapBangui = 0
                    binding.ryoBangui.visibility = View.INVISIBLE
                }
                3 -> binding.ryoBangui.setColorFilter(Color.RED)
                2 -> binding.ryoBangui.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoBangui.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgBurgos.setOnClickListener {
            tapBurgos += 1
            binding.ryoBurgos.visibility = View.VISIBLE
            when (tapBurgos) {
                4 -> { tapBurgos = 0
                    binding.ryoBurgos.visibility = View.INVISIBLE
                }
                3 -> binding.ryoBurgos.setColorFilter(Color.RED)
                2 -> binding.ryoBurgos.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoBurgos.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgPasuquin.setOnClickListener {
            tapPasuquin += 1
            binding.ryoPasuquin.visibility = View.VISIBLE
            when (tapPasuquin) {
                4 -> { tapPasuquin = 0
                    binding.ryoPasuquin.visibility = View.INVISIBLE
                }
                3 -> binding.ryoPasuquin.setColorFilter(Color.RED)
                2 -> binding.ryoPasuquin.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoPasuquin.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgVintar.setOnClickListener {
            tapVintar += 1
            binding.ryoVintar.visibility = View.VISIBLE
            when (tapVintar) {
                4 -> { tapVintar = 0
                    binding.ryoVintar.visibility = View.INVISIBLE
                }
                3 -> binding.ryoVintar.setColorFilter(Color.RED)
                2 -> binding.ryoVintar.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoVintar.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgCarasi.setOnClickListener {
            tapCarasi += 1
            binding.ryoCarasi.visibility = View.VISIBLE
            when (tapCarasi) {
                4 -> { tapCarasi = 0
                    binding.ryoCarasi.visibility = View.INVISIBLE
                }
                3 -> binding.ryoCarasi.setColorFilter(Color.RED)
                2 -> binding.ryoCarasi.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoCarasi.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgBacarra.setOnClickListener {
            tapBacarra += 1
            binding.ryoBacarra.visibility = View.VISIBLE
            when (tapBacarra) {
                4 -> { tapBacarra = 0
                    binding.ryoBacarra.visibility = View.INVISIBLE
                }
                3 -> binding.ryoBacarra.setColorFilter(Color.RED)
                2 -> binding.ryoBacarra.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoBacarra.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgPiddig.setOnClickListener {
            tapPiddig += 1
            binding.ryoPiddig.visibility = View.VISIBLE
            when (tapPiddig) {
                4 -> { tapPiddig = 0
                    binding.ryoPiddig.visibility = View.INVISIBLE
                }
                3 -> binding.ryoPiddig.setColorFilter(Color.RED)
                2 -> binding.ryoPiddig.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoPiddig.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgSolsona.setOnClickListener {
            tapSolsona += 1
            binding.ryoSolsona.visibility = View.VISIBLE
            when (tapSolsona) {
                4 -> { tapSolsona = 0
                    binding.ryoSolsona.visibility = View.INVISIBLE
                }
                3 -> binding.ryoSolsona.setColorFilter(Color.RED)
                2 -> binding.ryoSolsona.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoSolsona.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgLaoag.setOnClickListener {
            tapLaoag += 1
            binding.ryoLaoag.visibility = View.VISIBLE
            when (tapLaoag) {
                4 -> { tapLaoag = 0
                    binding.ryoLaoag.visibility = View.INVISIBLE
                }
                3 -> binding.ryoLaoag.setColorFilter(Color.RED)
                2 -> binding.ryoLaoag.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoLaoag.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgSanNicolas.setOnClickListener {
            tapSanNicolas += 1
            binding.ryoSanNicolas.visibility = View.VISIBLE
            when (tapSanNicolas) {
                4 -> { tapSanNicolas = 0
                    binding.ryoSanNicolas.visibility = View.INVISIBLE
                }
                3 -> binding.ryoSanNicolas.setColorFilter(Color.RED)
                2 -> binding.ryoSanNicolas.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoSanNicolas.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgSarrat.setOnClickListener {
            tapSarrat += 1
            binding.ryoSarrat.visibility = View.VISIBLE
            when (tapSarrat) {
                4 -> { tapSarrat = 0
                    binding.ryoSarrat.visibility = View.INVISIBLE
                }
                3 -> binding.ryoSarrat.setColorFilter(Color.RED)
                2 -> binding.ryoSarrat.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoSarrat.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgDingras.setOnClickListener {
            tapDingras += 1
            binding.ryoDingras.visibility = View.VISIBLE
            when (tapDingras) {
                4 -> { tapDingras = 0
                    binding.ryoDingras.visibility = View.INVISIBLE
                }
                3 -> binding.ryoDingras.setColorFilter(Color.RED)
                2 -> binding.ryoDingras.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoDingras.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgMarcos.setOnClickListener {
            tapMarcos += 1
            binding.ryoMarcos.visibility = View.VISIBLE
            when (tapMarcos) {
                4 -> { tapMarcos = 0
                    binding.ryoMarcos.visibility = View.INVISIBLE
                }
                3 -> binding.ryoMarcos.setColorFilter(Color.RED)
                2 -> binding.ryoMarcos.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoMarcos.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgPaoay.setOnClickListener {
            tapPaoay += 1
            binding.ryoPaoay.visibility = View.VISIBLE
            when (tapPaoay) {
                4 -> { tapPaoay = 0
                    binding.ryoPaoay.visibility = View.INVISIBLE
                }
                3 -> binding.ryoPaoay.setColorFilter(Color.RED)
                2 -> binding.ryoPaoay.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoPaoay.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgBatac.setOnClickListener {
            tapBatac += 1
            binding.ryoBatac.visibility = View.VISIBLE
            when (tapBatac) {
                4 -> { tapBatac = 0
                    binding.ryoBatac.visibility = View.INVISIBLE
                }
                3 -> binding.ryoBatac.setColorFilter(Color.RED)
                2 -> binding.ryoBatac.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoBatac.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgBanna.setOnClickListener {
            tapBanna += 1
            binding.ryoBanna.visibility = View.VISIBLE
            when (tapBanna) {
                4 -> { tapBanna = 0
                    binding.ryoBanna.visibility = View.INVISIBLE
                }
                3 -> binding.ryoBanna.setColorFilter(Color.RED)
                2 -> binding.ryoBanna.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoBanna.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgNuevaEra.setOnClickListener {
            tapNuevaEra += 1
            binding.ryoNuevaEra.visibility = View.VISIBLE
            when (tapNuevaEra) {
                4 -> { tapNuevaEra = 0
                    binding.ryoNuevaEra.visibility = View.INVISIBLE
                }
                3 -> binding.ryoNuevaEra.setColorFilter(Color.RED)
                2 -> binding.ryoNuevaEra.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoNuevaEra.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgCurrimao.setOnClickListener {
            tapCurrimao += 1
            binding.ryoCurrimao.visibility = View.VISIBLE
            when (tapCurrimao) {
                4 -> { tapCurrimao = 0
                    binding.ryoCurrimao.visibility = View.INVISIBLE
                }
                3 -> binding.ryoCurrimao.setColorFilter(Color.RED)
                2 -> binding.ryoCurrimao.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoCurrimao.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgPinili.setOnClickListener {
            tapPinili += 1
            binding.ryoPinili.visibility = View.VISIBLE
            when (tapPinili) {
                4 -> { tapPinili = 0
                    binding.ryoPinili.visibility = View.INVISIBLE
                }
                3 -> binding.ryoPinili.setColorFilter(Color.RED)
                2 -> binding.ryoPinili.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoPinili.setColorFilter(Color.YELLOW)
            }

        }

        binding.imgBadoc.setOnClickListener {
            tapBadoc += 1
            binding.ryoBadoc.visibility = View.VISIBLE
            when (tapBadoc) {
                4 -> { tapBadoc = 0
                    binding.ryoBadoc.visibility = View.INVISIBLE
                }
                3 -> binding.ryoBadoc.setColorFilter(Color.RED)
                2 -> binding.ryoBadoc.setColorFilter(Color.argb(100, 255, 165, 0))
                1 -> binding.ryoBadoc.setColorFilter(Color.YELLOW)
            }

        }
    }
}