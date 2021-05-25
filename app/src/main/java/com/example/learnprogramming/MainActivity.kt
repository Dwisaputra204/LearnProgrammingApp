package com.example.learnprogramming

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var rvProgrammingLanguage: RecyclerView
    private var list: ArrayList<PL> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvProgrammingLanguage = findViewById(R.id.rv_programmingLanguage)
        rvProgrammingLanguage.setHasFixedSize(true)

        list.addAll(PLData.listData)
        showRecyclerList()
    }

    private fun showRecyclerList() {
        rvProgrammingLanguage.layoutManager = LinearLayoutManager(this)
        val listPLAdapter = ListPLAdapter(list)
        rvProgrammingLanguage.adapter = listPLAdapter

        listPLAdapter.setOnItemClickCallback(object : ListPLAdapter.OnItemClickCallback {
            override fun onItemClicked(data: PL) {
                showSelectedHero(data)
            }
        })
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.about, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        setMode(item.itemId)
        return super.onOptionsItemSelected(item)
    }

    private fun setMode(selectedMode: Int) {
        when (selectedMode) {
            R.id.action_about -> {
                val moveIntent = Intent(this, AboutActivity::class.java)
                startActivity(moveIntent)
            }
        }
    }

    private fun showSelectedHero(pl: PL) {
        val moveIntent = Intent(this, DetailActivity::class.java)
        moveIntent.putExtra(DetailActivity.EXTRA_IMG, pl.photo)
        moveIntent.putExtra(DetailActivity.EXTRA_TITLE, pl.name)
        moveIntent.putExtra(DetailActivity.EXTRA_DESCRIPTION, pl.detail)
        startActivity(moveIntent)
    }
}

