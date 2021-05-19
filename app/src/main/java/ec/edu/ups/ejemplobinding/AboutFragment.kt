package ec.edu.ups.ejemplobinding

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import ec.edu.ups.ejemplobinding.databinding.FragmentAboutBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER

class AboutFragment : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentAboutBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_about, container, false)
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_about, container, false);

        binding.btnIngresar.setOnClickListener {
            if (binding.txtUsuario.text.toString() == "admin" && binding.txtClave.text.toString() == "admin") {
                view?.findNavController()?.navigate(R.id.homeFragment2)
                var resultado =
                    "Credenciales:\n" + binding.txtUsuario.text.toString() + "\n" + binding.txtClave.text.toString()
                binding.infoTextView.text = resultado
                val archivo = "respuestas"
                var content = binding.infoTextView.text.toString() + "\n"
                context?.openFileOutput(archivo, Context.MODE_APPEND).use {
                    it?.write(content?.toByteArray())
                }
            } else if (binding.txtUsuario.text.toString() == "pedro" && binding.txtClave.text.toString() == "pedro") {
                view?.findNavController()?.navigate(R.id.homeFragment2)
                var resultado =
                    "Credenciales:\n" + binding.txtUsuario.text.toString() + "\n" + binding.txtClave.text.toString()
                binding.infoTextView.text = resultado
                val archivo = "respuestas"
                var content = binding.infoTextView.text.toString() + "\n"
                context?.openFileOutput(archivo, Context.MODE_APPEND).use {
                    it?.write(content?.toByteArray())
                }
            } else {
                var resultado =
                    "Credenciales:\n" + binding.txtUsuario.text.toString() + "\n" + binding.txtClave.text.toString()
                binding.infoTextView.text = resultado
                val archivo = "respuestas"
                context?.openFileOutput(archivo, Context.MODE_PRIVATE).use {
                    it?.write(""?.toByteArray())
                    it?.close();
                }
            }
        }
        return binding.root
    }
}