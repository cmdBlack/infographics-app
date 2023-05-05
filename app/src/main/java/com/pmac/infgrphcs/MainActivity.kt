package com.pmac.infgrphcs

import android.content.Intent
import android.media.SoundPool
import android.net.Uri
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.pmac.infgrphcs.databinding.ActivityMainBinding
import kotlin.math.abs
import kotlin.math.round
import kotlin.math.roundToInt


var satVapComputedWet = 0.0
var satVapTableDry = 0.0

var satVapTable = 0.0
var dewPointX = 0.0
var rH = 0

val a = arrayOf(10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20,
    21, 22, 23, 24, 25, 26, 27, 28, 29, 30,
    31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 43, 44)
val b = arrayOf(0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9)

val x1  = arrayOf(12.272, 12.355, 12.438, 12.521, 12.606, 12.690, 12.775, 12.860, 12.946, 13.032)
val x2  = arrayOf(13.119, 13.207, 13.295, 13.383, 13.472, 13.562, 13.652, 13.742, 13.833, 13.925)
val x3  = arrayOf(14.017, 14.110, 14.203, 14.297, 14.391, 14.486, 14.581, 14.678, 14.774, 14.871)
val x4  = arrayOf(14.969, 15.067, 15.166, 15.266, 15.365, 15.466, 15.567, 15.669, 15.771, 15.874)
val x5  = arrayOf(15.977, 16.081, 16.186, 16.291, 16.397, 16.503, 16.610, 16.718, 16.826, 16.935)
val x6  = arrayOf(17.044, 17.154, 17.264, 17.376, 17.487, 17.600, 17.713, 17.827, 17.942, 18.057)
val x7  = arrayOf(18.173, 18.290, 18.407, 18.524, 18.643, 18.762, 18.882, 19.002, 19.123, 19.425)
val x8  = arrayOf(19.367, 19.490, 19.614, 19.739, 19.864, 19.990, 20.117, 20.244, 20.372, 20.501)
val x9  = arrayOf(20.630, 20.760, 20.891, 21.023, 21.155, 21.288, 21.422, 21.556, 21.691, 21.827)
val x10 = arrayOf(21.964, 22.101, 22.240, 22.379, 22.518, 22.659, 22.800, 22.942, 23.085, 23.229)
val x11 = arrayOf(23.373, 23.518, 23.664, 23.811, 23.959, 24.107, 24.256, 24.406, 24.557, 24.709)
val x12 = arrayOf(24.861, 25.014, 25.168, 25.323, 25.479, 25.635, 25.792, 25.950, 26.109, 26.269)
val x13 = arrayOf(26.430, 26.592, 26.754, 26.918, 27.082, 27.247, 27.413, 27.580, 27.748, 27.916)
val x14 = arrayOf(28.086, 28.256, 28.428, 28.600, 28.773, 28.947, 29.122, 29.298, 29.475, 29.652)
val x15 = arrayOf(29.831, 30.011, 30.191, 30.373, 30.555, 30.739, 30.923, 31.109, 31.295, 31.483)
val x16 = arrayOf(31.671, 31.860, 32.050, 32.242, 32.434, 32.627, 32.821, 33.016, 33.212, 33.410)
val x17 = arrayOf(33.608, 33.807, 34.008, 34.209, 34.411, 34.615, 34.820, 35.025, 35.232, 35.440)
val x18 = arrayOf(35.649, 35.859, 36.070, 36.282, 36.495, 36.709, 36.924, 37.140, 37.358, 37.576)
val x19 = arrayOf(37.796, 38.017, 38.239, 38.462, 38.686, 38.911, 39.137, 39.365, 39.594, 39.824)
val x20 = arrayOf(40.055, 40.287, 40.521, 40.755, 40.991, 41.228, 41.466, 41.705, 41.945, 42.187)
val x21 = arrayOf(42.430, 42.674, 42.919, 43.166, 43.414, 43.663, 43.913, 44.164, 44.418, 44.672)
val x22 = arrayOf(44.927, 45.184, 45.442, 45.701, 45.961, 46.223, 46.486, 46.750, 47.016, 47.283)
val x23 = arrayOf(47.551, 47.820, 48.091, 48.364, 48.637, 48.912, 49.188, 49.466, 49.745, 50.025)
val x24 = arrayOf(50.307, 50.590, 50.874, 51.160, 51.447, 51.736, 52.026, 52.317, 52.610, 52.904)
val x25 = arrayOf(53.200, 53.497, 53.796, 54.096, 54.397, 54.700, 55.004, 55.310, 55.617, 55.926)
val x26 = arrayOf(56.236, 56.548, 56.861, 57.176, 57.492, 57.810, 58.129, 58.450, 58.773, 59.097)
val x27 = arrayOf(59.422, 59.749, 60.077, 60.407, 60.739, 61.072, 61.407, 61.743, 62.081, 62.421)
val x28 = arrayOf(62.762, 63.105, 63.450, 63.796, 64.144, 64.493, 64.844, 65.196, 65.550, 65.906)
val x29 = arrayOf(66.264, 66.623, 66.985, 67.347, 67.712, 68.078, 68.446, 68.815, 69.186, 69.559)
val x30 = arrayOf(69.934, 70.310, 70.688, 71.068, 71.450, 71.833, 72.218, 72.605, 72.994, 73.385)
val x31 = arrayOf(73.777, 74.171, 74.586, 74.966, 75.365, 75.767, 76.170, 76.575, 76.982, 77.391)
val x32 = arrayOf(77.802, 78.215, 78.630, 79.046, 79.465, 79.885, 80.307, 80.731, 81.157, 81.585)
val x33 = arrayOf(82.015, 82.447, 82.881, 83.316, 83.754, 84.194, 84.636, 85.079, 85.525, 85.973)
val x34 = arrayOf(86.423, 86.875, 87.329, 87.785, 88.243, 88.703, 89.165, 89.629, 90.095, 90.564)
val x35 = arrayOf(91.034, 91.507, 91.981, 92.458, 92.937, 93.418, 93.901, 94.386, 94.874, 95.363)

