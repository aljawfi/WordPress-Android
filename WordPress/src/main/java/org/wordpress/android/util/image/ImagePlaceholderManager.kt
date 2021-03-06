package org.wordpress.android.util.image

import org.wordpress.android.R
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ImagePlaceholderManager @Inject constructor() {
    fun getErrorResource(imgType: ImageType): Int? {
        return when (imgType) {
            ImageType.AVATAR -> R.drawable.bg_rectangle_grey_lighten_20_user_32dp
            ImageType.AVATAR_WITH_BACKGROUND -> R.drawable.bg_oval_grey_user_32dp
            ImageType.AVATAR_WITHOUT_BACKGROUND -> R.drawable.ic_user_circle_grey_24dp
            ImageType.BLAVATAR -> R.drawable.bg_rectangle_grey_lighten_20_globe_32dp
            ImageType.IMAGE -> null // don't display any error drawable
            ImageType.PHOTO -> R.color.grey_lighten_30
            ImageType.PLAN -> R.drawable.ic_reader_white_24dp
            ImageType.PLUGIN -> R.drawable.plugin_placeholder
            ImageType.THEME -> R.color.grey_lighten_30
            ImageType.UNKNOWN -> R.drawable.ic_notice_white_24dp
            ImageType.VIDEO -> R.color.grey_lighten_30
            ImageType.ICON -> R.drawable.bg_grey_lighten_30_with_radius
        }
    }

    fun getPlaceholderResource(imgType: ImageType): Int? {
        return when (imgType) {
            ImageType.AVATAR -> R.drawable.shape_oval_grey_light
            ImageType.AVATAR_WITH_BACKGROUND -> R.drawable.bg_oval_grey_user_32dp
            ImageType.AVATAR_WITHOUT_BACKGROUND -> R.drawable.ic_user_circle_grey_24dp
            ImageType.BLAVATAR -> R.color.grey_light
            ImageType.IMAGE -> null // don't display any placeholder
            ImageType.PHOTO -> R.color.grey_light
            ImageType.PLAN -> R.drawable.ic_reader_white_24dp
            ImageType.PLUGIN -> R.drawable.plugin_placeholder
            ImageType.THEME -> R.drawable.theme_loading
            ImageType.UNKNOWN -> R.drawable.legacy_dashicon_format_image_big_grey
            ImageType.VIDEO -> R.color.grey_light
            ImageType.ICON -> R.drawable.bg_grey_light_with_radius
        }
    }
}
