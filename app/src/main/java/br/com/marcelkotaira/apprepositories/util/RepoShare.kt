package br.com.marcelkotaira.apprepositories.util

import android.content.Context
import android.content.Intent
import br.com.marcelkotaira.apprepositories.R

class RepoShare {

    companion object {

        fun shareIntent(context: Context, url: String) {
            val shareIntent: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, url)
                putExtra(Intent.EXTRA_HTML_TEXT, url)
                type = "text/plain"
            }
            context.startActivity(
                Intent.createChooser(
                    shareIntent,
                    context.resources.getText(R.string.action_share)
                )
            )
        }

    }
}