package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CompoundButton
import android.widget.ToggleButton
import com.pmac.infgrphcs.databinding.ActivityMapPangasinanBinding

class ActivityPangasinan : AppCompatActivity() {
    private lateinit var binding: ActivityMapPangasinanBinding
    private var select = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMapPangasinanBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val header = intent.getStringExtra(HEADER)
        val lightningList = intent.getStringExtra(LIGHTNING_LIST)
        val modRainList = intent.getStringExtra(MOD_RAINS_LIST)
        val lgtRainList = intent.getStringExtra(LGT_RAINS_LIST)
        val header1 = header?.substringBefore("Radar") + "Radar(PANGASINAN)" + header?.substringAfter("Radar")


        if (lightningList != null){
            if (lightningList.contains("bolinao", true)){
                binding.imgBolinao.visibility = View.VISIBLE
                binding.imgBolinao.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("anda", true)){
                binding.imgAnda.visibility = View.VISIBLE
                binding.imgAnda.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bani", true)){
                binding.imgBani.visibility = View.VISIBLE
                binding.imgBani.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("agno", true)){
                binding.imgAgno.visibility = View.VISIBLE
                binding.imgAgno.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("burgos", true)){
                binding.imgBurgos4.visibility = View.VISIBLE
                binding.imgBurgos4.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("alaminoscity", true)){
                binding.imgAlaminosCity.visibility = View.VISIBLE
                binding.imgAlaminosCity.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sual", true)){
                binding.imgSual.visibility = View.VISIBLE
                binding.imgSual.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("mabini", true)){
                binding.imgMabini.visibility = View.VISIBLE
                binding.imgMabini.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("dasol", true)){
                binding.imgDasol.visibility = View.VISIBLE
                binding.imgDasol.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("infanta", true)){
                binding.imgInfanta.visibility = View.VISIBLE
                binding.imgInfanta.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bugallon", true)){
                binding.imgBugallon.visibility = View.VISIBLE
                binding.imgBugallon.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("labrador", true)){
                binding.imgLabrador.visibility = View.VISIBLE
                binding.imgLabrador.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("lingayen", true)){
                binding.imgLingayen.visibility = View.VISIBLE
                binding.imgLingayen.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("binmaley", true)){
                binding.imgBinmaley.visibility = View.VISIBLE
                binding.imgBinmaley.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("dagupancity", true)){
                binding.imgDagupanCity.visibility = View.VISIBLE
                binding.imgDagupanCity.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("calasiao", true)){
                binding.imgCalasiao.visibility = View.VISIBLE
                binding.imgCalasiao.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sta.barbara", true)){
                binding.imgSantaBarbara.visibility = View.VISIBLE
                binding.imgSantaBarbara.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("mangaldan", true)){
                binding.imgMangaldan.visibility = View.VISIBLE
                binding.imgMangaldan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanfabian", true)){
                binding.imgSanFabian.visibility = View.VISIBLE
                binding.imgSanFabian.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sison", true)){
                binding.imgSison.visibility = View.VISIBLE
                binding.imgSison.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("pozzorubio", true)){
                binding.imgPozzorubio.visibility = View.VISIBLE
                binding.imgPozzorubio.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("binalonan", true)){
                binding.imgBinalonan.visibility = View.VISIBLE
                binding.imgBinalonan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("manaoag", true)){
                binding.imgManaoag.visibility = View.VISIBLE
                binding.imgManaoag.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("laoac", true)){
                binding.imgLaoac.visibility = View.VISIBLE
                binding.imgLaoac.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("mapandan", true)){
                binding.imgMapandan.visibility = View.VISIBLE
                binding.imgMapandan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("urdanetacity", true)){
                binding.imgUrdanetaCity.visibility = View.VISIBLE
                binding.imgUrdanetaCity.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanmanuel", true)){
                binding.imgSanManuel1.visibility = View.VISIBLE
                binding.imgSanManuel1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sannicolas", true)){
                binding.imgSanNicolas1.visibility = View.VISIBLE
                binding.imgSanNicolas1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("natividad", true)){
                binding.imgNatividad.visibility = View.VISIBLE
                binding.imgNatividad.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("tayug", true)){
                binding.imgTayug.visibility = View.VISIBLE
                binding.imgTayug.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sanquintin", true)){
                binding.imgSanQuintin1.visibility = View.VISIBLE
                binding.imgSanQuintin1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("umingan", true)){
                binding.imgUmingan.visibility = View.VISIBLE
                binding.imgUmingan.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("balungao", true)){
                binding.imgBalungao.visibility = View.VISIBLE
                binding.imgBalungao.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("rosales", true)){
                binding.imgRosales.visibility = View.VISIBLE
                binding.imgRosales.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("villasis", true)){
                binding.imgVillasis.visibility = View.VISIBLE
                binding.imgVillasis.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sto.tomas", true)){
                binding.imgSantoTomas2.visibility = View.VISIBLE
                binding.imgSantoTomas2.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("alcala", true)){
                binding.imgAlcala1.visibility = View.VISIBLE
                binding.imgAlcala1.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bautista", true)){
                binding.imgBautista.visibility = View.VISIBLE
                binding.imgBautista.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("bayambang", true)){
                binding.imgBayambang.visibility = View.VISIBLE
                binding.imgBayambang.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("urbiztondo", true)){
                binding.imgUrbiztondo.visibility = View.VISIBLE
                binding.imgUrbiztondo.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sancarloscity", true)){
                binding.imgSanCarlosCity.visibility = View.VISIBLE
                binding.imgSanCarlosCity.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("basista", true)){
                binding.imgBasista.visibility = View.VISIBLE
                binding.imgBasista.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("malasiqui", true)){
                binding.imgMalasiqui.visibility = View.VISIBLE
                binding.imgMalasiqui.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("aguilar", true)){
                binding.imgAguilar.visibility = View.VISIBLE
                binding.imgAguilar.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("mangatarem", true)){
                binding.imgMangatarem.visibility = View.VISIBLE
                binding.imgMangatarem.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("sta.maria", true)){
                binding.imgSantaMaria2.visibility = View.VISIBLE
                binding.imgSantaMaria2.setImageResource(R.drawable.rainlightning)
            }
            if (lightningList.contains("asingan", true)){
                binding.imgAsingan.visibility = View.VISIBLE
                binding.imgAsingan.setImageResource(R.drawable.rainlightning)
            }

        }

