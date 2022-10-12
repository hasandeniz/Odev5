package com.hasandeniz.odev5

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.hasandeniz.odev5.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var anlikDeger = ""
    private var geciciDeger = 0
    private var sonuc = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        binding.buton0.setOnClickListener {
            anlikDeger += 0
            sonuc += 0
            binding.textView.text = sonuc
        }
        binding.buton1.setOnClickListener {
            anlikDeger += 1
            sonuc += 1
            binding.textView.text = sonuc
        }
        binding.buton2.setOnClickListener {
            anlikDeger += 2
            sonuc += 2
            binding.textView.text = sonuc
        }
        binding.buton3.setOnClickListener {
            anlikDeger += 3
            sonuc += 3
            binding.textView.text = sonuc
        }
        binding.buton4.setOnClickListener {
            anlikDeger += 4
            sonuc += 4
            binding.textView.text = sonuc
        }
        binding.buton5.setOnClickListener {
            anlikDeger += 5
            sonuc += 5
            binding.textView.text = sonuc
        }
        binding.buton6.setOnClickListener {
            anlikDeger += 6
            sonuc += 6
            binding.textView.text = sonuc
        }
        binding.buton7.setOnClickListener {
            anlikDeger += 7
            sonuc += 7
            binding.textView.text = sonuc
        }
        binding.buton8.setOnClickListener {
            anlikDeger += 8
            sonuc += 8
            binding.textView.text = sonuc
        }
        binding.buton9.setOnClickListener {
            anlikDeger += 9
            sonuc += 9
            binding.textView.text = sonuc
        }
        binding.butonTemizle.setOnClickListener {
            anlikDeger = ""
            geciciDeger = 0
            sonuc = ""
            binding.textView.text = "0"
        }
        binding.butonSil.setOnClickListener {
            if (sonuc.isNotEmpty() && sonuc.last() != '+')
                anlikDeger = anlikDeger.dropLast(1)
            sonuc = sonuc.dropLast(1)
            binding.textView.text = sonuc
        }
        binding.butonTopla.setOnClickListener {
            if (sonuc.isNotEmpty() && sonuc.last() != '+'){
                if (!sonuc.contains('+'))
                    anlikDeger = sonuc
                geciciDeger += anlikDeger.toInt()
                anlikDeger = ""
                sonuc += "+"
            }
            binding.textView.text = sonuc
        }
        binding.butonSonuc.setOnClickListener {
            if (anlikDeger != ""){
                sonuc = (geciciDeger + anlikDeger.toInt()).toString()
                binding.textView.text = sonuc
                geciciDeger = 0
                anlikDeger = ""
            }

        }
        setContentView(binding.root)
    }
}