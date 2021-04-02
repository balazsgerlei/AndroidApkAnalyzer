package sk.styk.martin.apkanalyzer.ui.appdetail.page.usedpermission

import android.view.LayoutInflater
import android.view.ViewGroup
import sk.styk.martin.apkanalyzer.databinding.FragmentAppDetailPageBinding
import sk.styk.martin.apkanalyzer.ui.appdetail.page.AppDetailPageFragment
import sk.styk.martin.apkanalyzer.util.provideViewModel
import javax.inject.Inject

class AppUsedPermissionDetailFragment : AppDetailPageFragment<AppUsedPermissionFragmentViewModel, FragmentAppDetailPageBinding>() {

    @Inject
    lateinit var viewModelFactory: AppUsedPermissionFragmentViewModel.Factory

    override fun createViewModel(): AppUsedPermissionFragmentViewModel {
        return provideViewModel {
            viewModelFactory.create(parentViewModel())
        }
    }

    override fun createFragmentBinding(inflater: LayoutInflater, container: ViewGroup?): FragmentAppDetailPageBinding {
        return FragmentAppDetailPageBinding.inflate(inflater, container, false)
    }
}