val dataX = arrayOf(x1, x2, x3, x4,x5,x6,x7, x8, x9, x10, x11, x12, x13, x14, x15, x16, x17, x18, x19, x20,
    x21, x22, x23, x24, x25, x26, x27, x28, x29, x30, x31, x32, x33, x34, x35)

val vapor = arrayOf(12.26, 13.11, 14.01, 14.97, 15.97, 17.03, 18.17, 19.37, 20.62, 21.95, 23.37,
    24.86, 26.42, 28.07, 29.82, 31.66, 33.61, 35.65, 37.79, 40.05, 42.82)

var vapor_val = 0.0

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        binding.imageViewWelcome2.postDelayed( {
            binding.imageViewWelcome2.visibility = View.GONE
            binding.btnAdvisory.visibility = View.VISIBLE
            binding.btnLightning.visibility = View.VISIBLE
            binding.btnForecast.visibility = View.VISIBLE
            binding.btnDevelopers.visibility = View.VISIBLE
            binding.editTextPassword.visibility = View.VISIBLE
            binding.tgCalc.visibility = View.VISIBLE
                                                      }, 2500)

        binding.editTextPassword.addTextChangedListener(object : TextWatcher {
            override fun afterTextChanged(s: Editable) {
                if (s.length == 6){
                    if (s.toString() == "LxC6H/"){
                        binding.btnAdvisory.isEnabled = true
                        binding.btnLightning.isEnabled = true
//                        binding.btnForecast.isEnabled = true
                        s.clear()
                        binding.editTextPassword.visibility = View.GONE
                    }
                    else{
                        s.clear()
                        Toast.makeText(this@MainActivity, "TRY AGAIN", Toast.LENGTH_SHORT).show()
                    }

                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }
        })

        binding.btnAdvisory.setOnClickListener {
            val advisoryActivity = Intent(applicationContext, ActivityAdvisory::class.java)
            startActivity(advisoryActivity)
        }

        binding.btnLightning.setOnClickListener {
            val lightningActivity = Intent(applicationContext, ActivityLightning::class.java)
            startActivity(lightningActivity)
        }

        binding.btnForecast.setOnClickListener {
            val forecastActivity = Intent(applicationContext, ActivityForecastEN::class.java)
            startActivity(forecastActivity)
        }

        binding.btnDevelopers.setOnClickListener {
            val developerActivity = Intent(applicationContext, ActivityDeveloper::class.java)
            startActivity(developerActivity)
        }

        binding.tgCalc.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                binding.calcLayout.visibility = View.VISIBLE
                binding.btnAdvisory.visibility = View.GONE
                binding.btnLightning.visibility = View.GONE
                binding.btnForecast.visibility = View.GONE
                binding.btnDevelopers.visibility = View.GONE
                binding.editTextPassword.visibility = View.GONE
            }
            else{
                binding.calcLayout.visibility = View.GONE
                binding.btnAdvisory.visibility = View.VISIBLE
                binding.btnLightning.visibility = View.VISIBLE
                binding.btnForecast.visibility = View.VISIBLE
                binding.btnDevelopers.visibility = View.VISIBLE
                if (!binding.btnAdvisory.isEnabled) binding.editTextPassword.visibility = View.VISIBLE
            }
        }

        Glide.with(this).load(Uri.parse("android.resource://" + packageName + "/" + R.drawable.stars)).into(binding.imgBgStars)

