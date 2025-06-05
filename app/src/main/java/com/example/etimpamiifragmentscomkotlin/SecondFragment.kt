package com.example.etimpamiifragmentscomkotlin

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class SecondFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_second, container, false)

        val buttonRosa = view.findViewById<Button>(R.id.buttonrosa)
        val buttonAmarelo = view.findViewById<Button>(R.id.buttonamarelo)
        val buttonVerde = view.findViewById<Button>(R.id.buttonverde)

        buttonRosa.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, FirstFragment())
                .addToBackStack(null)
                .commit()
        }

        buttonAmarelo.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, SecondFragment())
                .addToBackStack(null)
                .commit()
        }

        buttonVerde.setOnClickListener {
            parentFragmentManager.beginTransaction()
                .replace(R.id.fragmentContainerView, ThirdFragment())
                .addToBackStack(null)
                .commit()
        }

        return view
    }
}
