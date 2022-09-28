package com.example.lesson4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    val cat = Predator("Барсик","мышь")
    val dog = Predator("Бобик","мясо")
    val chicken = Herbivores("Цыпа",2)
    val hamster = Herbivores("Жора",4)
    var predatorList = listOf(cat,dog)
    var herbivoresList = listOf(hamster,chicken)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    printAll()

    }

    fun printPredators(view: View) {
        var tvTitle:TextView = findViewById(R.id.tvTitle)
        tvTitle.text = "Хищные животные"
        var tv: TextView = findViewById(R.id.tv)
        tv.text = ""
        for (i in predatorList) {
            tv.append("Меня зовут ${i.name + ". Я ем " + i.eatType}\n")
        }
    }

    fun printHerbivores(view: View) {
        var tvTitle:TextView = findViewById(R.id.tvTitle)
        tvTitle.text = "Травоядные животные"
        var tv: TextView = findViewById(R.id.tv)
        tv.text = ""
        for (i in herbivoresList) {
            tv.append("Меня зовут ${i.name+". Мне "+ i.ageLife} года\n")
        }
    }

    fun printAll(){
        var tvTitle:TextView = findViewById(R.id.tvTitle)
        var tv:TextView = findViewById(R.id.tv)
        tv.text=""
        tvTitle.text = "Список животных "
        for (i in predatorList){
            tv.append("Меня зовут ${i.name+". Я ем "+ i.eatType}\n")
            //Log.d("MyLog","Моё имя ${i.name+". Я ем "+ i.eatType}")
        }
        for (i in herbivoresList){
            tv.append("Меня зовут ${i.name+". Мне "+ i.ageLife} года\n")
            //Log.d("MyLog","Моё имя ${i.name+". Мне "+ i.ageLife} года")
        }
    }


}
