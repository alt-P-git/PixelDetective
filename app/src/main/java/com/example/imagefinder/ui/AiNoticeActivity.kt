package com.example.imagefinder.ui

import android.content.ClipboardManager
import android.os.Bundle
import android.widget.ImageButton
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.imagefinder.R
import com.example.imagefinder.databinding.ActivityNoticePageBinding
import com.google.android.material.tabs.TabLayout
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class AiNoticeActivity : AppCompatActivity() {
    private var binding: ActivityNoticePageBinding? = null
    private var selectedTab: String = "Friendly"
    lateinit var viewModel3: ImageViewModel3

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNoticePageBinding.inflate(layoutInflater)
        setContentView(binding?.root)

        viewModel3 = ViewModelProvider(this)[ImageViewModel3::class.java]

        val sharedPreferences = getSharedPreferences("MySharedPref", MODE_PRIVATE)
        val name = sharedPreferences.getString("name", "User")
        val domain = intent.getStringExtra("DOMAIN")

        val noticeTextView: TextView = findViewById(R.id.noticetv)
        val refreshButton: ImageButton = findViewById(R.id.refreshbtn)
        val copyButton: ImageButton = findViewById(R.id.copybtn)
        val closeButton: ImageButton = findViewById(R.id.closebtn)
        val tabLayout: TabLayout = findViewById(R.id.tabLayout)

        noticeTextView.text = "Generating..."

        tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
            override fun onTabSelected(tab: TabLayout.Tab) {
                selectedTab = tab.text.toString()
                noticeTextView.text = "Generating..."
                generateAINotice(domain ?: "")
            }

            override fun onTabUnselected(tab: TabLayout.Tab) {}
            override fun onTabReselected(tab: TabLayout.Tab) {}
        })

        refreshButton.setOnClickListener {
            generateAINotice(domain ?: "")
        }

        copyButton.setOnClickListener {
            val clipboard = getSystemService(CLIPBOARD_SERVICE) as ClipboardManager
            val clip = android.content.ClipData.newPlainText("Copied Text", noticeTextView.text)
            clipboard.setPrimaryClip(clip)
        }

        closeButton.setOnClickListener {
            finish()
        }

        generateAINotice(domain ?: "")
    }

    private fun generateAINotice(domain: String) {
        findViewById<TextView>(R.id.noticetv).text = "Generating..."
        viewModel3.writeAINotice(domain, selectedTab)
        viewModel3.writeAINoticeResponseData.observe(this) { response ->
            findViewById<TextView>(R.id.noticetv).text = response
        }
    }
}