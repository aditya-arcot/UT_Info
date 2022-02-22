package com.example.utinfo.adapter
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.example.utinfo.R
import com.example.utinfo.model.School
import com.google.android.material.snackbar.Snackbar

class ItemAdapter (
    private val context: Context,
    private val dataset: List<School>,
    private val recyclerView: RecyclerView,
    private val button: Button,
    private val image: ImageView,
    private val nursingLayout: ConstraintLayout):

    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>()

{

    class ItemViewHolder(private val view: View): RecyclerView.ViewHolder(view){
        //TODO use to access properties here
        val textView: TextView = view.findViewById(R.id.school_name)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        //create new view
        button.setOnClickListener {
            buttonClicked(recyclerView, button, image)
        }

        val adapterLayout = LayoutInflater.from(parent.context).inflate(R.layout.school, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.textView.text = context.resources.getString(item.stringResourceId)

        holder.textView.setOnClickListener {
            schoolClicked(recyclerView, button, image)

            when (position) {
                0 -> nursingLayout.visibility = View.VISIBLE
                else -> Snackbar.make(holder.textView, "Not yet implemented", Snackbar.LENGTH_SHORT).show()
            }

        }

    }

    private fun buttonClicked(recyclerView: RecyclerView, button: Button, image: ImageView){
        recyclerView.visibility = View.VISIBLE
        image.visibility = View.VISIBLE
        button.visibility = View.GONE

        nursingLayout.visibility = View.GONE
    }

    private fun schoolClicked(recyclerView: RecyclerView, button: Button, image: ImageView) {
        recyclerView.visibility = View.GONE
        image.visibility = View.GONE
        button.visibility = View.VISIBLE
    }

    override fun getItemCount() = dataset.size


}