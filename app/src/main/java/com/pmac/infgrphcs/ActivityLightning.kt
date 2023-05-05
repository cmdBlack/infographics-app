package com.pmac.infgrphcs

import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.gms.maps.*
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions
import com.pmac.infgrphcs.databinding.ActivityLightningBinding
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.model.BitmapDescriptorFactory
import com.google.android.gms.maps.model.Marker


class ActivityLightning : AppCompatActivity(), OnMapReadyCallback, GoogleMap.OnMarkerClickListener {
    private lateinit var binding: ActivityLightningBinding
    private var k: Marker? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLightningBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val mapFragment = supportFragmentManager
            .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }

    override fun onMapReady(googleMap: GoogleMap) {
        // Set the map type to Hybrid.
        googleMap.mapType = GoogleMap.MAP_TYPE_HYBRID
        binding.tgInput.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked){
                binding.textInputLayoutX.visibility = View.VISIBLE
                binding.tgInput.visibility = View.GONE
                binding.imgBackground.visibility = View.GONE
                binding.textViewDateTime.visibility = View.GONE
                binding.textViewTitle.visibility = View.GONE
                binding.textViewType.visibility = View.GONE
                binding.cardView.visibility = View.GONE
                binding.gmapSwitch.visibility = View.GONE
                binding.textView8.visibility = View.GONE
                googleMap.clear()
            }
            else{
                binding.textInputLayoutX.visibility = View.GONE
                binding.tgInput.visibility = View.VISIBLE
                binding.imgBackground.visibility = View.VISIBLE
                binding.textViewDateTime.visibility = View.VISIBLE
                binding.textViewTitle.visibility = View.VISIBLE
                binding.textViewType.visibility = View.VISIBLE
                binding.cardView.visibility = View.VISIBLE
                binding.gmapSwitch.visibility = View.VISIBLE
                binding.textView8.visibility = View.VISIBLE
            }
        }

        binding.gmapSwitch.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) googleMap.mapType = GoogleMap.MAP_TYPE_NORMAL
            else googleMap.mapType = GoogleMap.MAP_TYPE_HYBRID
        }

        binding.btnGenerate1.setOnClickListener {
            val separated: List<String> = binding.textInputAdvisory.text!!.split("\n\nNotification Rule")
            val lightningNums = separated.size

            for (i in 1..lightningNums) {
                if (binding.textInputAdvisory.text!!.contains("Notification Rule")) {
                    val separated2: List<String> = separated[i-1].split("\n")
                    binding.tgInput.visibility = View.VISIBLE
                    binding.imgBackground.visibility = View.VISIBLE
                    binding.textViewDateTime.visibility = View.VISIBLE
                    binding.textViewTitle.visibility = View.VISIBLE
                    binding.textViewType.visibility = View.VISIBLE
                    binding.cardView.visibility = View.VISIBLE
                    binding.gmapSwitch.visibility = View.VISIBLE
                    binding.textView8.visibility = View.VISIBLE
                    binding.textInputLayoutX.visibility = View.GONE
                    binding.tgInput.isChecked = false

                    val x: Double = separated2[3].substringAfter("Stroke Location: Lat: ")
                        .substringBefore(" Lon").toDouble()
                    val y: Double = separated2[3].substringAfter("Lon: ").toDouble()

                    val strike = LatLng(x, y)
                    // Add a marker on the map coordinates.
                    k = googleMap.addMarker(
                        MarkerOptions()
                            .position(strike)
                            .title(separated2[5])
                            .icon(BitmapDescriptorFactory.fromResource(R.drawable.lightning))
                            .anchor(0.0f, 1.0f)
                    )

                    val dateTimeStrike = separated2[6].substringAfter("Activated Time: ")
                    var cloudType = "IN CLOUD"

                    if (separated2[4] == "Type: IC") {
                        cloudType = "IN CLOUD"
                        k?.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.lightning_blue))
                    } else if (separated2[4] == "Type: CG") {
                        cloudType = "CLOUD TO GROUND"
                        k?.setIcon(BitmapDescriptorFactory.fromResource(R.drawable.lightning))
                    }

                    k?.tag = dateTimeStrike + "blank" + cloudType

                    googleMap.setOnMarkerClickListener(this)


                    // Move the camera to the map coordinates and zoom in closer.
                    googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(strike, 15f))
                    googleMap.animateCamera(CameraUpdateFactory.zoomIn())
                    googleMap.animateCamera(CameraUpdateFactory.zoomTo(15f))

                } else Toast.makeText(this, "Please Input Lightning Advisory", Toast.LENGTH_SHORT)
                    .show()
            }
        }


        binding.btnClear2.setOnClickListener {
            binding.textInputAdvisory.text?.clear()
            googleMap.clear()
        }

        // Display traffic.
//        googleMap.isTrafficEnabled = true
    }

    override fun onMarkerClick(p0: Marker): Boolean {
        val lightningInfo = p0.tag as? String

        binding.textViewDateTime.text = lightningInfo!!.split("blank")[0]
        binding.textViewType.text = lightningInfo.split("blank")[1]

        if (lightningInfo.split("blank")[1] == "IN CLOUD") {
            binding.textViewType.setTextColor(Color.CYAN)
        } else if (lightningInfo.split("blank")[1] == "CLOUD TO GROUND") {
            binding.textViewType.setTextColor(Color.YELLOW)
        }
    return false
    }
}