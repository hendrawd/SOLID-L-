package io.github.hendrawd.solid

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.core.os.bundleOf
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.fragment.findNavController
import io.github.hendrawd.solid.dummy.Content
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SolidItemFragment.OnListFragmentInteractionListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onSupportNavigateUp(): Boolean {
        return NavHostFragment.findNavController(navHostFragment).navigateUp()
    }

    override fun onListFragmentInteraction(item: Content.Item?) {
        navHostFragment.findNavController().navigate(
            R.id.action_solidItemFragment_to_detailFragment,
            bundleOf(ARG_ITEM to item)
        )
        Log.e("hendrawd", item.toString())
    }

}
