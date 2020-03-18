package roomexample.com.ui.view

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import kotlinx.android.synthetic.main.fragment_add_card.*
import kotlinx.android.synthetic.main.fragment_card_list.*

import roomexample.com.R
import roomexample.com.ui.viewmodel.CardViewModel

class AddCardFragment: Fragment() {

    private lateinit var cardViewModel: CardViewModel
    private lateinit var cardAdapter: CardAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        cardViewModel = ViewModelProvider(this).get(CardViewModel::class.java)
        cardAdapter = CardAdapter()
        recyclerview_cardlist.adapter = cardAdapter

        val buttonToAddCard = view?.findViewById<Button>(R.id.button_save_card)
        buttonToAddCard?.setOnClickListener {
            if (name_credit_card.text.isEmpty() &&
                number_credit_card.text.isEmpty() &&
                date_credit_card.text.isEmpty() &&
                code_credit_card.text.isEmpty()) {

                name_credit_card.error
                number_credit_card.error
                date_credit_card.error
                code_credit_card.error
            } else {
                // cardViewModel.insertCard()
            }
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_add_card, container, false)

    }
}
