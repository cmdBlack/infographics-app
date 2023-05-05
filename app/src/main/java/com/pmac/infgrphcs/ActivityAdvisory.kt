package com.pmac.infgrphcs

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.pmac.infgrphcs.databinding.ActivityAdvisoryBinding

const val HEADER = "ADVISORY"
const val LIGHTNING_LIST = "LIGHTNING_LIST"
const val MOD_RAINS_LIST = "MOD_RAINS_LIST"
const val LGT_RAINS_LIST = "LGT_RAINS_LIST"

class ActivityAdvisory : AppCompatActivity() {
    private lateinit var binding: ActivityAdvisoryBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAdvisoryBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        var header = ""
        var norteLightning = ""
        var modRainsNorte = ""
        var lightRainsNorte = ""

        var abraLightning = ""
        var modRainsAbra1 = ""
        var lightRainsAbra1 = ""

        var apayaoLightning = ""
        var modRainsApayao1 = ""
        var lightRainsApayao1 = ""

        var quirinoLightning = ""
        var modRainsQuirino1 = ""
        var lightRainsQuirino1 = ""

        var nvizcayaLightning = ""
        var modRainsNVizcaya1 = ""
        var lightRainsNVizcaya1 = ""

        var benguetLightning = ""
        var modRainsBenguet1 = ""
        var lightRainsBenguet1 = ""

        var launionLightning = ""
        var modRainsLaunion1 = ""
        var lightRainsLaunion1 = ""

        var mProvinceLightning = ""
        var modRainsmProvince1 = ""
        var lightRainsmProvince1 = ""

        var isabelaLightning = ""
        var modRainsIsabela1 = ""
        var lightRainsIsabela1 = ""

        var surLightning = ""
        var modRainsSur1 = ""
        var lightRainsSur1 = ""

        var auroraLightning = ""
        var modRainsAurora1 = ""
        var lightRainsAurora1 = ""

        var kalingaLightning = ""
        var modRainsKalinga1 = ""
        var lightRainsKalinga1 = ""

        var ifugaoLightning = ""
        var modRainsIfugao1 = ""
        var lightRainsIfugao1 = ""

        var cagayanLightning = ""
        var modRainsCagayan1 = ""
        var lightRainsCagayan1 = ""

        var pangasinanLightning = ""
        var modRainsPangasinan1 = ""
        var lightRainsPangasinan1 = ""

