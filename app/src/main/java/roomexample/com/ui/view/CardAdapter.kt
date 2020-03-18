package roomexample.com.ui.view

import android.app.Application
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.LiveData
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_card.view.*
import roomexample.com.R
import roomexample.com.data.db.ListCardsEntity
import roomexample.com.ui.viewmodel.CardViewModel

class CardAdapter(): RecyclerView.Adapter<CardAdapter.CardViewHolder>() {
    class CardViewHolder(view: View): RecyclerView.ViewHolder(view)

   // private val cardViewModel = CardViewModel(application = Application())

    private var listCard: List<ListCardsEntity> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listCard.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val bindView = holder.itemView
        bindView.name_credit_card_save.text = listCard[position].nameCredit
        bindView.number_credit_card_save.text = listCard[position].numberCredit
        bindView.date_credit_card_save.text = listCard[position].dateCredit
        bindView.code_credit_card_save.text = listCard[position].codeCredit

//        bindView.image_delete_card.setOnClickListener {
//           cardViewModel.deleteCard()
//        }
    }
}