package com.zomato.conduit.fragments.feed

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import com.zomato.conduit.R
import kotlinx.android.synthetic.main.fragment_feed.view.*

class FeedFragment : Fragment() {

    companion object {
        fun newInstance() = FeedFragment()
    }

    private lateinit var viewModel: FeedViewModel
    private lateinit var feedRV: RecyclerView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val rootView = inflater.inflate(R.layout.fragment_feed, container, false)
        feedRV = rootView.feedRecyclerView
        feedRV.layoutManager = LinearLayoutManager(context)
        feedRV.adapter = FeedAdapter()
        return rootView
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProviders.of(activity!!).get(FeedViewModel::class.java)

        viewModel.getGlobalFeed().observe({lifecycle}) {
            Toast.makeText(context, "Articles = ${it.size}", Toast.LENGTH_SHORT).show()
            (feedRV.adapter as FeedAdapter).submitList(it)
        }
    }

}
