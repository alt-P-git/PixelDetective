package com.example.imagefinder.ui

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.compose.ui.platform.LocalContext
import androidx.core.content.ContentProviderCompat.requireContext
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.imagefinder.databinding.ItemReverseBinding
import com.example.imagefinder.model.Data

class ReverseSearchAdapter(private val context: Context, private val reverseImagesList: MutableList<Data>) : RecyclerView.Adapter<ReverseSearchAdapter.ViewHolder>() {
    class ViewHolder(binding: ItemReverseBinding) : RecyclerView.ViewHolder(binding.root) {
        val tvTitle = binding?.tvTitle
        val tvDomain = binding?.tvDomain
        val tvLink = binding?.tvLink
        val ivImage = binding?.ivActor
        val noticeButton = binding.noticeButton
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            ItemReverseBinding.inflate(
                LayoutInflater.from(parent.context), parent, false
            )
        )
    }

    override fun getItemCount(): Int {
        return reverseImagesList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = reverseImagesList[position]

        holder.itemView.setOnClickListener(){
            val intent = Intent(Intent.ACTION_VIEW, Uri.parse(model.link))
            context.startActivity(intent)
        }

        holder?.tvTitle?.text = model.title
        holder?.tvDomain?.text = model.domain
        holder?.tvLink?.text = model.link
        Glide.with(context)
            .load(model.image)
            .into(holder?.ivImage!!)

        holder.noticeButton.setOnClickListener {
            val intent = Intent(context, AiNoticeActivity::class.java).apply {
                putExtra("DOMAIN", model.domain)
            }
            context.startActivity(intent)
        }
    }

}