//        val calcS = SoundPool(5, AudioManager.STREAM_MUSIC, 0)
        val calcS = SoundPool.Builder().setMaxStreams(5).build()

        val soundIdCalc = calcS.load(this, R.raw.calc, 1)

//        val clearS = SoundPool(5, AudioManager.STREAM_MUSIC, 0)
        val clearS = SoundPool.Builder().setMaxStreams(5).build()

        val soundIdClear = clearS.load(this, R.raw.clear, 1)

        binding.buttonCalc.setOnClickListener {
            calcS.play(soundIdCalc, 1f, 1f, 0, 0, 1f)
            try {
                calculate()
            } catch (e: NumberFormatException){
                binding.dryBulb.setText("")
                binding.wetBulb.setText("")
            }

        }

        binding.buttonClear.setOnClickListener{
            clearS.play(soundIdClear, 1f, 1f, 0, 0, 1f)
            clear()
        }

    }
    private fun calculate() {
        val dryBulbVal = binding.dryBulb.text.toString().toDouble()
        val wetBulbVal = binding.wetBulb.text.toString().toDouble()
        if (dryBulbVal < wetBulbVal){
            Toast.makeText(this, "DRY BULB TEMPERATURE SHOULD BE HIGHER THAN WET BULB TEMPERATURE", Toast.LENGTH_SHORT).show()
            clear()
        }

        else if ( dryBulbVal in 10.0..44.9 && wetBulbVal in 10.0..44.9) {
            for (i in a.indices) {
                for (j in b.indices) {
                    val ab = a[i] + b[j]

                    if (ab == wetBulbVal) {
                        satVapTable = dataX[i][j]
                        satVapComputedWet =
                            satVapTable - (0.00066 * (1 + (0.00115 * wetBulbVal)) * (1015.9) * (dryBulbVal - wetBulbVal))

                        var distance = abs(dataX[0][0] - satVapComputedWet)

                        for (q in a.indices) {
                            for (w in b.indices) {
                                val cdistance = abs(dataX[q][w] - satVapComputedWet)
                                val qw = a[q] + b[w]
                                if (cdistance < distance){
                                    dewPointX = qw
                                    distance = cdistance

                                }
                            }
                        }
                    }

                    if (ab == dryBulbVal) {
                        satVapTableDry = dataX[i][j]
                        break
                    }

                }

            }


            for (k in 10..30) {
                if (k == round(dewPointX).toInt() && round(dewPointX).toInt() in 10..30) {
                    vapor_val = vapor[k - 10]
                    binding.vapPres.text = vapor_val.toString()
                    break
                }
                else if (round(dewPointX).toInt() !in 10..30){
                    binding.vapPres.text = ""
                    Toast.makeText(this, "VP CAN ONLY BE COMPUTED IF DP IS BETWEEN 10 AND 30", Toast.LENGTH_SHORT).show()
                    break
                }
            }
            binding.dewPoint.text = dewPointX.toString()
            rH = ((satVapComputedWet / satVapTableDry) * 100).roundToInt()
            binding.relHumid.text = rH.toString()
        }

        else{
            Toast.makeText(this, "PLEASE ENTER A VALID VALUE(between 10.0 and 44.9)", Toast.LENGTH_SHORT).show()
            clear()
        }
    }

    private fun clear() {
        binding.dryBulb.setText("")
        binding.wetBulb.setText("")
        binding.dewPoint.text = ""
        binding.relHumid.text = ""
        binding.vapPres.text = ""
    }



}