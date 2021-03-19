package sk.styk.martin.apkanalyzer.ui.activity.permission.detail

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import dagger.android.AndroidInjection
import sk.styk.martin.apkanalyzer.R
import sk.styk.martin.apkanalyzer.databinding.ActivityPermissionDetailBinding
import sk.styk.martin.apkanalyzer.ui.activity.ApkAnalyzerBaseActivity
import sk.styk.martin.apkanalyzer.ui.activity.permission.detail.pager.PermissionDetailPagerFragment
import sk.styk.martin.apkanalyzer.ui.activity.permission.detail.pager.PermissionDetailPagerFragment.Companion.ARG_PERMISSIONS_DATA

class PermissionDetailActivity : ApkAnalyzerBaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)

        super.onCreate(savedInstanceState)

        DataBindingUtil.setContentView<ActivityPermissionDetailBinding>(this, R.layout.activity_permission_detail)

        if (savedInstanceState == null) {
            val fragment = PermissionDetailPagerFragment.create(
                    permissionData = requireNotNull(intent.getParcelableExtra(ARG_PERMISSIONS_DATA))
            )
            supportFragmentManager.beginTransaction()
                    .add(R.id.item_detail_container, fragment, PermissionDetailPagerFragment.TAG)
                    .commit()
        }
    }

}