        if (modRainList != null){
            if (modRainList.contains("bolinao", true)){
                binding.imgBolinao.visibility = View.VISIBLE
                binding.imgBolinao.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("anda", true)){
                binding.imgAnda.visibility = View.VISIBLE
                binding.imgAnda.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bani", true)){
                binding.imgBani.visibility = View.VISIBLE
                binding.imgBani.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("agno", true)){
                binding.imgAgno.visibility = View.VISIBLE
                binding.imgAgno.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("burgos", true)){
                binding.imgBurgos4.visibility = View.VISIBLE
                binding.imgBurgos4.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("alaminoscity", true)){
                binding.imgAlaminosCity.visibility = View.VISIBLE
                binding.imgAlaminosCity.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sual", true)){
                binding.imgSual.visibility = View.VISIBLE
                binding.imgSual.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("mabini", true)){
                binding.imgMabini.visibility = View.VISIBLE
                binding.imgMabini.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("dasol", true)){
                binding.imgDasol.visibility = View.VISIBLE
                binding.imgDasol.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("infanta", true)){
                binding.imgInfanta.visibility = View.VISIBLE
                binding.imgInfanta.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bugallon", true)){
                binding.imgBugallon.visibility = View.VISIBLE
                binding.imgBugallon.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("labrador", true)){
                binding.imgLabrador.visibility = View.VISIBLE
                binding.imgLabrador.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("lingayen", true)){
                binding.imgLingayen.visibility = View.VISIBLE
                binding.imgLingayen.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("binmaley", true)){
                binding.imgBinmaley.visibility = View.VISIBLE
                binding.imgBinmaley.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("dagupancity", true)){
                binding.imgDagupanCity.visibility = View.VISIBLE
                binding.imgDagupanCity.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("calasiao", true)){
                binding.imgCalasiao.visibility = View.VISIBLE
                binding.imgCalasiao.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sta.barbara", true)){
                binding.imgSantaBarbara.visibility = View.VISIBLE
                binding.imgSantaBarbara.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("mangaldan", true)){
                binding.imgMangaldan.visibility = View.VISIBLE
                binding.imgMangaldan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanfabian", true)){
                binding.imgSanFabian.visibility = View.VISIBLE
                binding.imgSanFabian.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sison", true)){
                binding.imgSison.visibility = View.VISIBLE
                binding.imgSison.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("pozzorubio", true)){
                binding.imgPozzorubio.visibility = View.VISIBLE
                binding.imgPozzorubio.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("binalonan", true)){
                binding.imgBinalonan.visibility = View.VISIBLE
                binding.imgBinalonan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("manaoag", true)){
                binding.imgManaoag.visibility = View.VISIBLE
                binding.imgManaoag.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("laoac", true)){
                binding.imgLaoac.visibility = View.VISIBLE
                binding.imgLaoac.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("mapandan", true)){
                binding.imgMapandan.visibility = View.VISIBLE
                binding.imgMapandan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("urdanetacity", true)){
                binding.imgUrdanetaCity.visibility = View.VISIBLE
                binding.imgUrdanetaCity.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanmanuel", true)){
                binding.imgSanManuel1.visibility = View.VISIBLE
                binding.imgSanManuel1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sannicolas", true)){
                binding.imgSanNicolas1.visibility = View.VISIBLE
                binding.imgSanNicolas1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("natividad", true)){
                binding.imgNatividad.visibility = View.VISIBLE
                binding.imgNatividad.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("tayug", true)){
                binding.imgTayug.visibility = View.VISIBLE
                binding.imgTayug.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sanquintin", true)){
                binding.imgSanQuintin1.visibility = View.VISIBLE
                binding.imgSanQuintin1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("umingan", true)){
                binding.imgUmingan.visibility = View.VISIBLE
                binding.imgUmingan.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("balungao", true)){
                binding.imgBalungao.visibility = View.VISIBLE
                binding.imgBalungao.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("rosales", true)){
                binding.imgRosales.visibility = View.VISIBLE
                binding.imgRosales.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("villasis", true)){
                binding.imgVillasis.visibility = View.VISIBLE
                binding.imgVillasis.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sto.tomas", true)){
                binding.imgSantoTomas2.visibility = View.VISIBLE
                binding.imgSantoTomas2.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("alcala", true)){
                binding.imgAlcala1.visibility = View.VISIBLE
                binding.imgAlcala1.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bautista", true)){
                binding.imgBautista.visibility = View.VISIBLE
                binding.imgBautista.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("bayambang", true)){
                binding.imgBayambang.visibility = View.VISIBLE
                binding.imgBayambang.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("urbiztondo", true)){
                binding.imgUrbiztondo.visibility = View.VISIBLE
                binding.imgUrbiztondo.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sancarloscity", true)){
                binding.imgSanCarlosCity.visibility = View.VISIBLE
                binding.imgSanCarlosCity.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("basista", true)){
                binding.imgBasista.visibility = View.VISIBLE
                binding.imgBasista.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("malasiqui", true)){
                binding.imgMalasiqui.visibility = View.VISIBLE
                binding.imgMalasiqui.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("aguilar", true)){
                binding.imgAguilar.visibility = View.VISIBLE
                binding.imgAguilar.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("mangatarem", true)){
                binding.imgMangatarem.visibility = View.VISIBLE
                binding.imgMangatarem.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("sta.maria", true)){
                binding.imgSantaMaria2.visibility = View.VISIBLE
                binding.imgSantaMaria2.setImageResource(R.drawable.cloudrain)
            }
            if (modRainList.contains("asingan", true)){
                binding.imgAsingan.visibility = View.VISIBLE
                binding.imgAsingan.setImageResource(R.drawable.cloudrain)
            }

        }

