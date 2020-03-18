package roomexample.com.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.google.android.material.floatingactionbutton.FloatingActionButton

import roomexample.com.R

class CardListFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_card_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val buttonToAddFragment = view.findViewById<FloatingActionButton>(R.id.fab_teleport_to_another_fragment)
        buttonToAddFragment.setOnClickListener {
            findNavController().navigate(R.id.addCardFragment, null)
        }
    }
}
