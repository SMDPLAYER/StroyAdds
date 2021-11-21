package uz.smd.stroyadds.images

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import uz.smd.stroyadds.R
import uz.smd.stroyadds.databinding.ItemGroceryBinding


class MainAdapter(val clicked:(asPic)->Unit) : ListAdapter<asPic, MainAdapter.ItemViewHolder>(
    DiffCallback()
) {


  override fun onCreateViewHolder(viewGroup: ViewGroup, position: Int): ItemViewHolder {
   val binding = ItemGroceryBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
    return ItemViewHolder(binding)
  }

  override fun onBindViewHolder(holder: ItemViewHolder, pos: Int) {
      holder.bind(currentList[pos])
  }



  override fun getItemCount(): Int {
    return currentList.size
  }

  private class DiffCallback : DiffUtil.ItemCallback<asPic>() {

    override fun areItemsTheSame(oldItem: asPic, newItem: asPic) =
        oldItem.src == newItem.src

      override fun areContentsTheSame(oldItem: asPic, newItem: asPic) =
        oldItem == newItem
  }


  inner class ItemViewHolder(private val itemBinding: ItemGroceryBinding) :
      RecyclerView.ViewHolder(itemBinding.root) {

    fun bind(item: asPic) {
      Glide.with(itemBinding.imageHolder.context).load(item.src)
            .placeholder(R.drawable.progress_animation)
            .into(itemBinding.imageHolder)
        itemBinding.imageHolder.setOnClickListener {
            clicked(item)
        }
    }

  }
}