        if (lgtRainList != null){
            if (lgtRainList.contains("bolinao", true)){
                binding.imgBolinao.visibility = View.VISIBLE
                binding.imgBolinao.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("anda", true)){
                binding.imgAnda.visibility = View.VISIBLE
                binding.imgAnda.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bani", true)){
                binding.imgBani.visibility = View.VISIBLE
                binding.imgBani.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("agno", true)){
                binding.imgAgno.visibility = View.VISIBLE
                binding.imgAgno.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("burgos", true)){
                binding.imgBurgos4.visibility = View.VISIBLE
                binding.imgBurgos4.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("alaminoscity", true)){
                binding.imgAlaminosCity.visibility = View.VISIBLE
                binding.imgAlaminosCity.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sual", true)){
                binding.imgSual.visibility = View.VISIBLE
                binding.imgSual.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("mabini", true)){
                binding.imgMabini.visibility = View.VISIBLE
                binding.imgMabini.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("dasol", true)){
                binding.imgDasol.visibility = View.VISIBLE
                binding.imgDasol.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("infanta", true)){
                binding.imgInfanta.visibility = View.VISIBLE
                binding.imgInfanta.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bugallon", true)){
                binding.imgBugallon.visibility = View.VISIBLE
                binding.imgBugallon.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("labrador", true)){
                binding.imgLabrador.visibility = View.VISIBLE
                binding.imgLabrador.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("lingayen", true)){
                binding.imgLingayen.visibility = View.VISIBLE
                binding.imgLingayen.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("binmaley", true)){
                binding.imgBinmaley.visibility = View.VISIBLE
                binding.imgBinmaley.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("dagupancity", true)){
                binding.imgDagupanCity.visibility = View.VISIBLE
                binding.imgDagupanCity.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("calasiao", true)){
                binding.imgCalasiao.visibility = View.VISIBLE
                binding.imgCalasiao.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sta.barbara", true)){
                binding.imgSantaBarbara.visibility = View.VISIBLE
                binding.imgSantaBarbara.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("mangaldan", true)){
                binding.imgMangaldan.visibility = View.VISIBLE
                binding.imgMangaldan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanfabian", true)){
                binding.imgSanFabian.visibility = View.VISIBLE
                binding.imgSanFabian.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sison", true)){
                binding.imgSison.visibility = View.VISIBLE
                binding.imgSison.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("pozzorubio", true)){
                binding.imgPozzorubio.visibility = View.VISIBLE
                binding.imgPozzorubio.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("binalonan", true)){
                binding.imgBinalonan.visibility = View.VISIBLE
                binding.imgBinalonan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("manaoag", true)){
                binding.imgManaoag.visibility = View.VISIBLE
                binding.imgManaoag.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("laoac", true)){
                binding.imgLaoac.visibility = View.VISIBLE
                binding.imgLaoac.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("mapandan", true)){
                binding.imgMapandan.visibility = View.VISIBLE
                binding.imgMapandan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("urdanetacity", true)){
                binding.imgUrdanetaCity.visibility = View.VISIBLE
                binding.imgUrdanetaCity.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanmanuel", true)){
                binding.imgSanManuel1.visibility = View.VISIBLE
                binding.imgSanManuel1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sannicolas", true)){
                binding.imgSanNicolas1.visibility = View.VISIBLE
                binding.imgSanNicolas1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("natividad", true)){
                binding.imgNatividad.visibility = View.VISIBLE
                binding.imgNatividad.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("tayug", true)){
                binding.imgTayug.visibility = View.VISIBLE
                binding.imgTayug.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sanquintin", true)){
                binding.imgSanQuintin1.visibility = View.VISIBLE
                binding.imgSanQuintin1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("umingan", true)){
                binding.imgUmingan.visibility = View.VISIBLE
                binding.imgUmingan.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("balungao", true)){
                binding.imgBalungao.visibility = View.VISIBLE
                binding.imgBalungao.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("rosales", true)){
                binding.imgRosales.visibility = View.VISIBLE
                binding.imgRosales.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("villasis", true)){
                binding.imgVillasis.visibility = View.VISIBLE
                binding.imgVillasis.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sto.tomas", true)){
                binding.imgSantoTomas2.visibility = View.VISIBLE
                binding.imgSantoTomas2.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("alcala", true)){
                binding.imgAlcala1.visibility = View.VISIBLE
                binding.imgAlcala1.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bautista", true)){
                binding.imgBautista.visibility = View.VISIBLE
                binding.imgBautista.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("bayambang", true)){
                binding.imgBayambang.visibility = View.VISIBLE
                binding.imgBayambang.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("urbiztondo", true)){
                binding.imgUrbiztondo.visibility = View.VISIBLE
                binding.imgUrbiztondo.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sancarloscity", true)){
                binding.imgSanCarlosCity.visibility = View.VISIBLE
                binding.imgSanCarlosCity.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("basista", true)){
                binding.imgBasista.visibility = View.VISIBLE
                binding.imgBasista.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("malasiqui", true)){
                binding.imgMalasiqui.visibility = View.VISIBLE
                binding.imgMalasiqui.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("aguilar", true)){
                binding.imgAguilar.visibility = View.VISIBLE
                binding.imgAguilar.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("mangatarem", true)){
                binding.imgMangatarem.visibility = View.VISIBLE
                binding.imgMangatarem.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("sta.maria", true)){
                binding.imgSantaMaria2.visibility = View.VISIBLE
                binding.imgSantaMaria2.setImageResource(R.drawable.sunrain)
            }
            if (lgtRainList.contains("asingan", true)){
                binding.imgAsingan.visibility = View.VISIBLE
                binding.imgAsingan.setImageResource(R.drawable.sunrain)
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
                "bolinao" -> {
                    if (isChecked){
                        binding.imgBolinao.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBolinao.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBolinao.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBolinao.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBolinao.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBolinao.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBolinao.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBolinao.visibility = View.INVISIBLE
                    }
                }

                "anda" -> {
                    if (isChecked){
                        binding.imgAnda.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAnda.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAnda.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAnda.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAnda.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAnda.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAnda.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAnda.visibility = View.INVISIBLE
                    }
                }

                "bani" -> {
                    if (isChecked){
                        binding.imgBani.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBani.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBani.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBani.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBani.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBani.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBani.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBani.visibility = View.INVISIBLE
                    }
                }

                "agno" -> {
                    if (isChecked){
                        binding.imgAgno.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAgno.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAgno.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAgno.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAgno.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAgno.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAgno.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAgno.visibility = View.INVISIBLE
                    }
                }

                "burgos" -> {
                    if (isChecked){
                        binding.imgBurgos4.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBurgos4.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBurgos4.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBurgos4.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBurgos4.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBurgos4.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBurgos4.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBurgos4.visibility = View.INVISIBLE
                    }
                }

                "alaminoscity" -> {
                    if (isChecked){
                        binding.imgAlaminosCity.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAlaminosCity.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAlaminosCity.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAlaminosCity.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAlaminosCity.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAlaminosCity.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAlaminosCity.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAlaminosCity.visibility = View.INVISIBLE
                    }
                }

                "sual" -> {
                    if (isChecked){
                        binding.imgSual.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSual.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSual.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSual.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSual.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSual.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSual.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSual.visibility = View.INVISIBLE
                    }
                }

                "mabini" -> {
                    if (isChecked){
                        binding.imgMabini.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMabini.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMabini.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMabini.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMabini.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMabini.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMabini.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMabini.visibility = View.INVISIBLE
                    }
                }

                "dasol" -> {
                    if (isChecked){
                        binding.imgDasol.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDasol.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDasol.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDasol.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDasol.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDasol.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDasol.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDasol.visibility = View.INVISIBLE
                    }
                }

                "infanta" -> {
                    if (isChecked){
                        binding.imgInfanta.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgInfanta.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgInfanta.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgInfanta.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgInfanta.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgInfanta.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgInfanta.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgInfanta.visibility = View.INVISIBLE
                    }
                }

                "bugallon" -> {
                    if (isChecked){
                        binding.imgBugallon.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBugallon.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBugallon.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBugallon.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBugallon.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBugallon.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBugallon.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBugallon.visibility = View.INVISIBLE
                    }
                }

                "labrador" -> {
                    if (isChecked){
                        binding.imgLabrador.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLabrador.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLabrador.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLabrador.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLabrador.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLabrador.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLabrador.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLabrador.visibility = View.INVISIBLE
                    }
                }

                "lingayen" -> {
                    if (isChecked){
                        binding.imgLingayen.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLingayen.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLingayen.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLingayen.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLingayen.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLingayen.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLingayen.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLingayen.visibility = View.INVISIBLE
                    }
                }



                "binmaley" -> {
                    if (isChecked){
                        binding.imgBinmaley.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBinmaley.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBinmaley.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBinmaley.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBinmaley.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBinmaley.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBinmaley.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBinmaley.visibility = View.INVISIBLE
                    }
                }

                "dagupancity" -> {
                    if (isChecked){
                        binding.imgDagupanCity.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgDagupanCity.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgDagupanCity.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgDagupanCity.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgDagupanCity.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgDagupanCity.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgDagupanCity.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgDagupanCity.visibility = View.INVISIBLE
                    }
                }

                "calasiao" -> {
                    if (isChecked){
                        binding.imgCalasiao.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgCalasiao.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgCalasiao.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgCalasiao.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgCalasiao.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgCalasiao.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgCalasiao.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgCalasiao.visibility = View.INVISIBLE
                    }
                }

                "sta.barbara" -> {
                    if (isChecked){
                        binding.imgSantaBarbara.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantaBarbara.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantaBarbara.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantaBarbara.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantaBarbara.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantaBarbara.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantaBarbara.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantaBarbara.visibility = View.INVISIBLE
                    }
                }

                "mangaldan" -> {
                    if (isChecked){
                        binding.imgMangaldan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMangaldan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMangaldan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMangaldan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMangaldan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMangaldan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMangaldan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMangaldan.visibility = View.INVISIBLE
                    }
                }

                "sanfabian" -> {
                    if (isChecked){
                        binding.imgSanFabian.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanFabian.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanFabian.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanFabian.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanFabian.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanFabian.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanFabian.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanFabian.visibility = View.INVISIBLE
                    }
                }

                "sison" -> {
                    if (isChecked){
                        binding.imgSison.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSison.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSison.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSison.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSison.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSison.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSison.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSison.visibility = View.INVISIBLE
                    }
                }

                "pozzorubio" -> {
                    if (isChecked){
                        binding.imgPozzorubio.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgPozzorubio.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgPozzorubio.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgPozzorubio.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgPozzorubio.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgPozzorubio.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgPozzorubio.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgPozzorubio.visibility = View.INVISIBLE
                    }
                }

                "binalonan" -> {
                    if (isChecked){
                        binding.imgBinalonan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBinalonan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBinalonan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBinalonan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBinalonan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBinalonan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBinalonan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBinalonan.visibility = View.INVISIBLE
                    }
                }

                "manaoag" -> {
                    if (isChecked){
                        binding.imgManaoag.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgManaoag.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgManaoag.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgManaoag.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgManaoag.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgManaoag.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgManaoag.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgManaoag.visibility = View.INVISIBLE
                    }
                }

                "laoac" -> {
                    if (isChecked){
                        binding.imgLaoac.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgLaoac.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgLaoac.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgLaoac.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgLaoac.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgLaoac.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgLaoac.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgLaoac.visibility = View.INVISIBLE
                    }
                }

                "mapandan" -> {
                    if (isChecked){
                        binding.imgMapandan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMapandan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMapandan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMapandan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMapandan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMapandan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMapandan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMapandan.visibility = View.INVISIBLE
                    }
                }


                "urdanetacity" -> {
                    if (isChecked){
                        binding.imgUrdanetaCity.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgUrdanetaCity.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgUrdanetaCity.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgUrdanetaCity.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgUrdanetaCity.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgUrdanetaCity.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgUrdanetaCity.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgUrdanetaCity.visibility = View.INVISIBLE
                    }
                }

                "sanmanuel" -> {
                    if (isChecked){
                        binding.imgSanManuel1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanManuel1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanManuel1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanManuel1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanManuel1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanManuel1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanManuel1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanManuel1.visibility = View.INVISIBLE
                    }
                }

                "sannicolas" -> {
                    if (isChecked){
                        binding.imgSanNicolas1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanNicolas1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanNicolas1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanNicolas1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanNicolas1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanNicolas1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanNicolas1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanNicolas1.visibility = View.INVISIBLE
                    }
                }

                "natividad" -> {
                    if (isChecked){
                        binding.imgNatividad.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgNatividad.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgNatividad.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgNatividad.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgNatividad.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgNatividad.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgNatividad.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgNatividad.visibility = View.INVISIBLE
                    }
                }

                "tayug" -> {
                    if (isChecked){
                        binding.imgTayug.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgTayug.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgTayug.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgTayug.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgTayug.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgTayug.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgTayug.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgTayug.visibility = View.INVISIBLE
                    }
                }

                "sanquintin" -> {
                    if (isChecked){
                        binding.imgSanQuintin1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanQuintin1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanQuintin1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanQuintin1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanQuintin1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanQuintin1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanQuintin1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanQuintin1.visibility = View.INVISIBLE
                    }
                }

                "umingan" -> {
                    if (isChecked){
                        binding.imgUmingan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgUmingan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgUmingan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgUmingan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgUmingan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgUmingan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgUmingan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgUmingan.visibility = View.INVISIBLE
                    }
                }

                "balungao" -> {
                    if (isChecked){
                        binding.imgBalungao.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBalungao.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBalungao.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBalungao.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBalungao.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBalungao.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBalungao.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBalungao.visibility = View.INVISIBLE
                    }
                }

                "rosales" -> {
                    if (isChecked){
                        binding.imgRosales.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgRosales.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgRosales.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgRosales.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgRosales.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgRosales.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgRosales.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgRosales.visibility = View.INVISIBLE
                    }
                }

                "villasis" -> {
                    if (isChecked){
                        binding.imgVillasis.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgVillasis.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgVillasis.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgVillasis.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgVillasis.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgVillasis.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgVillasis.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgVillasis.visibility = View.INVISIBLE
                    }
                }

                "sto.tomas" -> {
                    if (isChecked){
                        binding.imgSantoTomas2.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantoTomas2.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantoTomas2.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantoTomas2.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantoTomas2.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantoTomas2.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantoTomas2.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantoTomas2.visibility = View.INVISIBLE
                    }
                }

                "alcala" -> {
                    if (isChecked){
                        binding.imgAlcala1.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAlcala1.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAlcala1.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAlcala1.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAlcala1.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAlcala1.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAlcala1.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAlcala1.visibility = View.INVISIBLE
                    }
                }

                "bautista" -> {
                    if (isChecked){
                        binding.imgBautista.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBautista.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBautista.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBautista.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBautista.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBautista.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBautista.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBautista.visibility = View.INVISIBLE
                    }
                }

                "bayambang" -> {
                    if (isChecked){
                        binding.imgBayambang.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBayambang.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBayambang.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBayambang.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBayambang.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBayambang.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBayambang.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBayambang.visibility = View.INVISIBLE
                    }
                }

                "urbiztondo" -> {
                    if (isChecked){
                        binding.imgUrbiztondo.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgUrbiztondo.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgUrbiztondo.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgUrbiztondo.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgUrbiztondo.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgUrbiztondo.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgUrbiztondo.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgUrbiztondo.visibility = View.INVISIBLE
                    }
                }

                "sancarloscity" -> {
                    if (isChecked){
                        binding.imgSanCarlosCity.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSanCarlosCity.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSanCarlosCity.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSanCarlosCity.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSanCarlosCity.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSanCarlosCity.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSanCarlosCity.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSanCarlosCity.visibility = View.INVISIBLE
                    }
                }

                "basista" -> {
                    if (isChecked){
                        binding.imgBasista.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgBasista.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgBasista.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgBasista.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgBasista.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgBasista.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgBasista.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgBasista.visibility = View.INVISIBLE
                    }
                }

                "malasiqui" -> {
                    if (isChecked){
                        binding.imgMalasiqui.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMalasiqui.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMalasiqui.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMalasiqui.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMalasiqui.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMalasiqui.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMalasiqui.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMalasiqui.visibility = View.INVISIBLE
                    }
                }

                "aguilar" -> {
                    if (isChecked){
                        binding.imgAguilar.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAguilar.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAguilar.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAguilar.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAguilar.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAguilar.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAguilar.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAguilar.visibility = View.INVISIBLE
                    }
                }

                "mangatarem" -> {
                    if (isChecked){
                        binding.imgMangatarem.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgMangatarem.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgMangatarem.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgMangatarem.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgMangatarem.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgMangatarem.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgMangatarem.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgMangatarem.visibility = View.INVISIBLE
                    }
                }

                "sta.maria" -> {
                    if (isChecked){
                        binding.imgSantaMaria2.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgSantaMaria2.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgSantaMaria2.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgSantaMaria2.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgSantaMaria2.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgSantaMaria2.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgSantaMaria2.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgSantaMaria2.visibility = View.INVISIBLE
                    }
                }

                "asingan" -> {
                    if (isChecked){
                        binding.imgAsingan.visibility = View.VISIBLE
                        when (select) {
                            1 -> binding.imgAsingan.setImageResource(R.drawable.sunrain)
                            2 -> binding.imgAsingan.setImageResource(R.drawable.cloudrain)
                            3 -> binding.imgAsingan.setImageResource(R.drawable.cloudlightning)
                            4 -> binding.imgAsingan.setImageResource(R.drawable.rainlightning)
                            5 -> binding.imgAsingan.setImageResource(R.drawable.suncloud)
                            6 -> binding.imgAsingan.setImageResource(R.drawable.cloudy)
                        }
                    }
                    else{
                        binding.imgAsingan.visibility = View.INVISIBLE
                    }
                }

            }
        }

