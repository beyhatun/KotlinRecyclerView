package com.example.kotlinrecyclerview

import android.content.Intent
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.kotlinrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var landmarkList : ArrayList<LandMark>

    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(view)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
       landmarkList = ArrayList<LandMark>()

        val pisa = LandMark("Pisa","Italy",R.drawable.pisa)
        val colesseum = LandMark("Colesseum","Italy",R.drawable.colosseum)
        val eiffel = LandMark("Eiffel","France",R.drawable.eiffel2)
        val londonBridge = LandMark("London Bridge","United Kingdom",R.drawable.londonbridge)

        landmarkList.add(pisa)
        landmarkList.add(eiffel)
        landmarkList.add(colesseum)
        landmarkList.add(londonBridge)

        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val landMarkAdapter = LandmarkAdapter(landmarkList)
        binding.recyclerView.adapter = landMarkAdapter

        /*val adapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,landmarkList.map{landmark -> landmark.name})

        binding.listView.adapter = adapter

        binding.listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            val intent = Intent(MainActivity@this,DetailsActivity::class.java)
            intent.putExtra("landmark",landmarkList.get(position))
            startActivity(intent)
        }*/
    }

}