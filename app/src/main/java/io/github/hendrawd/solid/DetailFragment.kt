package io.github.hendrawd.solid

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.text.HtmlCompat
import androidx.fragment.app.Fragment
import coil.api.load
import io.github.hendrawd.solid.dummy.Content
import kotlinx.android.synthetic.main.fragment_detail.*

const val ARG_ITEM = "item"

/**
 * A simple [Fragment] subclass.
 * Use the [DetailFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class DetailFragment : Fragment() {
    private var contentItem: Content.Item? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            contentItem = it.getParcelable(ARG_ITEM)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_detail, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        contentItem?.imageUrl?.let {
            imageView.load(it)
        }
        textViewDetail.text = HtmlCompat.fromHtml(
            contentItem?.details ?: "No detail",
            HtmlCompat.FROM_HTML_MODE_LEGACY
        )
    }

    companion object {
        @JvmStatic
        fun newInstance(item: Content.Item) =
            DetailFragment().apply {
                arguments = Bundle().apply {
                    putParcelable(ARG_ITEM, item)
                }
            }
    }
}