        binding.tgAgno.setOnCheckedChangeListener(listener)
        binding.tgAguilar.setOnCheckedChangeListener(listener)
        binding.tgAlaminosCity.setOnCheckedChangeListener(listener)
        binding.tgAlcala1.setOnCheckedChangeListener(listener)
        binding.tgAnda.setOnCheckedChangeListener(listener)
        binding.tgAsingan.setOnCheckedChangeListener(listener)
        binding.tgBalungao.setOnCheckedChangeListener(listener)
        binding.tgBani.setOnCheckedChangeListener(listener)
        binding.tgBasista.setOnCheckedChangeListener(listener)
        binding.tgBautista.setOnCheckedChangeListener(listener)
        binding.tgBayambang.setOnCheckedChangeListener(listener)
        binding.tgBinalonan.setOnCheckedChangeListener(listener)
        binding.tgBinmaley.setOnCheckedChangeListener(listener)
        binding.tgBolinao.setOnCheckedChangeListener(listener)
        binding.tgBugallon.setOnCheckedChangeListener(listener)
        binding.tgBurgos4.setOnCheckedChangeListener(listener)
        binding.tgCalasiao.setOnCheckedChangeListener(listener)
        binding.tgDagupanCity.setOnCheckedChangeListener(listener)
        binding.tgDasol.setOnCheckedChangeListener(listener)
        binding.tgInfanta.setOnCheckedChangeListener(listener)
        binding.tgLabrador.setOnCheckedChangeListener(listener)
        binding.tgLaoac.setOnCheckedChangeListener(listener)
        binding.tgLingayen.setOnCheckedChangeListener(listener)
        binding.tgMabini.setOnCheckedChangeListener(listener)
        binding.tgMalasiqui.setOnCheckedChangeListener(listener)
        binding.tgManaoag.setOnCheckedChangeListener(listener)
        binding.tgMangaldan.setOnCheckedChangeListener(listener)
        binding.tgMangatarem.setOnCheckedChangeListener(listener)
        binding.tgMapandan.setOnCheckedChangeListener(listener)
        binding.tgNatividad.setOnCheckedChangeListener(listener)
        binding.tgPozzorubio.setOnCheckedChangeListener(listener)
        binding.tgRosales.setOnCheckedChangeListener(listener)
        binding.tgSanCarlosCity.setOnCheckedChangeListener(listener)
        binding.tgSanFabian.setOnCheckedChangeListener(listener)
        binding.tgSanManuel1.setOnCheckedChangeListener(listener)
        binding.tgSanNicolas1.setOnCheckedChangeListener(listener)
        binding.tgSanQuintin1.setOnCheckedChangeListener(listener)
        binding.tgSantaBarbara.setOnCheckedChangeListener(listener)
        binding.tgSantaMaria2.setOnCheckedChangeListener(listener)
        binding.tgSantoTomas2.setOnCheckedChangeListener(listener)
        binding.tgSison.setOnCheckedChangeListener(listener)
        binding.tgSual.setOnCheckedChangeListener(listener)
        binding.tgTayug.setOnCheckedChangeListener(listener)
        binding.tgUmingan.setOnCheckedChangeListener(listener)
        binding.tgUrbiztondo.setOnCheckedChangeListener(listener)
        binding.tgUrdanetaCity.setOnCheckedChangeListener(listener)
        binding.tgVillasis.setOnCheckedChangeListener(listener)

        binding.btnSave12.setOnClickListener {
            OpenFunctions.saveMediaToStorage(this, OpenFunctions.getBitMapFromView(binding.pangasinanLayout))
        }
    }
}