        binding.tgInput1.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                binding.textInputLayoutA.visibility = View.VISIBLE
                binding.btnNorte.visibility = View.GONE
                binding.btnAbra.visibility = View.GONE
                binding.btnIfugao.visibility = View.GONE
                binding.btnApayao.visibility = View.GONE
                binding.btnPangasinan.visibility = View.GONE
                binding.btnSur.visibility = View.GONE
                binding.btnAurora.visibility = View.GONE
                binding.btnCagayan.visibility = View.GONE
                binding.btnQuirino.visibility = View.GONE
                binding.btnNVizcaya.visibility = View.GONE
                binding.btnIsabela.visibility = View.GONE
                binding.btnMProvince.visibility = View.GONE
                binding.btnKalinga.visibility = View.GONE
                binding.btnLaUnion.visibility = View.GONE
                binding.btnBenguet.visibility = View.GONE
                binding.tgInput1.visibility = View.GONE
                binding.btnNorte.setTextColor(Color.BLACK)
                binding.btnAbra.setTextColor(Color.BLACK)
                binding.btnApayao.setTextColor(Color.BLACK)
                binding.btnQuirino.setTextColor(Color.BLACK)
                binding.btnKalinga.setTextColor(Color.BLACK)
                binding.btnIsabela.setTextColor(Color.BLACK)
                binding.btnMProvince.setTextColor(Color.BLACK)
                binding.btnLaUnion.setTextColor(Color.BLACK)
                binding.btnBenguet.setTextColor(Color.BLACK)
                binding.btnNVizcaya.setTextColor(Color.BLACK)
                binding.btnCagayan.setTextColor(Color.BLACK)
                binding.btnSur.setTextColor(Color.BLACK)
                binding.btnIfugao.setTextColor(Color.BLACK)
                binding.btnPangasinan.setTextColor(Color.BLACK)
                binding.btnAurora.setTextColor(Color.BLACK)

            }
            else{
                binding.textInputLayoutA.visibility = View.GONE
                binding.btnNorte.visibility = View.VISIBLE
                binding.btnAbra.visibility = View.VISIBLE
                binding.btnCagayan.visibility = View.VISIBLE
                binding.btnQuirino.visibility = View.VISIBLE
                binding.btnAurora.visibility = View.VISIBLE
                binding.btnApayao.visibility = View.VISIBLE
                binding.btnSur.visibility = View.VISIBLE
                binding.btnIsabela.visibility = View.VISIBLE
                binding.btnMProvince.visibility = View.VISIBLE
                binding.btnLaUnion.visibility = View.VISIBLE
                binding.btnPangasinan.visibility = View.VISIBLE
                binding.btnIfugao.visibility = View.VISIBLE
                binding.btnBenguet.visibility = View.VISIBLE
                binding.btnNVizcaya.visibility = View.VISIBLE
                binding.tgInput1.visibility = View.VISIBLE
            }
        }

        binding.btnSend1.setOnClickListener {
            norteLightning = ""
            modRainsNorte = ""
            lightRainsNorte = ""
            abraLightning = ""
            modRainsAbra1 = ""
            lightRainsAbra1 = ""
            apayaoLightning = ""
            modRainsApayao1 = ""
            lightRainsApayao1 = ""
            quirinoLightning = ""
            modRainsQuirino1 = ""
            lightRainsQuirino1 = ""
            nvizcayaLightning = ""
            modRainsNVizcaya1 = ""
            lightRainsNVizcaya1 = ""
            benguetLightning = ""
            modRainsBenguet1 = ""
            lightRainsBenguet1 = ""
            launionLightning = ""
            modRainsLaunion1 = ""
            lightRainsLaunion1 = ""
            mProvinceLightning = ""
            modRainsmProvince1 = ""
            lightRainsmProvince1 = ""
            isabelaLightning = ""
            modRainsIsabela1 = ""
            lightRainsIsabela1 = ""
            surLightning = ""
            modRainsSur1 = ""
            lightRainsSur1 = ""
            auroraLightning = ""
            modRainsAurora1 = ""
            lightRainsAurora1 = ""
            kalingaLightning = ""
            modRainsKalinga1 = ""
            lightRainsKalinga1 = ""
            ifugaoLightning = ""
            modRainsIfugao1 = ""
            lightRainsIfugao1 = ""
            cagayanLightning = ""
            modRainsCagayan1 = ""
            lightRainsCagayan1 = ""
            pangasinanLightning = ""
            modRainsPangasinan1 = ""
            lightRainsPangasinan1 = ""

            if (binding.textInputAdvisory1.text!!.contains("#IlocosNorte")){
                binding.btnNorte.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#Abra")){
                binding.btnAbra.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#Apayao")){
                binding.btnApayao.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#Quirino")){
                binding.btnQuirino.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#NuevaVizcaya")){
                binding.btnNVizcaya.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#Benguet")){
                binding.btnBenguet.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#LaUnion")){
                binding.btnLaUnion.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#MountainProvince")){
                binding.btnMProvince.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#Isabela")){
                binding.btnIsabela.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#IlocosSur")){
                binding.btnSur.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#Aurora")){
                binding.btnAurora.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#Kalinga")){
                binding.btnKalinga.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#Ifugao")){
                binding.btnIfugao.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#Cagayan")){
                binding.btnCagayan.setTextColor(Color.RED)
            }
            if (binding.textInputAdvisory1.text!!.contains("#Pangasinan")){
                binding.btnPangasinan.setTextColor(Color.RED)
            }
            val separated: List<String> = binding.textInputAdvisory1.text!!.split("\n\n")
            header = separated[0]

            if (separated.size < 4){
                Toast.makeText(this, "Please arrange advisory, must have at least 4 paragraphs", Toast.LENGTH_SHORT).show()
            }
            else {
                if (binding.textInputAdvisory1.text!!.contains("Advisory")) {
                    binding.btnAbra.visibility = View.VISIBLE
                    binding.btnNorte.visibility = View.VISIBLE
                    binding.btnApayao.visibility = View.VISIBLE
                    binding.btnCagayan.visibility = View.VISIBLE
                    binding.btnQuirino.visibility = View.VISIBLE
                    binding.btnPangasinan.visibility = View.VISIBLE
                    binding.btnIfugao.visibility = View.VISIBLE
                    binding.btnLaUnion.visibility = View.VISIBLE
                    binding.btnKalinga.visibility = View.VISIBLE
                    binding.btnIsabela.visibility = View.VISIBLE
                    binding.btnAurora.visibility = View.VISIBLE
                    binding.btnMProvince.visibility = View.VISIBLE
                    binding.btnNVizcaya.visibility = View.VISIBLE
                    binding.btnSur.visibility = View.VISIBLE
                    binding.btnBenguet.visibility = View.VISIBLE
                    binding.tgInput1.visibility = View.VISIBLE
                    binding.tgInput1.isChecked = false
                    binding.textInputLayoutA.visibility = View.GONE
                    if (separated[1].contains(
                            "#IlocosNorte",
                            true
                        ) || separated[2].contains("#IlocosNorte", true)
                        || separated[3].contains("#IlocosNorte", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                norteLightning =
                                    separated[1].substringAfter("#IlocosNorte(")
                                        .substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsNorte =
                                    separated[1].substringAfter("#IlocosNorte(")
                                        .substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsNorte =
                                    separated[1].substringAfter("#IlocosNorte(")
                                        .substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsNorte =
                                    separated[2].substringAfter("#IlocosNorte(")
                                        .substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsNorte =
                                    separated[2].substringAfter("#IlocosNorte(")
                                        .substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsNorte =
                                    separated[3].substringAfter("#IlocosNorte(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsNorte =
                                    separated[3].substringAfter("#IlocosNorte(").substringBefore(")")
                            }

                        }
                    }

                    if (separated[1].contains("#Abra", true) || separated[2].contains("#Abra", true)
                        || separated[3].contains("#Abra", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                abraLightning =
                                    separated[1].substringAfter("#Abra(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsAbra1 =
                                    separated[1].substringAfter("#Abra(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsAbra1 =
                                    separated[1].substringAfter("#Abra(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsAbra1 =
                                    separated[2].substringAfter("#Abra(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsAbra1 =
                                    separated[2].substringAfter("#Abra(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsAbra1 =
                                    separated[3].substringAfter("#Abra(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsAbra1 =
                                    separated[3].substringAfter("#Abra(").substringBefore(")")
                            }

                        }
                    }


                    if (separated[1].contains("#Apayao", true) || separated[2].contains("#Apayao", true)
                        || separated[3].contains("#Apayao", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                apayaoLightning =
                                    separated[1].substringAfter("#Apayao(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsApayao1 =
                                    separated[1].substringAfter("#Apayao(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsApayao1 =
                                    separated[1].substringAfter("#Apayao(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsApayao1 =
                                    separated[2].substringAfter("#Apayao(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsApayao1 =
                                    separated[2].substringAfter("#Apayao(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsApayao1 =
                                    separated[3].substringAfter("#Apayao(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsApayao1 =
                                    separated[3].substringAfter("#Apayao(").substringBefore(")")
                            }

                        }
                    }

                    if (separated[1].contains("#Quirino", true) || separated[2].contains("#Quirino", true)
                        || separated[3].contains("#Quirino", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                quirinoLightning =
                                    separated[1].substringAfter("#Quirino(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsQuirino1 =
                                    separated[1].substringAfter("#Quirino(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsQuirino1 =
                                    separated[1].substringAfter("#Quirino(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsQuirino1 =
                                    separated[2].substringAfter("#Quirino(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsQuirino1 =
                                    separated[2].substringAfter("#Quirino(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsQuirino1 =
                                    separated[3].substringAfter("#Quirino(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsQuirino1 =
                                    separated[3].substringAfter("#Quirino(").substringBefore(")")
                            }

                        }
                    }

                    if (separated[1].contains("#NuevaVizcaya", true) || separated[2].contains("#NuevaVizcaya", true)
                        || separated[3].contains("#NuevaVizcaya", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                nvizcayaLightning =
                                    separated[1].substringAfter("#NuevaVizcaya(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsNVizcaya1 =
                                    separated[1].substringAfter("#NuevaVizcaya(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsNVizcaya1 =
                                    separated[1].substringAfter("#NuevaVizcaya(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsNVizcaya1 =
                                    separated[2].substringAfter("#NuevaVizcaya(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsNVizcaya1 =
                                    separated[2].substringAfter("#NuevaVizcaya(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsNVizcaya1 =
                                    separated[3].substringAfter("#NuevaVizcaya(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsNVizcaya1 =
                                    separated[3].substringAfter("#NuevaVizcaya(").substringBefore(")")
                            }

                        }
                    }

                    if (separated[1].contains("#Benguet", true) || separated[2].contains("#Benguet", true)
                        || separated[3].contains("#Benguet", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                benguetLightning =
                                    separated[1].substringAfter("#Benguet(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsBenguet1 =
                                    separated[1].substringAfter("#Benguet(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsBenguet1 =
                                    separated[1].substringAfter("#Benguet(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsBenguet1 =
                                    separated[2].substringAfter("#Benguet(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsBenguet1 =
                                    separated[2].substringAfter("#Benguet(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsBenguet1 =
                                    separated[3].substringAfter("#Benguet(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsBenguet1 =
                                    separated[3].substringAfter("#Benguet(").substringBefore(")")
                            }

                        }
                    }

                    if (separated[1].contains("#LaUnion", true) || separated[2].contains("#LaUnion", true)
                        || separated[3].contains("#LaUnion", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                launionLightning =
                                    separated[1].substringAfter("#LaUnion(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsLaunion1 =
                                    separated[1].substringAfter("#LaUnion(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsLaunion1 =
                                    separated[1].substringAfter("#LaUnion(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsLaunion1 =
                                    separated[2].substringAfter("#LaUnion(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsLaunion1 =
                                    separated[2].substringAfter("#LaUnion(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsLaunion1 =
                                    separated[3].substringAfter("#LaUnion(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsLaunion1 =
                                    separated[3].substringAfter("#LaUnion(").substringBefore(")")
                            }

                        }
                    }

                    if (separated[1].contains("#MountainProvince", true) || separated[2].contains("#MountainProvince", true)
                        || separated[3].contains("#MountainProvince", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                mProvinceLightning =
                                    separated[1].substringAfter("#MountainProvince(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsmProvince1 =
                                    separated[1].substringAfter("#MountainProvince(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsmProvince1 =
                                    separated[1].substringAfter("#MountainProvince(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsmProvince1 =
                                    separated[2].substringAfter("#MountainProvince(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsmProvince1 =
                                    separated[2].substringAfter("#MountainProvince(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsmProvince1 =
                                    separated[3].substringAfter("#MountainProvince(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsmProvince1 =
                                    separated[3].substringAfter("#MountainProvince(").substringBefore(")")
                            }

                        }
                    }


                    if (separated[1].contains("#Isabela", true) || separated[2].contains("#Isabela", true)
                        || separated[3].contains("#Isabela", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                isabelaLightning =
                                    separated[1].substringAfter("#Isabela(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsIsabela1 =
                                    separated[1].substringAfter("#Isabela(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsIsabela1 =
                                    separated[1].substringAfter("#Isabela(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsIsabela1 =
                                    separated[2].substringAfter("#Isabela(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsIsabela1 =
                                    separated[2].substringAfter("#Isabela(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsIsabela1 =
                                    separated[3].substringAfter("#Isabela(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsIsabela1 =
                                    separated[3].substringAfter("#Isabela(").substringBefore(")")
                            }

                        }
                    }

                    if (separated[1].contains("#IlocosSur", true) || separated[2].contains("#IlocosSur", true)
                        || separated[3].contains("#IlocosSur", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                surLightning =
                                    separated[1].substringAfter("#IlocosSur(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsSur1 =
                                    separated[1].substringAfter("#IlocosSur(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsSur1 =
                                    separated[1].substringAfter("#IlocosSur(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsSur1 =
                                    separated[2].substringAfter("#IlocosSur(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsSur1 =
                                    separated[2].substringAfter("#IlocosSur(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsSur1 =
                                    separated[3].substringAfter("#IlocosSur(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsSur1 =
                                    separated[3].substringAfter("#IlocosSur(").substringBefore(")")
                            }

                        }
                    }


                    if (separated[1].contains("#Aurora", true) || separated[2].contains("#Aurora", true)
                        || separated[3].contains("#Aurora", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                auroraLightning =
                                    separated[1].substringAfter("#Aurora(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsAurora1 =
                                    separated[1].substringAfter("#Aurora(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsAurora1 =
                                    separated[1].substringAfter("#Aurora(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsAurora1 =
                                    separated[2].substringAfter("#Aurora(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsAurora1 =
                                    separated[2].substringAfter("#Aurora(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsAurora1 =
                                    separated[3].substringAfter("#Aurora(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsAurora1 =
                                    separated[3].substringAfter("#Aurora(").substringBefore(")")
                            }

                        }
                    }

                    if (separated[1].contains("#Kalinga", true) || separated[2].contains("#Kalinga", true)
                        || separated[3].contains("#Kalinga", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                kalingaLightning =
                                    separated[1].substringAfter("#Kalinga(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsKalinga1 =
                                    separated[1].substringAfter("#Kalinga(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsKalinga1 =
                                    separated[1].substringAfter("#Kalinga(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsKalinga1 =
                                    separated[2].substringAfter("#Kalinga(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsKalinga1 =
                                    separated[2].substringAfter("#Kalinga(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsKalinga1 =
                                    separated[3].substringAfter("#Kalinga(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsKalinga1 =
                                    separated[3].substringAfter("#Kalinga(").substringBefore(")")
                            }

                        }
                    }

                    if (separated[1].contains("#Ifugao", true) || separated[2].contains("#Ifugao", true)
                        || separated[3].contains("#Ifugao", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                ifugaoLightning =
                                    separated[1].substringAfter("#Ifugao(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsIfugao1 =
                                    separated[1].substringAfter("#Ifugao(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsIfugao1 =
                                    separated[1].substringAfter("#Ifugao(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsIfugao1 =
                                    separated[2].substringAfter("#Ifugao(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsIfugao1 =
                                    separated[2].substringAfter("#Ifugao(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsIfugao1 =
                                    separated[3].substringAfter("#Ifugao(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsIfugao1 =
                                    separated[3].substringAfter("#Ifugao(").substringBefore(")")
                            }

                        }
                    }


                    if (separated[1].contains("#Cagayan", true) || separated[2].contains("#Cagayan", true)
                        || separated[3].contains("#Cagayan", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                cagayanLightning =
                                    separated[1].substringAfter("#Cagayan(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsCagayan1 =
                                    separated[1].substringAfter("#Cagayan(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsCagayan1 =
                                    separated[1].substringAfter("#Cagayan(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsCagayan1 =
                                    separated[2].substringAfter("#Cagayan(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsCagayan1 =
                                    separated[2].substringAfter("#Cagayan(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsCagayan1 =
                                    separated[3].substringAfter("#Cagayan(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsCagayan1 =
                                    separated[3].substringAfter("#Cagayan(").substringBefore(")")
                            }

                        }
                    }

                    if (separated[1].contains("#Pangasinan", true) || separated[2].contains("#Pangasinan", true)
                        || separated[3].contains("#Pangasinan", true)
                    ) {
                        when {
                            separated[1].contains("lightning", true) -> {
                                pangasinanLightning =
                                    separated[1].substringAfter("#Pangasinan(").substringBefore(")")
                            }
                            separated[1].contains("light to", true) -> {
                                lightRainsPangasinan1 =
                                    separated[1].substringAfter("#Pangasinan(").substringBefore(")")

                            }
                            separated[1].contains("moderate", true) -> {
                                modRainsPangasinan1 =
                                    separated[1].substringAfter("#Pangasinan(").substringBefore(")")
                            }

                        }

                        when {
                            separated[2].contains("light to", true) -> {
                                lightRainsPangasinan1 =
                                    separated[2].substringAfter("#Pangasinan(").substringBefore(")")

                            }
                            separated[2].contains("moderate", true) -> {
                                modRainsPangasinan1 =
                                    separated[2].substringAfter("#Pangasinan(").substringBefore(")")
                            }

                        }

                        when {
                            separated[3].contains("light to", true) -> {
                                lightRainsPangasinan1 =
                                    separated[3].substringAfter("#Pangasinan(").substringBefore(")")

                            }
                            separated[3].contains("moderate", true) -> {
                                modRainsPangasinan1 =
                                    separated[3].substringAfter("#Pangasinan(").substringBefore(")")
                            }

                        }
                    }

                }
                else Toast.makeText(this, "Please Input Weather Advisory", Toast.LENGTH_SHORT).show()
            }

        }

        binding.btnClear1.setOnClickListener {
            binding.textInputAdvisory1.text?.clear()
        }

        val listener = View.OnClickListener { v ->
            val a = v as Button
            when(a.text){
                "ABRA" -> {
                    val abraActivity = Intent(applicationContext, ActivityAbra::class.java)
                    abraActivity.putExtra(HEADER, header)
                    abraActivity.putExtra(LIGHTNING_LIST, abraLightning)
                    abraActivity.putExtra(MOD_RAINS_LIST, modRainsAbra1)
                    abraActivity.putExtra(LGT_RAINS_LIST, lightRainsAbra1)
                    startActivity(abraActivity)
                }
                "I. NORTE" -> {
                    val norteActivity = Intent(applicationContext, ActivityNorte::class.java)
                    norteActivity.putExtra(HEADER, header)
                    norteActivity.putExtra(LIGHTNING_LIST, norteLightning)
                    norteActivity.putExtra(MOD_RAINS_LIST, modRainsNorte)
                    norteActivity.putExtra(LGT_RAINS_LIST, lightRainsNorte)
                    startActivity(norteActivity)
                }

                "APAYAO" -> {
                    val apayaoActivity = Intent(applicationContext, ActivityApayao::class.java)
                    apayaoActivity.putExtra(HEADER, header)
                    apayaoActivity.putExtra(LIGHTNING_LIST, apayaoLightning)
                    apayaoActivity.putExtra(MOD_RAINS_LIST, modRainsApayao1)
                    apayaoActivity.putExtra(LGT_RAINS_LIST, lightRainsApayao1)
                    startActivity(apayaoActivity)
                }

                "QUIRINO" -> {
                    val quirinoActivity = Intent(applicationContext, ActivityQuirino::class.java)
                    quirinoActivity.putExtra(HEADER, header)
                    quirinoActivity.putExtra(LIGHTNING_LIST, quirinoLightning)
                    quirinoActivity.putExtra(MOD_RAINS_LIST, modRainsQuirino1)
                    quirinoActivity.putExtra(LGT_RAINS_LIST, lightRainsQuirino1)
                    startActivity(quirinoActivity)
                }

                "N. VIZCAYA" -> {
                    val nvizcayaActivity = Intent(applicationContext, ActivityNVizcaya::class.java)
                    nvizcayaActivity.putExtra(HEADER, header)
                    nvizcayaActivity.putExtra(LIGHTNING_LIST, nvizcayaLightning)
                    nvizcayaActivity.putExtra(MOD_RAINS_LIST, modRainsNVizcaya1)
                    nvizcayaActivity.putExtra(LGT_RAINS_LIST, lightRainsNVizcaya1)
                    startActivity(nvizcayaActivity)
                }

                "BENGUET" -> {
                    val benguetActivity = Intent(applicationContext, ActivityBenguet::class.java)
                    benguetActivity.putExtra(HEADER, header)
                    benguetActivity.putExtra(LIGHTNING_LIST, benguetLightning)
                    benguetActivity.putExtra(MOD_RAINS_LIST, modRainsBenguet1)
                    benguetActivity.putExtra(LGT_RAINS_LIST, lightRainsBenguet1)
                    startActivity(benguetActivity)
                }

                "LA UNION" -> {
                    val laUnionActivity = Intent(applicationContext, ActivityLaunion::class.java)
                    laUnionActivity.putExtra(HEADER, header)
                    laUnionActivity.putExtra(LIGHTNING_LIST, launionLightning)
                    laUnionActivity.putExtra(MOD_RAINS_LIST, modRainsLaunion1)
                    laUnionActivity.putExtra(LGT_RAINS_LIST, lightRainsLaunion1)
                    startActivity(laUnionActivity)
                }

                "M. PROVINCE" -> {
                    val mProvinceActivity = Intent(applicationContext, ActivityMProvince::class.java)
                    mProvinceActivity.putExtra(HEADER, header)
                    mProvinceActivity.putExtra(LIGHTNING_LIST, mProvinceLightning)
                    mProvinceActivity.putExtra(MOD_RAINS_LIST, modRainsmProvince1)
                    mProvinceActivity.putExtra(LGT_RAINS_LIST, lightRainsmProvince1)
                    startActivity(mProvinceActivity)
                }

                "ISABELA" -> {
                    val isabelaActivity = Intent(applicationContext, ActivityIsabela::class.java)
                    isabelaActivity.putExtra(HEADER, header)
                    isabelaActivity.putExtra(LIGHTNING_LIST, isabelaLightning)
                    isabelaActivity.putExtra(MOD_RAINS_LIST, modRainsIsabela1)
                    isabelaActivity.putExtra(LGT_RAINS_LIST, lightRainsIsabela1)
                    startActivity(isabelaActivity)
                }

                "I. SUR" -> {
                    val surActivity = Intent(applicationContext, ActivitySur::class.java)
                    surActivity.putExtra(HEADER, header)
                    surActivity.putExtra(LIGHTNING_LIST, surLightning)
                    surActivity.putExtra(MOD_RAINS_LIST, modRainsSur1)
                    surActivity.putExtra(LGT_RAINS_LIST, lightRainsSur1)
                    startActivity(surActivity)
                }

                "AURORA" -> {
                    val auroraActivity = Intent(applicationContext, ActivityAurora::class.java)
                    auroraActivity.putExtra(HEADER, header)
                    auroraActivity.putExtra(LIGHTNING_LIST, auroraLightning)
                    auroraActivity.putExtra(MOD_RAINS_LIST, modRainsAurora1)
                    auroraActivity.putExtra(LGT_RAINS_LIST, lightRainsAurora1)
                    startActivity(auroraActivity)
                }

                "KALINGA" -> {
                    val kalingaActivity = Intent(applicationContext, ActivityKalinga::class.java)
                    kalingaActivity.putExtra(HEADER, header)
                    kalingaActivity.putExtra(LIGHTNING_LIST, kalingaLightning)
                    kalingaActivity.putExtra(MOD_RAINS_LIST, modRainsKalinga1)
                    kalingaActivity.putExtra(LGT_RAINS_LIST, lightRainsKalinga1)
                    startActivity(kalingaActivity)
                }

                "IFUGAO" -> {
                    val ifugaoActivity = Intent(applicationContext, ActivityIfugao::class.java)
                    ifugaoActivity.putExtra(HEADER, header)
                    ifugaoActivity.putExtra(LIGHTNING_LIST, ifugaoLightning)
                    ifugaoActivity.putExtra(MOD_RAINS_LIST, modRainsIfugao1)
                    ifugaoActivity.putExtra(LGT_RAINS_LIST, lightRainsIfugao1)
                    startActivity(ifugaoActivity)
                }

                "CAGAYAN" -> {
                    val cagayanActivity = Intent(applicationContext, ActivityCagayan::class.java)
                    cagayanActivity.putExtra(HEADER, header)
                    cagayanActivity.putExtra(LIGHTNING_LIST, cagayanLightning)
                    cagayanActivity.putExtra(MOD_RAINS_LIST, modRainsCagayan1)
                    cagayanActivity.putExtra(LGT_RAINS_LIST, lightRainsCagayan1)
                    startActivity(cagayanActivity)
                }

                "PANGASINAN" -> {
                    val pangasinanActivity = Intent(applicationContext, ActivityPangasinan::class.java)
                    pangasinanActivity.putExtra(HEADER, header)
                    pangasinanActivity.putExtra(LIGHTNING_LIST, pangasinanLightning)
                    pangasinanActivity.putExtra(MOD_RAINS_LIST, modRainsPangasinan1)
                    pangasinanActivity.putExtra(LGT_RAINS_LIST, lightRainsPangasinan1)
                    startActivity(pangasinanActivity)
                }
            }

        }

        binding.btnAbra.setOnClickListener(listener)
        binding.btnNorte.setOnClickListener(listener)
        binding.btnApayao.setOnClickListener(listener)
        binding.btnQuirino.setOnClickListener(listener)
        binding.btnNVizcaya.setOnClickListener(listener)
        binding.btnBenguet.setOnClickListener(listener)
        binding.btnLaUnion.setOnClickListener(listener)
        binding.btnMProvince.setOnClickListener(listener)
        binding.btnIsabela.setOnClickListener(listener)
        binding.btnSur.setOnClickListener(listener)
        binding.btnAurora.setOnClickListener(listener)
        binding.btnKalinga.setOnClickListener(listener)
        binding.btnIfugao.setOnClickListener(listener)
        binding.btnCagayan.setOnClickListener(listener)
        binding.btnPangasinan.setOnClickListener(listener)

    }
}