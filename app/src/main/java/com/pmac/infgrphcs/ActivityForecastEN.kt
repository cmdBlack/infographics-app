package com.pmac.infgrphcs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.pmac.infgrphcs.databinding.ActivityForecastEnBinding

class ActivityForecastEN : AppCompatActivity() {
    private lateinit var binding: ActivityForecastEnBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityForecastEnBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.btnGenerate2.setOnClickListener {
            binding.textInputLayoutB.visibility = View.GONE
            binding.norteLayoutEN.visibility = View.VISIBLE
            binding.btnSaveEN.visibility = View.VISIBLE

            binding.imgPagudpudEN.visibility = View.VISIBLE
            binding.imgDumalnegEN.visibility = View.VISIBLE
            binding.imgAdamsEN.visibility = View.VISIBLE
            binding.imgBanguiEN.visibility = View.VISIBLE
            binding.imgBurgosEN.visibility = View.VISIBLE
            binding.imgPasuquinEN.visibility = View.VISIBLE
            binding.imgBacarraEN.visibility = View.VISIBLE
            binding.imgLaoagEN.visibility = View.VISIBLE
            binding.imgSanNicolasEN.visibility = View.VISIBLE
            binding.imgSarratEN.visibility = View.VISIBLE
            binding.imgDingrasEN.visibility = View.VISIBLE
            binding.imgMarcosEN.visibility = View.VISIBLE
            binding.imgNuevaEraEN.visibility = View.VISIBLE
            binding.imgBannaEN.visibility = View.VISIBLE
            binding.imgBatacEN.visibility = View.VISIBLE
            binding.imgCurrimaoEN.visibility = View.VISIBLE
            binding.imgPiniliEN.visibility = View.VISIBLE
            binding.imgBadocEN.visibility = View.VISIBLE
            binding.imgPaoayEN.visibility = View.VISIBLE
            binding.imgVintarEN.visibility = View.VISIBLE
            binding.imgCarasiEN.visibility = View.VISIBLE
            binding.imgPiddigEN.visibility = View.VISIBLE
            binding.imgSolsonaEN.visibility = View.VISIBLE
            binding.tVHeaderEN.visibility = View.VISIBLE
            binding.textViewEN.visibility = View.VISIBLE


            val separated: List<String> = binding.textInputForecast.text!!.split("\n\n")
            val separated1: List<String> = separated[0].split(".")
            val separated2: List<String> = separated[1].split(".")
            val separated3: List<String> = separated[2].split(".")

            when {
                separated1[0].contains("rain", true) -> {
                    binding.imgPagudpudEN.setImageResource(R.drawable.chance_rain)
                    binding.imgAdamsEN.setImageResource(R.drawable.chance_rain)
                    binding.imgBanguiEN.setImageResource(R.drawable.chance_rain)
                    binding.imgBurgosEN.setImageResource(R.drawable.chance_rain)
                    binding.imgDumalnegEN.setImageResource(R.drawable.chance_rain)
                }
                separated1[0].contains("mostly sunny", true) -> {
                    binding.imgPagudpudEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgAdamsEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgBanguiEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgBurgosEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgDumalnegEN.setImageResource(R.drawable.mostly_sunny)
                }
                separated1[0].contains("partly cloudy", true) -> {
                    binding.imgPagudpudEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgAdamsEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgBanguiEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgBurgosEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgDumalnegEN.setImageResource(R.drawable.partly_cloudy)
                }
                separated1[0].contains("mostly cloudy", true) -> {
                    binding.imgPagudpudEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgAdamsEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgBanguiEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgBurgosEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgDumalnegEN.setImageResource(R.drawable.mostly_cloudy)
                }
                separated1[0].contains("sunny", true) -> {
                    binding.imgPagudpudEN.setImageResource(R.drawable.sunny_en)
                    binding.imgAdamsEN.setImageResource(R.drawable.sunny_en)
                    binding.imgBanguiEN.setImageResource(R.drawable.sunny_en)
                    binding.imgBurgosEN.setImageResource(R.drawable.sunny_en)
                    binding.imgDumalnegEN.setImageResource(R.drawable.sunny_en)
                }
            }

            when {
                separated2[0].contains("rain", true) -> {
                    binding.imgLaoagEN.setImageResource(R.drawable.chance_rain)
                    binding.imgPasuquinEN.setImageResource(R.drawable.chance_rain)
                    binding.imgBacarraEN.setImageResource(R.drawable.chance_rain)
                    binding.imgSanNicolasEN.setImageResource(R.drawable.chance_rain)
                    binding.imgSarratEN.setImageResource(R.drawable.chance_rain)
                    binding.imgDingrasEN.setImageResource(R.drawable.chance_rain)
                    binding.imgPaoayEN.setImageResource(R.drawable.chance_rain)
                    binding.imgVintarEN.setImageResource(R.drawable.chance_rain)
                    binding.imgCarasiEN.setImageResource(R.drawable.chance_rain)
                    binding.imgPiddigEN.setImageResource(R.drawable.chance_rain)
                    binding.imgCurrimaoEN.setImageResource(R.drawable.chance_rain)
                    binding.imgBatacEN.setImageResource(R.drawable.chance_rain)
                    binding.imgMarcosEN.setImageResource(R.drawable.chance_rain)
                    binding.imgSolsonaEN.setImageResource(R.drawable.chance_rain)
                }
                separated2[0].contains("mostly sunny", true) -> {
                    binding.imgLaoagEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgPasuquinEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgBacarraEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgSanNicolasEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgSarratEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgDingrasEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgPaoayEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgVintarEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgCarasiEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgPiddigEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgCurrimaoEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgBatacEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgMarcosEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgSolsonaEN.setImageResource(R.drawable.mostly_sunny)
                }
                separated2[0].contains("partly cloudy", true) -> {
                    binding.imgLaoagEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgPasuquinEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgBacarraEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgSanNicolasEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgSarratEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgDingrasEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgPaoayEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgVintarEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgCarasiEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgPiddigEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgCurrimaoEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgBatacEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgMarcosEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgSolsonaEN.setImageResource(R.drawable.partly_cloudy)
                }
                separated2[0].contains("mostly cloudy", true) -> {
                    binding.imgLaoagEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgPasuquinEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgBacarraEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgSanNicolasEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgSarratEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgDingrasEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgPaoayEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgVintarEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgCarasiEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgPiddigEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgCurrimaoEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgBatacEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgMarcosEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgSolsonaEN.setImageResource(R.drawable.mostly_cloudy)
                }
                separated2[0].contains("sunny", true) -> {
                    binding.imgLaoagEN.setImageResource(R.drawable.sunny_en)
                    binding.imgPasuquinEN.setImageResource(R.drawable.sunny_en)
                    binding.imgBacarraEN.setImageResource(R.drawable.sunny_en)
                    binding.imgSanNicolasEN.setImageResource(R.drawable.sunny_en)
                    binding.imgSarratEN.setImageResource(R.drawable.sunny_en)
                    binding.imgDingrasEN.setImageResource(R.drawable.sunny_en)
                    binding.imgPaoayEN.setImageResource(R.drawable.sunny_en)
                    binding.imgVintarEN.setImageResource(R.drawable.sunny_en)
                    binding.imgCarasiEN.setImageResource(R.drawable.sunny_en)
                    binding.imgPiddigEN.setImageResource(R.drawable.sunny_en)
                    binding.imgCurrimaoEN.setImageResource(R.drawable.sunny_en)
                    binding.imgBatacEN.setImageResource(R.drawable.sunny_en)
                    binding.imgMarcosEN.setImageResource(R.drawable.sunny_en)
                    binding.imgSolsonaEN.setImageResource(R.drawable.sunny_en)
                }
            }

            when {
                separated3[0].contains("rain", true) -> {
                    binding.imgBadocEN.setImageResource(R.drawable.chance_rain)
                    binding.imgPiniliEN.setImageResource(R.drawable.chance_rain)
                    binding.imgBannaEN.setImageResource(R.drawable.chance_rain)
                    binding.imgNuevaEraEN.setImageResource(R.drawable.chance_rain)
                }
                separated3[0].contains("mostly sunny", true) -> {
                    binding.imgBadocEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgPiniliEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgBannaEN.setImageResource(R.drawable.mostly_sunny)
                    binding.imgNuevaEraEN.setImageResource(R.drawable.mostly_sunny)
                }
                separated3[0].contains("partly cloudy", true) -> {
                    binding.imgBadocEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgPiniliEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgBannaEN.setImageResource(R.drawable.partly_cloudy)
                    binding.imgNuevaEraEN.setImageResource(R.drawable.partly_cloudy)
                }
                separated3[0].contains("mostly cloudy", true) -> {
                    binding.imgBadocEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgPiniliEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgBannaEN.setImageResource(R.drawable.mostly_cloudy)
                    binding.imgNuevaEraEN.setImageResource(R.drawable.mostly_cloudy)
                }
                separated3[0].contains("sunny", true) -> {
                    binding.imgBadocEN.setImageResource(R.drawable.sunny_en)
                    binding.imgPiniliEN.setImageResource(R.drawable.sunny_en)
                    binding.imgBannaEN.setImageResource(R.drawable.sunny_en)
                    binding.imgNuevaEraEN.setImageResource(R.drawable.sunny_en)
                }
            }




        }
    }
}