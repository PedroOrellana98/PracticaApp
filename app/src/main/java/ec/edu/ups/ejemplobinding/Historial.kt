package ec.edu.ups.ejemplobinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import ec.edu.ups.ejemplobinding.databinding.FragmentHistorialBinding
import java.io.BufferedReader

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class Historial : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentHistorialBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_historial, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_historial, container, false)
        binding.button2.setOnClickListener{
            context?.openFileInput("respuestas").use {
                val text = it?.bufferedReader().use {BufferedReader->
                    BufferedReader?.readText()
                }
                binding.textView3.setText(text);
            }
        }
        return binding.root
    }
}