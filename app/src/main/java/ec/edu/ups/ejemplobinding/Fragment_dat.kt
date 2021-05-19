package ec.edu.ups.ejemplobinding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.navArgs
import ec.edu.ups.ejemplobinding.databinding.FragmentDatBinding
import ec.edu.ups.ejemplobinding.databinding.FragmentHomeBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [DataFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class Fragment_dat : Fragment() {
    // TODO: Rename and change types of parameters
    private lateinit var binding: FragmentDatBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       binding= DataBindingUtil.inflate(inflater,R.layout.fragment_dat,container,false)
        //val args: Fragment_datArgs by navArgs()
        //binding.editTextTextPersonName.setText(args.name)
        //binding.editTextTextPersonLastName.setText(args.lastname)
        //binding.editTextTextPersonAge.setText(args.age)

          return binding.root
    }


}

